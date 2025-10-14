package io.appmetrica.analytics.impl;

import android.location.Location;

/* renamed from: io.appmetrica.analytics.impl.J0 */
/* loaded from: classes8.dex */
public final class RunnableC8984J0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Location f6799a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f6800b;

    public RunnableC8984J0(C9692m1 c9692m1, Location location) {
        this.f6800b = c9692m1;
        this.f6799a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9816r0 c9816r0 = this.f6800b.f8612a;
        Location location = this.f6799a;
        c9816r0.getClass();
        C9791q0.m6663g().mo4935a(location);
    }
}
