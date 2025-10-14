package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zm */
/* loaded from: classes5.dex */
public final class C10038zm implements InterfaceC8808Bm {
    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    /* renamed from: a */
    public final Thread mo5009a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    /* renamed from: b */
    public final StackTraceElement[] mo5010b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    /* renamed from: c */
    public final Map mo5011c() {
        return Thread.getAllStackTraces();
    }
}
