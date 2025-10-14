package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class BackpressureHelper {
    public static long addCap(long a2, long b) {
        long j = a2 + b;
        if (j < 0) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    public BackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static long multiplyCap(long a2, long b) {
        long j = a2 * b;
        if (((a2 | b) >>> 31) == 0 || j / a2 == b) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    public static long add(@NonNull AtomicLong requested, long n) {
        long j;
        do {
            j = requested.get();
            if (j == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!requested.compareAndSet(j, addCap(j, n)));
        return j;
    }

    public static long addCancel(@NonNull AtomicLong requested, long n) {
        long j;
        do {
            j = requested.get();
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!requested.compareAndSet(j, addCap(j, n)));
        return j;
    }

    public static long produced(@NonNull AtomicLong requested, long n) {
        long j;
        long j2;
        do {
            j = requested.get();
            if (j == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j2 = j - n;
            if (j2 < 0) {
                RxJavaPlugins.onError(new IllegalStateException("More produced than requested: " + j2));
                j2 = 0L;
            }
        } while (!requested.compareAndSet(j, j2));
        return j2;
    }

    public static long producedCancel(@NonNull AtomicLong requested, long n) {
        long j;
        long j2;
        do {
            j = requested.get();
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j2 = j - n;
            if (j2 < 0) {
                RxJavaPlugins.onError(new IllegalStateException("More produced than requested: " + j2));
                j2 = 0L;
            }
        } while (!requested.compareAndSet(j, j2));
        return j2;
    }
}
