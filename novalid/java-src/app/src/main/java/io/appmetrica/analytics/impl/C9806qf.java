package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.qf */
/* loaded from: classes6.dex */
public final class C9806qf implements InterfaceC9706mf {

    /* renamed from: a */
    public final /* synthetic */ C9906uf f8943a;

    public C9806qf(C9906uf c9906uf) {
        this.f8943a = c9906uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9706mf
    @WorkerThread
    /* renamed from: a */
    public final void mo6488a() {
        C9906uf c9906uf = this.f8943a;
        ArrayList arrayList = c9906uf.f9184g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C8901Ff c8901Ff = (C8901Ff) next;
            c9906uf.f9180c.getClass();
            String str = c8901Ff != null ? c8901Ff.f6595a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(next);
            }
        }
        c9906uf.m6858a(c9906uf.f9180c.m5460a(CollectionsKt___CollectionsKt.filterNotNull(arrayList2)));
    }
}
