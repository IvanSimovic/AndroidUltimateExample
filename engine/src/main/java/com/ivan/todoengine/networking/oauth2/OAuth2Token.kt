package com.ivan.todoengine.networking.oauth2

import com.google.gson.annotations.SerializedName
import com.ivan.todoengine.networking.RefreshableAuthToken
import com.ivan.todoengine.networking.RefreshableSetTimeExpirableAuthToken

/**
 * Simple model representing OAuth2 AuthToken
 * Should not contain null tokens and should be safe to use
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2Token(
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("token")
    val token: String,
    @field:SerializedName("refreshToken")
    val refreshToken: String
) : RefreshableAuthToken {

    override val stringValue: String = token

    override val refreshTokenStringValue: String = refreshToken

    override fun toString(): String {
        return "OAuth2Token{" +
                ", email='" + email + '\''.toString() +
                ", token='" + token + '\''.toString() +
                ", refreshToken='" + refreshToken + '\''.toString() +
                '}'.toString()
    }
}
