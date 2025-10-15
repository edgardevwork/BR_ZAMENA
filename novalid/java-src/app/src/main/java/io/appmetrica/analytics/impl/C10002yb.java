package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.yb */
/* loaded from: classes5.dex */
public final class C10002yb implements InterfaceC9440c {

    /* renamed from: a */
    public final InterfaceC9416b0 f9363a;

    /* renamed from: b */
    public final C8833Cm f9364b = new C8833Cm();

    public C10002yb(@NotNull InterfaceC9416b0 interfaceC9416b0) {
        this.f9363a = interfaceC9416b0;
    }

    /* renamed from: a */
    public static final void m6995a(C10002yb c10002yb, C9222T c9222t) {
        c10002yb.f9363a.mo4965a(c9222t);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9440c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrMo5010b;
        C8833Cm c8833Cm = this.f9364b;
        Thread threadMo5009a = c8833Cm.f6436a.mo5009a();
        try {
            stackTraceElementArrMo5010b = c8833Cm.f6436a.mo5010b();
            if (stackTraceElementArrMo5010b == null) {
                try {
                    stackTraceElementArrMo5010b = threadMo5009a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrMo5010b = null;
        }
        final C9222T c9222t = new C9222T((C9938vm) c8833Cm.f6437b.apply(threadMo5009a, stackTraceElementArrMo5010b), c8833Cm.m5040a(threadMo5009a, null), c8833Cm.f6438c.m5691b());
        ((C9975x9) C9820r4.m6725i().f8968c.m6201a()).f9301b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.yb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C10002yb.m6995a(this.f$0, c9222t);
            }
        });
    }
}
