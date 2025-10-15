package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.W0 */
/* loaded from: classes5.dex */
public final class RunnableC9295W0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f7382a;

    /* renamed from: b */
    public final /* synthetic */ String f7383b;

    /* renamed from: c */
    public final /* synthetic */ C9692m1 f7384c;

    public RunnableC9295W0(C9692m1 c9692m1, String str, String str2) {
        this.f7384c = c9692m1;
        this.f7382a = str;
        this.f7383b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7384c).mo4986b(this.f7382a, this.f7383b);
    }
}
