package com.ivan.todoengine.networking.oauth2

import com.ivan.todoengine.data.store.SecureKeyValueStore
import com.ivan.todoengine.networking.TokenStorage
import javax.inject.Inject

/**
 * Simple storage for OAuth2 Tokens (there should always be one currently)
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2TokenStorage
@Inject constructor(private val secureKeyValueStore: SecureKeyValueStore) :
    TokenStorage<OAuth2Token> {

    override fun clearToken() {
        secureKeyValueStore.delete(TOKEN_KEY)
        secureKeyValueStore.delete(REFRESH_TOKEN_KEY)
        secureKeyValueStore.delete(EMAIL)
    }

    override fun saveToken(token: OAuth2Token) {
        secureKeyValueStore.put(TOKEN_KEY, token.token)
        secureKeyValueStore.put(REFRESH_TOKEN_KEY, token.refreshToken)
        secureKeyValueStore.put(EMAIL, token.email)
    }

    override fun readToken(): OAuth2Token? {
        val token = secureKeyValueStore.readString(TOKEN_KEY)
        val refreshToken = secureKeyValueStore.readString(REFRESH_TOKEN_KEY)
        val email = secureKeyValueStore.readString(EMAIL)
        return if (token == null || refreshToken == null || email == null) {
            null
        } else OAuth2Token(
            email,
            token,
            refreshToken
        )
    }

    companion object {
        // Tag as string if we use proguard in future
        const val TAG = "OAuth2TokenStorage"
        const val TOKEN_KEY = "$TAG.token"
        const val REFRESH_TOKEN_KEY = "$TAG.refresh_token"
        const val EMAIL = "$TAG.email"
    }
}
