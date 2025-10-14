package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xh */
/* loaded from: classes8.dex */
public final class RunnableC9983xh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8778Ah f9316a;

    public RunnableC9983xh(C8778Ah c8778Ah) {
        this.f9316a = c8778Ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9316a;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).clearAppEnvironment();
    }
}
