package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wh */
/* loaded from: classes8.dex */
public final class RunnableC9958wh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f9269a;

    /* renamed from: b */
    public final /* synthetic */ String f9270b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f9271c;

    public RunnableC9958wh(C8778Ah c8778Ah, String str, String str2) {
        this.f9271c = c8778Ah;
        this.f9269a = str;
        this.f9270b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9271c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).putAppEnvironmentValue(this.f9269a, this.f9270b);
    }
}
