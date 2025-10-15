package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ne */
/* loaded from: classes7.dex */
public final class C9730ne extends AbstractC9454cd {

    /* renamed from: d */
    public static final C9805qe f8732d = new C9805qe("UUID_RESULT", null);

    /* renamed from: e */
    public static final C9805qe f8733e = new C9805qe("DEVICE_ID_RESULT", null);

    /* renamed from: f */
    public static final C9805qe f8734f = new C9805qe("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g */
    public static final C9805qe f8735g = new C9805qe("AD_URL_GET_RESULT", null);

    /* renamed from: h */
    public static final C9805qe f8736h = new C9805qe("AD_URL_REPORT_RESULT", null);

    /* renamed from: i */
    public static final C9805qe f8737i = new C9805qe("CUSTOM_HOSTS", null);

    /* renamed from: j */
    public static final C9805qe f8738j = new C9805qe("SERVER_TIME_OFFSET", null);

    /* renamed from: k */
    public static final C9805qe f8739k = new C9805qe("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l */
    public static final C9805qe f8740l = new C9805qe("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m */
    public static final C9805qe f8741m = new C9805qe("CLIENT_CLIDS", null);

    /* renamed from: n */
    public static final C9805qe f8742n = new C9805qe("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o */
    public static final C9805qe f8743o = new C9805qe("API_LEVEL", null);

    /* renamed from: p */
    public static final C9805qe f8744p = new C9805qe("NEXT_STARTUP_TIME", null);

    /* renamed from: q */
    public static final C9805qe f8745q = new C9805qe("GAID", null);

    /* renamed from: r */
    public static final C9805qe f8746r = new C9805qe("HOAID", null);

    /* renamed from: s */
    public static final C9805qe f8747s = new C9805qe("YANDEX_ADV_ID", null);

    /* renamed from: t */
    public static final C9805qe f8748t = new C9805qe("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u */
    public static final C9805qe f8749u = new C9805qe("SCREEN_INFO", null);

    /* renamed from: v */
    public static final C9805qe f8750v = new C9805qe("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w */
    public static final C9805qe f8751w = new C9805qe("FEATURES", null);

    /* renamed from: x */
    public static final C9805qe f8752x = new C9805qe("APPMETRICA_CLIENT_CONFIG", null);

    public C9730ne(InterfaceC8896Fa interfaceC8896Fa) {
        super(interfaceC8896Fa);
    }

    /* renamed from: a */
    public final boolean m6517a(boolean z) {
        return this.f8900a.getBoolean(f8748t.f8942b, z);
    }

    /* renamed from: b */
    public final long m6518b(long j) {
        return this.f8900a.getLong(f8738j.f8941a, j);
    }

    @NonNull
    /* renamed from: c */
    public final C9730ne m6522c(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8740l.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: d */
    public final IdentifiersResult m6525d() {
        return m6535h(f8735g.f8942b);
    }

    @NonNull
    /* renamed from: e */
    public final IdentifiersResult m6528e() {
        return m6535h(f8736h.f8942b);
    }

    @NonNull
    /* renamed from: f */
    public final C9730ne m6530f(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8745q.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: h */
    public final IdentifiersResult m6534h() {
        return m6535h(f8740l.f8942b);
    }

    @NonNull
    /* renamed from: i */
    public final IdentifiersResult m6537i() {
        return m6535h(f8734f.f8942b);
    }

    @NonNull
    /* renamed from: j */
    public final IdentifiersResult m6541j() {
        return m6535h(f8733e.f8942b);
    }

    @NonNull
    /* renamed from: k */
    public final C9232T9 m6542k() {
        String string = this.f8900a.getString(f8751w.f8942b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C9232T9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C9232T9(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    /* renamed from: l */
    public final IdentifiersResult m6544l() {
        return m6535h(f8745q.f8942b);
    }

    @NonNull
    /* renamed from: m */
    public final IdentifiersResult m6545m() {
        return m6535h(f8746r.f8942b);
    }

    @NonNull
    /* renamed from: n */
    public final long m6546n() {
        return this.f8900a.getLong(f8744p.f8942b, 0L);
    }

    @NonNull
    /* renamed from: o */
    public final IdentifiersResult m6547o() {
        return m6535h(f8739k.f8942b);
    }

    @Nullable
    /* renamed from: p */
    public final ScreenInfo m6548p() {
        return AbstractC9452cb.m5972e(this.f8900a.getString(f8749u.f8942b, null));
    }

    @NonNull
    /* renamed from: q */
    public final IdentifiersResult m6549q() {
        return m6535h(f8732d.f8942b);
    }

    @NonNull
    /* renamed from: r */
    public final IdentifiersResult m6550r() {
        return m6535h(f8747s.f8942b);
    }

    /* renamed from: s */
    public final boolean m6551s() {
        return this.f8900a.getBoolean(f8742n.f8942b, false);
    }

    /* renamed from: t */
    public final boolean m6552t() {
        return this.f8900a.getBoolean(f8750v.f8942b, false);
    }

    /* renamed from: u */
    public final C9730ne m6553u() {
        return (C9730ne) m6647b(f8742n.f8942b, true);
    }

    /* renamed from: v */
    public final void m6554v() {
        m6647b(f8750v.f8942b, true);
    }

    /* renamed from: g */
    public final List<String> m6532g() {
        String string = this.f8900a.getString(f8737i.f8942b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC9452cb.m5969b(string);
    }

    /* renamed from: a */
    public final long m6510a(long j) {
        return this.f8900a.getLong(f8743o.f8942b, j);
    }

    @NonNull
    /* renamed from: b */
    public final C9730ne m6519b(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8736h.f8942b, identifiersResult);
    }

    /* renamed from: c */
    public final C9730ne m6521c(long j) {
        return (C9730ne) m6645b(f8743o.f8942b, j);
    }

    @NonNull
    /* renamed from: d */
    public final C9730ne m6524d(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8734f.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: e */
    public final C9730ne m6527e(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8733e.f8942b, identifiersResult);
    }

    @Nullable
    /* renamed from: f */
    public final AppMetricaConfig m6529f() {
        String string = this.f8900a.getString(f8752x.f8942b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    /* renamed from: h */
    public final IdentifiersResult m6535h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f8900a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    /* renamed from: i */
    public final C9730ne m6536i(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8732d.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: j */
    public final C9730ne m6539j(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8747s.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: g */
    public final C9730ne m6531g(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8746r.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: a */
    public final C9730ne m6512a(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8735g.f8942b, identifiersResult);
    }

    /* renamed from: b */
    public final C9730ne m6520b(boolean z) {
        return (C9730ne) m6647b(f8748t.f8942b, z);
    }

    @NonNull
    /* renamed from: d */
    public final C9730ne m6523d(long j) {
        return (C9730ne) m6645b(f8744p.f8942b, j);
    }

    /* renamed from: e */
    public final C9730ne m6526e(long j) {
        return (C9730ne) m6645b(f8738j.f8942b, j);
    }

    @Nullable
    /* renamed from: i */
    public final String m6538i(@Nullable String str) {
        return this.f8900a.getString(f8741m.f8942b, str);
    }

    /* renamed from: j */
    public final C9730ne m6540j(@Nullable String str) {
        return (C9730ne) m6646b(f8741m.f8942b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9454cd
    @NonNull
    /* renamed from: f */
    public final String mo5982f(@NonNull String str) {
        return new C9805qe(str, null).f8942b;
    }

    /* renamed from: a */
    public final C9730ne m6514a(List<String> list) {
        return (C9730ne) m6646b(f8737i.f8942b, AbstractC9664kn.m6344a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    /* renamed from: h */
    public final C9730ne m6533h(@Nullable IdentifiersResult identifiersResult) {
        return m6513a(f8739k.f8942b, identifiersResult);
    }

    @NonNull
    /* renamed from: a */
    public final C9730ne m6511a(@NonNull C9232T9 c9232t9) {
        String str = f8751w.f8942b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c9232t9.f7285a).put("STATUS", c9232t9.f7286b.getValue()).putOpt("ERROR_EXPLANATION", c9232t9.f7287c);
        } catch (Throwable unused) {
        }
        return (C9730ne) m6646b(str, jSONObject.toString());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9454cd
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C9730ne mo5983g(@NonNull String str) {
        return (C9730ne) m6651d(new C9805qe(str, null).f8942b);
    }

    /* renamed from: a */
    public final void m6516a(@Nullable ScreenInfo screenInfo) {
        m6646b(f8749u.f8942b, AbstractC9452cb.m5963a(screenInfo));
    }

    /* renamed from: a */
    public final void m6515a(@NonNull AppMetricaConfig appMetricaConfig) {
        m6646b(f8752x.f8942b, appMetricaConfig.toJson());
    }

    /* renamed from: a */
    public final C9730ne m6513a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f9419id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            m6646b(str, string);
        }
        return this;
    }
}
