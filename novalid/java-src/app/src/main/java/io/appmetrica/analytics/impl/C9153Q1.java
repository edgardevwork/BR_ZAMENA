package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.Q1 */
/* loaded from: classes5.dex */
public final class C9153Q1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static final AtomicBoolean f7134e = new AtomicBoolean();

    /* renamed from: a */
    public final InterfaceC8846Da f7135a;

    /* renamed from: b */
    public final C9282Vb f7136b = C9820r4.m6725i().m6738l();

    /* renamed from: c */
    public final C9822r6 f7137c = new C9822r6();

    /* renamed from: d */
    public final C8833Cm f7138d = new C8833Cm();

    public C9153Q1(C9747o6 c9747o6) {
        this.f7135a = c9747o6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArrMo5010b;
        try {
            f7134e.set(true);
            InterfaceC8846Da interfaceC8846Da = this.f7135a;
            C9938vm c9938vmApply = this.f7137c.apply(thread);
            C8833Cm c8833Cm = this.f7138d;
            Thread threadMo5009a = c8833Cm.f6436a.mo5009a();
            ArrayList arrayListM5040a = c8833Cm.m5040a(threadMo5009a, thread);
            if (thread != threadMo5009a) {
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
                arrayListM5040a.add(0, (C9938vm) c8833Cm.f6437b.apply(threadMo5009a, stackTraceElementArrMo5010b));
            }
            interfaceC8846Da.mo5058a(th, new C9222T(c9938vmApply, arrayListM5040a, this.f7136b.m5691b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
