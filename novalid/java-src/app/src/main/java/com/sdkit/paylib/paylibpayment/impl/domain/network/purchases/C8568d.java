package com.sdkit.paylib.paylibpayment.impl.domain.network.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.AbstractC8579a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.AbstractC8585b;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.d */
/* loaded from: classes8.dex */
public final class C8568d {
    /* renamed from: a */
    public final String m4185a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = String.format("gmarkt/v1/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }

    /* renamed from: b */
    public final String m4188b(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = String.format("gmarkt/v2/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }

    /* renamed from: a */
    public final String m4186a(String packageName, String purchaseId) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        StringBuilder sb = new StringBuilder();
        String str = String.format("gmarkt/v1/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        sb.append(str);
        sb.append('/');
        sb.append(purchaseId);
        sb.append(":confirm");
        return sb.toString();
    }

    /* renamed from: b */
    public final String m4189b(String packageName, String purchaseId) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        StringBuilder sb = new StringBuilder();
        String str = String.format("gmarkt/v1/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        sb.append(str);
        sb.append('/');
        sb.append(purchaseId);
        return sb.toString();
    }

    /* renamed from: a */
    public final String m4187a(String packageName, String purchaseId, PurchaseState purchaseState, Integer num) {
        String strM4546a;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        String str = String.format("gmarkt/v1/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{(purchaseState == null || (strM4546a = AbstractC8579a.m4546a(purchaseState)) == null) ? null : new Pair("purchase_state", strM4546a), num != null ? new Pair("wait", String.valueOf(num.intValue())) : null});
        String str2 = str + '/' + purchaseId;
        if (!(!listListOfNotNull.isEmpty())) {
            return str2;
        }
        return str2 + '?' + AbstractC8585b.m4649b(listListOfNotNull);
    }

    /* renamed from: b */
    public final String m4190b(String packageName, String purchaseId, PurchaseState purchaseState, Integer num) {
        String strM4546a;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        String str = String.format("gmarkt/v2/applications/%s/purchases", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{(purchaseState == null || (strM4546a = AbstractC8579a.m4546a(purchaseState)) == null) ? null : new Pair("purchase_state", strM4546a), num != null ? new Pair("wait", String.valueOf(num.intValue())) : null});
        String str2 = str + '/' + purchaseId;
        if (!(!listListOfNotNull.isEmpty())) {
            return str2;
        }
        return str2 + '?' + AbstractC8585b.m4649b(listListOfNotNull);
    }
}
