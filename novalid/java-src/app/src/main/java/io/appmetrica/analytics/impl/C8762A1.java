package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.A1 */
/* loaded from: classes7.dex */
public final class C8762A1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f6304a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f6305b;

    /* renamed from: c */
    public final /* synthetic */ C8837D1 f6306c;

    public C8762A1(C8837D1 c8837d1, int i, Bundle bundle) {
        this.f6306c = c8837d1;
        this.f6304a = i;
        this.f6305b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6306c.f6442b.reportData(this.f6304a, this.f6305b);
    }
}
