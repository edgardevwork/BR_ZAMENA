package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h1 */
/* loaded from: classes5.dex */
public final class RunnableC9567h1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8222a;

    /* renamed from: b */
    public final /* synthetic */ String f8223b;

    /* renamed from: c */
    public final /* synthetic */ C9692m1 f8224c;

    public RunnableC9567h1(C9692m1 c9692m1, String str, String str2) {
        this.f8224c = c9692m1;
        this.f8222a = str;
        this.f8223b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8224c).reportEvent(this.f8222a, this.f8223b);
    }
}
