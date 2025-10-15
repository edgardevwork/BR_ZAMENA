package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Hg */
/* loaded from: classes7.dex */
public final class C8952Hg extends AbstractC9632jg {

    /* renamed from: b */
    public final C9046Le f6721b;

    /* renamed from: c */
    public final C9964wn f6722c;

    /* renamed from: d */
    public final SafePackageManager f6723d;

    /* renamed from: e */
    public final TimeProvider f6724e;

    public C8952Hg(@NonNull C9571h5 c9571h5) {
        this(c9571h5, c9571h5.m6224u(), C9676la.m6362h().m6380q(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        C9571h5 c9571h5 = this.f8444a;
        if (this.f6722c.m6946d()) {
            return false;
        }
        C9252U5 c9252u5M5635a = ((C8902Fg) c9571h5.f8239l.m6880a()).f6601f ? C9252U5.m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_APP_UPDATE) : C9252U5.m5635a(c9252u5, EnumC9329Xa.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f6723d.getInstallerPackageName(c9571h5.f8228a, c9571h5.f8229b.f7668a), ""));
            C9046Le c9046Le = this.f6721b;
            c9046Le.f7025h.mo4928a(c9046Le.f7018a);
            jSONObject.put("preloadInfo", ((C8974Ie) c9046Le.m5437c()).m5272b());
        } catch (Throwable unused) {
        }
        c9252u5M5635a.setValue(jSONObject.toString());
        C9625j9 c9625j9 = c9571h5.f8242o;
        c9625j9.m6308a(c9252u5M5635a, C9338Xj.m5752a(c9625j9.f8421c.m5756b(c9252u5M5635a), c9252u5M5635a.f7317i));
        C9964wn c9964wn = this.f6722c;
        synchronized (c9964wn) {
            C9989xn c9989xn = c9964wn.f9286a;
            c9989xn.m6980a(c9989xn.m6979a().put("init_event_done", true));
        }
        this.f6722c.m6938a(this.f6724e.currentTimeMillis());
        return false;
    }

    public C8952Hg(C9571h5 c9571h5, C9964wn c9964wn, C9046Le c9046Le, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c9571h5);
        this.f6722c = c9964wn;
        this.f6721b = c9046Le;
        this.f6723d = safePackageManager;
        this.f6724e = systemTimeProvider;
    }
}
