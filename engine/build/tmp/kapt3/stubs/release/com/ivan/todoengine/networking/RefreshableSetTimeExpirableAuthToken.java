package com.ivan.todoengine.networking;

import java.lang.System;

/**
 * Token that can be refreshed and expires at a set time (like JWT and OAuth2)
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ivan/todoengine/networking/RefreshableSetTimeExpirableAuthToken;", "Lcom/ivan/todoengine/networking/SetTimeExpirableAuthToken;", "Lcom/ivan/todoengine/networking/RefreshableAuthToken;", "engine_release"})
public abstract interface RefreshableSetTimeExpirableAuthToken extends com.ivan.todoengine.networking.SetTimeExpirableAuthToken, com.ivan.todoengine.networking.RefreshableAuthToken {
    
    /**
     * Token that can be refreshed and expires at a set time (like JWT and OAuth2)
     * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static boolean expired(com.ivan.todoengine.networking.RefreshableSetTimeExpirableAuthToken $this) {
            return false;
        }
    }
}