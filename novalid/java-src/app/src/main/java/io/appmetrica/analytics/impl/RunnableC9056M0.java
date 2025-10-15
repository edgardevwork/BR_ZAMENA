package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.M0 */
/* loaded from: classes8.dex */
public final class RunnableC9056M0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6956a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f6957b;

    public RunnableC9056M0(C9692m1 c9692m1, String str) {
        this.f6957b = c9692m1;
        this.f6956a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9816r0 c9816r0 = this.f6957b.f8612a;
        String str = this.f6956a;
        c9816r0.getClass();
        C9791q0.m6663g().setUserProfileID(str);
    }
}
