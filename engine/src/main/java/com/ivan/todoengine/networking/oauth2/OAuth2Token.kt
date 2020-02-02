package com.ivan.todoengine.networking.oauth2

import com.google.gson.annotations.SerializedName
import com.ivan.todoengine.networking.RefreshableSetTimeExpirableAuthToken

/**
 * Simple model representing OAuth2 AuthToken
 * Should not contain null tokens and should be safe to use
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class OAuth2Token(
    @field:SerializedName("expires_in")
    val expirationPeriod: Long,
    @field:SerializedName("created_at")
    val createdAt: Long,
    @field:SerializedName("access_token")
    val accessToken: String,
    @field:SerializedName("refresh_token")
    val refreshToken: String
) : RefreshableSetTimeExpirableAuthToken {

    override val stringValue: String = accessToken

    override val refreshTokenStringValue: String = refreshToken

    override val expirationTimestamp: Long = createdAt + expirationPeriod

    override fun toString(): String {
        return "OAuth2Token{" +
                "expirationPeriod=" + expirationPeriod +
                ", createdAt=" + createdAt +
                ", accessToken='" + accessToken + '\''.toString() +
                ", refreshToken='" + refreshToken + '\''.toString() +
                '}'.toString()
    }
}
