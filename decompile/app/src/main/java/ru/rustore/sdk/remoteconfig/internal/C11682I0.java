package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.I0 */
/* loaded from: classes5.dex */
public final class C11682I0 {
    /* renamed from: a */
    public static String m7520a(String jsonString) throws JSONException {
        String string;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            string = new JSONObject(jsonString).getString("short_segments");
        } catch (JSONException unused) {
            string = null;
        }
        return string == null ? "" : string;
    }
}
