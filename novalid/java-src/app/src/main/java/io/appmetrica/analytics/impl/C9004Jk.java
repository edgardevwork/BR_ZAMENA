package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Jk */
/* loaded from: classes8.dex */
public final class C9004Jk {

    /* renamed from: a */
    public final /* synthetic */ C9052Lk f6841a;

    public C9004Jk(C9052Lk c9052Lk) {
        this.f6841a = c9052Lk;
    }

    /* renamed from: a */
    public final void m5314a(String str, EnumC9100Nk enumC9100Nk, C9637jl c9637jl) {
        ArrayList arrayList;
        synchronized (this.f6841a.f6950b) {
            try {
                Collection collection = (Collection) this.f6841a.f6949a.f8720a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9267Uk) it.next()).mo5378a(enumC9100Nk, c9637jl);
        }
    }
}
