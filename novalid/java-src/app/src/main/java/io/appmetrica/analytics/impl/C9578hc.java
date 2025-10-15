package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.hc */
/* loaded from: classes5.dex */
public final class C9578hc {

    /* renamed from: a */
    public final Context f8265a;

    /* renamed from: b */
    public final C9145Ph f8266b;

    /* renamed from: c */
    public final C9529fd f8267c;

    /* renamed from: d */
    public final C9017K9 f8268d;

    /* renamed from: e */
    public final C9383Zg f8269e;

    /* renamed from: f */
    public final C9543g2 f8270f;

    /* renamed from: g */
    public final C9282Vb f8271g;

    /* renamed from: h */
    public final C9815r f8272h;

    /* renamed from: i */
    public final C9455ce f8273i;

    /* renamed from: j */
    public final C9174Qm f8274j;

    /* renamed from: k */
    public final C9310Wf f8275k;

    /* renamed from: l */
    public final C9947w6 f8276l;

    /* renamed from: m */
    public final C9342Y f8277m;

    public C9578hc(Context context, C9213Se c9213Se, C9145Ph c9145Ph, C9219Sk c9219Sk) {
        this.f8265a = context;
        this.f8266b = c9145Ph;
        this.f8267c = new C9529fd(c9213Se);
        C9017K9 c9017k9 = new C9017K9(context);
        this.f8268d = c9017k9;
        this.f8269e = new C9383Zg(c9213Se, new CounterConfiguration(CounterConfigurationReporterType.MAIN));
        this.f8270f = new C9543g2();
        this.f8271g = C9820r4.m6725i().m6738l();
        this.f8272h = new C9815r();
        this.f8273i = new C9455ce(c9017k9);
        this.f8274j = new C9174Qm();
        this.f8275k = new C9310Wf();
        this.f8276l = new C9947w6();
        this.f8277m = new C9342Y();
    }

    /* renamed from: a */
    public final C9342Y m6245a() {
        return this.f8277m;
    }

    /* renamed from: b */
    public final Context m6247b() {
        return this.f8265a;
    }

    /* renamed from: c */
    public final C9947w6 m6248c() {
        return this.f8276l;
    }

    /* renamed from: d */
    public final C9017K9 m6249d() {
        return this.f8268d;
    }

    /* renamed from: e */
    public final C9455ce m6250e() {
        return this.f8273i;
    }

    /* renamed from: f */
    public final C9282Vb m6251f() {
        return this.f8271g;
    }

    /* renamed from: g */
    public final C9310Wf m6252g() {
        return this.f8275k;
    }

    /* renamed from: h */
    public final C9383Zg m6253h() {
        return this.f8269e;
    }

    /* renamed from: i */
    public final C9145Ph m6254i() {
        return this.f8266b;
    }

    /* renamed from: j */
    public final C9174Qm m6255j() {
        return this.f8274j;
    }

    /* renamed from: a */
    public final void m6246a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f8269e.f7617b.applyFromConfig(appMetricaConfig);
        C9383Zg c9383Zg = this.f8269e;
        String str = appMetricaConfig.userProfileID;
        synchronized (c9383Zg) {
            c9383Zg.f7646f = str;
        }
        C9383Zg c9383Zg2 = this.f8269e;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        c9383Zg2.f7644d = new C9070Me(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
