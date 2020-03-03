package com.ivan.todoengine.networking.oauth2.request

import com.google.gson.annotations.SerializedName

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2CreateTokenRequest(
    @field:SerializedName("Email")
    val email: String,
    @field:SerializedName("Password")
    val password: String
) : OAuth2GrantRequest() {
    companion object {
        private const val GRANT_TYPE = "password"
    }
}
