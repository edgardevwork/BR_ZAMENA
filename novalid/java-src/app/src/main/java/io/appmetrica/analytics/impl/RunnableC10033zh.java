package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zh */
/* loaded from: classes8.dex */
public final class RunnableC10033zh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f9402a;

    /* renamed from: b */
    public final /* synthetic */ String f9403b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f9404c;

    public RunnableC10033zh(C8778Ah c8778Ah, String str, String str2) {
        this.f9404c = c8778Ah;
        this.f9402a = str;
        this.f9403b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9404c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportEvent(this.f9402a, this.f9403b);
    }
}
