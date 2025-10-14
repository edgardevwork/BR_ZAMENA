package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.vj */
/* loaded from: classes7.dex */
public final class ExecutorC9935vj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f9231a;

    public ExecutorC9935vj(Handler handler) {
        this.f9231a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9231a.post(runnable);
    }
}
