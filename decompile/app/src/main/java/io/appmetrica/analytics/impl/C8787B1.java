package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.B1 */
/* loaded from: classes7.dex */
public final class C8787B1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f6354a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f6355b;

    public C8787B1(C8837D1 c8837d1, Bundle bundle) {
        this.f6355b = c8837d1;
        this.f6354a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6355b.f6442b.resumeUserSession(this.f6354a);
    }
}
