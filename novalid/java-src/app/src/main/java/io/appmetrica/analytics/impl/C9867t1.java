package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.t1 */
/* loaded from: classes6.dex */
public final class C9867t1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Configuration f9081a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f9082b;

    public C9867t1(C8837D1 c8837d1, Configuration configuration) {
        this.f9082b = c8837d1;
        this.f9081a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9082b.f6442b.onConfigurationChanged(this.f9081a);
    }
}
