package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.gl */
/* loaded from: classes5.dex */
public abstract class AbstractC9562gl {

    /* renamed from: a */
    public static final Set f8211a = SetsKt__SetsKt.setOf((Object[]) new String[]{"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID});

    /* renamed from: b */
    public static final SystemTimeProvider f8212b = new SystemTimeProvider();

    /* renamed from: c */
    public static final C9250U3 f8213c = new C9250U3();

    /* renamed from: a */
    public static final boolean m6192a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0017 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m6191a(C9637jl c9637jl, Collection collection, Map map, Function0 function0) {
        boolean zM6192a;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (c9637jl.f8474w) {
                            break;
                        } else {
                            if (f8212b.currentTimeSeconds() > c9637jl.f8466o + c9637jl.f8449A.f6734a) {
                                break;
                            }
                        }
                    } else {
                        zM6192a = m6192a(c9637jl.f8455d);
                        if (zM6192a) {
                            break;
                        }
                    }
                case 155670667:
                    if (str.equals("appmetrica_get_ad_url")) {
                        zM6192a = m6192a(c9637jl.f8460i);
                        if (zM6192a) {
                        }
                    } else if (c9637jl.f8474w) {
                    }
                    break;
                case 299713912:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        zM6192a = m6192a(c9637jl.f8453b);
                        if (zM6192a) {
                        }
                    } else if (c9637jl.f8474w) {
                    }
                    break;
                case 530949152:
                    if (str.equals("appmetrica_clids")) {
                        C9250U3 c9250u3 = f8213c;
                        C9178R3 c9178r3 = (C9178R3) function0.invoke();
                        c9250u3.getClass();
                        zM6192a = C9250U3.m5629a(map, c9637jl, c9178r3);
                        if (zM6192a) {
                        }
                    } else if (c9637jl.f8474w) {
                    }
                    break;
                case 703740463:
                    if (str.equals("appmetrica_report_ad_url")) {
                        zM6192a = m6192a(c9637jl.f8461j);
                        if (zM6192a) {
                        }
                    } else if (c9637jl.f8474w) {
                    }
                    break;
                case 1117383061:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        zM6192a = m6192a(c9637jl.f8452a);
                        if (zM6192a) {
                        }
                    } else if (c9637jl.f8474w) {
                    }
                    break;
                default:
                    if (c9637jl.f8474w) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }
}
