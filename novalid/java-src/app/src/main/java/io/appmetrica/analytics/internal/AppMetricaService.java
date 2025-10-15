package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.BinderC9792q1;
import io.appmetrica.analytics.impl.C10017z1;
import io.appmetrica.analytics.impl.C8837D1;
import io.appmetrica.analytics.impl.C8904Fi;
import io.appmetrica.analytics.impl.C8912G1;
import io.appmetrica.analytics.impl.C8929Gi;
import io.appmetrica.analytics.impl.C8985J1;
import io.appmetrica.analytics.impl.C9676la;
import io.appmetrica.analytics.impl.C9721n5;
import io.appmetrica.analytics.impl.C9767p1;
import io.appmetrica.analytics.impl.C9860sj;
import io.appmetrica.analytics.impl.C9867t1;
import io.appmetrica.analytics.impl.C9917v1;
import io.appmetrica.analytics.impl.C9942w1;
import io.appmetrica.analytics.impl.C9967x1;
import io.appmetrica.analytics.impl.C9992y1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class AppMetricaService extends Service {

    /* renamed from: c */
    private static C8837D1 f9413c;

    /* renamed from: a */
    private final C9767p1 f9414a = new C9767p1(this);

    /* renamed from: b */
    private final BinderC10040a f9415b = new BinderC10040a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC9792q1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f9415b : new BinderC9792q1();
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C9967x1(c8837d1, intent));
        return binderC9792q1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C9867t1(c8837d1, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C9676la.m6361a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        C8837D1 c8837d1 = f9413c;
        if (c8837d1 == null) {
            Context applicationContext = getApplicationContext();
            C8912G1 c8912g1 = new C8912G1(applicationContext, this.f9414a, new C9721n5(applicationContext));
            C9860sj c9860sj = C9676la.f8552C.f8576v;
            C8985J1 c8985j1 = new C8985J1(c8912g1);
            LinkedHashMap linkedHashMap = c9860sj.f9051a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(c8985j1);
            f9413c = new C8837D1(C9676la.f8552C.f8558d.m6967b(), c8912g1);
        } else {
            c8837d1.f6442b.mo5046a(this.f9414a);
        }
        C9676la c9676la = C9676la.f8552C;
        C8929Gi c8929Gi = new C8929Gi(f9413c);
        synchronized (c9676la) {
            c9676la.f8560f = new C8904Fi(c9676la.f8555a, c8929Gi);
        }
        f9413c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f9413c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C9992y1(c8837d1, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C9917v1(c8837d1, intent, i));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C9942w1(c8837d1, intent, i, i2));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C8837D1 c8837d1 = f9413c;
        c8837d1.f6441a.execute(new C10017z1(c8837d1, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
