package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Xg */
/* loaded from: classes5.dex */
public class C9335Xg implements InterfaceC9920v4, InterfaceC9596i5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC9596i5
    @NonNull
    /* renamed from: b */
    public C9571h5 mo5750a(@NonNull Context context, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull C8907Fl c8907Fl) {
        return new C9359Yg(context, c9396a5, c8840d4, C9676la.f8552C.m6370f(), c8907Fl.m5201e(), new C9334Xf(c8907Fl));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9920v4
    @NonNull
    /* renamed from: a */
    public final InterfaceC9895u4 mo4967a(@NonNull Context context, @NonNull C9721n5 c9721n5, @NonNull C9520f4 c9520f4, @NonNull C8865E4 c8865e4) {
        C9238Tf c9238Tf;
        C9396a5 c9396a5 = new C9396a5(c9520f4.f8053b, c9520f4.f8052a);
        C9262Uf c9262Uf = new C9262Uf(this);
        synchronized (c9721n5) {
            c9238Tf = (C9238Tf) c9721n5.m6496a(c9396a5, c8865e4, c9262Uf, c9721n5.f8697a);
        }
        return new C9214Sf(context, c9238Tf);
    }
}
