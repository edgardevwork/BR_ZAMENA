package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Lk */
/* loaded from: classes8.dex */
public final class C9052Lk {

    /* renamed from: a */
    public final C9726na f6949a = new C9726na();

    /* renamed from: b */
    public final HashMap f6950b = new HashMap();

    /* renamed from: c */
    public C9637jl f6951c = null;

    /* renamed from: d */
    public final C9004Jk f6952d = new C9004Jk(this);

    /* renamed from: a */
    public static final C9052Lk m5366a() {
        return AbstractC9028Kk.f6915a;
    }

    /* renamed from: a */
    public final C8907Fl m5367a(Context context, C9396a5 c9396a5, C9487dl c9487dl) {
        C8907Fl c8907Fl = (C8907Fl) this.f6950b.get(c9396a5.f7668a);
        boolean z = true;
        if (c8907Fl == null) {
            synchronized (this.f6950b) {
                try {
                    c8907Fl = (C8907Fl) this.f6950b.get(c9396a5.f7668a);
                    if (c8907Fl == null) {
                        c8907Fl = new C8907Fl(new C8932Gl(context, c9396a5.f7668a, c9487dl, this.f6952d));
                        c8907Fl.m5202f();
                        this.f6950b.put(c9396a5.f7668a, c8907Fl);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            c8907Fl.m5193a(c9487dl);
        }
        return c8907Fl;
    }

    /* renamed from: a */
    public final void m5368a(C9396a5 c9396a5, InterfaceC9267Uk interfaceC9267Uk) {
        synchronized (this.f6950b) {
            try {
                this.f6949a.m6504a(c9396a5.f7668a, interfaceC9267Uk);
                C9637jl c9637jl = this.f6951c;
                if (c9637jl != null) {
                    interfaceC9267Uk.mo5381a(c9637jl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
