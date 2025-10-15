package com.sdkit.paylib.paylibnetwork.api.domain.client;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJT\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000b¨\u0006,"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequest;", "", "Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequestMethod;", "component1", "", "component2", "", "component3", "component4", "", "component5", "()Ljava/lang/Long;", FirebaseAnalytics.Param.METHOD, "url", "headers", "bodyString", "waitSec", "copy", "(Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequestMethod;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequest;", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequestMethod;", "getMethod", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequestMethod;", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "c", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "d", "getBodyString", "e", "Ljava/lang/Long;", "getWaitSec", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequestMethod;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)V", "com-sdkit-assistant_paylib_network_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class WebRequest {

    /* renamed from: a, reason: from kotlin metadata */
    public final WebRequestMethod com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String;

    /* renamed from: b, reason: from kotlin metadata */
    public final String url;

    /* renamed from: c, reason: from kotlin metadata */
    public final Map headers;

    /* renamed from: d, reason: from kotlin metadata */
    public final String bodyString;

    /* renamed from: e, reason: from kotlin metadata */
    public final Long waitSec;

    public WebRequest(WebRequestMethod method, String url, Map<String, String> map, String str, Long l) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String = method;
        this.url = url;
        this.headers = map;
        this.bodyString = str;
        this.waitSec = l;
    }

    public static /* synthetic */ WebRequest copy$default(WebRequest webRequest, WebRequestMethod webRequestMethod, String str, Map map, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            webRequestMethod = webRequest.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String;
        }
        if ((i & 2) != 0) {
            str = webRequest.url;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            map = webRequest.headers;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            str2 = webRequest.bodyString;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            l = webRequest.waitSec;
        }
        return webRequest.copy(webRequestMethod, str3, map2, str4, l);
    }

    /* renamed from: component1, reason: from getter */
    public final WebRequestMethod getCom.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String() {
        return this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBodyString() {
        return this.bodyString;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getWaitSec() {
        return this.waitSec;
    }

    public final WebRequest copy(WebRequestMethod webRequestMethod, String url, Map<String, String> headers, String bodyString, Long waitSec) {
        Intrinsics.checkNotNullParameter(webRequestMethod, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        return new WebRequest(webRequestMethod, url, headers, bodyString, waitSec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebRequest)) {
            return false;
        }
        WebRequest webRequest = (WebRequest) other;
        return this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String == webRequest.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String && Intrinsics.areEqual(this.url, webRequest.url) && Intrinsics.areEqual(this.headers, webRequest.headers) && Intrinsics.areEqual(this.bodyString, webRequest.bodyString) && Intrinsics.areEqual(this.waitSec, webRequest.waitSec);
    }

    public final String getBodyString() {
        return this.bodyString;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final WebRequestMethod getMethod() {
        return this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Long getWaitSec() {
        return this.waitSec;
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.url, this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String.hashCode() * 31, 31);
        Map map = this.headers;
        int iHashCode = (iM1429a + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.bodyString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.waitSec;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "WebRequest(method=" + this.com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD java.lang.String + ", url=" + this.url + ", headers=" + this.headers + ", bodyString=" + this.bodyString + ", waitSec=" + this.waitSec + ')';
    }
}
