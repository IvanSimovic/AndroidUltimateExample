package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB,\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0013\b\u0001\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher;", "", "tokenStorage", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "oAuth2RequestFactory", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;", "oAuth2TokenApi", "Ldagger/Lazy;", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;Ldagger/Lazy;)V", "refreshToken", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Token;", "Companion", "engine_release"})
public final class OAuth2TokenRefresher {
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage tokenStorage = null;
    private final com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory oAuth2RequestFactory = null;
    private final dagger.Lazy<com.ivan.todoengine.networking.oauth2.OAuth2TokenApi> oAuth2TokenApi = null;
    private static final java.lang.Object lock = null;
    public static final com.ivan.todoengine.networking.oauth2.OAuth2TokenRefresher.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.oauth2.OAuth2Token refreshToken() {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2TokenRefresher(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage tokenStorage, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory oAuth2RequestFactory, @org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = true)
    dagger.Lazy<com.ivan.todoengine.networking.oauth2.OAuth2TokenApi> oAuth2TokenApi) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenRefresher$Companion;", "", "()V", "lock", "engine_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}