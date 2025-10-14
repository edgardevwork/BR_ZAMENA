package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC9664kn;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f6238a;

    /* renamed from: b */
    private final String f6239b;

    public ECommerceAmount(long j, @NonNull String str) {
        this(AbstractC9664kn.m6339a(j), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f6238a;
    }

    @NonNull
    public String getUnit() {
        return this.f6239b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f6238a + ", unit='" + this.f6239b + "'}";
    }

    public ECommerceAmount(double d, @NonNull String str) {
        this(new BigDecimal(AbstractC9664kn.m6338a(d)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f6238a = bigDecimal;
        this.f6239b = str;
    }
}
