package com.sdkit.paylib.paylibpayment.impl.domain.network.products;

import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.AbstractC8585b;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.products.d */
/* loaded from: classes8.dex */
public final class C8563d {
    /* renamed from: a */
    public final String m4162a(String packageName, List productIds) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        String str = "product_ids=" + AbstractC8585b.m4648a(productIds);
        StringBuilder sb = new StringBuilder();
        String str2 = String.format("gmarkt/v1/applications/%s/products", Arrays.copyOf(new Object[]{packageName}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
        sb.append(str2);
        sb.append('?');
        sb.append(str);
        return sb.toString();
    }
}
