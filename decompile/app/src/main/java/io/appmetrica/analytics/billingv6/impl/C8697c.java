package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.c */
/* loaded from: classes5.dex */
public final class C8697c extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8698d f6034a;

    /* renamed from: b */
    public final /* synthetic */ String f6035b;

    /* renamed from: c */
    public final /* synthetic */ C8710p f6036c;

    public C8697c(C8698d c8698d, String str, C8710p c8710p) {
        this.f6034a = c8698d;
        this.f6035b = str;
        this.f6036c = c8710p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f6034a.f6038b.isReady()) {
            this.f6034a.f6038b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(this.f6035b).build(), this.f6036c);
        } else {
            this.f6034a.f6039c.getWorkerExecutor().execute(new C8696b(this.f6034a, this.f6036c));
        }
    }
}
