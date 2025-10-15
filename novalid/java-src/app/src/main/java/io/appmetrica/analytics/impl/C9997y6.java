package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.y6 */
/* loaded from: classes8.dex */
public final class C9997y6 {

    /* renamed from: a */
    public final C9339Xk f9347a = new C9339Xk();

    /* renamed from: b */
    public Map f9348b = MapsKt__MapsKt.emptyMap();

    /* renamed from: c */
    public Map f9349c = MapsKt__MapsKt.emptyMap();

    /* renamed from: d */
    public IdentifiersResult f9350d;

    /* renamed from: a */
    public final synchronized void m6988a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map mapEmptyMap;
        List listM5966a;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f9350d;
            String str2 = identifiersResult2 != null ? identifiersResult2.f9419id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f9419id) != null && str.length() != 0)) {
                this.f9350d = identifiersResult;
                String str3 = identifiersResult.f9419id;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                ArrayList arrayListM5966a = AbstractC9452cb.m5966a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListM5966a != null) {
                                    map.put(next, arrayListM5966a);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    mapEmptyMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        mapEmptyMap.put(key, new IdentifiersResult(String.valueOf(AbstractC9664kn.m6344a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    mapEmptyMap = MapsKt__MapsKt.emptyMap();
                }
                this.f9349c = mapEmptyMap;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapEmptyMap.size()));
                for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).f9419id;
                    if (str4 == null) {
                        listM5966a = null;
                    } else {
                        try {
                            listM5966a = AbstractC9452cb.m5966a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (listM5966a == null) {
                        listM5966a = CollectionsKt__CollectionsKt.emptyList();
                    }
                    linkedHashMap.put(key2, listM5966a);
                }
                this.f9348b = linkedHashMap;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m6989a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f9348b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            C9339Xk c9339Xk = this.f9347a;
            String strM5965a = AbstractC9452cb.m5965a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f9350d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", c9339Xk.m5758a(new IdentifiersResult(strM5965a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
