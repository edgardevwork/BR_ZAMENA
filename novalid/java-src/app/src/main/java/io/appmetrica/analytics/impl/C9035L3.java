package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.L3 */
/* loaded from: classes8.dex */
public final class C9035L3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9131P3 fromModel(@NotNull C9011K3 c9011k3) {
        C9131P3 c9131p3 = new C9131P3();
        c9131p3.f7079a = m5342a(c9011k3.f6854a);
        int size = c9011k3.f6855b.size();
        C9059M3[] c9059m3Arr = new C9059M3[size];
        for (int i = 0; i < size; i++) {
            c9059m3Arr[i] = m5342a((C8987J3) c9011k3.f6855b.get(i));
        }
        c9131p3.f7080b = c9059m3Arr;
        return c9131p3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9011K3 toModel(@NotNull C9131P3 c9131p3) {
        C9059M3 c9059m3 = c9131p3.f7079a;
        if (c9059m3 == null) {
            c9059m3 = new C9059M3();
        }
        C8987J3 c8987j3M5341a = m5341a(c9059m3);
        C9059M3[] c9059m3Arr = c9131p3.f7080b;
        ArrayList arrayList = new ArrayList(c9059m3Arr.length);
        for (C9059M3 c9059m32 : c9059m3Arr) {
            arrayList.add(m5341a(c9059m32));
        }
        return new C9011K3(c8987j3M5341a, arrayList);
    }

    /* renamed from: a */
    public static C9059M3 m5342a(C8987J3 c8987j3) {
        C9107O3 c9107o3;
        C9059M3 c9059m3 = new C9059M3();
        Map map = c8987j3.f6805a;
        int i = 0;
        if (map != null) {
            c9107o3 = new C9107O3();
            int size = map.size();
            C9083N3[] c9083n3Arr = new C9083N3[size];
            for (int i2 = 0; i2 < size; i2++) {
                c9083n3Arr[i2] = new C9083N3();
            }
            c9107o3.f7049a = c9083n3Arr;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C9083N3 c9083n3 = c9107o3.f7049a[i3];
                c9083n3.f7010a = str;
                c9083n3.f7011b = str2;
                i3++;
            }
        } else {
            c9107o3 = null;
        }
        c9059m3.f6959a = c9107o3;
        int iOrdinal = c8987j3.f6806b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                i = 1;
            }
        }
        c9059m3.f6960b = i;
        return c9059m3;
    }

    /* renamed from: a */
    public static C8987J3 m5341a(C9059M3 c9059m3) {
        LinkedHashMap linkedHashMap;
        EnumC9159Q7 enumC9159Q7;
        C9107O3 c9107o3 = c9059m3.f6959a;
        if (c9107o3 != null) {
            C9083N3[] c9083n3Arr = c9107o3.f7049a;
            linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(c9083n3Arr.length), 16));
            for (C9083N3 c9083n3 : c9083n3Arr) {
                Pair pairM7112to = TuplesKt.m7112to(c9083n3.f7010a, c9083n3.f7011b);
                linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i = c9059m3.f6960b;
        if (i == 0) {
            enumC9159Q7 = EnumC9159Q7.f7145b;
        } else if (i == 1) {
            enumC9159Q7 = EnumC9159Q7.f7146c;
        } else if (i == 2) {
            enumC9159Q7 = EnumC9159Q7.f7147d;
        } else if (i != 3) {
            enumC9159Q7 = EnumC9159Q7.f7145b;
        } else {
            enumC9159Q7 = EnumC9159Q7.f7148e;
        }
        return new C8987J3(linkedHashMap, enumC9159Q7);
    }
}
