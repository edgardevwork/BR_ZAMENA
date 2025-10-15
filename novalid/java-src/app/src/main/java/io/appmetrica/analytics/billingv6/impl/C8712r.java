package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.billingv6.impl.r */
/* loaded from: classes5.dex */
public final class C8712r implements PurchasesResponseListener {

    /* renamed from: a */
    public final UtilsProvider f6080a;

    /* renamed from: b */
    public final Function0 f6081b;

    /* renamed from: c */
    public final List f6082c;

    /* renamed from: d */
    public final List f6083d;

    /* renamed from: e */
    public final C8701g f6084e;

    public C8712r(UtilsProvider utilsProvider, Function0 function0, List list, List list2, C8701g c8701g) {
        this.f6080a = utilsProvider;
        this.f6081b = function0;
        this.f6082c = list;
        this.f6083d = list2;
        this.f6084e = c8701g;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f6080a.getWorkerExecutor().execute(new C8711q(this, billingResult, list));
    }
}
