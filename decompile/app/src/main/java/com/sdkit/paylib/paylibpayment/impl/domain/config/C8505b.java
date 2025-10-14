package com.sdkit.paylib.paylibpayment.impl.domain.config;

import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.config.b */
/* loaded from: classes6.dex */
public final class C8505b implements InterfaceC8504a {

    /* renamed from: a */
    public final InternalConfigProvider f4826a;

    public C8505b(InternalConfigProvider configProvider) {
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f4826a = configProvider;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a
    /* renamed from: a */
    public boolean mo3942a() {
        JSONObject jSONObjectM3945d = m3945d();
        if (jSONObjectM3945d != null) {
            return jSONObjectM3945d.optBoolean("is_ssl_pinning_enabled", true);
        }
        return true;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a
    /* renamed from: b */
    public String mo3943b() {
        JSONObject jSONObjectM3945d = m3945d();
        if (jSONObjectM3945d != null) {
            return jSONObjectM3945d.optString("custom_user_uid");
        }
        return null;
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a
    /* renamed from: c */
    public boolean mo3944c() {
        JSONObject jSONObjectM3945d = m3945d();
        if (jSONObjectM3945d != null) {
            return jSONObjectM3945d.optBoolean("is_light_mode_enabled");
        }
        return false;
    }

    /* renamed from: d */
    public final JSONObject m3945d() {
        try {
            return new JSONObject(this.f4826a.provide());
        } catch (JSONException unused) {
            return null;
        }
    }
}
