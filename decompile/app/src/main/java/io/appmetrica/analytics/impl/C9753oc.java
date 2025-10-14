package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.oc */
/* loaded from: classes7.dex */
public final class C9753oc {

    /* renamed from: a */
    public final C9413am f8830a;

    /* renamed from: b */
    public final C9413am f8831b;

    /* renamed from: c */
    public final C8790B4 f8832c;

    /* renamed from: d */
    public final PublicLogger f8833d;

    /* renamed from: e */
    public final String f8834e;

    public C9753oc(String str, PublicLogger publicLogger) {
        this(new C8790B4(30), new C9413am(50, str.concat("map key"), publicLogger), new C9413am(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C9753oc(C8790B4 c8790b4, C9413am c9413am, C9413am c9413am2, String str, PublicLogger publicLogger) {
        this.f8832c = c8790b4;
        this.f8830a = c9413am;
        this.f8831b = c9413am2;
        this.f8834e = str;
        this.f8833d = publicLogger;
    }
}
