package com.ivan.todoengine.networking.oauth2

import com.ivan.todoengine.data.store.SimpleKeyValueStore
import com.ivan.todoengine.networking.TokenStorage
import javax.inject.Inject

/**
 * Simple storage for OAuth2 Tokens (there should always be one currently)
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2TokenStorage
@Inject constructor(private val simpleKeyValueStore: SimpleKeyValueStore) :
    TokenStorage<OAuth2Token> {

    override fun clearToken() {
        simpleKeyValueStore.delete(TOKEN_KEY)
        simpleKeyValueStore.delete(REFRESH_TOKEN_KEY)
        simpleKeyValueStore.delete(EMAIL)
    }

    override fun saveToken(token: OAuth2Token) {
        simpleKeyValueStore.put(TOKEN_KEY, token.token)
        simpleKeyValueStore.put(REFRESH_TOKEN_KEY, token.refreshToken)
        simpleKeyValueStore.put(EMAIL, token.email)
    }

    override fun readToken(): OAuth2Token? {
        val token = simpleKeyValueStore.readString(TOKEN_KEY)
        val refreshToken = simpleKeyValueStore.readString(REFRESH_TOKEN_KEY)
        val email = simpleKeyValueStore.readString(EMAIL)
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
