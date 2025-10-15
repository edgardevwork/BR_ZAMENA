package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.billingv6.impl.k */
/* loaded from: classes5.dex */
public final class C8705k implements ProductDetailsResponseListener {

    /* renamed from: a */
    public final String f6055a;

    /* renamed from: b */
    public final BillingClient f6056b;

    /* renamed from: c */
    public final UtilsProvider f6057c;

    /* renamed from: d */
    public final Function0 f6058d;

    /* renamed from: e */
    public final List f6059e;

    /* renamed from: f */
    public final C8701g f6060f;

    public C8705k(String str, BillingClient billingClient, UtilsProvider utilsProvider, C8707m c8707m, List list, C8701g c8701g) {
        this.f6055a = str;
        this.f6056b = billingClient;
        this.f6057c = utilsProvider;
        this.f6058d = c8707m;
        this.f6059e = list;
        this.f6060f = c8701g;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f6057c.getWorkerExecutor().execute(new C8702h(this, billingResult, list));
    }
}
