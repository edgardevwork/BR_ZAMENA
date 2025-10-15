package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.identifiers.impl.e */
/* loaded from: classes6.dex */
public final class ServiceConnectionC8743e implements ServiceConnection {

    /* renamed from: a */
    public final Intent f6281a;

    /* renamed from: b */
    public IBinder f6282b;

    /* renamed from: c */
    public final Object f6283c = new Object();

    public ServiceConnectionC8743e(Intent intent, String str) {
        this.f6281a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    /* renamed from: a */
    public final void m4915a(Context context) {
        synchronized (this.f6283c) {
            this.f6282b = null;
            this.f6283c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f6283c) {
            this.f6282b = null;
            this.f6283c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f6283c) {
            this.f6283c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6283c) {
            this.f6282b = iBinder;
            this.f6283c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6283c) {
            this.f6282b = null;
            this.f6283c.notifyAll();
        }
    }
}
