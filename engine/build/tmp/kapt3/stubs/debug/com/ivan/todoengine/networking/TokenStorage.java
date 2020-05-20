package com.ivan.todoengine.networking;

import java.lang.System;

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ivan/todoengine/networking/TokenStorage;", "TOKEN_TYPE", "Lcom/ivan/todoengine/networking/AuthToken;", "", "clearToken", "", "readToken", "()Lcom/ivan/todoengine/networking/AuthToken;", "saveToken", "token", "(Lcom/ivan/todoengine/networking/AuthToken;)V", "engine_debug"})
public abstract interface TokenStorage<TOKEN_TYPE extends com.ivan.todoengine.networking.AuthToken> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract TOKEN_TYPE readToken();
    
    public abstract void clearToken();
    
    public abstract void saveToken(@org.jetbrains.annotations.NotNull()
    TOKEN_TYPE token);
}