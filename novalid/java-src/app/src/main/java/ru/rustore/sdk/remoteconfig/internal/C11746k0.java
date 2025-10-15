package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.k0 */
/* loaded from: classes5.dex */
public final class C11746k0 {

    /* renamed from: a */
    public final C11682I0 f10943a;

    public C11746k0(C11682I0 shortSegmentsSerializer) {
        Intrinsics.checkNotNullParameter(shortSegmentsSerializer, "shortSegmentsSerializer");
        this.f10943a = shortSegmentsSerializer;
    }

    /* renamed from: a */
    public final C11738g0 m7541a(String jsonString) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        long j = jSONObject.getLong("VERSION");
        String value = jSONObject.getString("HASH");
        Intrinsics.checkNotNullExpressionValue(value, "configFingerprintValue");
        Intrinsics.checkNotNullParameter(value, "value");
        C11759r c11759r = new C11759r(j, value);
        C11682I0 c11682i0 = this.f10943a;
        String strOptString = jSONObject.optString("SHORT_SEGMENTS");
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        c11682i0.getClass();
        String strM7520a = C11682I0.m7520a(strOptString);
        long j2 = jSONObject.getLong("UPDATE_TIMESTAMP");
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        return new C11738g0(j2, C11697Q.m7523a(jSONObject2), c11759r, strM7520a);
    }

    /* renamed from: a */
    public final String m7540a(C11738g0 config) throws JSONException {
        Intrinsics.checkNotNullParameter(config, "config");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("VERSION", config.f10929c.f10971a);
        jSONObject.put("HASH", config.f10929c.f10972b);
        jSONObject.put("UPDATE_TIMESTAMP", config.f10927a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : config.f10928b.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("CONFIG", jSONObject2);
        C11682I0 c11682i0 = this.f10943a;
        String shortSegments = config.f10930d;
        c11682i0.getClass();
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", shortSegments);
        String string = jSONObject3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS", string);
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        return string2;
    }
}
