package io.appmetrica.analytics.logger.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public abstract class BaseDebugLogger {
    public BaseDebugLogger(@NonNull String str) {
    }

    public void error(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
    }

    public void error(@NonNull String str, @Nullable Throwable th) {
    }

    public void error(@NonNull String str, @Nullable Throwable th, @Nullable String str2, @Nullable Object... objArr) {
    }

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
    }

    public void warning(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
    }
}
