package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.Ph */
/* loaded from: classes5.dex */
public final class C9145Ph {

    /* renamed from: a */
    public final C9251U4 f7115a;

    /* renamed from: b */
    public final C9197Rm f7116b;

    /* renamed from: c */
    public final C9169Qh f7117c;

    /* renamed from: d */
    public final C9616j0 f7118d;

    /* renamed from: e */
    public InterfaceC9243Tk f7119e;

    /* renamed from: f */
    public final C9760oj f7120f;

    public C9145Ph(C9616j0 c9616j0, C9197Rm c9197Rm, C9251U4 c9251u4, C9760oj c9760oj) {
        this(c9616j0, c9197Rm, c9251u4, c9760oj, new C9169Qh(c9616j0, c9760oj));
    }

    /* renamed from: a */
    public final void m5491a(C9168Qg c9168Qg) {
        C9383Zg c9383Zg = c9168Qg.f7165e;
        InterfaceC9243Tk interfaceC9243Tk = this.f7119e;
        if (interfaceC9243Tk != null) {
            c9383Zg.f7617b.setUuid(((C9219Sk) interfaceC9243Tk).m5599g());
        } else {
            c9383Zg.getClass();
        }
        this.f7117c.m5501a(c9168Qg);
    }

    /* renamed from: b */
    public final void m5497b(String str) {
        C9213Se c9213Se = this.f7115a.f7616a;
        synchronized (c9213Se) {
            c9213Se.f7251a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C9145Ph(C9616j0 c9616j0, C9197Rm c9197Rm, C9251U4 c9251u4, C9760oj c9760oj, C9169Qh c9169Qh) {
        this.f7118d = c9616j0;
        this.f7115a = c9251u4;
        this.f7116b = c9197Rm;
        this.f7120f = c9760oj;
        this.f7117c = c9169Qh;
    }

    /* renamed from: a */
    public final void m5492a(C9219Sk c9219Sk) {
        this.f7119e = c9219Sk;
        this.f7115a.f7617b.setUuid(c9219Sk.m5599g());
    }

    /* renamed from: a */
    public final void m5493a(C9252U5 c9252u5, C9383Zg c9383Zg, int i, Map map) {
        String str;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        this.f7118d.m6297b();
        if (!AbstractC9664kn.m6345a(map)) {
            c9252u5.setValue(AbstractC9452cb.m5968b(map));
            m5490a(c9252u5, c9383Zg);
        }
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        m5491a(new C9168Qg(c9252u5, false, i, null, new C9383Zg(c9213Se, counterConfiguration, str)));
    }

    /* renamed from: a */
    public static C9252U5 m5490a(C9252U5 c9252u5, C9383Zg c9383Zg) {
        if (AbstractC9875t9.f9105a.contains(Integer.valueOf(c9252u5.f7312d))) {
            c9252u5.f7311c = c9383Zg.m5813d();
        }
        return c9252u5;
    }

    /* renamed from: a */
    public final void m5496a(List list) {
        C9213Se c9213Se = this.f7115a.f7616a;
        synchronized (c9213Se) {
            c9213Se.f7251a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC9664kn.m6344a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    /* renamed from: a */
    public final void m5495a(HashMap map) {
        C9213Se c9213Se = this.f7115a.f7616a;
        synchronized (c9213Se) {
            c9213Se.f7251a.put("PROCESS_CFG_CLIDS", AbstractC9452cb.m5968b(map));
        }
    }

    /* renamed from: a */
    public final void m5494a(String str) {
        C9213Se c9213Se = this.f7115a.f7616a;
        synchronized (c9213Se) {
            c9213Se.f7251a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }
}
