package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gh */
/* loaded from: classes5.dex */
public final class RunnableC9558gh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8200a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8201b;

    public RunnableC9558gh(C8778Ah c8778Ah, String str) {
        this.f8201b = c8778Ah;
        this.f8200a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8201b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).setUserProfileID(this.f8200a);
    }
}
