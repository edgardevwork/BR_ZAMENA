package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.Ld */
/* loaded from: classes8.dex */
public final class C9045Ld {

    /* renamed from: a */
    public final String f6936a;

    /* renamed from: b */
    public final String f6937b;

    /* renamed from: c */
    public final List f6938c;

    /* renamed from: d */
    public final Map f6939d;

    public C9045Ld(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m5356a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    public static ArrayList m5356a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8814C3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f6936a + "', identifier='" + this.f6937b + "', cartItems=" + this.f6938c + ", payload=" + this.f6939d + '}';
    }

    public C9045Ld(String str, String str2, ArrayList arrayList, Map map) {
        this.f6936a = str;
        this.f6937b = str2;
        this.f6938c = arrayList;
        this.f6939d = map;
    }
}
