package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ECommerceOrder {

    /* renamed from: a */
    private final String f6244a;

    /* renamed from: b */
    private final List f6245b;

    /* renamed from: c */
    private Map f6246c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f6244a = str;
        this.f6245b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f6245b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f6244a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f6246c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f6246c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f6244a + "', cartItems=" + this.f6245b + ", payload=" + this.f6246c + '}';
    }
}
