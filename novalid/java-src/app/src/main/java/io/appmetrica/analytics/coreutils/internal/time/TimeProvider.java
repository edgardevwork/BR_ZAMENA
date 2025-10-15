package io.appmetrica.analytics.coreutils.internal.time;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;", "", "currentTimeMillis", "", "currentTimeSeconds", "elapsedRealtime", "systemNanoTime", "uptimeMillis", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface TimeProvider {
    long currentTimeMillis();

    long currentTimeSeconds();

    long elapsedRealtime();

    long systemNanoTime();

    long uptimeMillis();
}
