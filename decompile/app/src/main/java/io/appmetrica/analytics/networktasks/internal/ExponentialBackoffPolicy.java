package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z);

    void onHostAttemptFinished(boolean z);
}
