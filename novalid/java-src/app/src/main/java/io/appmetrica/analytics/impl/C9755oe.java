package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* renamed from: io.appmetrica.analytics.impl.oe */
/* loaded from: classes7.dex */
public final class C9755oe extends AbstractC9454cd implements InterfaceC8784An {

    /* renamed from: d */
    public static final long f8838d = 0;

    /* renamed from: e */
    public static final int f8839e = -1;

    /* renamed from: f */
    public static final String f8840f = "";

    /* renamed from: g */
    public static final String f8841g = "";

    /* renamed from: h */
    public static final C9805qe f8842h = new C9805qe("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i */
    public static final C9805qe f8843i = new C9805qe("PROFILE_ID", null);

    /* renamed from: j */
    public static final C9805qe f8844j = new C9805qe("APP_ENVIRONMENT", null);

    /* renamed from: k */
    public static final C9805qe f8845k = new C9805qe("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l */
    public static final C9805qe f8846l = new C9805qe("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m */
    public static final C9805qe f8847m = new C9805qe("APPLICATION_FEATURES", null);

    /* renamed from: n */
    public static final C9805qe f8848n = new C9805qe("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o */
    public static final C9805qe f8849o = new C9805qe("VITAL_DATA", null);

    /* renamed from: p */
    public static final C9805qe f8850p = new C9805qe("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q */
    public static final String f8851q = "SESSION_";

    public C9755oe(InterfaceC8896Fa interfaceC8896Fa) {
        super(interfaceC8896Fa);
    }

    /* renamed from: a */
    public final C9755oe m6594a(C9466d0 c9466d0) {
        synchronized (this) {
            m6646b(f8844j.f8942b, c9466d0.f7885a);
            m6645b(f8845k.f8942b, c9466d0.f7886b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9780pe
    @NonNull
    /* renamed from: c */
    public final Set<String> mo6597c() {
        return this.f8900a.mo5135a();
    }

    /* renamed from: d */
    public final C9466d0 m6598d() {
        C9466d0 c9466d0;
        synchronized (this) {
            c9466d0 = new C9466d0(this.f8900a.getString(f8844j.f8942b, MessageFormatter.DELIM_STR), this.f8900a.getLong(f8845k.f8942b, 0L));
        }
        return c9466d0;
    }

    /* renamed from: e */
    public final String m6600e() {
        return this.f8900a.getString(f8847m.f8942b, "");
    }

    @NonNull
    /* renamed from: f */
    public final List<String> m6601f() {
        String str = f8848n.f8942b;
        List listEmptyList = Collections.emptyList();
        String[] strArr = listEmptyList == null ? null : (String[]) listEmptyList.toArray(new String[listEmptyList.size()]);
        String string = this.f8900a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: g */
    public final int m6602g() {
        return this.f8900a.getInt(f8846l.f8942b, -1);
    }

    /* renamed from: h */
    public final long m6603h() {
        return this.f8900a.getLong(f8842h.f8942b, 0L);
    }

    /* renamed from: i */
    public final C9755oe m6605i(String str) {
        return (C9755oe) m6646b(f8847m.f8942b, str);
    }

    /* renamed from: j */
    public final C9755oe m6607j(@Nullable String str) {
        return (C9755oe) m6646b(f8843i.f8942b, str);
    }

    /* renamed from: h */
    public final String m6604h(String str) {
        return this.f8900a.getString(new C9805qe(f8851q, str).f8942b, "");
    }

    @Nullable
    /* renamed from: i */
    public final String m6606i() {
        return this.f8900a.getString(f8843i.f8942b, null);
    }

    @NonNull
    /* renamed from: j */
    public final Map<Integer, String> m6608j() {
        HashMap map = new HashMap();
        try {
            String string = this.f8900a.getString(f8850p.f8942b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* renamed from: e */
    public final C9755oe m6599e(String str, String str2) {
        return (C9755oe) m6646b(new C9805qe(f8851q, str).f8942b, str2);
    }

    /* renamed from: a */
    public final C9755oe m6593a(long j) {
        return (C9755oe) m6645b(f8842h.f8942b, j);
    }

    /* renamed from: a */
    public final C9755oe m6592a(int i) {
        return (C9755oe) m6644b(f8846l.f8942b, i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9454cd
    @NonNull
    /* renamed from: f */
    public final String mo5982f(@NonNull String str) {
        return new C9805qe(str, null).f8942b;
    }

    /* renamed from: a */
    public final C9755oe m6595a(List<String> list) {
        return (C9755oe) m6640a(f8848n.f8942b, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    @Nullable
    /* renamed from: a */
    public final String mo4978a() {
        return this.f8900a.getString(f8849o.f8942b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    /* renamed from: a */
    public final void mo4979a(@NonNull String str) {
        m6646b(f8849o.f8942b, str);
    }

    /* renamed from: a */
    public final void m6596a(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        m6646b(f8850p.f8942b, jSONObject.toString());
    }
}
