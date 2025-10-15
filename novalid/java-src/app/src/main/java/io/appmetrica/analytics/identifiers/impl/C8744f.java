package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.identifiers.impl.f */
/* loaded from: classes6.dex */
public final class C8744f {

    /* renamed from: a */
    public final ServiceConnectionC8743e f6284a;

    /* renamed from: b */
    public final Function1 f6285b;

    /* renamed from: c */
    public final String f6286c;

    /* renamed from: d */
    public final SafePackageManager f6287d;

    public C8744f(ServiceConnectionC8743e serviceConnectionC8743e, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f6284a = serviceConnectionC8743e;
        this.f6285b = function1;
        this.f6286c = str;
        this.f6287d = safePackageManager;
    }

    /* renamed from: a */
    public final Object m4916a(Context context) throws C8745g {
        IBinder iBinder;
        ServiceConnectionC8743e serviceConnectionC8743e;
        if (this.f6287d.resolveService(context, this.f6284a.f6281a, 0) == null) {
            throw new C8750l("could not resolve " + this.f6286c + " services");
        }
        try {
            serviceConnectionC8743e = this.f6284a;
        } catch (Throwable unused) {
        }
        if (context.bindService(serviceConnectionC8743e.f6281a, serviceConnectionC8743e, 1)) {
            ServiceConnectionC8743e serviceConnectionC8743e2 = this.f6284a;
            if (serviceConnectionC8743e2.f6282b == null) {
                synchronized (serviceConnectionC8743e2.f6283c) {
                    if (serviceConnectionC8743e2.f6282b == null) {
                        try {
                            serviceConnectionC8743e2.f6283c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = serviceConnectionC8743e2.f6282b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.f6285b.invoke(iBinder);
        }
        throw new C8745g("could not bind to " + this.f6286c + " services");
    }

    /* renamed from: b */
    public final void m4917b(Context context) {
        try {
            this.f6284a.m4915a(context);
        } catch (Throwable unused) {
        }
    }

    public C8744f(Intent intent, Function1 function1, String str) {
        this(new ServiceConnectionC8743e(intent, str), function1, str, new SafePackageManager());
    }
}
