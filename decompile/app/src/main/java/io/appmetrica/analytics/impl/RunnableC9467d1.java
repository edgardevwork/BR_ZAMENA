package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.d1 */
/* loaded from: classes6.dex */
public final class RunnableC9467d1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExternalAttribution f7887a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7888b;

    public RunnableC9467d1(C9692m1 c9692m1, ExternalAttribution externalAttribution) {
        this.f7888b = c9692m1;
        this.f7887a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7888b).mo5215a(this.f7887a);
    }
}
