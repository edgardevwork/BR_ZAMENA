package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    private String f6256a;

    /* renamed from: b */
    private String f6257b;

    /* renamed from: c */
    private ECommerceScreen f6258c;

    @Nullable
    public String getIdentifier() {
        return this.f6257b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f6258c;
    }

    @Nullable
    public String getType() {
        return this.f6256a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f6257b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f6258c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f6256a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f6256a + "', identifier='" + this.f6257b + "', screen=" + this.f6258c + '}';
    }
}
