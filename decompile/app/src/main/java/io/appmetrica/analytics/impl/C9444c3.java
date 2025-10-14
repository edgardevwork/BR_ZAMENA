package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.c3 */
/* loaded from: classes7.dex */
public final class C9444c3 implements ProtobufConverter {
    /* renamed from: a */
    public static C9893u2 m5930a(BillingInfo billingInfo) {
        C9893u2 c9893u2 = new C9893u2();
        int i = AbstractC9419b3.f7762a[billingInfo.type.ordinal()];
        c9893u2.f9156a = i != 1 ? i != 2 ? 1 : 3 : 2;
        c9893u2.f9157b = billingInfo.productId;
        c9893u2.f9158c = billingInfo.purchaseToken;
        c9893u2.f9159d = billingInfo.purchaseTime;
        c9893u2.f9160e = billingInfo.sendTime;
        return c9893u2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m5930a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C9893u2 c9893u2 = (C9893u2) obj;
        int i = c9893u2.f9156a;
        return new BillingInfo(i != 2 ? i != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c9893u2.f9157b, c9893u2.f9158c, c9893u2.f9159d, c9893u2.f9160e);
    }
}
