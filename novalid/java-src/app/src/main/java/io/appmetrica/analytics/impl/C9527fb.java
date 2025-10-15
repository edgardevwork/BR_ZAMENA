package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fb */
/* loaded from: classes6.dex */
public final class C9527fb {

    /* renamed from: a */
    public final byte[] f8104a;

    /* renamed from: b */
    public final String f8105b;

    /* renamed from: c */
    public final int f8106c;

    /* renamed from: d */
    public final HashMap f8107d;

    /* renamed from: e */
    public final String f8108e;

    /* renamed from: f */
    public final Integer f8109f;

    /* renamed from: g */
    public final String f8110g;

    /* renamed from: h */
    public final String f8111h;

    /* renamed from: i */
    public final CounterConfigurationReporterType f8112i;

    /* renamed from: j */
    public final String f8113j;

    public C9527fb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f8104a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f8105b = jSONObject2.getString("name");
        this.f8106c = jSONObject2.getInt("bytes_truncated");
        this.f8113j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f8107d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapM5970c = AbstractC9452cb.m5970c(strOptString);
                if (mapM5970c != null) {
                    for (Map.Entry entry : mapM5970c.entrySet()) {
                        this.f8107d.put(EnumC9420b4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f8108e = jSONObject3.getString("package_name");
        this.f8109f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f8110g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f8111h = jSONObject4.getString("api_key");
        this.f8112i = m6112a(jSONObject4);
    }

    /* renamed from: a */
    public final String m6113a() {
        return this.f8111h;
    }

    /* renamed from: b */
    public final int m6114b() {
        return this.f8106c;
    }

    /* renamed from: c */
    public final byte[] m6115c() {
        return this.f8104a;
    }

    @Nullable
    /* renamed from: d */
    public final String m6116d() {
        return this.f8113j;
    }

    /* renamed from: e */
    public final String m6117e() {
        return this.f8105b;
    }

    /* renamed from: f */
    public final String m6118f() {
        return this.f8108e;
    }

    /* renamed from: g */
    public final Integer m6119g() {
        return this.f8109f;
    }

    /* renamed from: h */
    public final String m6120h() {
        return this.f8110g;
    }

    @NonNull
    /* renamed from: i */
    public final CounterConfigurationReporterType m6121i() {
        return this.f8112i;
    }

    @NonNull
    /* renamed from: j */
    public final HashMap<EnumC9420b4, Integer> m6122j() {
        return this.f8107d;
    }

    /* renamed from: k */
    public final String m6123k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f8107d.entrySet()) {
            map.put(((EnumC9420b4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f8109f).put("psid", this.f8110g).put("package_name", this.f8108e)).put("reporter_configuration", new JSONObject().put("api_key", this.f8111h).put("reporter_type", this.f8112i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f8104a, 0)).put("name", this.f8105b).put("bytes_truncated", this.f8106c).put("trimmed_fields", AbstractC9452cb.m5968b(map)).putOpt("environment", this.f8113j)).toString();
    }

    /* renamed from: a */
    public static CounterConfigurationReporterType m6112a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C9527fb(@NonNull C9252U5 c9252u5, @NonNull C9370Z3 c9370z3, @Nullable HashMap<EnumC9420b4, Integer> map) {
        this.f8104a = c9252u5.getValueBytes();
        this.f8105b = c9252u5.getName();
        this.f8106c = c9252u5.getBytesTruncated();
        if (map != null) {
            this.f8107d = map;
        } else {
            this.f8107d = new HashMap();
        }
        C9213Se c9213SeM5795a = c9370z3.m5795a();
        this.f8108e = c9213SeM5795a.m5566f();
        this.f8109f = c9213SeM5795a.m5567g();
        this.f8110g = c9213SeM5795a.m5568h();
        CounterConfiguration counterConfigurationM5796b = c9370z3.m5796b();
        this.f8111h = counterConfigurationM5796b.getApiKey();
        this.f8112i = counterConfigurationM5796b.getReporterType();
        this.f8113j = c9252u5.m5660f();
    }
}
