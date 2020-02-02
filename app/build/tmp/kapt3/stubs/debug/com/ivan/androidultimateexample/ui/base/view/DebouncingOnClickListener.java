package com.ivan.androidultimateexample.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/DebouncingOnClickListener;", "Landroid/view/View$OnClickListener;", "()V", "doClick", "", "v", "Landroid/view/View;", "onClick", "Companion", "app_debug"})
public abstract class DebouncingOnClickListener implements android.view.View.OnClickListener {
    private static boolean enabled;
    private static final java.lang.Runnable ENABLE_AGAIN = null;
    public static final com.ivan.androidultimateexample.ui.base.view.DebouncingOnClickListener.Companion Companion = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public abstract void doClick(@org.jetbrains.annotations.Nullable()
    android.view.View v);
    
    public DebouncingOnClickListener() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ivan/androidultimateexample/ui/base/view/DebouncingOnClickListener$Companion;", "", "()V", "ENABLE_AGAIN", "Ljava/lang/Runnable;", "enabled", "", "getEnabled$app_debug", "()Z", "setEnabled$app_debug", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean getEnabled$app_debug() {
            return false;
        }
        
        public final void setEnabled$app_debug(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}