package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.Gg */
/* loaded from: classes8.dex */
public final class RunnableC8927Gg implements Runnable {

    /* renamed from: a */
    public final Context f6675a;

    /* renamed from: b */
    public final C9252U5 f6676b;

    /* renamed from: c */
    public final Bundle f6677c;

    /* renamed from: d */
    public final C9795q4 f6678d;

    public RunnableC8927Gg(Context context, C9252U5 c9252u5, Bundle bundle, C9795q4 c9795q4) {
        this.f6675a = context;
        this.f6676b = c9252u5;
        this.f6677c = bundle;
        this.f6678d = c9795q4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C9370Z3 c9370z3M5794a = C9370Z3.m5794a(this.f6675a, this.f6677c);
            if (c9370z3M5794a == null) {
                return;
            }
            C9520f4 c9520f4M6080a = C9520f4.m6080a(c9370z3M5794a);
            C9959wi c9959wiM6382s = C9676la.f8552C.m6382s();
            c9959wiM6382s.m6926a(c9370z3M5794a.f7617b.getAppVersion(), c9370z3M5794a.f7617b.getAppBuildNumber());
            c9959wiM6382s.m6925a(c9370z3M5794a.f7617b.getDeviceType());
            C8865E4 c8865e4 = new C8865E4(c9370z3M5794a);
            this.f6678d.m6692a(c9520f4M6080a, c8865e4).mo5290a(this.f6676b, c8865e4);
        } catch (Throwable th) {
            C9610ij c9610ij = AbstractC8954Hi.f6726a;
            String str = "Exception during processing event with type: " + this.f6676b.f7312d + " (" + this.f6676b.f7313e + "): " + th.getMessage();
            c9610ij.getClass();
            c9610ij.m6292a(new C8978Ii(str, th));
        }
    }
}
