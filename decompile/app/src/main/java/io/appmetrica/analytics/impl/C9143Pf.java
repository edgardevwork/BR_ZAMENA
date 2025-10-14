package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.Pf */
/* loaded from: classes5.dex */
public final class C9143Pf {

    /* renamed from: a */
    public final String f7091a;

    /* renamed from: b */
    public final String f7092b;

    /* renamed from: c */
    public final C9909ui f7093c;

    public C9143Pf(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C9909ui(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f7091a + "', identifier='" + this.f7092b + "', screen=" + this.f7093c + '}';
    }

    public C9143Pf(String str, String str2, C9909ui c9909ui) {
        this.f7091a = str;
        this.f7092b = str2;
        this.f7093c = c9909ui;
    }
}
