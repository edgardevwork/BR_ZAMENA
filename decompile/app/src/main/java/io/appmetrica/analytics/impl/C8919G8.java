package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.G8 */
/* loaded from: classes7.dex */
public final class C8919G8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        C8968I8 c8968i8 = new C8968I8();
        C8944H8[] c8944h8Arr = new C8944H8[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C8944H8 c8944h8 = new C8944H8();
            c8944h8.f6706a = (String) entry.getKey();
            c8944h8.f6707b = (byte[]) entry.getValue();
            c8944h8Arr[i] = c8944h8;
            i = i2;
        }
        c8968i8.f6775a = c8944h8Arr;
        return MessageNano.toByteArray(c8968i8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        C8944H8[] c8944h8Arr = ((C8968I8) MessageNano.mergeFrom(new C8968I8(), bArr)).f6775a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(c8944h8Arr.length), 16));
        for (C8944H8 c8944h8 : c8944h8Arr) {
            Pair pairM7112to = TuplesKt.m7112to(c8944h8.f6706a, c8944h8.f6707b);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        return linkedHashMap;
    }
}
