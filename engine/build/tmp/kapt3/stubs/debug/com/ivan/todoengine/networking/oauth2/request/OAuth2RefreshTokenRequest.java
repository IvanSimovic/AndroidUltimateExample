package com.ivan.todoengine.networking.oauth2.request;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest;", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2GrantRequest;", "refreshToken", "", "clientId", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefreshToken", "()Ljava/lang/String;", "Companion", "engine_debug"})
public final class OAuth2RefreshTokenRequest extends com.ivan.todoengine.networking.oauth2.request.OAuth2GrantRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "refresh_token")
    private final java.lang.String refreshToken = null;
    private static final java.lang.String GRANT_TYPE = "refresh_token";
    public static final com.ivan.todoengine.networking.oauth2.request.OAuth2RefreshTokenRequest.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public OAuth2RefreshTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RefreshTokenRequest$Companion;", "", "()V", "GRANT_TYPE", "", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}