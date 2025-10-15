package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.R0 */
/* loaded from: classes5.dex */
public final class RunnableC9175R0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f7179a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7180b;

    public RunnableC9175R0(C9692m1 c9692m1, ECommerceEvent eCommerceEvent) {
        this.f7180b = c9692m1;
        this.f7179a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7180b).reportECommerce(this.f7179a);
    }
}
