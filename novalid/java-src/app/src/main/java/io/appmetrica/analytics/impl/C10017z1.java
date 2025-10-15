package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1 */
/* loaded from: classes5.dex */
public final class C10017z1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f9380a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f9381b;

    public C10017z1(C8837D1 c8837d1, Intent intent) {
        this.f9381b = c8837d1;
        this.f9380a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9381b.f6442b.mo5047b(this.f9380a);
    }
}
