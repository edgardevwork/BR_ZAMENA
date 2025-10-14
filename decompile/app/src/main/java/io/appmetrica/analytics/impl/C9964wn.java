package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wn */
/* loaded from: classes8.dex */
public final class C9964wn {

    /* renamed from: a */
    public final C9989xn f9286a;

    public C9964wn(C9755oe c9755oe, InterfaceC8784An interfaceC8784An, String str) {
        this.f9286a = new C9989xn(c9755oe, interfaceC8784An, new InterfaceC10014yn() { // from class: io.appmetrica.analytics.impl.wn$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC10014yn
            /* renamed from: a */
            public final JSONObject mo6914a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C9964wn.m6935a(jSONObject, jSONObject2);
            }
        });
    }

    /* renamed from: a */
    public static final JSONObject m6935a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC9452cb.m5962a(jSONObject2, "report_request_id", AbstractC9452cb.m5962a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC9452cb.m5962a(jSONObject2, "open_id", AbstractC9452cb.m5962a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC9452cb.m5962a(jSONObject2, "attribution_id", AbstractC9452cb.m5962a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC9452cb.m5962a(jSONObject2, "last_migration_api_level", AbstractC9452cb.m5962a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m6942b(long j) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("global_number", j));
    }

    /* renamed from: c */
    public final synchronized boolean m6945c() {
        return this.f9286a.m6979a().optBoolean("first_event_done", false);
    }

    /* renamed from: d */
    public final synchronized boolean m6946d() {
        return this.f9286a.m6979a().optBoolean("init_event_done", false);
    }

    /* renamed from: b */
    public final synchronized int m6940b() {
        return this.f9286a.m6979a().optInt("open_id", 1);
    }

    /* renamed from: c */
    public final synchronized void m6944c(long j) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("session_id", j));
    }

    /* renamed from: b */
    public final synchronized void m6941b(int i) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("last_migration_api_level", i));
    }

    /* renamed from: c */
    public final synchronized void m6943c(int i) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("open_id", i));
    }

    /* renamed from: a */
    public final synchronized void m6939a(JSONObject jSONObject) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("numbers_of_type", jSONObject));
    }

    /* renamed from: a */
    public final synchronized int m6936a() {
        return this.f9286a.m6979a().optInt("attribution_id", 1);
    }

    /* renamed from: a */
    public final synchronized void m6937a(int i) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("attribution_id", i));
    }

    /* renamed from: a */
    public final synchronized void m6938a(long j) {
        C9989xn c9989xn = this.f9286a;
        c9989xn.m6980a(c9989xn.m6979a().put("external_attribution_window_start", j));
    }
}
