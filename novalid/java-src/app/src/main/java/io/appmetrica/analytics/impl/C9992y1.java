package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1 */
/* loaded from: classes5.dex */
public final class C9992y1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f9337a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f9338b;

    public C9992y1(C8837D1 c8837d1, Intent intent) {
        this.f9338b = c8837d1;
        this.f9337a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9338b.f6442b.mo5048c(this.f9337a);
    }
}
