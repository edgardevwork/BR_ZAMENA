package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.O4 */
/* loaded from: classes5.dex */
public final class C9108O4 {

    /* renamed from: a */
    public final C8772Ab f7050a;

    public C9108O4() {
        this(C9676la.m6362h().m6372i());
    }

    /* renamed from: a */
    public static C9227T4 m5453a(C9060M4 c9060m4) {
        return new C9227T4(new C9179R4(c9060m4), c9060m4);
    }

    public C9108O4(C8772Ab c8772Ab) {
        this.f7050a = c8772Ab;
    }

    /* renamed from: a */
    public final C9688lm m5454a(C9060M4 c9060m4, C8907Fl c8907Fl) {
        C9688lm c9688lm = new C9688lm(c9060m4, new C9407ag(c8907Fl));
        C8772Ab c8772Ab = this.f7050a;
        synchronized (c8772Ab) {
            c8772Ab.f6323c.add(c9688lm);
        }
        return c9688lm;
    }
}
