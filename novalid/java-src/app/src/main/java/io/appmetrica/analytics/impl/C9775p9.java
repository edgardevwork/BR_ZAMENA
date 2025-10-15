package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.p9 */
/* loaded from: classes7.dex */
public final class C9775p9 {

    /* renamed from: a */
    public final List f8890a;

    /* renamed from: b */
    public final InterfaceC9850s9 f8891b;

    /* renamed from: c */
    public final AtomicBoolean f8892c = new AtomicBoolean(true);

    public C9775p9(ArrayList arrayList, InterfaceC9850s9 interfaceC9850s9) {
        this.f8890a = arrayList;
        this.f8891b = interfaceC9850s9;
    }

    /* renamed from: a */
    public final void m6632a() {
        C9571h5 c9571h5 = (C9571h5) this.f8891b;
        synchronized (c9571h5) {
            c9571h5.f8232e.m6408b();
        }
    }

    /* renamed from: b */
    public final void m6633b() {
        if (this.f8892c.get()) {
            if (this.f8890a.isEmpty()) {
                C9571h5 c9571h5 = (C9571h5) this.f8891b;
                synchronized (c9571h5) {
                    c9571h5.f8232e.m6408b();
                }
                return;
            }
            Iterator it = this.f8890a.iterator();
            boolean zMo5021b = false;
            while (it.hasNext()) {
                zMo5021b |= ((InterfaceC8819C8) it.next()).mo5021b();
            }
            if (zMo5021b) {
                m6632a();
            }
        }
    }
}
