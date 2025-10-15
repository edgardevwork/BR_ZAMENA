package io.appmetrica.analytics.impl;

import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.F0 */
/* loaded from: classes6.dex */
public final class RunnableC8886F0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f6564a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f6565b;

    public RunnableC8886F0(C9692m1 c9692m1, Intent intent) {
        this.f6565b = c9692m1;
        this.f6564a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8768A7 c8768a7 = this.f6565b.m6452d().f7632b;
        Intent intent = this.f6564a;
        c8768a7.getClass();
        if (intent != null) {
            c8768a7.m4929a(intent.getDataString(), false);
        }
    }
}
