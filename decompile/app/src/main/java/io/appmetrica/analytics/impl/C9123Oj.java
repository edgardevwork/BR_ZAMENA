package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Oj */
/* loaded from: classes8.dex */
public final class C9123Oj implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C9171Qj fromModel(@NotNull Map<String, byte[]> map) {
        C9171Qj c9171Qj = new C9171Qj();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C9194Rj c9194Rj = new C9194Rj();
            c9194Rj.f7209a = entry.getKey().getBytes(Charsets.UTF_8);
            c9194Rj.f7210b = entry.getValue();
            arrayList.add(c9194Rj);
        }
        Object[] array = arrayList.toArray(new C9194Rj[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c9171Qj.f7171a = (C9194Rj[]) array;
        return c9171Qj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, byte[]> toModel(@NotNull C9171Qj c9171Qj) {
        C9194Rj[] c9194RjArr = c9171Qj.f7171a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(c9194RjArr.length), 16));
        for (C9194Rj c9194Rj : c9194RjArr) {
            Pair pairM7112to = TuplesKt.m7112to(new String(c9194Rj.f7209a, Charsets.UTF_8), c9194Rj.f7210b);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        return linkedHashMap;
    }
}
