package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mh */
/* loaded from: classes5.dex */
public final class RunnableC9708mh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f8653a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8654b;

    public RunnableC9708mh(C8778Ah c8778Ah, boolean z) {
        this.f8654b = c8778Ah;
        this.f8653a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8654b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).setDataSendingEnabled(this.f8653a);
    }
}
