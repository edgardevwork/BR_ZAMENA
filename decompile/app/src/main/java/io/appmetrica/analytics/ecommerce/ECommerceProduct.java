package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ECommerceProduct {

    /* renamed from: a */
    private final String f6249a;

    /* renamed from: b */
    private String f6250b;

    /* renamed from: c */
    private List f6251c;

    /* renamed from: d */
    private Map f6252d;

    /* renamed from: e */
    private ECommercePrice f6253e;

    /* renamed from: f */
    private ECommercePrice f6254f;

    /* renamed from: g */
    private List f6255g;

    public ECommerceProduct(@NonNull String str) {
        this.f6249a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f6253e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f6251c;
    }

    @Nullable
    public String getName() {
        return this.f6250b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f6254f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f6252d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f6255g;
    }

    @NonNull
    public String getSku() {
        return this.f6249a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f6253e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f6251c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f6250b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f6254f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f6252d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f6255g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f6249a + "', name='" + this.f6250b + "', categoriesPath=" + this.f6251c + ", payload=" + this.f6252d + ", actualPrice=" + this.f6253e + ", originalPrice=" + this.f6254f + ", promocodes=" + this.f6255g + '}';
    }
}
