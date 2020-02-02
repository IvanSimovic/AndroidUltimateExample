package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * OAuth2 Token related APIs
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "", "createToken", "Lretrofit2/Response;", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Token;", "createTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2CreateTokenRequest;", "refreshToken", "refreshTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest;", "engine_debug"})
public abstract interface OAuth2TokenApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "oauth/token")
    public abstract retrofit2.Response<com.ivan.todoengine.networking.oauth2.OAuth2Token> createToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.networking.oauth2.request.OAuth2CreateTokenRequest createTokenRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "oauth/token")
    public abstract retrofit2.Response<com.ivan.todoengine.networking.oauth2.OAuth2Token> refreshToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest refreshTokenRequest);
}