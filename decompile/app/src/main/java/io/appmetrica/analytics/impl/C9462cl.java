package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cl */
/* loaded from: classes6.dex */
public final class C9462cl {

    /* renamed from: a */
    public final C9926va f7868a;

    /* renamed from: b */
    public final C9256U9 f7869b;

    /* renamed from: c */
    public final C9336Xh f7870c;

    /* renamed from: d */
    public final C9212Sd f7871d;

    /* renamed from: e */
    public final C9077Ml f7872e;

    /* renamed from: f */
    public final C9818r2 f7873f;

    /* renamed from: g */
    public final C9994y3 f7874g;

    /* renamed from: h */
    public final C9768p2 f7875h;

    /* renamed from: i */
    public final C9477db f7876i;

    /* renamed from: j */
    public final C9005Jl f7877j;

    /* renamed from: k */
    public final C9307Wc f7878k;

    /* renamed from: l */
    public final C8795B9 f7879l;

    public C9462cl() {
        this(new C9477db(), new C9926va(), new C9256U9(), new C9336Xh(), new C9212Sd(), new C9077Ml(), new C9994y3(), new C9818r2(), new C9768p2(), new C9005Jl(), new C9307Wc(), new C8795B9());
    }

    /* renamed from: a */
    public final void m5999a(C9587hl c9587hl, C9427bb c9427bb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListM6889a;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c9427bb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject(IFramePlayerOptions.Builder.LIST)) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c9587hl.f8296g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c9427bb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c9587hl.f8299j = AbstractC9029Kl.m5334a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c9427bb.optJSONObject("locale");
        String string2 = "";
        c9587hl.f8302m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject(CctTransportBackend.KEY_COUNTRY)) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c9427bb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c9587hl.f8301l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C8782Al c8782Al = new C8782Al();
        JSONObject jSONObjectOptJSONObject9 = c9427bb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c8782Al.f6349a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c8782Al.f6349a);
        }
        this.f7872e.getClass();
        c9587hl.f8305p = new C9053Ll(c8782Al.f6349a);
        this.f7869b.getClass();
        C9962wl c9962wl = new C9962wl();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c9427bb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject(IFramePlayerOptions.Builder.LIST);
            if (jSONObjectOptJSONObject10 != null) {
                C9995y4 c9995y4 = new C9995y4();
                c9995y4.f9340a = C9256U9.m5670a(jSONObjectOptJSONObject10, "permissions_collecting", c9962wl.f9279a);
                c9995y4.f9341b = C9256U9.m5670a(jSONObjectOptJSONObject10, "features_collecting", c9962wl.f9280b);
                c9995y4.f9342c = C9256U9.m5670a(jSONObjectOptJSONObject10, "google_aid", c9962wl.f9281c);
                c9995y4.f9343d = C9256U9.m5670a(jSONObjectOptJSONObject10, "sim_info", c9962wl.f9282d);
                c9995y4.f9344e = C9256U9.m5670a(jSONObjectOptJSONObject10, "huawei_oaid", c9962wl.f9283e);
                c9995y4.f9345f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c9587hl.f8291b = new C8765A4(c9995y4);
            }
        } catch (Throwable unused4) {
        }
        this.f7868a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c9427bb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject(IFramePlayerOptions.Builder.LIST);
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c9587hl.f8293d = string;
                }
                ArrayList arrayListM6889a2 = C9926va.m6889a(jSONObjectOptJSONObject11, "report");
                if (!AbstractC9664kn.m6344a((Collection) arrayListM6889a2)) {
                    c9587hl.f8294e = arrayListM6889a2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c9587hl.f8295f = string2;
                }
                ArrayList arrayListM6889a3 = C9926va.m6889a(jSONObjectOptJSONObject11, "startup");
                if (!AbstractC9664kn.m6344a((Collection) arrayListM6889a3)) {
                    c9587hl.f8292c = arrayListM6889a3;
                }
                ArrayList arrayListM6889a4 = C9926va.m6889a(jSONObjectOptJSONObject11, "diagnostic");
                if (!AbstractC9664kn.m6344a((Collection) arrayListM6889a4)) {
                    c9587hl.f8303n = arrayListM6889a4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C9926va.f9220a.contains(next2) && (arrayListM6889a = C9926va.m6889a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListM6889a);
                    }
                }
                c9587hl.f8304o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f7870c.getClass();
        C8807Bl c8807Bl = new C8807Bl();
        JSONObject jSONObjectOptJSONObject12 = c9427bb.optJSONObject("retry_policy");
        int iOptInt = c8807Bl.f6412w;
        int iOptInt2 = c8807Bl.f6413x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c8807Bl.f6413x);
        }
        c9587hl.f8306q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f7871d.getClass();
        if (c9587hl.f8291b.f6311a) {
            JSONObject jSONObjectOptJSONObject13 = c9427bb.optJSONObject("permissions_collecting");
            C10012yl c10012yl = new C10012yl();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c10012yl.f9371a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c10012yl.f9372b);
            } else {
                jOptLong = c10012yl.f9371a;
                jOptLong2 = c10012yl.f9372b;
            }
            c9587hl.f8300k = new C9165Qd(jOptLong, jOptLong2);
        }
        C9793q2 c9793q2 = this.f7873f.f8964a;
        C9862sl c9862sl = new C9862sl();
        JSONObject jSONObjectOptJSONObject14 = c9427bb.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject14 != null) {
            c9862sl.f9054a = jSONObjectOptJSONObject14.optInt("send_frequency_seconds", c9862sl.f9054a);
            c9862sl.f9055b = jSONObjectOptJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c9862sl.f9055b);
        }
        c9793q2.getClass();
        c9587hl.f8307r = new BillingConfig(c9862sl.f9054a, c9862sl.f9055b);
        C9994y3 c9994y3 = this.f7874g;
        c9994y3.getClass();
        C9887tl c9887tl = new C9887tl();
        JSONObject jSONObjectOptJSONObject15 = c9427bb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject15 != null) {
            c9887tl.f9134a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject15, "last_known_location_ttl", c9887tl.f9134a);
        }
        c9994y3.f9339a.getClass();
        c9587hl.f8308s = new C9919v3(c9887tl.f9134a);
        this.f7875h.getClass();
        C9768p2.m6620a(c9587hl, c9427bb);
        C9005Jl c9005Jl = this.f7877j;
        c9005Jl.getClass();
        JSONObject jSONObjectOptJSONObject16 = c9427bb.optJSONObject("startup_update");
        C10037zl c10037zl = new C10037zl();
        Integer numM5962a = AbstractC9452cb.m5962a(jSONObjectOptJSONObject16, "interval_seconds", null);
        if (numM5962a != null) {
            c10037zl.f9408a = numM5962a.intValue();
        }
        c9005Jl.f6842a.getClass();
        c9587hl.f8310u = new C8957Hl(c10037zl.f9408a);
        Map<String, C8996Jc> mapMo4990b = this.f7878k.f7403a.mo4990b();
        C9283Vc c9283Vc = new C9283Vc(c9427bb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C8996Jc> entry : mapMo4990b.entrySet()) {
            Object objInvoke = c9283Vc.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c9587hl.f8311v = linkedHashMap;
        C8770A9 c8770a9 = this.f7879l.f6368a;
        C9937vl c9937vl = new C9937vl();
        JSONObject jSONObjectOptJSONObject17 = c9427bb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject17 != null) {
            c9937vl.f9235a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject17, "collecting_interval_seconds", c9937vl.f9235a);
        }
        c8770a9.getClass();
        c9587hl.f8312w = new C10025z9(c9937vl.f9235a);
    }

    public C9462cl(C9477db c9477db, C9926va c9926va, C9256U9 c9256u9, C9336Xh c9336Xh, C9212Sd c9212Sd, C9077Ml c9077Ml, C9994y3 c9994y3, C9818r2 c9818r2, C9768p2 c9768p2, C9005Jl c9005Jl, C9307Wc c9307Wc, C8795B9 c8795b9) {
        this.f7868a = c9926va;
        this.f7869b = c9256u9;
        this.f7870c = c9336Xh;
        this.f7871d = c9212Sd;
        this.f7872e = c9077Ml;
        this.f7874g = c9994y3;
        this.f7873f = c9818r2;
        this.f7875h = c9768p2;
        this.f7876i = c9477db;
        this.f7877j = c9005Jl;
        this.f7878k = c9307Wc;
        this.f7879l = c8795b9;
    }
}
