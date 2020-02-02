package com.ivan.todoengine.networking.session

import com.ivan.todoengine.di.Authenticated
import com.ivan.todoengine.networking.oauth2.OAuth2TokenApi
import com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage
import com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory
import javax.inject.Inject

interface SessionRepository {
    fun logIn(credentials: Credentials)

    fun logOut()

    fun hasSession(): Boolean
}

class SessionRepositoryImpl
@Inject constructor(
    @param:Authenticated(false) private val oAuth2TokenApi: OAuth2TokenApi,
    private val oAuth2TokenStorage: OAuth2TokenStorage,
    private val oAuth2RequestFactory: OAuth2RequestFactory
) : SessionRepository {
    override fun logIn(credentials: Credentials) {
        val token = oAuth2TokenApi.createToken(
            oAuth2RequestFactory.makeCreateTokenRequest(
                credentials.username,
                credentials.password
            )
        ).body()!!
        oAuth2TokenStorage.saveToken(token)
    }

    override fun logOut() {
        oAuth2TokenStorage.clearToken()
    }

    override fun hasSession(): Boolean =
        oAuth2TokenStorage.readToken() != null
}