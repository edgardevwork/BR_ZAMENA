package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.Dc */
/* loaded from: classes6.dex */
public final class C8848Dc {

    /* renamed from: a */
    public final LinkedHashSet f6462a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set m5060a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f6462a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC8823Cc) it.next()).mo5027a());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    /* renamed from: a */
    public final synchronized void m5061a(InterfaceC8823Cc... interfaceC8823CcArr) {
        CollectionsKt__MutableCollectionsKt.addAll(this.f6462a, interfaceC8823CcArr);
    }
}
