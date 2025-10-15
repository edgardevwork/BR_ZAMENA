package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0011"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/time/TimePassedChecker;", "", "", "lastTimeSeconds", "intervalSeconds", "", "tag", "", "didTimePassSeconds", "lastTimeMillis", "intervalMillis", "didTimePassMillis", "Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;", "mTimeProvider", SegmentConstantPool.INITSTRING, "(Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;)V", "()V", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class TimePassedChecker {

    /* renamed from: a */
    private final TimeProvider f6227a;

    @VisibleForTesting
    public TimePassedChecker(@NotNull TimeProvider timeProvider) {
        this.f6227a = timeProvider;
    }

    public final boolean didTimePassMillis(long lastTimeMillis, long intervalMillis, @NotNull String tag) {
        long jCurrentTimeMillis = this.f6227a.currentTimeMillis();
        return jCurrentTimeMillis < lastTimeMillis || jCurrentTimeMillis - lastTimeMillis >= intervalMillis;
    }

    public final boolean didTimePassSeconds(long lastTimeSeconds, long intervalSeconds, @NotNull String tag) {
        long jCurrentTimeSeconds = this.f6227a.currentTimeSeconds();
        return jCurrentTimeSeconds < lastTimeSeconds || jCurrentTimeSeconds - lastTimeSeconds >= intervalSeconds;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
