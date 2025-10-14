package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.Rm */
/* loaded from: classes5.dex */
public final class C9197Rm {

    /* renamed from: a */
    public final C9577hb f7213a;

    public C9197Rm() {
        this(new C9577hb());
    }

    /* renamed from: a */
    public final C9168Qg m5531a(C9150Pm c9150Pm, C9383Zg c9383Zg) {
        String str;
        C8908Fm c8908Fm = c9150Pm.f7124a;
        String str2 = c8908Fm == null ? "" : (String) WrapUtils.getOrDefault(c8908Fm.f6628a, "");
        byte[] bArrFromModel = this.f7213a.fromModel(c9150Pm);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey());
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(bArrFromModel, str2, 5891, orCreatePublicLogger);
        c9445c4.f7311c = c9383Zg.m5813d();
        HashMap map = c9445c4.f7811q;
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        return new C9168Qg(c9445c4, true, 1, map, new C9383Zg(c9213Se, counterConfiguration, str));
    }

    public C9197Rm(C9577hb c9577hb) {
        this.f7213a = c9577hb;
    }
}
