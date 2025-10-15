package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.IReporter;

/* renamed from: io.appmetrica.analytics.impl.J5 */
/* loaded from: classes8.dex */
public final class C8989J5 {

    /* renamed from: a */
    public final C9765p f6810a;

    /* renamed from: b */
    public final IReporter f6811b;

    /* renamed from: c */
    public Context f6812c;

    /* renamed from: d */
    public final InterfaceC9715n f6813d;

    public C8989J5(C9765p c9765p) {
        this(c9765p, 0);
    }

    /* renamed from: a */
    public static final void m5295a(C8989J5 c8989j5, Activity activity, EnumC9690m enumC9690m) {
        int iOrdinal = enumC9690m.ordinal();
        if (iOrdinal == 1) {
            c8989j5.f6811b.resumeSession();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            c8989j5.f6811b.pauseSession();
        }
    }

    public C8989J5(C9765p c9765p, IReporter iReporter) {
        this.f6810a = c9765p;
        this.f6811b = iReporter;
        this.f6813d = new InterfaceC9715n() { // from class: io.appmetrica.analytics.impl.J5$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC9715n
            /* renamed from: a */
            public final void mo5297a(Activity activity, EnumC9690m enumC9690m) {
                C8989J5.m5295a(this.f$0, activity, enumC9690m);
            }
        };
    }

    /* renamed from: a */
    public final synchronized void m5296a(Context context) {
        if (this.f6812c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f6810a.m6615a(applicationContext);
            this.f6810a.m6616a(this.f6813d, EnumC9690m.RESUMED, EnumC9690m.PAUSED);
            this.f6812c = applicationContext;
        }
    }

    public /* synthetic */ C8989J5(C9765p c9765p, int i) {
        this(c9765p, AbstractC9742o1.m6565a());
    }
}
