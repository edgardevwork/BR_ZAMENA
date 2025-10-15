package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.v1 */
/* loaded from: classes5.dex */
public final class C9917v1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f9201a;

    /* renamed from: b */
    public final /* synthetic */ int f9202b;

    /* renamed from: c */
    public final /* synthetic */ C8837D1 f9203c;

    public C9917v1(C8837D1 c8837d1, Intent intent, int i) {
        this.f9203c = c8837d1;
        this.f9201a = intent;
        this.f9202b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9203c.f6442b.mo5044a(this.f9201a, this.f9202b);
    }
}
