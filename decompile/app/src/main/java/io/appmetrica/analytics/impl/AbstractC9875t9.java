package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.t9 */
/* loaded from: classes7.dex */
public abstract class AbstractC9875t9 {

    /* renamed from: a */
    public static final Set f9105a;

    /* renamed from: b */
    public static final EnumSet f9106b;

    /* renamed from: c */
    public static final EnumSet f9107c;

    /* renamed from: d */
    public static final EnumSet f9108d;

    /* renamed from: e */
    public static final EnumSet f9109e;

    /* renamed from: f */
    public static final EnumSet f9110f;

    /* renamed from: g */
    public static final EnumSet f9111g;

    /* renamed from: h */
    public static final EnumSet f9112h;

    /* renamed from: i */
    public static final List f9113i;

    /* renamed from: j */
    public static final List f9114j;

    static {
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC9329Xa enumC9329Xa2 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC9329Xa enumC9329Xa3 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC9329Xa enumC9329Xa4 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC9329Xa enumC9329Xa5 = EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        EnumC9329Xa enumC9329Xa6 = EnumC9329Xa.EVENT_TYPE_ANR;
        f9105a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC9329Xa enumC9329Xa7 = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        EnumC9329Xa enumC9329Xa8 = EnumC9329Xa.EVENT_TYPE_PURGE_BUFFER;
        EnumC9329Xa enumC9329Xa9 = EnumC9329Xa.EVENT_TYPE_SEND_REFERRER;
        EnumC9329Xa enumC9329Xa10 = EnumC9329Xa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC9329Xa enumC9329Xa11 = EnumC9329Xa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC9329Xa enumC9329Xa12 = EnumC9329Xa.EVENT_TYPE_ACTIVATION;
        EnumC9329Xa enumC9329Xa13 = EnumC9329Xa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC9329Xa enumC9329Xa14 = EnumC9329Xa.EVENT_TYPE_SET_SESSION_EXTRA;
        f9106b = EnumSet.of(enumC9329Xa7, enumC9329Xa8, enumC9329Xa9, enumC9329Xa10, enumC9329Xa11, enumC9329Xa12, enumC9329Xa13, enumC9329Xa14);
        f9107c = EnumSet.of(EnumC9329Xa.EVENT_TYPE_UPDATE_FOREGROUND_TIME, enumC9329Xa4);
        EnumC9329Xa enumC9329Xa15 = EnumC9329Xa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC9329Xa enumC9329Xa16 = EnumC9329Xa.EVENT_TYPE_REGULAR;
        f9108d = EnumSet.of(enumC9329Xa4, enumC9329Xa5, enumC9329Xa3, enumC9329Xa, enumC9329Xa2, enumC9329Xa15, enumC9329Xa13, enumC9329Xa16, EnumC9329Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC9329Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC9329Xa.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC9329Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC9329Xa8, EnumC9329Xa.EVENT_TYPE_INIT, EnumC9329Xa.EVENT_TYPE_SEND_USER_PROFILE, EnumC9329Xa.EVENT_TYPE_SET_USER_PROFILE_ID, enumC9329Xa9, enumC9329Xa10, enumC9329Xa11, EnumC9329Xa.EVENT_TYPE_FIRST_ACTIVATION, EnumC9329Xa.EVENT_TYPE_START, EnumC9329Xa.EVENT_TYPE_APP_OPEN, EnumC9329Xa.EVENT_TYPE_APP_UPDATE, enumC9329Xa6);
        f9109e = EnumSet.of(enumC9329Xa16);
        f9110f = EnumSet.of(enumC9329Xa16);
        f9111g = EnumSet.of(enumC9329Xa13);
        f9112h = EnumSet.of(EnumC9329Xa.EVENT_TYPE_ALIVE, enumC9329Xa8, enumC9329Xa14);
        f9113i = Arrays.asList(0, 6145, Integer.valueOf(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        f9114j = Arrays.asList(12290);
    }
}
