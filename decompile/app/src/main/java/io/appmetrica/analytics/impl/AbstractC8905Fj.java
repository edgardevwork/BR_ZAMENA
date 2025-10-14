package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Fj */
/* loaded from: classes6.dex */
public abstract class AbstractC8905Fj {

    /* renamed from: a */
    public static final SafePackageManager f6624a = new SafePackageManager();

    /* renamed from: a */
    public static Intent m5186a(Context context) {
        Bundle bundle;
        C9884ti c9884ti;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f6624a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C9213Se.f7250c).build());
        C9820r4 c9820r4M6725i = C9820r4.m6725i();
        synchronized (c9820r4M6725i) {
            try {
                if (c9820r4M6725i.f8980o == null) {
                    C9884ti c9884ti2 = new C9884ti();
                    c9820r4M6725i.f8980o = c9884ti2;
                    c9820r4M6725i.f8973h.m6347a(c9884ti2);
                }
                c9884ti = c9820r4M6725i.f8980o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo screenInfoM6827a = c9884ti.m6827a(context);
        intentPutExtras.putExtra("screen_size", screenInfoM6827a == null ? null : AbstractC9452cb.m5963a(screenInfoM6827a));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
