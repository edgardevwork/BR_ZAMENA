package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.x6 */
/* loaded from: classes5.dex */
public final class C9972x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C9912ul[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C9912ul[] c9912ulArr = new C9912ul[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C9912ul c9912ul = new C9912ul();
            c9912ul.f9197a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c9912ul.f9198b = (String[]) array;
            c9912ulArr[i] = c9912ul;
            i = i2;
        }
        return c9912ulArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, List<String>> toModel(@NotNull C9912ul[] c9912ulArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(c9912ulArr.length), 16));
        for (C9912ul c9912ul : c9912ulArr) {
            Pair pairM7112to = TuplesKt.m7112to(c9912ul.f9197a, ArraysKt___ArraysKt.toList(c9912ul.f9198b));
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        return linkedHashMap;
    }
}
