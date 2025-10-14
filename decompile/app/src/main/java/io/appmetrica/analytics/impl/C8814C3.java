package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.C3 */
/* loaded from: classes6.dex */
public final class C8814C3 {

    /* renamed from: a */
    public final C9333Xe f6422a;

    /* renamed from: b */
    public final BigDecimal f6423b;

    /* renamed from: c */
    public final C9166Qe f6424c;

    /* renamed from: d */
    public final C9143Pf f6425d;

    public C8814C3(ECommerceCartItem eCommerceCartItem) {
        this(new C9333Xe(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C9166Qe(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C9143Pf(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f6422a + ", quantity=" + this.f6423b + ", revenue=" + this.f6424c + ", referrer=" + this.f6425d + '}';
    }

    public C8814C3(C9333Xe c9333Xe, BigDecimal bigDecimal, C9166Qe c9166Qe, C9143Pf c9143Pf) {
        this.f6422a = c9333Xe;
        this.f6423b = bigDecimal;
        this.f6424c = c9166Qe;
        this.f6425d = c9143Pf;
    }
}
