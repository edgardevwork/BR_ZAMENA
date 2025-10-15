package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Ab */
/* loaded from: classes6.dex */
public final class C8772Ab {

    /* renamed from: a */
    public final C9321X2 f6321a;

    /* renamed from: b */
    public final C9593i2 f6322b;

    /* renamed from: c */
    public final ArrayList f6323c;

    public C8772Ab(C9321X2 c9321x2, C9593i2 c9593i2) {
        ArrayList arrayList = new ArrayList();
        this.f6323c = arrayList;
        this.f6321a = c9321x2;
        arrayList.add(c9321x2);
        this.f6322b = c9593i2;
        arrayList.add(c9593i2);
    }

    /* renamed from: a */
    public final synchronized void m4950a() {
        Iterator it = this.f6323c.iterator();
        while (it.hasNext()) {
            ((InterfaceC10010yj) it.next()).onCreate();
        }
    }

    /* renamed from: a */
    public final synchronized void m4951a(C9651ka c9651ka) {
        this.f6323c.add(c9651ka);
    }
}
