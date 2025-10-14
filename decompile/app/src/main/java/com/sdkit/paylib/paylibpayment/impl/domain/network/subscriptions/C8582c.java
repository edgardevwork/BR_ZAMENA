package com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.c */
/* loaded from: classes5.dex */
public final class C8582c {
    /* renamed from: a */
    public final String m4632a(int i, int i2, int i3, String sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        return "gmarkt/v2/subscriptions?status=" + i + "&page=" + i2 + "&size=" + i3 + "&sort=" + sort;
    }

    /* renamed from: b */
    public final String m4635b(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/subscriptions/" + purchaseId + ":disableRecurrent";
    }

    /* renamed from: c */
    public final String m4636c(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/subscriptions/" + purchaseId + ":enableRecurrent";
    }

    /* renamed from: d */
    public final String m4637d(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/subscriptions/" + purchaseId;
    }

    /* renamed from: e */
    public final String m4638e(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v2/subscriptions/" + purchaseId;
    }

    /* renamed from: f */
    public final String m4639f(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/subscriptions/" + purchaseId + ":enablePromo";
    }

    /* renamed from: a */
    public final String m4633a(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return "gmarkt/v1/subscriptions/" + purchaseId + ":changePaymentMethod";
    }

    /* renamed from: a */
    public final String m4634a(boolean z, int i, int i2, List sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        StringBuilder sb = new StringBuilder("gmarkt/v1/subscriptions?present=" + z + "&page=" + i + "&size=" + i2);
        Iterator it = sort.iterator();
        while (it.hasNext()) {
            sb.append("&sort=" + ((String) it.next()));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "\"$SUBSCRIPTIONS_PATH_V1?…lder.toString()\n        }");
        return string;
    }
}
