package com.ivan.todoengine.networking.oauth2.request;

import java.lang.System;

/**
 * Provides easy creation of [OAuth2GrantRequest] objects
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;", "", "()V", "makeCreateTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2CreateTokenRequest;", "email", "", "password", "makeRefreshTokenRequest", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest;", "refreshToken", "engine_release"})
public final class OAuth2RequestFactory {
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.oauth2.request.OAuth2CreateTokenRequest makeCreateTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest makeRefreshTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2RequestFactory() {
        super();
    }
}