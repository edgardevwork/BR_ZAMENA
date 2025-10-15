package io.appmetrica.analytics.impl;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.n7 */
/* loaded from: classes5.dex */
public final class C9723n7 {

    /* renamed from: a */
    public final String f8703a;

    /* renamed from: b */
    public final String f8704b;

    /* renamed from: c */
    public final String f8705c;

    /* renamed from: d */
    public final String f8706d;

    /* renamed from: e */
    public final String f8707e;

    /* renamed from: f */
    public final String f8708f;

    /* renamed from: g */
    public final String f8709g;

    /* renamed from: h */
    public final String f8710h;

    /* renamed from: i */
    public final String f8711i;

    /* renamed from: j */
    public final String f8712j;

    /* renamed from: k */
    public final String f8713k;

    /* renamed from: l */
    public final String f8714l;

    /* renamed from: m */
    public final String f8715m;

    /* renamed from: n */
    public final String f8716n;

    public C9723n7(C9427bb c9427bb) {
        this.f8703a = c9427bb.m5913b("dId");
        this.f8704b = c9427bb.m5913b("uId");
        this.f8705c = c9427bb.m5913b("analyticsSdkVersionName");
        this.f8706d = c9427bb.m5913b("kitBuildNumber");
        this.f8707e = c9427bb.m5913b("kitBuildType");
        this.f8708f = c9427bb.m5913b("appVer");
        this.f8709g = c9427bb.optString("app_debuggable", "0");
        this.f8710h = c9427bb.m5913b(RemoteConfigConstants.RequestFieldKey.APP_BUILD);
        this.f8711i = c9427bb.m5913b("osVer");
        this.f8713k = c9427bb.m5913b(WebvttCueParser.TAG_LANG);
        this.f8714l = c9427bb.m5913b("root");
        this.f8715m = c9427bb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c9427bb.optInt("osApiLev", -1);
        this.f8712j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c9427bb.optInt("attribution_id", 0);
        this.f8716n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f8703a + "', uuid='" + this.f8704b + "', analyticsSdkVersionName='" + this.f8705c + "', kitBuildNumber='" + this.f8706d + "', kitBuildType='" + this.f8707e + "', appVersion='" + this.f8708f + "', appDebuggable='" + this.f8709g + "', appBuildNumber='" + this.f8710h + "', osVersion='" + this.f8711i + "', osApiLevel='" + this.f8712j + "', locale='" + this.f8713k + "', deviceRootStatus='" + this.f8714l + "', appFramework='" + this.f8715m + "', attributionId='" + this.f8716n + "'}";
    }

    public C9723n7() {
        this.f8703a = null;
        this.f8704b = null;
        this.f8705c = null;
        this.f8706d = null;
        this.f8707e = null;
        this.f8708f = null;
        this.f8709g = null;
        this.f8710h = null;
        this.f8711i = null;
        this.f8712j = null;
        this.f8713k = null;
        this.f8714l = null;
        this.f8715m = null;
        this.f8716n = null;
    }
}
