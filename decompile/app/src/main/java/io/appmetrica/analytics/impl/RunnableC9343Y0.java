package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Y0 */
/* loaded from: classes6.dex */
public final class RunnableC9343Y0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7543a;

    /* renamed from: b */
    public final /* synthetic */ String f7544b;

    /* renamed from: c */
    public final /* synthetic */ C9692m1 f7545c;

    public RunnableC9343Y0(C9692m1 c9692m1, String str, String str2) {
        this.f7545c = c9692m1;
        this.f7543a = str;
        this.f7544b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9816r0 c9816r0 = this.f7545c.f8612a;
        String str = this.f7543a;
        String str2 = this.f7544b;
        c9816r0.getClass();
        C9791q0.m6663g().putAppEnvironmentValue(str, str2);
    }
}
