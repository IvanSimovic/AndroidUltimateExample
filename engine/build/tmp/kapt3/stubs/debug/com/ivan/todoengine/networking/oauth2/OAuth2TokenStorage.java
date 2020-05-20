package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * Simple storage for OAuth2 Tokens (there should always be one currently)
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage;", "Lcom/ivan/todoengine/networking/TokenStorage;", "Lcom/ivan/todoengine/networking/oauth2/OAuth2Token;", "secureKeyValueStore", "Lcom/ivan/todoengine/data/store/SecureKeyValueStore;", "(Lcom/ivan/todoengine/data/store/SecureKeyValueStore;)V", "clearToken", "", "readToken", "saveToken", "token", "Companion", "engine_debug"})
public final class OAuth2TokenStorage implements com.ivan.todoengine.networking.TokenStorage<com.ivan.todoengine.networking.oauth2.OAuth2Token> {
    private final com.ivan.todoengine.data.store.SecureKeyValueStore secureKeyValueStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "OAuth2TokenStorage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_KEY = "OAuth2TokenStorage.token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESH_TOKEN_KEY = "OAuth2TokenStorage.refresh_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL = "OAuth2TokenStorage.email";
    public static final com.ivan.todoengine.networking.oauth2.OAuth2TokenStorage.Companion Companion = null;
    
    @java.lang.Override()
    public void clearToken() {
    }
    
    @java.lang.Override()
    public void saveToken(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.oauth2.OAuth2Token token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ivan.todoengine.networking.oauth2.OAuth2Token readToken() {
        return null;
    }
    
    @javax.inject.Inject()
    public OAuth2TokenStorage(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.data.store.SecureKeyValueStore secureKeyValueStore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2TokenStorage$Companion;", "", "()V", "EMAIL", "", "REFRESH_TOKEN_KEY", "TAG", "TOKEN_KEY", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}