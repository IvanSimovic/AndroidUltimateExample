package com.ivan.todoengine.networking.oauth2

import com.ivan.todoengine.di.Authenticated
import com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory
import dagger.Lazy
import javax.inject.Inject
import kotlin.NullPointerException

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2TokenRefresher
@Inject constructor(
    private val tokenStorage: OAuth2TokenStorage,
    private val oAuth2RequestFactory: OAuth2RequestFactory,
    @Authenticated(true)
    private val oAuth2TokenApi: Lazy<@JvmSuppressWildcards OAuth2TokenApi>
) {

    fun refreshToken(): OAuth2Token {
        val oldToken = tokenStorage.readToken()
        return if (oldToken != null) {
            val newToken = oAuth2TokenApi.get().refreshToken(
                oAuth2RequestFactory.makeRefreshTokenRequest(
                    oldToken.email,
                    oldToken.refreshToken
                )
            ).execute().body()
            // Response body should not be null if it was successful
            if(newToken == null)
                throw NullPointerException("Failed to refresh token")

            synchronized(lock) {
                tokenStorage.saveToken(newToken)
            }
            newToken
        } else {
            throw NullPointerException("No token")
        }
    }

    companion object {
        private val lock = Any()
    }
}