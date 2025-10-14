package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeOffsetProvider;", "", "", "timestamp", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "elapsedRealtimeOffsetInSeconds", "timestampInUnit", "elapsedRealtimeOffset", "systemNanoTimeOffsetInNanos", "systemNanoTimeOffsetInSeconds", "offsetInSecondsIfNotZero", "Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;", "mSystemTimeProvider", SegmentConstantPool.INITSTRING, "(Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;)V", "()V", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a */
    private final SystemTimeProvider f6226a;

    @VisibleForTesting
    public SystemTimeOffsetProvider(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f6226a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long timestampInUnit, @NotNull TimeUnit timeUnit) {
        return this.f6226a.elapsedRealtime() - timeUnit.toMillis(timestampInUnit);
    }

    public final long elapsedRealtimeOffsetInSeconds(long timestamp, @NotNull TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(timestamp, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long timestamp, @NotNull TimeUnit timeUnit) {
        if (timestamp == 0) {
            return 0L;
        }
        return this.f6226a.currentTimeSeconds() - timeUnit.toSeconds(timestamp);
    }

    public final long systemNanoTimeOffsetInNanos(long timestamp, @NotNull TimeUnit timeUnit) {
        return this.f6226a.systemNanoTime() - timeUnit.toNanos(timestamp);
    }

    public final long systemNanoTimeOffsetInSeconds(long timestamp, @NotNull TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(timestamp, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
