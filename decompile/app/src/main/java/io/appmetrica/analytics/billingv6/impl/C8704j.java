package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.j */
/* loaded from: classes5.dex */
public final class C8704j extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8705k f6053a;

    /* renamed from: b */
    public final /* synthetic */ C8712r f6054b;

    public C8704j(C8705k c8705k, C8712r c8712r) {
        this.f6053a = c8705k;
        this.f6054b = c8712r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f6053a.f6056b.isReady()) {
            this.f6053a.f6056b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.f6053a.f6055a).build(), this.f6054b);
        } else {
            this.f6053a.f6057c.getWorkerExecutor().execute(new C8703i(this.f6053a, this.f6054b));
        }
    }
}
