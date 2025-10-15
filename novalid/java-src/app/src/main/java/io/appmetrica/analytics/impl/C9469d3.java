package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.d3 */
/* loaded from: classes8.dex */
public final class C9469d3 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ ProductInfo f7889a;

    /* renamed from: b */
    public final /* synthetic */ C9494e3 f7890b;

    public C9469d3(C9494e3 c9494e3, ProductInfo productInfo) {
        this.f7890b = c9494e3;
        this.f7889a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C9571h5) this.f7890b.f7984a).mo5440a(C9252U5.m5638a(new C9309We(this.f7889a)));
    }
}
