import android.app.Application
import android.content.Context
import android.os.Build
import android.security.KeyPairGeneratorSpec
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import androidx.annotation.NonNull
import com.ivan.todoengine.data.store.EncryptedInfo
import java.io.IOException
import java.math.BigInteger
import java.nio.charset.StandardCharsets
import java.security.*
import java.security.KeyStore.PrivateKeyEntry
import java.security.KeyStore.SecretKeyEntry
import java.security.cert.CertificateException
import java.util.*
import javax.crypto.*
import javax.crypto.spec.GCMParameterSpec
import javax.security.auth.x500.X500Principal

class KeyStoreHelper private constructor() {
    private var keyStore: KeyStore? = null
    fun encrypt(key: String, textToEncrypt: String, context: Context): EncryptedInfo? {
        return try {
            encryptData(key, textToEncrypt, context)
        } catch (ignored: NoSuchAlgorithmException) {
            null
        } catch (ignored: NoSuchProviderException) {
            null
        } catch (ignored: NoSuchPaddingException) {
            null
        } catch (ignored: InvalidKeyException) {
            null
        } catch (ignored: InvalidAlgorithmParameterException) {
            null
        } catch (ignored: IllegalBlockSizeException) {
            null
        } catch (ignored: BadPaddingException) {
            null
        } catch (ignored: IllegalArgumentException) {
            null
        }
    }

    @Throws(NoSuchProviderException::class)
    fun decrypt(key: String, iv: String, data: String): String? {
        try {
            return decryptData(key, iv, data)
        } catch (ignored: UnrecoverableEntryException) {
        } catch (ignored: NoSuchAlgorithmException) {
        } catch (ignored: KeyStoreException) {
        } catch (ignored: InvalidKeyException) {
        } catch (ignored: IllegalBlockSizeException) {
        } catch (ignored: BadPaddingException) {
        } catch (ignored: InvalidAlgorithmParameterException) {
        } catch (ignored: IllegalArgumentException) {
        } catch (e: NoSuchPaddingException) {
            e.printStackTrace()
        }
        return null
    }

    @Throws(
        KeyStoreException::class,
        CertificateException::class,
        NoSuchAlgorithmException::class,
        IOException::class
    )
    private fun initKeyStore() {
        keyStore = KeyStore.getInstance(ANDROID_KEY_STORE)
        keyStore?.load(null)
    }

    @Throws(
        UnrecoverableEntryException::class,
        NoSuchAlgorithmException::class,
        KeyStoreException::class,
        InvalidKeyException::class,
        BadPaddingException::class,
        IllegalBlockSizeException::class,
        InvalidAlgorithmParameterException::class,
        NoSuchPaddingException::class,
        NoSuchProviderException::class
    )
    private fun decryptData(
        keyAlias: String,
        encryptedIv: String?,
        encryptedData: String
    ): String? {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val cipher = Cipher.getInstance(AES_TRANSFORMATION)
            val secretKey = getSecretKey(keyAlias)
            val decryptedIv =
                Base64.decode(encryptedIv, Base64.DEFAULT)
            val decryptedData =
                Base64.decode(encryptedData, Base64.DEFAULT)
            if (encryptedIv != null && secretKey != null && decryptedIv != null && decryptedData != null) {
                val spec = GCMParameterSpec(128, decryptedIv)
                cipher.init(Cipher.DECRYPT_MODE, secretKey, spec)
                return String(cipher.doFinal(decryptedData), StandardCharsets.UTF_8)
            }
        } else {
            val privateKeyEntry = getPrivateKey(keyAlias)
            val decryptedData =
                Base64.decode(encryptedData, Base64.DEFAULT)
            if (privateKeyEntry != null && decryptedData != null) {
                val cipher = Cipher.getInstance(
                    RSA_TRANSFORMATION,
                    CIPHER_PROVIDER_NAME_ENCRYPTION_DECRYPTION_RSA
                )
                cipher.init(Cipher.DECRYPT_MODE, privateKeyEntry.privateKey)
                return String(cipher.doFinal(decryptedData), StandardCharsets.UTF_8)
            }
        }
        return null
    }

    @Throws(
        NoSuchAlgorithmException::class,
        UnrecoverableEntryException::class,
        KeyStoreException::class
    )
    private fun getSecretKey(key: String): SecretKey? {
        return if (keyStore!!.getEntry(key, null) != null) {
            (keyStore!!.getEntry(key, null) as SecretKeyEntry).secretKey
        } else null
    }

    @Throws(
        KeyStoreException::class,
        UnrecoverableEntryException::class,
        NoSuchAlgorithmException::class
    )
    private fun getPrivateKey(alias: String): PrivateKeyEntry? {
        return if (keyStore!!.getEntry(alias, null) != null) {
            keyStore!!.getEntry(alias, null) as PrivateKeyEntry
        } else null
    }

    @Throws(
        NoSuchAlgorithmException::class,
        NoSuchProviderException::class,
        NoSuchPaddingException::class,
        InvalidKeyException::class,
        InvalidAlgorithmParameterException::class,
        BadPaddingException::class,
        IllegalBlockSizeException::class
    )
    private fun encryptData(
        key: String,
        textToEncrypt: String,
        context: Context
    ): EncryptedInfo {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val cipher = Cipher.getInstance(AES_TRANSFORMATION)
            cipher.init(Cipher.ENCRYPT_MODE, getKey(key, context))
            val iv = cipher.iv
            val encryption =
                cipher.doFinal(textToEncrypt.toByteArray(StandardCharsets.UTF_8))
            val encodedIv =
                Base64.encodeToString(iv, Base64.DEFAULT)
            val encodedData =
                Base64.encodeToString(encryption, Base64.DEFAULT)
            EncryptedInfo(encodedIv, encodedData)
        } else {
            val cipher = Cipher.getInstance(
                RSA_TRANSFORMATION,
                CIPHER_PROVIDER_NAME_ENCRYPTION_DECRYPTION_RSA
            )
            cipher.init(Cipher.ENCRYPT_MODE, getKey(key, context))
            val encryption =
                cipher.doFinal(textToEncrypt.toByteArray(StandardCharsets.UTF_8))
            val encodedData =
                Base64.encodeToString(encryption, Base64.DEFAULT)
            EncryptedInfo("", encodedData)
        }
    }

    @NonNull
    @Throws(
        NoSuchAlgorithmException::class,
        NoSuchProviderException::class,
        InvalidAlgorithmParameterException::class
    )
    private fun getKey(key: String, context: Context): Key {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val keyGenerator: KeyGenerator = KeyGenerator.getInstance(
                KeyProperties.KEY_ALGORITHM_AES,
                ANDROID_KEY_STORE
            )
            keyGenerator.init(
                KeyGenParameterSpec.Builder(
                    key,
                    KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
                )
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .build()
            )
            keyGenerator.generateKey()
        } else {
            // generate key for api level less than M
            val start = Calendar.getInstance()
            val end = Calendar.getInstance()
            end.add(Calendar.YEAR, 30)
            val spec =
                KeyPairGeneratorSpec.Builder(context)
                    .setSubject(X500Principal("CN=$PREF_REALM_KEY_ALIAS"))
                    .setAlias(PREF_REALM_KEY_ALIAS)
                    .setSerialNumber(BigInteger.TEN)
                    .setStartDate(start.time)
                    .setEndDate(end.time)
                    .build()
            val keyPairGenerator = KeyPairGenerator.getInstance(
                RSA_ALGORITHM_NAME,
                ANDROID_KEY_STORE
            )
            keyPairGenerator.initialize(spec)
            keyPairGenerator.generateKeyPair().public
        }
    }

    companion object {
        private const val AES_TRANSFORMATION = "AES/GCM/NoPadding"
        private const val RSA_TRANSFORMATION = "RSA/ECB/PKCS1Padding"
        private const val CIPHER_PROVIDER_NAME_ENCRYPTION_DECRYPTION_RSA = "AndroidOpenSSL"
        private const val ANDROID_KEY_STORE = "AndroidKeyStore"
        private const val PREF_REALM_KEY_ALIAS = "pref_realm_key"
        private const val RSA_ALGORITHM_NAME = "RSA"

        @get:Synchronized
        var instance: KeyStoreHelper? = null
            get() {
                if (field == null) {
                    try {
                        field = KeyStoreHelper()
                    } catch (ignored: CertificateException) {
                    } catch (ignored: NoSuchAlgorithmException) {
                    } catch (ignored: KeyStoreException) {
                    } catch (ignored: NoSuchProviderException) {
                    } catch (ignored: NoSuchPaddingException) {
                    } catch (ignored: IOException) {
                    }
                }
                return field
            }
            private set
    }

    init {
        initKeyStore()
    }
}
