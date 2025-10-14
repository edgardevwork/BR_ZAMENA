package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.eh */
/* loaded from: classes6.dex */
public final class RunnableC9508eh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8778Ah f8012a;

    public RunnableC9508eh(C8778Ah c8778Ah) {
        this.f8012a = c8778Ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8012a;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).resumeSession();
    }
}
