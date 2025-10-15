package io.appmetrica.analytics.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.lc */
/* loaded from: classes5.dex */
public final class C9678lc {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C10000y9 m6391a(C9678lc c9678lc, EnumC8945H9 enumC8945H9, Map map) {
        int i;
        Object value;
        c9678lc.getClass();
        C10000y9 c10000y9 = new C10000y9();
        switch (enumC8945H9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c10000y9.f9361a = i;
        C9703mc.f8648b.getClass();
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double dDoubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                    value = null;
                }
            } else {
                value = entry.getValue();
            }
            Pair pairM7112to = TuplesKt.m7112to(key, value);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        String string = new JSONObject(linkedHashMap).toString();
        if (string != null) {
            c10000y9.f9362b = string.getBytes(Charsets.UTF_8);
        }
        return c10000y9;
    }
}
