package com.ivan.todoengine.data.store

import KeyStoreHelper
import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SecureSharedPreferencesStore
@Inject constructor(private val sharedPreferences: SharedPreferences, private val context: Context) : SecureKeyValueStore {

    private val editor: SharedPreferences.Editor
        get() = sharedPreferences.edit()

    override fun put(key: String, value: String) {
        val encryptedInfo = KeyStoreHelper.instance!!.encrypt(key, value, context)!!
        val editor = editor
        editor.putString("${key}_iv", encryptedInfo.iv)
        editor.putString(key, encryptedInfo.data)
        editor.apply()
    }

    override fun readString(key: String): String? {
        val iv = sharedPreferences.getString("${key}_iv", "")!!
        val data = sharedPreferences.getString(key, "")!!
        return KeyStoreHelper.instance!!.decrypt(key, iv, data)
    }

    override fun delete(key: String) {
        val editor = editor
        editor.remove(key)
        editor.remove("${key}_iv")
        editor.apply()
    }
}
