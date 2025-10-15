package io.appmetrica.analytics.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Yj */
/* loaded from: classes6.dex */
public final class C9362Yj {

    /* renamed from: a */
    public final String f7600a;

    /* renamed from: b */
    public final String f7601b;

    /* renamed from: c */
    public final String f7602c;

    /* renamed from: d */
    public final String f7603d;

    /* renamed from: e */
    public final String f7604e;

    /* renamed from: f */
    public final int f7605f;

    /* renamed from: g */
    public final int f7606g;

    public C9362Yj(JSONObject jSONObject) {
        this.f7600a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f7601b = jSONObject.optString("kitBuildNumber", "");
        this.f7602c = jSONObject.optString("appVer", "");
        this.f7603d = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_BUILD, "");
        this.f7604e = jSONObject.optString("osVer", "");
        this.f7605f = jSONObject.optInt("osApiLev", -1);
        this.f7606g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f7600a + "', kitBuildNumber='" + this.f7601b + "', appVersion='" + this.f7602c + "', appBuild='" + this.f7603d + "', osVersion='" + this.f7604e + "', apiLevel=" + this.f7605f + ", attributionId=" + this.f7606g + ')';
    }
}
