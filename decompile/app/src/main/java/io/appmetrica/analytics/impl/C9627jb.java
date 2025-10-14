package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.jb */
/* loaded from: classes5.dex */
public final class C9627jb {

    /* renamed from: a */
    public final Handler f8432a;

    /* renamed from: b */
    public final AbstractC9177R2 f8433b;

    /* renamed from: c */
    public final RunnableC9652kb f8434c;

    public C9627jb(Handler handler, AbstractC9177R2 abstractC9177R2) {
        this.f8432a = handler;
        this.f8433b = abstractC9177R2;
        this.f8434c = new RunnableC9652kb(handler, abstractC9177R2);
    }

    /* renamed from: a */
    public static void m6310a(Handler handler, AbstractC9177R2 abstractC9177R2, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC9177R2.f7186b.f7617b.getApiKey());
        handler.postAtTime(runnable, abstractC9177R2.f7186b.f7617b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(abstractC9177R2.f7186b.f7617b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
