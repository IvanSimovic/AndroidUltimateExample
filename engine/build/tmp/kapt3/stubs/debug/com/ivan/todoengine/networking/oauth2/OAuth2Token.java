package com.ivan.todoengine.networking.oauth2;

import java.lang.System;

/**
 * Simple model representing OAuth2 AuthToken
 * Should not contain null tokens and should be safe to use
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/OAuth2Token;", "Lcom/ivan/todoengine/networking/RefreshableSetTimeExpirableAuthToken;", "expirationPeriod", "", "createdAt", "accessToken", "", "refreshToken", "(JJLjava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getCreatedAt", "()J", "getExpirationPeriod", "expirationTimestamp", "getExpirationTimestamp", "getRefreshToken", "refreshTokenStringValue", "getRefreshTokenStringValue", "stringValue", "getStringValue", "toString", "engine_debug"})
public final class OAuth2Token implements com.ivan.todoengine.networking.RefreshableSetTimeExpirableAuthToken {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stringValue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String refreshTokenStringValue = null;
    private final long expirationTimestamp = 0L;
    @com.google.gson.annotations.SerializedName(value = "expires_in")
    private final long expirationPeriod = 0L;
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final long createdAt = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "access_token")
    private final java.lang.String accessToken = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "refresh_token")
    private final java.lang.String refreshToken = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getStringValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRefreshTokenStringValue() {
        return null;
    }
    
    @java.lang.Override()
    public long getExpirationTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final long getExpirationPeriod() {
        return 0L;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public OAuth2Token(long expirationPeriod, long createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        super();
    }
    
    @java.lang.Override()
    public boolean expired() {
        return false;
    }
}