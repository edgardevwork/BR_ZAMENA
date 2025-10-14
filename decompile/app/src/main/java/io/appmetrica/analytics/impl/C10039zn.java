package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.zn */
/* loaded from: classes8.dex */
public final class C10039zn {

    /* renamed from: a */
    public final Context f9409a;

    /* renamed from: b */
    public final LinkedHashMap f9410b = new LinkedHashMap();

    /* renamed from: c */
    public final C9939vn f9411c;

    /* renamed from: d */
    public final C9939vn f9412d;

    public C10039zn(Context context) {
        this.f9409a = context;
        C9376Z9 c9376z9 = new C9376Z9(context, "appmetrica_vital.dat");
        this.f9411c = new C9939vn(C9676la.m6362h().m6386w(), c9376z9);
        this.f9412d = new C9939vn(new C9830re(C9398a7.m5836a(context).m5843d()), c9376z9);
    }

    /* renamed from: a */
    public final C9939vn m7011a() {
        return this.f9411c;
    }

    /* renamed from: b */
    public final C9939vn m7012b() {
        return this.f9412d;
    }
}
