package com.ivan.todoengine.networking.oauth2.request

import javax.inject.Inject

/**
 * Provides easy creation of [OAuth2GrantRequest] objects
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2RequestFactory
@Inject constructor() {

    fun makeCreateTokenRequest(
        email: String,
        password: String
    ): OAuth2CreateTokenRequest {
        return OAuth2CreateTokenRequest(
            email,
            password
        )
    }

    fun makeRefreshTokenRequest(email: String, refreshToken: String): OAuth2RefreshTokenRequest {
        return OAuth2RefreshTokenRequest(
            email,
            refreshToken
        )
    }
}
