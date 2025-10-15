package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;

/* renamed from: io.appmetrica.analytics.billingv6.impl.d */
/* loaded from: classes5.dex */
public final class C8698d implements BillingClientStateListener {

    /* renamed from: a */
    public final BillingConfig f6037a;

    /* renamed from: b */
    public final BillingClient f6038b;

    /* renamed from: c */
    public final UtilsProvider f6039c;

    /* renamed from: d */
    public final C8701g f6040d;

    public C8698d(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1, C8701g c8701g) {
        this.f6037a = billingConfig;
        this.f6038b = billingClient;
        this.f6039c = billingLibraryMonitor$updateBilling$1$runSafety$1;
        this.f6040d = c8701g;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f6039c.getWorkerExecutor().execute(new C8695a(this, billingResult));
    }
}
