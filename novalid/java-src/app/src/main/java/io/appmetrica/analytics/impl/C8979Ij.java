package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Ij */
/* loaded from: classes6.dex */
public final class C8979Ij implements ServiceWakeLock {

    /* renamed from: a */
    public final Context f6792a;

    /* renamed from: b */
    public final C8955Hj f6793b;

    /* renamed from: c */
    public final HashMap f6794c = new HashMap();

    public C8979Ij(@NotNull Context context, @NotNull C8955Hj c8955Hj) {
        this.f6792a = context;
        this.f6793b = c8955Hj;
    }

    @NotNull
    /* renamed from: a */
    public final String m5278a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.f6794c.get(str) == null) {
                HashMap map = this.f6794c;
                C8955Hj c8955Hj = this.f6793b;
                Context context = this.f6792a;
                String strM5278a = m5278a(str);
                c8955Hj.f6727a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strM5278a);
                ServiceConnectionC8930Gj serviceConnectionC8930Gj = new ServiceConnectionC8930Gj();
                try {
                    context.bindService(intent, serviceConnectionC8930Gj, 1);
                } catch (Throwable unused) {
                    serviceConnectionC8930Gj = null;
                }
                map.put(str, serviceConnectionC8930Gj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6794c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f6794c.get(str);
        if (serviceConnection != null) {
            C8955Hj c8955Hj = this.f6793b;
            m5278a(str);
            Context context = this.f6792a;
            c8955Hj.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
