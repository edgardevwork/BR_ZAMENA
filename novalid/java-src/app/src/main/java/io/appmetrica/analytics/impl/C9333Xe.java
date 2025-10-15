package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Xe */
/* loaded from: classes6.dex */
public final class C9333Xe {

    /* renamed from: a */
    public final String f7524a;

    /* renamed from: b */
    public final String f7525b;

    /* renamed from: c */
    public final List f7526c;

    /* renamed from: d */
    public final Map f7527d;

    /* renamed from: e */
    public final C9166Qe f7528e;

    /* renamed from: f */
    public final C9166Qe f7529f;

    /* renamed from: g */
    public final List f7530g;

    public C9333Xe(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C9166Qe(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C9166Qe(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f7524a + "', name='" + this.f7525b + "', categoriesPath=" + this.f7526c + ", payload=" + this.f7527d + ", actualPrice=" + this.f7528e + ", originalPrice=" + this.f7529f + ", promocodes=" + this.f7530g + '}';
    }

    public C9333Xe(String str, String str2, List list, Map map, C9166Qe c9166Qe, C9166Qe c9166Qe2, List list2) {
        this.f7524a = str;
        this.f7525b = str2;
        this.f7526c = list;
        this.f7527d = map;
        this.f7528e = c9166Qe;
        this.f7529f = c9166Qe2;
        this.f7530g = list2;
    }
}
