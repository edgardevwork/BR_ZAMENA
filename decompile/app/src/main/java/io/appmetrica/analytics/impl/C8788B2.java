package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.B2 */
/* loaded from: classes6.dex */
public final class C8788B2 extends BroadcastReceiver {

    /* renamed from: a */
    public final BiConsumer f6356a;

    /* renamed from: b */
    public final ICommonExecutor f6357b;

    public C8788B2(C9297W2 c9297w2, ICommonExecutor iCommonExecutor) {
        this.f6356a = c9297w2;
        this.f6357b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f6357b.execute(new RunnableC8763A2(this, context, intent));
    }
}
