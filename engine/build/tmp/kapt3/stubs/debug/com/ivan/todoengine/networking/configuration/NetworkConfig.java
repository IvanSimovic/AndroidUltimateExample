package com.ivan.todoengine.networking.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/ivan/todoengine/networking/configuration/NetworkConfig;", "", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "connectTimeoutInMs", "", "getConnectTimeoutInMs", "()J", "readTimeoutInMs", "getReadTimeoutInMs", "writeTimeoutInMs", "getWriteTimeoutInMs", "engine_debug"})
public abstract interface NetworkConfig {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBaseUrl();
    
    public abstract long getConnectTimeoutInMs();
    
    public abstract long getReadTimeoutInMs();
    
    public abstract long getWriteTimeoutInMs();
}