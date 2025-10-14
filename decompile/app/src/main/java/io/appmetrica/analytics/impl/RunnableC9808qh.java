package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh */
/* loaded from: classes7.dex */
public final class RunnableC9808qh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8945a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f8946b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f8947c;

    public RunnableC9808qh(C8778Ah c8778Ah, String str, byte[] bArr) {
        this.f8947c = c8778Ah;
        this.f8945a = str;
        this.f8946b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8947c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).setSessionExtra(this.f8945a, this.f8946b);
    }
}
