
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J$\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"LKeyStoreHelper;", "", "()V", "keyStore", "Ljava/security/KeyStore;", "decrypt", "", "key", "iv", "data", "decryptData", "keyAlias", "encryptedIv", "encryptedData", "encrypt", "Lcom/ivan/todoengine/data/store/EncryptedInfo;", "textToEncrypt", "context", "Landroid/content/Context;", "encryptData", "getKey", "Ljava/security/Key;", "getPrivateKey", "Ljava/security/KeyStore$PrivateKeyEntry;", "alias", "getSecretKey", "Ljavax/crypto/SecretKey;", "initKeyStore", "", "Companion", "engine_release"})
public final class KeyStoreHelper {
    private java.security.KeyStore keyStore;
    private static final java.lang.String AES_TRANSFORMATION = "AES/GCM/NoPadding";
    private static final java.lang.String RSA_TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private static final java.lang.String CIPHER_PROVIDER_NAME_ENCRYPTION_DECRYPTION_RSA = "AndroidOpenSSL";
    private static final java.lang.String ANDROID_KEY_STORE = "AndroidKeyStore";
    private static final java.lang.String PREF_REALM_KEY_ALIAS = "pref_realm_key";
    private static final java.lang.String RSA_ALGORITHM_NAME = "RSA";
    @org.jetbrains.annotations.Nullable()
    private static KeyStoreHelper instance;
    public static final KeyStoreHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ivan.todoengine.data.store.EncryptedInfo encrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String textToEncrypt, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String iv, @org.jetbrains.annotations.NotNull()
    java.lang.String data) throws java.security.NoSuchProviderException {
        return null;
    }
    
    private final void initKeyStore() throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
    }
    
    private final java.lang.String decryptData(java.lang.String keyAlias, java.lang.String encryptedIv, java.lang.String encryptedData) throws java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.security.InvalidAlgorithmParameterException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException {
        return null;
    }
    
    private final javax.crypto.SecretKey getSecretKey(java.lang.String key) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableEntryException, java.security.KeyStoreException {
        return null;
    }
    
    private final java.security.KeyStore.PrivateKeyEntry getPrivateKey(java.lang.String alias) throws java.security.KeyStoreException, java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException {
        return null;
    }
    
    private final com.ivan.todoengine.data.store.EncryptedInfo encryptData(java.lang.String key, java.lang.String textToEncrypt, android.content.Context context) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        return null;
    }
    
    @androidx.annotation.NonNull()
    private final java.security.Key getKey(java.lang.String key, android.content.Context context) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException {
        return null;
    }
    
    private KeyStoreHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"LKeyStoreHelper$Companion;", "", "()V", "AES_TRANSFORMATION", "", "ANDROID_KEY_STORE", "CIPHER_PROVIDER_NAME_ENCRYPTION_DECRYPTION_RSA", "PREF_REALM_KEY_ALIAS", "RSA_ALGORITHM_NAME", "RSA_TRANSFORMATION", "<set-?>", "LKeyStoreHelper;", "instance", "getInstance", "()LKeyStoreHelper;", "setInstance", "(LKeyStoreHelper;)V", "engine_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized KeyStoreHelper getInstance() {
            return null;
        }
        
        private final void setInstance(KeyStoreHelper p0) {
        }
        
        private Companion() {
            super();
        }
    }
}