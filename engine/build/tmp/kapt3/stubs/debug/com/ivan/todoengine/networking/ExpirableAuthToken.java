package com.ivan.todoengine.networking;

import java.lang.System;

/**
 * Token that can expire
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/ivan/todoengine/networking/ExpirableAuthToken;", "Lcom/ivan/todoengine/networking/AuthToken;", "expired", "", "engine_debug"})
public abstract interface ExpirableAuthToken extends com.ivan.todoengine.networking.AuthToken {
    
    public abstract boolean expired();
}