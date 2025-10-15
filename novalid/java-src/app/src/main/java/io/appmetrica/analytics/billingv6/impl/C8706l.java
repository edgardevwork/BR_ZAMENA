package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.billingv6.impl.l */
/* loaded from: classes5.dex */
public final class C8706l extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8710p f6061a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f6062b;

    /* renamed from: c */
    public final /* synthetic */ List f6063c;

    public C8706l(C8710p c8710p, BillingResult billingResult, List list) {
        this.f6061a = c8710p;
        this.f6062b = billingResult;
        this.f6063c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C8710p c8710p = this.f6061a;
        BillingResult billingResult = this.f6062b;
        List<PurchaseHistoryRecord> list = this.f6063c;
        c8710p.getClass();
        if (billingResult.getResponseCode() == 0 && list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = c8710p.f6075d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = c8710p.f6074c.getUpdatePolicy().getBillingInfoToUpdate(c8710p.f6072a, linkedHashMap, c8710p.f6074c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                C8714t.m4893a(linkedHashMap, billingInfoToUpdate, c8710p.f6075d, c8710p.f6074c.getBillingInfoManager());
            } else {
                List list2 = CollectionsKt___CollectionsKt.toList(billingInfoToUpdate.keySet());
                C8707m c8707m = new C8707m(linkedHashMap, billingInfoToUpdate, c8710p);
                String str3 = c8710p.f6075d;
                BillingClient billingClient = c8710p.f6073b;
                UtilsProvider utilsProvider = c8710p.f6074c;
                C8701g c8701g = c8710p.f6076e;
                C8705k c8705k = new C8705k(str3, billingClient, utilsProvider, c8707m, list, c8701g);
                c8701g.f6047c.add(c8705k);
                c8710p.f6074c.getUiExecutor().execute(new C8709o(c8710p, list2, c8705k));
            }
        }
        C8710p c8710p2 = this.f6061a;
        c8710p2.f6076e.m4892a(c8710p2);
    }
}
