package io.appmetrica.analytics.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.R8 */
/* loaded from: classes5.dex */
public final class C9183R8 {

    /* renamed from: a */
    public final C9964wn f7199a;

    public C9183R8(C9964wn c9964wn) {
        this.f7199a = c9964wn;
    }

    /* renamed from: a */
    public final void m5520a(int i, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        C9964wn c9964wn = this.f7199a;
        synchronized (c9964wn) {
            jSONObjectOptJSONObject = c9964wn.f9286a.m6979a().optJSONObject("numbers_of_type");
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(String.valueOf(i), j);
        this.f7199a.m6939a(jSONObjectOptJSONObject);
    }
}
