package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "key", "", "detect", "", "window", "", "limitPerWindow", "", "updateParameters", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "storage", SegmentConstantPool.INITSTRING, "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a */
    private long f6216a;

    /* renamed from: b */
    private int f6217b;

    /* renamed from: c */
    private final EventFrequencyStorage f6218c;

    /* renamed from: d */
    private final SystemTimeProvider f6219d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j, int i, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f6216a = j;
        this.f6217b = i;
        this.f6218c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String key) {
        long jLongValue;
        long jUptimeMillis = this.f6219d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f6218c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j = jUptimeMillis - jLongValue;
        if (j < 0 || j > this.f6216a) {
            this.f6218c.putWindowStart(key, jUptimeMillis);
            this.f6218c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f6218c.getWindowOccurrencesCount(key);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f6218c.putWindowOccurrencesCount(key, iIntValue);
        return iIntValue > this.f6217b;
    }

    public final synchronized void updateParameters(long window, int limitPerWindow) {
        this.f6216a = window;
        this.f6217b = limitPerWindow;
    }
}
