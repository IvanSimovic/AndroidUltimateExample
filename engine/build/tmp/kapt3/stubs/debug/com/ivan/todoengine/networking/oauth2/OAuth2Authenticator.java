package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * OKHttp OAuth2 authenticator implementation
 * Made to fix request on 401 responses
 * Since we are checking tokens expiration time prior to sending requests and adding headers
 * to all requests with [OAuth2Interceptor], this class should not have much work
 * It will try to add missing header and log errors
 *
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Authenticator;", "Lokhttp3/Authenticator;", "oAuth2TokenStorage", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "oAuth2TokenRefresher", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher;", "(Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "retryWithToken", "accessToken", "", "Companion", "engine_debug"})
public final class OAuth2Authenticator implements okhttp3.Authenticator {
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage = null;
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenRefresher oAuth2TokenRefresher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "OAuth2Authenticator";
    private static final java.lang.String AUTH_HEADER = "Authorization";
    private static final java.lang.String AUTH_HEADER_PREFIX = "Bearer ";
    public static final com.ivan.todoengine.networking.oauth2.OAuth2Authenticator.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) throws java.io.IOException {
        return null;
    }
    
    private final okhttp3.Request retryWithToken(okhttp3.Response response, java.lang.String accessToken) {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2Authenticator(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenRefresher oAuth2TokenRefresher) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Authenticator$Companion;", "", "()V", "AUTH_HEADER", "", "AUTH_HEADER_PREFIX", "TAG", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}