package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;)V", "bindToService", "", "callback", "Landroid/os/Messenger;", "serviceConnection", "Landroid/content/ServiceConnection;", "unbindServiceSafely", "", "appContext", "Landroid/content/Context;", "Companion", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "LifecycleServiceBinder";

    @NotNull
    private final FirebaseApp firebaseApp;

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(@NotNull Messenger callback, @NotNull ServiceConnection serviceConnection) {
        boolean zBindService;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        Context applicationContext = this.firebaseApp.getApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d(TAG, "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e) {
            Log.w(TAG, "Failed to bind session lifecycle service to application.", e);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        unbindServiceSafely(applicationContext, serviceConnection);
        Log.i(TAG, "Session lifecycle service binding failed.");
    }

    private final Object unbindServiceSafely(Context appContext, ServiceConnection serviceConnection) {
        try {
            appContext.unbindService(serviceConnection);
            return Unit.INSTANCE;
        } catch (IllegalArgumentException e) {
            return Integer.valueOf(Log.w(TAG, "Session lifecycle service binding failed.", e));
        }
    }

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m7105d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl$Companion;", "", "()V", "TAG", "", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
