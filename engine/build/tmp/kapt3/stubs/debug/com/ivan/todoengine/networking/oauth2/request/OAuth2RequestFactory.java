package com.ivan.todoengine.networking.oauth2.request;

import java.lang.System;

/**
 * Provides easy creation of [OAuth2GrantRequest] objects
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;", "", "clientConfig", "Lcom/ivan/todoengine/networking/ClientConfig;", "(Lcom/ivan/todoengine/networking/ClientConfig;)V", "makeCreateTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2CreateTokenRequest;", "username", "", "password", "makeRefreshTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest;", "refreshToken", "engine_debug"})
public final class OAuth2RequestFactory {
    private final com.ivan.todoengine.networking.ClientConfig clientConfig = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.oauth2.request.OAuth2CreateTokenRequest makeCreateTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest makeRefreshTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2RequestFactory(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.ClientConfig clientConfig) {
        super();
    }
}