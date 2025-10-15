package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.u9 */
/* loaded from: classes7.dex */
public final class C9900u9 {

    /* renamed from: a */
    public final ReentrantLock f9170a;

    /* renamed from: b */
    public final C9304W9 f9171b;

    public C9900u9(Context context, String str) {
        this(new ReentrantLock(), new C9304W9(context, str));
    }

    /* renamed from: a */
    public final void m6852a() {
        this.f9170a.lock();
        this.f9171b.m5715a();
    }

    /* renamed from: b */
    public final void m6853b() {
        this.f9171b.m5716b();
        this.f9170a.unlock();
    }

    /* renamed from: c */
    public final void m6854c() {
        C9304W9 c9304w9 = this.f9171b;
        synchronized (c9304w9) {
            c9304w9.m5716b();
            c9304w9.f7397a.delete();
        }
        this.f9170a.unlock();
    }

    public C9900u9(ReentrantLock reentrantLock, C9304W9 c9304w9) {
        this.f9170a = reentrantLock;
        this.f9171b = c9304w9;
    }
}
