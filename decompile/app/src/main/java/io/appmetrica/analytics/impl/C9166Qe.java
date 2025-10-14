package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Qe */
/* loaded from: classes5.dex */
public final class C9166Qe {

    /* renamed from: a */
    public final C9294W f7159a;

    /* renamed from: b */
    public final List f7160b;

    public C9166Qe(ECommercePrice eCommercePrice) {
        this(new C9294W(eCommercePrice.getFiat()), m5500a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static LinkedList m5500a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new C9294W(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f7159a + ", internalComponents=" + this.f7160b + '}';
    }

    public C9166Qe(C9294W c9294w, LinkedList linkedList) {
        this.f7159a = c9294w;
        this.f7160b = linkedList;
    }
}
