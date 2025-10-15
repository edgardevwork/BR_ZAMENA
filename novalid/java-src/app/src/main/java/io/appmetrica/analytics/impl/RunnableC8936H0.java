package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.H0 */
/* loaded from: classes8.dex */
public final class RunnableC8936H0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f6699a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f6700b;

    public RunnableC8936H0(C9692m1 c9692m1, Intent intent) {
        this.f6700b = c9692m1;
        this.f6699a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8768A7 c8768a7 = this.f6700b.m6452d().f7632b;
        Intent intent = this.f6699a;
        c8768a7.getClass();
        if (intent != null) {
            c8768a7.m4929a(intent.getDataString(), false);
        }
    }
}
