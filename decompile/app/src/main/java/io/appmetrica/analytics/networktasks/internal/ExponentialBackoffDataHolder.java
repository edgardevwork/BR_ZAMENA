package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes7.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a */
    private final TimePassedChecker f9578a;

    /* renamed from: b */
    private final TimeProvider f9579b;

    /* renamed from: c */
    private final HostRetryInfoProvider f9580c;

    /* renamed from: d */
    private long f9581d;

    /* renamed from: e */
    private int f9582e;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker());
    }

    public void reset() {
        this.f9582e = 1;
        this.f9581d = 0L;
        this.f9580c.saveNextSendAttemptNumber(1);
        this.f9580c.saveLastAttemptTimeSeconds(this.f9581d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f9579b.currentTimeSeconds();
        this.f9581d = jCurrentTimeSeconds;
        this.f9582e++;
        this.f9580c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f9580c.saveNextSendAttemptNumber(this.f9582e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f9581d;
            if (j != 0) {
                TimePassedChecker timePassedChecker = this.f9578a;
                int i = ((1 << (this.f9582e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i2 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i2) {
                    i = i2;
                }
                return timePassedChecker.didTimePassSeconds(j, i, "last send attempt");
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker) {
        this.f9580c = hostRetryInfoProvider;
        this.f9579b = systemTimeProvider;
        this.f9578a = timePassedChecker;
        this.f9581d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f9582e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }
}
