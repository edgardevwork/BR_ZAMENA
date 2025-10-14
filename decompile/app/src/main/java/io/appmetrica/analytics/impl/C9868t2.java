package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.t2 */
/* loaded from: classes7.dex */
public final class C9868t2 implements ProtobufConverter {

    /* renamed from: a */
    public final C9444c3 f9083a;

    public C9868t2() {
        this(new C9444c3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9918v2 fromModel(@NonNull C9843s2 c9843s2) {
        C9918v2 c9918v2 = new C9918v2();
        c9918v2.f9208a = new C9893u2[c9843s2.f9032a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c9843s2.f9032a) {
            C9893u2[] c9893u2Arr = c9918v2.f9208a;
            this.f9083a.getClass();
            c9893u2Arr[i] = C9444c3.m5930a(billingInfo);
            i++;
        }
        c9918v2.f9209b = c9843s2.f9033b;
        return c9918v2;
    }

    public C9868t2(C9444c3 c9444c3) {
        this.f9083a = c9444c3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9843s2 toModel(@NonNull C9918v2 c9918v2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c9918v2.f9208a.length);
        for (C9893u2 c9893u2 : c9918v2.f9208a) {
            this.f9083a.getClass();
            int i = c9893u2.f9156a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c9893u2.f9157b, c9893u2.f9158c, c9893u2.f9159d, c9893u2.f9160e));
        }
        return new C9843s2(arrayList, c9918v2.f9209b);
    }
}
