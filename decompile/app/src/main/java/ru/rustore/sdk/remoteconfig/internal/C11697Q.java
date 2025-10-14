package ru.rustore.sdk.remoteconfig.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.Q */
/* loaded from: classes5.dex */
public final class C11697Q {
    /* renamed from: a */
    public static final Map<String, String> m7523a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        if (!itKeys.hasNext()) {
            return MapsKt__MapsKt.emptyMap();
        }
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(TuplesKt.m7112to(next, jSONObject.get(next).toString()));
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }
}
