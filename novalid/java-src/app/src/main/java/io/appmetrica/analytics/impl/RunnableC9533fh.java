package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fh */
/* loaded from: classes6.dex */
public final class RunnableC9533fh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8778Ah f8130a;

    public RunnableC9533fh(C8778Ah c8778Ah) {
        this.f8130a = c8778Ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8130a;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).pauseSession();
    }
}
