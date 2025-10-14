package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.w1 */
/* loaded from: classes5.dex */
public final class C9942w1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f9244a;

    /* renamed from: b */
    public final /* synthetic */ int f9245b;

    /* renamed from: c */
    public final /* synthetic */ int f9246c;

    /* renamed from: d */
    public final /* synthetic */ C8837D1 f9247d;

    public C9942w1(C8837D1 c8837d1, Intent intent, int i, int i2) {
        this.f9247d = c8837d1;
        this.f9244a = intent;
        this.f9245b = i;
        this.f9246c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9247d.f6442b.mo5045a(this.f9244a, this.f9245b, this.f9246c);
    }
}
