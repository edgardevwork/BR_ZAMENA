package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.b1 */
/* loaded from: classes6.dex */
public final class RunnableC9417b1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f7757a;

    /* renamed from: b */
    public final /* synthetic */ StartupParamsCallback f7758b;

    /* renamed from: c */
    public final /* synthetic */ List f7759c;

    /* renamed from: d */
    public final /* synthetic */ C9692m1 f7760d;

    public RunnableC9417b1(C9692m1 c9692m1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f7760d = c9692m1;
        this.f7757a = context;
        this.f7758b = startupParamsCallback;
        this.f7759c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9816r0 c9816r0 = this.f7760d.f8612a;
        Context applicationContext = this.f7757a.getApplicationContext();
        c9816r0.getClass();
        C9791q0 c9791q0M6658a = C9791q0.m6658a(applicationContext, false);
        c9791q0M6658a.m6687k().mo4940a(this.f7758b, this.f7759c);
    }
}
