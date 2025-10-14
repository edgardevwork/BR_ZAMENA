package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ECommerceScreen {

    /* renamed from: a */
    private String f6259a;

    /* renamed from: b */
    private List f6260b;

    /* renamed from: c */
    private String f6261c;

    /* renamed from: d */
    private Map f6262d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f6260b;
    }

    @Nullable
    public String getName() {
        return this.f6259a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f6262d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f6261c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f6260b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f6259a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f6262d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f6261c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f6259a + "', categoriesPath=" + this.f6260b + ", searchQuery='" + this.f6261c + "', payload=" + this.f6262d + '}';
    }
}
