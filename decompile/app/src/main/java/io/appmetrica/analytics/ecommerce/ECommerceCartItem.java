package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.AbstractC9664kn;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f6240a;

    /* renamed from: b */
    private final BigDecimal f6241b;

    /* renamed from: c */
    private final ECommercePrice f6242c;

    /* renamed from: d */
    private ECommerceReferrer f6243d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, AbstractC9664kn.m6339a(j));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f6240a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f6241b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.f6243d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f6242c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.f6243d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f6240a + ", quantity=" + this.f6241b + ", revenue=" + this.f6242c + ", referrer=" + this.f6243d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC9664kn.m6338a(d)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f6240a = eCommerceProduct;
        this.f6241b = bigDecimal;
        this.f6242c = eCommercePrice;
    }
}
