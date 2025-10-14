package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.metrics.internal.w */
/* loaded from: classes8.dex */
public final class C11641w {
    /* renamed from: a */
    public static C11640v m7505a(String uuid, String jsonString) throws JSONException {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(NAME_KEY)");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
        Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(TuplesKt.m7112to(next, jSONObject2.get(next).toString()));
        }
        return new C11640v(uuid, string, MapsKt__MapsKt.toMap(arrayList));
    }
}
