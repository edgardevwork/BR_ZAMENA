package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.l0 */
/* loaded from: classes5.dex */
public final class C9666l0 {

    /* renamed from: a */
    public final C9341Xm f8534a;

    /* renamed from: b */
    public volatile Boolean f8535b;

    /* renamed from: c */
    public InterfaceC10026za f8536c;

    /* renamed from: d */
    public InterfaceC8771Aa f8537d;

    public C9666l0() {
        this(new C9341Xm());
    }

    /* renamed from: a */
    public final synchronized InterfaceC10026za m6348a(Context context, C9570h4 c9570h4) {
        try {
            if (this.f8536c == null) {
                if (m6349a(context)) {
                    this.f8536c = new C9716n0();
                } else {
                    this.f8536c = new C9641k0(context, c9570h4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8536c;
    }

    public C9666l0(C9341Xm c9341Xm) {
        this.f8534a = c9341Xm;
    }

    /* renamed from: a */
    public final boolean m6349a(Context context) {
        Boolean boolValueOf = this.f8535b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f8535b;
                    if (boolValueOf == null) {
                        this.f8534a.getClass();
                        boolean z = !C9341Xm.m5760a(context);
                        boolValueOf = Boolean.valueOf(z);
                        this.f8535b = boolValueOf;
                        if (z) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
