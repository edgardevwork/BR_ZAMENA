package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.zj */
/* loaded from: classes5.dex */
public final class C10035zj extends AbstractC9928vc {

    /* renamed from: a */
    public final C9939vn f9406a;

    public C10035zj() {
        this(C9676la.m6362h().m6363A().m7012b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: a */
    public final void mo6350a(int i) {
        C9939vn c9939vn = this.f9406a;
        synchronized (c9939vn) {
            C9989xn c9989xn = c9939vn.f9242a;
            c9989xn.m6980a(c9989xn.m6979a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: b */
    public final int mo6351b() {
        int iOptInt;
        C9939vn c9939vn = this.f9406a;
        synchronized (c9939vn) {
            iOptInt = c9939vn.f9242a.m6979a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9928vc
    /* renamed from: c */
    public final SparseArray<InterfaceC9903uc> mo6352c() {
        SparseArray<InterfaceC9903uc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C8780Aj(this.f9406a));
        sparseArray.put(115, new C8805Bj());
        return sparseArray;
    }

    public C10035zj(C9939vn c9939vn) {
        this.f9406a = c9939vn;
    }
}
