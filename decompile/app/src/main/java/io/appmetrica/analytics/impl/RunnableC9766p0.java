package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p0 */
/* loaded from: classes7.dex */
public final class RunnableC9766p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9791q0 f8866a;

    public RunnableC9766p0(C9791q0 c9791q0) {
        this.f8866a = c9791q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f8866a.f8916a;
        C9610ij c9610ij = AbstractC8954Hi.f6726a;
        synchronized (c9610ij) {
            try {
                c9610ij.f8369b = AbstractC8953Hh.f6725a.m5276a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                Iterator it = c9610ij.f8368a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9114Oa) it.next()).mo5277a(c9610ij.f8369b);
                }
                c9610ij.f8368a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
