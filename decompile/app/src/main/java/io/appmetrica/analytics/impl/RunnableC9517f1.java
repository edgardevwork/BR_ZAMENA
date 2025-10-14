package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.f1 */
/* loaded from: classes6.dex */
public final class RunnableC9517f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f8043a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f8044b;

    public RunnableC9517f1(C9692m1 c9692m1, Activity activity) {
        this.f8044b = c9692m1;
        this.f8043a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1 c9692m1 = this.f8044b;
        C9461ck c9461ck = c9692m1.f8619h;
        Activity activity = this.f8043a;
        InterfaceC8921Ga interfaceC8921Ga = c9692m1.m6452d().f7631a;
        if (activity != null) {
            c9461ck.f7866f.m6346a(activity);
        }
        if (c9461ck.f7865e.m6721a(activity, EnumC9790q.PAUSED)) {
            interfaceC8921Ga.mo5219b(activity);
        }
    }
}
