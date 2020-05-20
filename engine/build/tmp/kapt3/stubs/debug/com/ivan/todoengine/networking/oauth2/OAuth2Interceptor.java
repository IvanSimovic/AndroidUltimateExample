package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * OKHttp2 interceptor for OAuth2 authorization
 * It will add Authorization header and refresh token when needed
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Interceptor;", "Lokhttp3/Interceptor;", "oAuth2TokenStorage", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "oAuth2TokenRefresher", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher;", "(Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "engine_debug"})
public final class OAuth2Interceptor implements okhttp3.Interceptor {
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage = null;
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenRefresher oAuth2TokenRefresher = null;
    private static final java.lang.String AUTH_HEADER = "Authorization";
    public static final com.ivan.todoengine.networking.oauth2.OAuth2Interceptor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2Interceptor(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenRefresher oAuth2TokenRefresher) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Interceptor$Companion;", "", "()V", "AUTH_HEADER", "", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}