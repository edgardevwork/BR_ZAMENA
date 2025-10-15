package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.AbstractC8953Hh;
import io.appmetrica.analytics.impl.C9068Mc;
import io.appmetrica.analytics.impl.C9116Oc;
import io.appmetrica.analytics.impl.C9140Pc;
import io.appmetrica.analytics.impl.C9164Qc;
import io.appmetrica.analytics.impl.C9187Rc;
import io.appmetrica.analytics.impl.C9211Sc;
import io.appmetrica.analytics.impl.C9791q0;

/* loaded from: classes8.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a */
    private static C9211Sc f5978a = new C9211Sc();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C9211Sc c9211Sc = f5978a;
        C9068Mc c9068Mc = c9211Sc.f7247b;
        c9068Mc.f6987b.mo5086a(context);
        c9068Mc.f6989d.mo5086a(str);
        c9211Sc.f7248c.f7579a.m5296a(context.getApplicationContext().getApplicationContext());
        return AbstractC8953Hh.f6725a.m5276a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        boolean z;
        C9211Sc c9211Sc = f5978a;
        c9211Sc.f7247b.getClass();
        c9211Sc.f7248c.getClass();
        c9211Sc.f7246a.getClass();
        synchronized (C9791q0.class) {
            z = C9791q0.f8914f;
        }
        return z;
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C9211Sc c9211Sc = f5978a;
        c9211Sc.f7247b.f6986a.mo5086a(null);
        c9211Sc.f7248c.getClass();
        c9211Sc.f7249d.execute(new C9140Pc(c9211Sc, moduleEvent));
    }

    public static void reportExternalAttribution(int i, @NonNull String str) {
        C9211Sc c9211Sc = f5978a;
        c9211Sc.f7247b.getClass();
        c9211Sc.f7248c.getClass();
        c9211Sc.f7249d.execute(new C9164Qc(c9211Sc, i, str));
    }

    public static void sendEventsBuffer() {
        C9211Sc c9211Sc = f5978a;
        c9211Sc.f7247b.getClass();
        c9211Sc.f7248c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C9211Sc c9211Sc) {
        f5978a = c9211Sc;
    }

    public static void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C9211Sc c9211Sc = f5978a;
        c9211Sc.f7247b.f6988c.mo5086a(str);
        c9211Sc.f7248c.getClass();
        c9211Sc.f7249d.execute(new C9187Rc(c9211Sc, str, bArr));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C9211Sc c9211Sc = f5978a;
        boolean zBooleanValue = bool.booleanValue();
        c9211Sc.f7247b.getClass();
        c9211Sc.f7248c.getClass();
        c9211Sc.f7249d.execute(new C9116Oc(c9211Sc, adRevenue, zBooleanValue));
    }
}
