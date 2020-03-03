package com.ivan.todoengine.networking.oauth2.request

import com.google.gson.annotations.SerializedName

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2RefreshTokenRequest(
    @field:SerializedName("Email")
    val email: String,
    @field:SerializedName("RefreshToken")
    val refreshToken: String
) : OAuth2GrantRequest() {
    companion object {
        private const val GRANT_TYPE = "refresh_token"
    }
}
