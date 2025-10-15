package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.ck */
/* loaded from: classes6.dex */
public final class C9461ck {

    /* renamed from: a */
    public final C9765p f7861a;

    /* renamed from: b */
    public final C9871t5 f7862b;

    /* renamed from: c */
    public final InterfaceC9715n f7863c;

    /* renamed from: d */
    public final InterfaceC9715n f7864d;

    /* renamed from: e */
    public final C9815r f7865e;

    /* renamed from: f */
    public final C9665l f7866f;

    /* renamed from: g */
    public boolean f7867g;

    public C9461ck(C9765p c9765p, C9665l c9665l) {
        this(c9765p, c9665l, new C9871t5(), new C9815r());
    }

    /* renamed from: a */
    public final void m5996a(final Activity activity, EnumC9690m enumC9690m) {
        synchronized (this) {
            try {
                if (this.f7867g) {
                    C9871t5 c9871t5 = this.f7862b;
                    InterfaceC9954wd interfaceC9954wd = new InterfaceC9954wd() { // from class: io.appmetrica.analytics.impl.ck$$ExternalSyntheticLambda0
                        @Override // io.appmetrica.analytics.impl.InterfaceC9954wd
                        public final void consume(Object obj) {
                            this.f$0.m5995a(activity, (C9330Xb) obj);
                        }
                    };
                    c9871t5.getClass();
                    C9820r4.m6725i().f8968c.m6201a().execute(new RunnableC9846s5(c9871t5, interfaceC9954wd));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m5998b(final Activity activity, EnumC9690m enumC9690m) {
        synchronized (this) {
            try {
                if (this.f7867g) {
                    C9871t5 c9871t5 = this.f7862b;
                    InterfaceC9954wd interfaceC9954wd = new InterfaceC9954wd() { // from class: io.appmetrica.analytics.impl.ck$$ExternalSyntheticLambda1
                        @Override // io.appmetrica.analytics.impl.InterfaceC9954wd
                        public final void consume(Object obj) {
                            this.f$0.m5997b(activity, (C9330Xb) obj);
                        }
                    };
                    c9871t5.getClass();
                    C9820r4.m6725i().f8968c.m6201a().execute(new RunnableC9846s5(c9871t5, interfaceC9954wd));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C9461ck(C9765p c9765p, C9665l c9665l, C9871t5 c9871t5, C9815r c9815r) {
        this.f7867g = false;
        this.f7861a = c9765p;
        this.f7866f = c9665l;
        this.f7862b = c9871t5;
        this.f7865e = c9815r;
        this.f7863c = new InterfaceC9715n() { // from class: io.appmetrica.analytics.impl.ck$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.impl.InterfaceC9715n
            /* renamed from: a */
            public final void mo5297a(Activity activity, EnumC9690m enumC9690m) {
                this.f$0.m5996a(activity, enumC9690m);
            }
        };
        this.f7864d = new InterfaceC9715n() { // from class: io.appmetrica.analytics.impl.ck$$ExternalSyntheticLambda3
            @Override // io.appmetrica.analytics.impl.InterfaceC9715n
            /* renamed from: a */
            public final void mo5297a(Activity activity, EnumC9690m enumC9690m) {
                this.f$0.m5998b(activity, enumC9690m);
            }
        };
    }

    /* renamed from: b */
    public final void m5997b(Activity activity, C9330Xb c9330Xb) {
        if (this.f7865e.m6721a(activity, EnumC9790q.PAUSED)) {
            c9330Xb.mo5219b(activity);
        }
    }

    /* renamed from: a */
    public final synchronized EnumC9740o m5994a() {
        try {
            if (!this.f7867g) {
                this.f7861a.m6616a(this.f7863c, EnumC9690m.RESUMED);
                this.f7861a.m6616a(this.f7864d, EnumC9690m.PAUSED);
                this.f7867g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7861a.f8864b;
    }

    /* renamed from: a */
    public final void m5995a(Activity activity, C9330Xb c9330Xb) {
        if (this.f7865e.m6721a(activity, EnumC9790q.RESUMED)) {
            c9330Xb.mo5213a(activity);
        }
    }
}
