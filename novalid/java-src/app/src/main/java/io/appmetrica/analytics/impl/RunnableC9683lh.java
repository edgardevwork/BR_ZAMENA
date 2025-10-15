package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.lh */
/* loaded from: classes5.dex */
public final class RunnableC9683lh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f8592a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8593b;

    public RunnableC9683lh(C8778Ah c8778Ah, ECommerceEvent eCommerceEvent) {
        this.f8593b = c8778Ah;
        this.f8592a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8593b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportECommerce(this.f8592a);
    }
}
