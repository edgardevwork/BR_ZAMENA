package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.C1 */
/* loaded from: classes7.dex */
public final class C8812C1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f6419a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f6420b;

    public C8812C1(C8837D1 c8837d1, Bundle bundle) {
        this.f6420b = c8837d1;
        this.f6419a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6420b.f6442b.pauseUserSession(this.f6419a);
    }
}
