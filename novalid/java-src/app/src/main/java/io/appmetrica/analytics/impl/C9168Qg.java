package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Qg */
/* loaded from: classes5.dex */
public final class C9168Qg {

    /* renamed from: a */
    public final C9252U5 f7161a;

    /* renamed from: b */
    public final boolean f7162b;

    /* renamed from: c */
    public final int f7163c;

    /* renamed from: d */
    public final HashMap f7164d;

    /* renamed from: e */
    public final C9383Zg f7165e;

    public C9168Qg(C9252U5 c9252u5, boolean z, int i, HashMap map, C9383Zg c9383Zg) {
        this.f7161a = c9252u5;
        this.f7162b = z;
        this.f7163c = i;
        this.f7164d = map;
        this.f7165e = c9383Zg;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f7161a + ", serviceDataReporterType=" + this.f7163c + ", environment=" + this.f7165e + ", isCrashReport=" + this.f7162b + ", trimmedFields=" + this.f7164d + ')';
    }
}
