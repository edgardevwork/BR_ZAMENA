package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dh */
/* loaded from: classes6.dex */
public final class RunnableC9483dh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f7954a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f7955b;

    public RunnableC9483dh(C8778Ah c8778Ah, Throwable th) {
        this.f7955b = c8778Ah;
        this.f7954a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f7955b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportUnhandledException(this.f7954a);
    }
}
