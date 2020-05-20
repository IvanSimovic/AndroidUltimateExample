package com.ivan.androidultimateexample.ui.main.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/ivan/androidultimateexample/ui/main/login/LoginViewModel;", "Lcom/ivan/androidultimateexample/ui/base/viewmodel/BaseViewModel;", "sessionRepository", "Lcom/ivan/todoengine/networking/session/SessionRepository;", "(Lcom/ivan/todoengine/networking/session/SessionRepository;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "onLogin", "Landroidx/lifecycle/MutableLiveData;", "", "getOnLogin", "()Landroidx/lifecycle/MutableLiveData;", "password", "getPassword", "setPassword", "getSessionRepository", "()Lcom/ivan/todoengine/networking/session/SessionRepository;", "setSessionRepository", "login", "app_debug"})
public final class LoginViewModel extends com.ivan.androidultimateexample.ui.base.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> onLogin = null;
    @org.jetbrains.annotations.NotNull()
    private com.ivan.todoengine.networking.session.SessionRepository sessionRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getOnLogin() {
        return null;
    }
    
    public final void login() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ivan.todoengine.networking.session.SessionRepository getSessionRepository() {
        return null;
    }
    
    public final void setSessionRepository(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.session.SessionRepository p0) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.ivan.todoengine.networking.session.SessionRepository sessionRepository) {
        super();
    }
}