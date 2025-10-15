package io.appmetrica.analytics.impl;

import okhttp3.internal.connection.RealConnection;

/* renamed from: io.appmetrica.analytics.impl.Wj */
/* loaded from: classes6.dex */
public final class C9314Wj {

    /* renamed from: a */
    public final C9964wn f7416a;

    public C9314Wj(C9964wn c9964wn) {
        this.f7416a = c9964wn;
    }

    /* renamed from: a */
    public final long m5720a() {
        long jOptLong;
        C9964wn c9964wn = this.f7416a;
        synchronized (c9964wn) {
            jOptLong = c9964wn.f9286a.m6979a().optLong("session_id", -1L);
        }
        long j = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        if (jOptLong >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j = 1 + jOptLong;
        }
        this.f7416a.m6944c(j);
        return j;
    }
}
