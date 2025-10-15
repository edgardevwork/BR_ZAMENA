package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ue */
/* loaded from: classes7.dex */
public final class C9905ue {

    /* renamed from: a */
    public final String f9175a;

    /* renamed from: b */
    public final JSONObject f9176b;

    /* renamed from: c */
    public final EnumC9159Q7 f9177c;

    public C9905ue(String str, JSONObject jSONObject, EnumC9159Q7 enumC9159Q7) {
        this.f9175a = str;
        this.f9176b = jSONObject;
        this.f9177c = enumC9159Q7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f9175a + "', additionalParams=" + this.f9176b + ", source=" + this.f9177c + '}';
    }
}
