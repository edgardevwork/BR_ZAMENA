package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.oi */
/* loaded from: classes6.dex */
public final class C9759oi extends AbstractC9632jg {

    /* renamed from: b */
    public final C9046Le f8859b;

    public C9759oi(@NonNull C9571h5 c9571h5) {
        this(c9571h5, C9676la.m6362h().m6380q());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(c9252u5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f8859b.m5436b(C8974Ie.m5270a(jSONObjectOptJSONObject));
        return false;
    }

    public C9759oi(C9571h5 c9571h5, C9046Le c9046Le) {
        super(c9571h5);
        this.f8859b = c9046Le;
    }
}
