package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Gm */
/* loaded from: classes8.dex */
public abstract class AbstractC8933Gm {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8908Fm m5233a(Throwable th, int i, int i2) {
        StackTraceElement[] stackTrace;
        C8908Fm c8908FmM5233a;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTrace = th.getStackTrace();
        } catch (Throwable unused) {
            stackTrace = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList2.add(new C8956Hk(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            c8908FmM5233a = null;
        } else {
            if (i2 >= i) {
                cause = null;
            }
            if (cause != null) {
                c8908FmM5233a = m5233a(cause, 30, i2 + 1);
            }
        }
        if (i2 < i) {
            Throwable[] suppressed = th.getSuppressed();
            arrayList = new ArrayList(suppressed.length);
            for (Throwable th2 : suppressed) {
                arrayList.add(m5233a(th2, 1, i2));
            }
        } else {
            arrayList = null;
        }
        return new C8908Fm(name, message, arrayList2, c8908FmM5233a, arrayList);
    }
}
