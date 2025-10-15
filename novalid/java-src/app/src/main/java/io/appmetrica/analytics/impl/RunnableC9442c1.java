package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.c1 */
/* loaded from: classes6.dex */
public final class RunnableC9442c1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AnrListener f7803a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7804b;

    public RunnableC9442c1(C9692m1 c9692m1, AnrListener anrListener) {
        this.f7804b = c9692m1;
        this.f7803a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7804b).mo5214a(this.f7803a);
    }
}
