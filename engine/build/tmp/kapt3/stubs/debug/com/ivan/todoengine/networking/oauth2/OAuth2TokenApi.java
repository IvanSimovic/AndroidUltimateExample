package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * OAuth2 Token related APIs
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "", "createToken", "Lretrofit2/Response;", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Token;", "createTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2CreateTokenRequest;", "(Lcom/ivan/todoengine/networking/oauth2/request/OAuth2CreateTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "Lretrofit2/Call;", "refreshTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest;", "engine_debug"})
public abstract interface OAuth2TokenApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "oauth/login")
    public abstract java.lang.Object createToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.networking.oauth2.request.OAuth2CreateTokenRequest createTokenRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ivan.todoengine.networking.oauth2.OAuth2Token>> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "oauth/refreshtoken")
    public abstract retrofit2.Call<com.ivan.todoengine.networking.oauth2.OAuth2Token> refreshToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest refreshTokenRequest);
}