package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Df */
/* loaded from: classes6.dex */
public final class C8851Df {

    /* renamed from: a */
    public final HashSet f6469a = new HashSet();

    /* renamed from: b */
    public C8901Ff f6470b;

    /* renamed from: c */
    public boolean f6471c;

    /* renamed from: d */
    public final C9939vn f6472d;

    /* renamed from: e */
    public final Context f6473e;

    public C8851Df(Context context, C9939vn c9939vn) {
        this.f6473e = context;
        this.f6472d = c9939vn;
        this.f6470b = c9939vn.m6910b();
        this.f6471c = c9939vn.m6912c();
    }

    /* renamed from: a */
    public final void m5068a() {
        if (this.f6471c) {
            return;
        }
        Context context = this.f6473e;
        InterfaceC9066Ma interfaceC9066MaM5443a = C9095Nf.m5443a(context, C9676la.f8552C.f8558d.m6966a());
        InterfaceC9023Kf interfaceC9023Kf = (InterfaceC9023Kf) new C9906uf(this, new C9095Nf(interfaceC9066MaM5443a), new C9976xa(context), new C9119Of(context)).f9183f.getValue();
        try {
            interfaceC9066MaM5443a.mo4955a(interfaceC9023Kf);
        } catch (Throwable th) {
            interfaceC9023Kf.mo5333a(th);
        }
    }

    /* renamed from: a */
    public final synchronized void m5070a(C8951Hf c8951Hf) {
        this.f6469a.add(c8951Hf);
        if (this.f6471c) {
            c8951Hf.m5251a(this.f6470b);
        }
    }

    /* renamed from: a */
    public final synchronized void m5069a(C8901Ff c8901Ff) {
        Iterator it = this.f6469a.iterator();
        while (it.hasNext()) {
            ((C8951Hf) it.next()).m5251a(c8901Ff);
        }
    }
}
