package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.A2 */
/* loaded from: classes6.dex */
public final class RunnableC8763A2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f6307a;

    /* renamed from: b */
    public final /* synthetic */ Intent f6308b;

    /* renamed from: c */
    public final /* synthetic */ C8788B2 f6309c;

    public RunnableC8763A2(C8788B2 c8788b2, Context context, Intent intent) {
        this.f6309c = c8788b2;
        this.f6307a = context;
        this.f6308b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6309c.f6356a.consume(this.f6307a, this.f6308b);
    }
}
