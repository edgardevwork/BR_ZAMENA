package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.m */
/* loaded from: classes6.dex */
public final class C10056m extends SynchronizedDataCache {

    /* renamed from: d */
    public static final long f9452d = 200;

    /* renamed from: e */
    public static final long f9453e = 50;

    /* renamed from: a */
    public final C10055l f9455a;

    /* renamed from: b */
    public static final long f9450b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static final long f9451c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f */
    public static final List<String> f9454f = Arrays.asList("gps", "network");

    public C10056m() {
        C10055l c10055l = new C10055l(f9451c);
        long j = f9450b;
        this(c10055l, j, 2 * j);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a */
    public final boolean shouldUpdate(@NonNull Location location) {
        return f9454f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || m7033a(location, (Location) this.mCachedData.getData(), this.f9455a.f9449a, 200L));
    }

    public C10056m(C10055l c10055l, long j, long j2) {
        super(j, j2, "location");
        this.f9455a = c10055l;
    }

    /* renamed from: a */
    public static boolean m7033a(@Nullable Location location, @Nullable Location location2, long j, long j2) {
        boolean zEquals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j;
        boolean z2 = time < (-j);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > j2;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && zEquals;
        }
        return true;
    }
}
