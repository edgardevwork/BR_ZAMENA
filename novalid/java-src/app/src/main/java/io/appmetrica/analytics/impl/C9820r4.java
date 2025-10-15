package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.r4 */
/* loaded from: classes7.dex */
public final class C9820r4 {

    /* renamed from: r */
    public static volatile C9820r4 f8965r;

    /* renamed from: a */
    public final C9282Vb f8966a;

    /* renamed from: b */
    public final C8868E7 f8967b;

    /* renamed from: c */
    public final C9570h4 f8968c;

    /* renamed from: d */
    public final C9009K1 f8969d;

    /* renamed from: e */
    public final C9765p f8970e;

    /* renamed from: f */
    public final C9461ck f8971f;

    /* renamed from: g */
    public final C8989J5 f8972g;

    /* renamed from: h */
    public final C9665l f8973h;

    /* renamed from: i */
    public final C9713mm f8974i;

    /* renamed from: j */
    public C9379Zc f8975j;

    /* renamed from: k */
    public final C9666l0 f8976k;

    /* renamed from: l */
    public volatile C9745o4 f8977l;

    /* renamed from: m */
    public final C8848Dc f8978m;

    /* renamed from: n */
    public volatile C9730ne f8979n;

    /* renamed from: o */
    public C9884ti f8980o;

    /* renamed from: p */
    public final C9816r0 f8981p;

    /* renamed from: q */
    public final C9401aa f8982q;

    public C9820r4(C9282Vb c9282Vb, C9765p c9765p, C9570h4 c9570h4) {
        this(c9282Vb, c9765p, c9570h4, new C9665l(c9765p));
    }

    /* renamed from: i */
    public static C9820r4 m6725i() {
        if (f8965r == null) {
            synchronized (C9820r4.class) {
                try {
                    if (f8965r == null) {
                        f8965r = new C9820r4(new C9282Vb(), new C9765p(), new C9570h4());
                    }
                } finally {
                }
            }
        }
        return f8965r;
    }

    /* renamed from: a */
    public final C9765p m6727a() {
        return this.f8970e;
    }

    /* renamed from: b */
    public final C9666l0 m6728b() {
        return this.f8976k;
    }

    /* renamed from: c */
    public final C9816r0 m6730c() {
        return this.f8981p;
    }

    /* renamed from: d */
    public final C9009K1 m6731d() {
        return this.f8969d;
    }

    /* renamed from: e */
    public final C9570h4 m6732e() {
        return this.f8968c;
    }

    /* renamed from: f */
    public final C8989J5 m6733f() {
        return this.f8972g;
    }

    /* renamed from: g */
    public final C8868E7 m6734g() {
        return this.f8967b;
    }

    /* renamed from: h */
    public final C9401aa m6735h() {
        return this.f8982q;
    }

    /* renamed from: j */
    public final C9282Vb m6736j() {
        return this.f8966a;
    }

    /* renamed from: k */
    public final C9745o4 m6737k() {
        C9745o4 c9745o4 = this.f8977l;
        if (c9745o4 == null) {
            synchronized (this) {
                try {
                    c9745o4 = this.f8977l;
                    if (c9745o4 == null) {
                        c9745o4 = new C9745o4();
                        this.f8977l = c9745o4;
                    }
                } finally {
                }
            }
        }
        return c9745o4;
    }

    /* renamed from: l */
    public final C9282Vb m6738l() {
        return this.f8966a;
    }

    /* renamed from: m */
    public final C9461ck m6739m() {
        return this.f8971f;
    }

    public C9820r4(C9282Vb c9282Vb, C9765p c9765p, C9570h4 c9570h4, C9665l c9665l) {
        this(c9282Vb, new C8868E7(), c9570h4, c9665l, new C9009K1(), c9765p, new C9461ck(c9765p, c9665l), new C8989J5(c9765p), new C9713mm(), new C9666l0());
    }

    /* renamed from: a */
    public final synchronized C9379Zc m6726a(Context context) {
        try {
            if (this.f8975j == null) {
                this.f8975j = new C9379Zc(context, new C9689ln());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8975j;
    }

    /* renamed from: b */
    public final C9730ne m6729b(Context context) {
        C9730ne c9730ne = this.f8979n;
        if (c9730ne == null) {
            synchronized (this) {
                try {
                    c9730ne = this.f8979n;
                    if (c9730ne == null) {
                        c9730ne = new C9730ne(C9398a7.m5836a(context).m5838a());
                        this.f8979n = c9730ne;
                    }
                } finally {
                }
            }
        }
        return c9730ne;
    }

    public C9820r4(C9282Vb c9282Vb, C8868E7 c8868e7, C9570h4 c9570h4, C9665l c9665l, C9009K1 c9009k1, C9765p c9765p, C9461ck c9461ck, C8989J5 c8989j5, C9713mm c9713mm, C9666l0 c9666l0) {
        this.f8978m = new C8848Dc();
        this.f8981p = new C9816r0();
        this.f8982q = new C9401aa();
        this.f8966a = c9282Vb;
        this.f8967b = c8868e7;
        this.f8968c = c9570h4;
        this.f8973h = c9665l;
        this.f8969d = c9009k1;
        this.f8970e = c9765p;
        this.f8971f = c9461ck;
        this.f8972g = c8989j5;
        this.f8974i = c9713mm;
        this.f8976k = c9666l0;
    }
}
