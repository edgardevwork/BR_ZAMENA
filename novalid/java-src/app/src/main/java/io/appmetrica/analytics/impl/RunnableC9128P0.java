package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.P0 */
/* loaded from: classes5.dex */
public final class RunnableC9128P0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9692m1 f7073a;

    public RunnableC9128P0(C9692m1 c9692m1) {
        this.f7073a = c9692m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7073a).sendEventsBuffer();
    }
}
