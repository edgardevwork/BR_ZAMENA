package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    public interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.isHandlingException.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
                } else {
                    Logger.getLogger().m1355d("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                Logger.getLogger().m1358e("An error occurred in the uncaught exception handler", e);
                if (this.defaultHandler != null) {
                }
            }
            if (this.defaultHandler == null) {
                Logger.getLogger().m1355d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            } else {
                Logger.getLogger().m1355d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            }
            this.isHandlingException.set(false);
        } catch (Throwable th2) {
            if (this.defaultHandler == null) {
                Logger.getLogger().m1355d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            } else {
                Logger.getLogger().m1355d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            }
            this.isHandlingException.set(false);
            throw th2;
        }
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().m1357e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            Logger.getLogger().m1357e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        Logger.getLogger().m1355d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }
}
