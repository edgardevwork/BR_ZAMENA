package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh */
/* loaded from: classes6.dex */
public final class RunnableC9433bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7783a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f7784b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f7785c;

    public RunnableC9433bh(C8778Ah c8778Ah, String str, Throwable th) {
        this.f7785c = c8778Ah;
        this.f7783a = str;
        this.f7784b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f7785c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportError(this.f7783a, this.f7784b);
    }
}
