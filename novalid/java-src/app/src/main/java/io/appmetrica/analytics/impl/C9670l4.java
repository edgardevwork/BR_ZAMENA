package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.l4 */
/* loaded from: classes6.dex */
public final class C9670l4 extends AbstractC9928vc {

    /* renamed from: a */
    public final C9730ne f8541a;

    public C9670l4(@NonNull Context context) {
        this(new C9730ne(C9398a7.m5836a(context).m5839b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: a */
    public final void mo6350a(int i) {
        this.f8541a.m6521c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: b */
    public final int mo6351b() {
        return (int) this.f8541a.m6510a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: c */
    public final SparseArray<InterfaceC9903uc> mo6352c() {
        return new SparseArray<>();
    }

    public C9670l4(C9730ne c9730ne) {
        this.f8541a = c9730ne;
    }
}
