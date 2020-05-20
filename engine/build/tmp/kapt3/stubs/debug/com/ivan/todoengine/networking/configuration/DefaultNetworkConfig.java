package com.ivan.todoengine.networking.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/ivan/todoengine/networking/configuration/DefaultNetworkConfig;", "Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "connectTimeoutInMs", "", "getConnectTimeoutInMs", "()J", "readTimeoutInMs", "getReadTimeoutInMs", "writeTimeoutInMs", "getWriteTimeoutInMs", "Companion", "engine_debug"})
@javax.inject.Singleton()
public final class DefaultNetworkConfig implements com.ivan.todoengine.networking.configuration.NetworkConfig {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUrl = "http://192.168.2.3:5000/api/";
    private final long connectTimeoutInMs = 10000L;
    private final long readTimeoutInMs = 10000L;
    private final long writeTimeoutInMs = 10000L;
    private static final long DEFAULT_TIMEOUT_MS = 10000L;
    public static final com.ivan.todoengine.networking.configuration.DefaultNetworkConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBaseUrl() {
        return null;
    }
    
    @java.lang.Override()
    public long getConnectTimeoutInMs() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getReadTimeoutInMs() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getWriteTimeoutInMs() {
        return 0L;
    }
    
    @javax.inject.Inject()
    public DefaultNetworkConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/ivan/todoengine/networking/configuration/DefaultNetworkConfig$Companion;", "", "()V", "DEFAULT_TIMEOUT_MS", "", "engine_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}