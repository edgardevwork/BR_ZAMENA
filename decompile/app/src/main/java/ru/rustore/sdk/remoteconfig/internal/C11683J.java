package ru.rustore.sdk.remoteconfig.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.J */
/* loaded from: classes5.dex */
public final class C11683J {
    /* renamed from: a */
    public static final C11689M m7521a(List<C11689M> list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String name = ((C11689M) obj2).f10833a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            if (StringsKt__StringNumberConversionsKt.toIntOrNull(name) != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                String name2 = ((C11689M) next).f10833a.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                int i = Integer.parseInt(name2);
                do {
                    Object next2 = it.next();
                    String name3 = ((C11689M) next2).f10833a.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "file.name");
                    int i2 = Integer.parseInt(name3);
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C11689M) obj;
    }
}
