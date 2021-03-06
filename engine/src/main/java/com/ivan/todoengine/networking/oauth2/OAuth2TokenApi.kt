package com.ivan.todoengine.networking.oauth2

import com.ivan.todoengine.networking.oauth2.request.OAuth2CreateTokenRequest
import com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * OAuth2 Token related APIs
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
interface OAuth2TokenApi {

    @POST("oauth/login")
    suspend fun createToken(@Body createTokenRequest: OAuth2CreateTokenRequest): Response<OAuth2Token>

    @POST("oauth/refreshtoken")
    fun refreshToken(@Body refreshTokenRequest: OAuth2RefreshTokenRequest): Call<OAuth2Token>
}
