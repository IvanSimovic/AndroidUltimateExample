package com.ivan.todoengine.networking.oauth2.request;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ivan/todoengine/networking/oauth2/request/OAuth2GrantRequest;", "", "grantType", "", "clientId", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "engine_debug"})
public abstract class OAuth2GrantRequest {
    @com.google.gson.annotations.SerializedName(value = "grant_type")
    private final java.lang.String grantType = null;
    @com.google.gson.annotations.SerializedName(value = "client_id")
    private final java.lang.String clientId = null;
    @com.google.gson.annotations.SerializedName(value = "client_secret")
    private final java.lang.String clientSecret = null;
    
    public OAuth2GrantRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String grantType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret) {
        super();
    }
}