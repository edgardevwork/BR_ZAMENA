package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nj */
/* loaded from: classes7.dex */
public final class C9735nj {

    /* renamed from: a */
    public volatile long f8759a;

    /* renamed from: b */
    public C9830re f8760b;

    /* renamed from: c */
    public TimeProvider f8761c;

    /* renamed from: c */
    public static C9735nj m6556c() {
        return AbstractC9710mj.f8655a;
    }

    /* renamed from: a */
    public final synchronized long m6557a() {
        return (System.currentTimeMillis() / 1000) + this.f8759a;
    }

    /* renamed from: b */
    public final synchronized void m6560b() {
        this.f8760b.m6766c(false);
        this.f8760b.m6648b();
    }

    /* renamed from: d */
    public final synchronized long m6561d() {
        return this.f8759a;
    }

    /* renamed from: e */
    public final synchronized void m6562e() {
        m6559a(C9676la.f8552C.m6386w(), new SystemTimeProvider());
    }

    /* renamed from: f */
    public final synchronized boolean m6563f() {
        return this.f8760b.m6760a(true);
    }

    /* renamed from: a */
    public final synchronized void m6558a(long j, @Nullable Long l) {
        try {
            this.f8759a = (j - this.f8761c.currentTimeMillis()) / 1000;
            boolean z = true;
            if (this.f8760b.m6760a(true)) {
                if (l != null) {
                    long jAbs = Math.abs(j - this.f8761c.currentTimeMillis());
                    C9830re c9830re = this.f8760b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c9830re.m6766c(z);
                } else {
                    this.f8760b.m6766c(false);
                }
            }
            this.f8760b.m6767d(this.f8759a);
            this.f8760b.m6648b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m6559a(C9830re c9830re, TimeProvider timeProvider) {
        this.f8760b = c9830re;
        this.f8759a = c9830re.m6757a(0);
        this.f8761c = timeProvider;
    }
}
