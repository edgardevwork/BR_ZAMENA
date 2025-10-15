package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.i0 */
/* loaded from: classes5.dex */
public final class ServiceConnectionC9591i0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C9616j0 f8321a;

    public ServiceConnectionC9591i0(C9616j0 c9616j0) {
        this.f8321a = c9616j0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f8321a) {
            this.f8321a.f8381d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f8321a.f8382e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f8321a) {
            this.f8321a.f8381d = null;
        }
    }
}
