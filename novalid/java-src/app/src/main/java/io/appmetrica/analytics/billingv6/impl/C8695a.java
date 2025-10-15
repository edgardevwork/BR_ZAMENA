package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* renamed from: io.appmetrica.analytics.billingv6.impl.a */
/* loaded from: classes5.dex */
public final class C8695a extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8698d f6030a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f6031b;

    public C8695a(C8698d c8698d, BillingResult billingResult) {
        this.f6030a = c8698d;
        this.f6031b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C8698d c8698d = this.f6030a;
        BillingResult billingResult = this.f6031b;
        c8698d.getClass();
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        for (String str : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"inapp", "subs"})) {
            BillingConfig billingConfig = c8698d.f6037a;
            BillingClient billingClient = c8698d.f6038b;
            UtilsProvider utilsProvider = c8698d.f6039c;
            C8701g c8701g = c8698d.f6040d;
            C8710p c8710p = new C8710p(billingConfig, billingClient, utilsProvider, str, c8701g);
            c8701g.f6047c.add(c8710p);
            c8698d.f6039c.getUiExecutor().execute(new C8697c(c8698d, str, c8710p));
        }
    }
}
