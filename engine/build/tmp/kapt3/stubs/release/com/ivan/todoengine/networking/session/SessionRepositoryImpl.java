package com.ivan.todoengine.networking.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/ivan/todoengine/networking/session/SessionRepositoryImpl;", "Lcom/ivan/todoengine/networking/session/SessionRepository;", "oAuth2TokenApi", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "oAuth2TokenStorage", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "oAuth2RequestFactory", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;", "(Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;)V", "hasSession", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logIn", "", "credentials", "Lcom/ivan/todoengine/networking/session/Credentials;", "(Lcom/ivan/todoengine/networking/session/Credentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "engine_release"})
public final class SessionRepositoryImpl implements com.ivan.todoengine.networking.session.SessionRepository {
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi oAuth2TokenApi = null;
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage = null;
    private final com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory oAuth2RequestFactory = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object logIn(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.session.Credentials credentials, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object logOut(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object hasSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public SessionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    @com.ivan.todoengine.di.Authenticated(isAuthenticated = false)
    com.ivan.todoengine.networking.oauth2.OAuth2TokenApi oAuth2TokenApi, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage, @org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory oAuth2RequestFactory) {
        super();
    }
}