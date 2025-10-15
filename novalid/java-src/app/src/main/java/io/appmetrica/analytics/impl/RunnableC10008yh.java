package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yh */
/* loaded from: classes8.dex */
public final class RunnableC10008yh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f9368a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f9369b;

    public RunnableC10008yh(C8778Ah c8778Ah, String str) {
        this.f9369b = c8778Ah;
        this.f9368a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9369b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportEvent(this.f9368a);
    }
}
