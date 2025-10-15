package io.appmetrica.analytics.coreutils.internal.time;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;", "Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;", "()V", "currentTimeMillis", "", "currentTimeSeconds", "elapsedRealtime", "systemNanoTime", "uptimeMillis", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class SystemTimeProvider implements TimeProvider {
    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long systemNanoTime() {
        return System.nanoTime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
