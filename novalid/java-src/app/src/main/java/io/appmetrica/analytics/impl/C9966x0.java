package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.x0 */
/* loaded from: classes8.dex */
public final class C9966x0 {

    /* renamed from: a */
    public final C9816r0 f9288a;

    /* renamed from: b */
    public final C9952wb f9289b;

    /* renamed from: c */
    public final C9977xb f9290c;

    /* renamed from: d */
    public final C10027zb f9291d;

    /* renamed from: e */
    public final IHandlerExecutor f9292e;

    public C9966x0() {
        C9816r0 c9816r0M6730c = C9820r4.m6725i().m6730c();
        this.f9288a = c9816r0M6730c;
        this.f9289b = new C9952wb(c9816r0M6730c);
        this.f9290c = new C9977xb(c9816r0M6730c);
        this.f9291d = new C10027zb();
        this.f9292e = C9820r4.m6725i().m6732e().m6201a();
    }

    /* renamed from: a */
    public final void m6948a(Context context) {
        if (!this.f9289b.f9255a.mo5086a(context).f8908a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        C9977xb c9977xb = this.f9290c;
        c9977xb.f9306b.m5296a(applicationContext);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        C9820r4.m6725i().f8971f.m5994a();
        c9977xb.f9305a.getClass();
        C9791q0 c9791q0M6658a = C9791q0.m6658a(applicationContext, true);
        c9791q0M6658a.f8919d.mo6320a(null, c9791q0M6658a);
        this.f9292e.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.x0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C9966x0.m6947a(this.f$0, applicationContext);
            }
        });
        this.f9288a.getClass();
        synchronized (C9791q0.class) {
            C9791q0.f8914f = true;
        }
    }

    /* renamed from: a */
    public static final void m6947a(C9966x0 c9966x0, Context context) {
        c9966x0.f9288a.getClass();
        C9791q0.m6658a(context, false).m6687k().mo4945e();
    }
}
