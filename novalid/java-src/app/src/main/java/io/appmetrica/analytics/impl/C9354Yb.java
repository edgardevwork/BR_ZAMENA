package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.Yb */
/* loaded from: classes6.dex */
public final class C9354Yb {

    /* renamed from: a */
    public int f7577a = 5;

    /* renamed from: b */
    public final C9490e f7578b;

    public C9354Yb(InterfaceC9416b0 interfaceC9416b0) {
        this.f7578b = new C9490e(new C10002yb(interfaceC9416b0));
    }

    /* renamed from: b */
    public static final void m5782b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    /* renamed from: a */
    public final void m5783a(final AnrListener anrListener) {
        C9490e c9490e = this.f7578b;
        c9490e.f7972a.add(new InterfaceC9440c() { // from class: io.appmetrica.analytics.impl.Yb$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC9440c
            public final void onAppNotResponding() {
                C9354Yb.m5782b(anrListener);
            }
        });
    }
}
