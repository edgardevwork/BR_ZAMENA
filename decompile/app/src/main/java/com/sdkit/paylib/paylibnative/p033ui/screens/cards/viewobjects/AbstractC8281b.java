package com.sdkit.paylib.paylibnative.p033ui.screens.cards.viewobjects;

import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.viewobjects.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8281b {
    /* renamed from: a */
    public static final List m2686a(List list, String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8395a c8395a = (C8395a) it.next();
            arrayList.add(new C8280a(c8395a, str != null ? Intrinsics.areEqual(c8395a.m3579d(), str) : list.size() == 1));
        }
        return arrayList;
    }
}
