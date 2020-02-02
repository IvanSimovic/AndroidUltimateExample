package com.ivan.todoengine.networking;

import java.lang.System;

/**
 * Token that expires at a specific time
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/ivan/todoengine/networking/SetTimeExpirableAuthToken;", "Lcom/ivan/todoengine/networking/ExpirableAuthToken;", "expirationTimestamp", "", "getExpirationTimestamp", "()J", "expired", "", "engine_debug"})
public abstract interface SetTimeExpirableAuthToken extends com.ivan.todoengine.networking.ExpirableAuthToken {
    
    public abstract long getExpirationTimestamp();
    
    @java.lang.Override()
    public abstract boolean expired();
    
    /**
     * Token that expires at a specific time
     * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static boolean expired(com.ivan.todoengine.networking.SetTimeExpirableAuthToken $this) {
            return false;
        }
    }
}