package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.j */
/* loaded from: classes5.dex */
public final class RunnableC9615j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f8375a;

    /* renamed from: b */
    public final /* synthetic */ C9665l f8376b;

    public RunnableC9615j(C9665l c9665l, Activity activity) {
        this.f8376b = c9665l;
        this.f8375a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8376b.m6346a(this.f8375a);
    }
}
