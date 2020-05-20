package com.ivan.todoengine.data.store

interface SecureKeyValueStore {
    fun put(key: String, value: String)
    fun readString(key: String): String?
    fun delete(key: String)
}
