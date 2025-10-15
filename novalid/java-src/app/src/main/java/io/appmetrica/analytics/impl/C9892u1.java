package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.u1 */
/* loaded from: classes5.dex */
public final class C9892u1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8837D1 f9154a;

    public C9892u1(C8837D1 c8837d1) {
        this.f9154a = c8837d1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f9154a) {
            try {
                C8837D1 c8837d1 = this.f9154a;
                if (c8837d1.f6443c) {
                    c8837d1.f6442b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
