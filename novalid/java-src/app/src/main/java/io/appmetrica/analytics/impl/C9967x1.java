package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1 */
/* loaded from: classes5.dex */
public final class C9967x1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f9293a;

    /* renamed from: b */
    public final /* synthetic */ C8837D1 f9294b;

    public C9967x1(C8837D1 c8837d1, Intent intent) {
        this.f9294b = c8837d1;
        this.f9293a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f9294b.f6442b.mo5043a(this.f9293a);
    }
}
