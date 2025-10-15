package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ff */
/* loaded from: classes6.dex */
public abstract class AbstractC9531ff {

    /* renamed from: a */
    public static final Map f8126a;

    /* renamed from: b */
    public static final SparseArray f8127b;

    /* renamed from: c */
    public static final Map f8128c;

    /* renamed from: d */
    public static final Map f8129d;

    static {
        HashMap map = new HashMap();
        EnumC9436bk enumC9436bk = EnumC9436bk.FOREGROUND;
        map.put(enumC9436bk, 0);
        EnumC9436bk enumC9436bk2 = EnumC9436bk.BACKGROUND;
        map.put(enumC9436bk2, 1);
        f8126a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC9436bk);
        sparseArray.put(1, enumC9436bk2);
        f8127b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_INIT;
        map2.put(enumC9329Xa, 1);
        EnumC9329Xa enumC9329Xa2 = EnumC9329Xa.EVENT_TYPE_REGULAR;
        map2.put(enumC9329Xa2, 4);
        EnumC9329Xa enumC9329Xa3 = EnumC9329Xa.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC9329Xa3, 5);
        EnumC9329Xa enumC9329Xa4 = EnumC9329Xa.EVENT_TYPE_ALIVE;
        map2.put(enumC9329Xa4, 7);
        EnumC9329Xa enumC9329Xa5 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC9329Xa5, 26);
        EnumC9329Xa enumC9329Xa6 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC9329Xa6, 26);
        EnumC9329Xa enumC9329Xa7 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC9329Xa7, 26);
        EnumC9329Xa enumC9329Xa8 = EnumC9329Xa.EVENT_TYPE_ANR;
        map2.put(enumC9329Xa8, 25);
        EnumC9329Xa enumC9329Xa9 = EnumC9329Xa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC9329Xa9, 26);
        EnumC9329Xa enumC9329Xa10 = EnumC9329Xa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC9329Xa10, 26);
        EnumC9329Xa enumC9329Xa11 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC9329Xa11, 27);
        EnumC9329Xa enumC9329Xa12 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC9329Xa12, 27);
        EnumC9329Xa enumC9329Xa13 = EnumC9329Xa.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC9329Xa13, 13);
        EnumC9329Xa enumC9329Xa14 = EnumC9329Xa.EVENT_TYPE_START;
        map2.put(enumC9329Xa14, 2);
        EnumC9329Xa enumC9329Xa15 = EnumC9329Xa.EVENT_TYPE_APP_OPEN;
        map2.put(enumC9329Xa15, 16);
        EnumC9329Xa enumC9329Xa16 = EnumC9329Xa.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC9329Xa16, 17);
        EnumC9329Xa enumC9329Xa17 = EnumC9329Xa.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC9329Xa17, 18);
        EnumC9329Xa enumC9329Xa18 = EnumC9329Xa.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC9329Xa18, 19);
        EnumC9329Xa enumC9329Xa19 = EnumC9329Xa.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC9329Xa19, 20);
        EnumC9329Xa enumC9329Xa20 = EnumC9329Xa.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC9329Xa20, 21);
        EnumC9329Xa enumC9329Xa21 = EnumC9329Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC9329Xa21, 40);
        EnumC9329Xa enumC9329Xa22 = EnumC9329Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC9329Xa22, 35);
        map2.put(EnumC9329Xa.EVENT_TYPE_CLEANUP, 29);
        EnumC9329Xa enumC9329Xa23 = EnumC9329Xa.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC9329Xa23, 38);
        EnumC9329Xa enumC9329Xa24 = EnumC9329Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC9329Xa24, 42);
        f8128c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C9899u8 c9899u8 = new C9899u8();
        C8769A8 c8769a8 = new C8769A8(new C8869E8());
        C9924v8 c9924v8 = new C9924v8();
        C9894u3 c9894u3 = new C9894u3(new C8869E8());
        C9126Om c9126Om = new C9126Om(new C8869E8());
        C9431bf c9431bf = new C9431bf();
        C9207S8 c9207s8M5604a = C9231T8.m5604a();
        c9207s8M5604a.f7235b = c9431bf;
        c9207s8M5604a.f7236c = c9431bf;
        C9231T8 c9231t8 = new C9231T8(c9207s8M5604a);
        C9207S8 c9207s8M5604a2 = C9231T8.m5604a();
        c9207s8M5604a2.f7235b = c8769a8;
        C9231T8 c9231t82 = new C9231T8(c9207s8M5604a2);
        C9207S8 c9207s8M5604a3 = C9231T8.m5604a();
        c9207s8M5604a3.f7235b = c9894u3;
        C9231T8 c9231t83 = new C9231T8(c9207s8M5604a3);
        C9207S8 c9207s8M5604a4 = C9231T8.m5604a();
        c9207s8M5604a4.f7235b = c9126Om;
        C9231T8 c9231t84 = new C9231T8(c9207s8M5604a4);
        C9207S8 c9207s8M5604a5 = C9231T8.m5604a();
        c9207s8M5604a5.f7234a = c9899u8;
        C9231T8 c9231t85 = new C9231T8(c9207s8M5604a5);
        C9207S8 c9207s8M5604a6 = C9231T8.m5604a();
        c9207s8M5604a6.f7235b = new C9889tn(new C8769A8());
        C9231T8 c9231t86 = new C9231T8(c9207s8M5604a6);
        map3.put(enumC9329Xa2, c9231t82);
        C9207S8 c9207s8M5604a7 = C9231T8.m5604a();
        c9207s8M5604a7.f7235b = new C9481df();
        map3.put(enumC9329Xa3, new C9231T8(c9207s8M5604a7));
        C9207S8 c9207s8M5604a8 = C9231T8.m5604a();
        c9207s8M5604a8.f7234a = c9899u8;
        c9207s8M5604a8.f7235b = c9924v8;
        c9207s8M5604a8.f7238e = new C9278V7();
        c9207s8M5604a8.f7239f = new C9302W7();
        map3.put(enumC9329Xa4, new C9231T8(c9207s8M5604a8));
        map3.put(enumC9329Xa9, c9231t8);
        map3.put(enumC9329Xa10, c9231t8);
        map3.put(enumC9329Xa11, c9231t83);
        map3.put(enumC9329Xa12, c9231t83);
        map3.put(enumC9329Xa5, c9231t83);
        map3.put(enumC9329Xa6, c9231t83);
        map3.put(enumC9329Xa7, c9231t83);
        map3.put(enumC9329Xa8, c9231t83);
        C9207S8 c9207s8M5604a9 = C9231T8.m5604a();
        c9207s8M5604a9.f7234a = new C9899u8();
        c9207s8M5604a9.f7235b = c9894u3;
        map3.put(enumC9329Xa14, new C9231T8(c9207s8M5604a9));
        EnumC9329Xa enumC9329Xa25 = EnumC9329Xa.EVENT_TYPE_CUSTOM_EVENT;
        C9207S8 c9207s8M5604a10 = C9231T8.m5604a();
        c9207s8M5604a10.f7237d = new C9506ef();
        map3.put(enumC9329Xa25, new C9231T8(c9207s8M5604a10));
        map3.put(enumC9329Xa15, c9231t82);
        map3.put(enumC9329Xa17, c9231t85);
        map3.put(enumC9329Xa18, c9231t85);
        map3.put(enumC9329Xa19, c9231t83);
        map3.put(enumC9329Xa20, c9231t83);
        map3.put(enumC9329Xa21, c9231t83);
        map3.put(enumC9329Xa22, c9231t84);
        map3.put(enumC9329Xa, c9231t86);
        map3.put(enumC9329Xa16, c9231t86);
        map3.put(enumC9329Xa13, c9231t82);
        map3.put(enumC9329Xa23, c9231t82);
        map3.put(enumC9329Xa24, c9231t83);
        f8129d = Collections.unmodifiableMap(map3);
    }

    /* renamed from: a */
    public static C9575h9 m6126a(Long l, Long l2, Boolean bool) {
        C9575h9 c9575h9 = new C9575h9();
        if (l != null) {
            c9575h9.f8260a = l.longValue();
            c9575h9.f8261b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c9575h9.f8262c = l2.longValue();
        }
        if (bool != null) {
            c9575h9.f8263d = bool.booleanValue();
        }
        return c9575h9;
    }

    /* renamed from: a */
    public static void m6127a(C9525f9 c9525f9) {
        C9475d9[] c9475d9Arr = c9525f9.f8102c;
        if (c9475d9Arr != null) {
            for (C9475d9 c9475d9 : c9475d9Arr) {
            }
        }
    }
}
