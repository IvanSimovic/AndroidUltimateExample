package com.ivan.todoengine.networking.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ivan/todoengine/networking/session/SessionRepositoryImpl;", "Lcom/ivan/todoengine/networking/session/SessionRepository;", "oAuth2TokenApi", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;", "oAuth2TokenStorage", "Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "oAuth2RequestFactory", "Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;", "(Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenApi;Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;Lcom/ivan/todoengine/networking/oauth2/request/OAuth2RequestFactory;)V", "hasSession", "", "logIn", "", "credentials", "Lcom/ivan/todoengine/networking/session/Credentials;", "logOut", "engine_debug"})
public final class SessionRepositoryImpl implements com.ivan.todoengine.networking.session.SessionRepository {
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenApi oAuth2TokenApi = null;
    private final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage oAuth2TokenStorage = null;
    private final com.ivan.todoengine.networking.oauth2.request.OAuth2RequestFactory oAuth2RequestFactory = null;
    
    @java.lang.Override()
    public void logIn(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.session.Credentials credentials) {
    }
    
    @java.lang.Override()
    public void logOut() {
    }
    
    @java.lang.Override()
    public boolean hasSession() {
        return false;
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