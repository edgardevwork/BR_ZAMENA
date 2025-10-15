package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* renamed from: io.appmetrica.analytics.impl.Sm */
/* loaded from: classes5.dex */
public abstract class AbstractC9221Sm {
    /* renamed from: a */
    public static final C9150Pm m5602a(Throwable th, C9222T c9222t, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C8908Fm c8908FmM5233a = th != null ? AbstractC8933Gm.m5233a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C8956Hk((StackTraceElement) it.next()));
            }
        }
        return new C9150Pm(c8908FmM5233a, c9222t, arrayList, null, null, null, str, bool);
    }
}
