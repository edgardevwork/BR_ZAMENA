package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.a1 */
/* loaded from: classes6.dex */
public final class RunnableC9392a1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f7659a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7660b;

    public RunnableC9392a1(C9692m1 c9692m1, Activity activity) {
        this.f7660b = c9692m1;
        this.f7659a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1 c9692m1 = this.f7660b;
        C9461ck c9461ck = c9692m1.f8619h;
        Activity activity = this.f7659a;
        InterfaceC8921Ga interfaceC8921Ga = c9692m1.m6452d().f7631a;
        if (activity != null) {
            c9461ck.f7866f.m6346a(activity);
        }
        if (c9461ck.f7865e.m6721a(activity, EnumC9790q.RESUMED)) {
            interfaceC8921Ga.mo5213a(activity);
        }
    }
}
