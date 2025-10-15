package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ch */
/* loaded from: classes6.dex */
public final class RunnableC9458ch implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7851a;

    /* renamed from: b */
    public final /* synthetic */ String f7852b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f7853c;

    /* renamed from: d */
    public final /* synthetic */ C8778Ah f7854d;

    public RunnableC9458ch(C8778Ah c8778Ah, String str, String str2, Throwable th) {
        this.f7854d = c8778Ah;
        this.f7851a = str;
        this.f7852b = str2;
        this.f7853c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f7854d;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportError(this.f7851a, this.f7852b, this.f7853c);
    }
}
