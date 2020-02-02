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
        var newToken: OAuth2Token?
        synchronized(lock) {
            val oldToken = tokenStorage.readToken()
            return if (oldToken != null && oldToken.expired()) {
                newToken = oAuth2TokenApi.get().refreshToken(
                    oAuth2RequestFactory.makeRefreshTokenRequest(oldToken.refreshToken)
                ).body()
                // Response body should not be null if it was successful
                assert(newToken != null)
                tokenStorage.saveToken(newToken!!)
                newToken!!
            } else {
                if (oldToken == null) {
                    // TODO custom exception
                    throw NullPointerException("No token")
                }
                oldToken
            }
        }
    }

    companion object {
        private val lock = Any()
    }
}