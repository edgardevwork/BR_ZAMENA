package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.P9 */
/* loaded from: classes5.dex */
public final class C9137P9 {

    /* renamed from: a */
    public final String f7085a;

    /* renamed from: b */
    public final int f7086b;

    /* renamed from: c */
    public final boolean f7087c;

    public C9137P9(JSONObject jSONObject) {
        this.f7085a = jSONObject.getString("name");
        this.f7087c = jSONObject.getBoolean("required");
        this.f7086b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9137P9.class != obj.getClass()) {
            return false;
        }
        C9137P9 c9137p9 = (C9137P9) obj;
        if (this.f7086b != c9137p9.f7086b || this.f7087c != c9137p9.f7087c) {
            return false;
        }
        String str = this.f7085a;
        String str2 = c9137p9.f7085a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f7085a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f7086b) * 31) + (this.f7087c ? 1 : 0);
    }

    public C9137P9(String str, int i, boolean z) {
        this.f7085a = str;
        this.f7086b = i;
        this.f7087c = z;
    }
}
