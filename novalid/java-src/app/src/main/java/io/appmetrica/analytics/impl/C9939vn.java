package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vn */
/* loaded from: classes7.dex */
public final class C9939vn {

    /* renamed from: a */
    public final C9989xn f9242a;

    public C9939vn(C9830re c9830re, C9376Z9 c9376z9) {
        this.f9242a = new C9989xn(c9830re, c9376z9, new InterfaceC10014yn() { // from class: io.appmetrica.analytics.impl.vn$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC10014yn
            /* renamed from: a */
            public final JSONObject mo6914a(JSONObject jSONObject, JSONObject jSONObject2) {
                return C9939vn.m6906a(jSONObject, jSONObject2);
            }
        });
    }

    /* renamed from: a */
    public static final JSONObject m6906a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC9452cb.m5962a(jSONObject2, "last_migration_api_level", AbstractC9452cb.m5962a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    /* renamed from: b */
    public final synchronized void m6911b(String str) {
        C9989xn c9989xn = this.f9242a;
        c9989xn.m6980a(c9989xn.m6979a().put("device_id_hash", str));
    }

    /* renamed from: c */
    public final synchronized boolean m6912c() {
        return this.f9242a.m6979a().optBoolean("referrer_checked", false);
    }

    /* renamed from: d */
    public final synchronized void m6913d() {
        C9989xn c9989xn = this.f9242a;
        c9989xn.m6980a(c9989xn.m6979a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized C8901Ff m6910b() {
        byte[] bArrDecode;
        C8901Ff c8901Ff;
        String strOptStringOrNull = JsonUtils.optStringOrNull(this.f9242a.m6979a(), "referrer");
        if (strOptStringOrNull != null) {
            try {
                bArrDecode = Base64.decode(strOptStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            c8901Ff = (bArrDecode == null || bArrDecode.length == 0) ? null : new C8901Ff(bArrDecode);
        }
        return c8901Ff;
    }

    /* renamed from: a */
    public final synchronized void m6909a(String str) {
        C9989xn c9989xn = this.f9242a;
        c9989xn.m6980a(c9989xn.m6979a().put("device_id", str));
    }

    /* renamed from: a */
    public final synchronized String m6907a() {
        return JsonUtils.optStringOrNull(this.f9242a.m6979a(), "device_id_hash");
    }

    /* renamed from: a */
    public final synchronized void m6908a(C8901Ff c8901Ff) {
        try {
            C9989xn c9989xn = this.f9242a;
            c9989xn.m6980a(c9989xn.m6979a().put("referrer", c8901Ff != null ? new String(Base64.encode(c8901Ff.m5147a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
