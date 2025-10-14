package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public interface ICrashTransformer {
    @Nullable
    Throwable process(@NonNull Throwable th);
}
