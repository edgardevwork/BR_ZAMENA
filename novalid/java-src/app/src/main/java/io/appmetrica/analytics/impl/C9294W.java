package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.W */
/* loaded from: classes5.dex */
public final class C9294W {

    /* renamed from: a */
    public final BigDecimal f7380a;

    /* renamed from: b */
    public final String f7381b;

    public C9294W(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f7380a + ", unit='" + this.f7381b + "'}";
    }

    public C9294W(BigDecimal bigDecimal, String str) {
        this.f7380a = bigDecimal;
        this.f7381b = str;
    }
}
