package com.sdkit.paylib.paylibpayment.impl.domain.network.applications;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.AbstractC8579a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.AbstractC8585b;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.d */
/* loaded from: classes8.dex */
public final class C8517d {
    /* renamed from: a */
    public final String m3968a() {
        return "gmarkt/v1/applications/purchases";
    }

    /* renamed from: a */
    public final String m3969a(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/applications/purchases/" + purchaseId;
    }

    /* renamed from: a */
    public final String m3970a(String purchaseId, PurchaseState purchaseState, Integer num) {
        String strM4546a;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{(purchaseState == null || (strM4546a = AbstractC8579a.m4546a(purchaseState)) == null) ? null : new Pair("purchase_state", strM4546a), num != null ? new Pair("wait", String.valueOf(num.intValue())) : null});
        String str = "gmarkt/v1/applications/purchases/" + purchaseId;
        if (!(!listListOfNotNull.isEmpty())) {
            return str;
        }
        return str + '?' + AbstractC8585b.m4649b(listListOfNotNull);
    }
}
