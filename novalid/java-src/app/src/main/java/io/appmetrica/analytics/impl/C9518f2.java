package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.f2 */
/* loaded from: classes6.dex */
public final class C9518f2 {

    /* renamed from: a */
    public final C9306Wb f8045a;

    /* renamed from: b */
    public final ICommonExecutor f8046b;

    /* renamed from: c */
    public final long f8047c;

    /* renamed from: d */
    public boolean f8048d = true;

    /* renamed from: e */
    public final Runnable f8049e = new Runnable() { // from class: io.appmetrica.analytics.impl.f2$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            C9518f2.m6079a(this.f$0);
        }
    };

    public C9518f2(C9306Wb c9306Wb, IHandlerExecutor iHandlerExecutor, long j) {
        this.f8045a = c9306Wb;
        this.f8046b = iHandlerExecutor;
        this.f8047c = j;
    }

    /* renamed from: a */
    public static final void m6079a(C9518f2 c9518f2) {
        C9330Xb c9330Xb = c9518f2.f8045a.f7402a;
        C9145Ph c9145Ph = c9330Xb.f7192h;
        c9145Ph.f7117c.m5502a(c9330Xb.f7186b.f7616a);
    }
}
