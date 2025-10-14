package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.bc */
/* loaded from: classes8.dex */
public final class C9428bc implements InterfaceC9920v4, InterfaceC9596i5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC9920v4
    /* renamed from: a */
    public final InterfaceC9895u4 mo4967a(Context context, C9721n5 c9721n5, C9520f4 c9520f4, C8865E4 c8865e4) {
        C9238Tf c9238Tf;
        C9478dc c9478dc = new C9478dc(c9520f4.f8053b, c9520f4.f8052a);
        C9262Uf c9262Uf = new C9262Uf(this);
        synchronized (c9721n5) {
            c9238Tf = (C9238Tf) c9721n5.m6496a(c9478dc, c8865e4, c9262Uf, c9721n5.f8697a);
        }
        return new C9453cc(context, c9238Tf);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9596i5
    /* renamed from: a */
    public final InterfaceC9090Na mo5750a(Context context, C9396a5 c9396a5, C8840D4 c8840d4, C8907Fl c8907Fl) {
        return new C9528fc(context, c8907Fl.m5201e(), c9396a5, c8840d4, C9676la.f8552C.m6381r(), C9676la.f8552C.m6370f(), new C9334Xf(c8907Fl));
    }
}
