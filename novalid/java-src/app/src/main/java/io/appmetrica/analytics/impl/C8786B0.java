package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.B0 */
/* loaded from: classes6.dex */
public final class C8786B0 {
    /* renamed from: a */
    public static String m4982a(C8761A0 c8761a0) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c8761a0.f6298a).put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, c8761a0.f6299b).put("reporterType", c8761a0.f6300c.getStringValue()).put("processID", c8761a0.f6301d).put("processSessionID", c8761a0.f6302e).put("errorEnvironment", c8761a0.f6303f).toString().getBytes(Charsets.UTF_8), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C8761A0 m4981a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), Charsets.UTF_8));
            return new C8761A0(jSONObject.getString("apiKey"), jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
