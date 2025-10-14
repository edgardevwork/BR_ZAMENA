package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes6.dex */
public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f6247a;

    /* renamed from: b */
    private List f6248b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f6247a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f6247a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f6248b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f6248b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f6247a + ", internalComponents=" + this.f6248b + '}';
    }
}
