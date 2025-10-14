package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* renamed from: io.appmetrica.analytics.billingv6.impl.p */
/* loaded from: classes5.dex */
public final class C8710p implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    public final BillingConfig f6072a;

    /* renamed from: b */
    public final BillingClient f6073b;

    /* renamed from: c */
    public final UtilsProvider f6074c;

    /* renamed from: d */
    public final String f6075d;

    /* renamed from: e */
    public final C8701g f6076e;

    public C8710p(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, C8701g c8701g) {
        this.f6072a = billingConfig;
        this.f6073b = billingClient;
        this.f6074c = utilsProvider;
        this.f6075d = str;
        this.f6076e = c8701g;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f6074c.getWorkerExecutor().execute(new C8706l(this, billingResult, list));
    }
}
