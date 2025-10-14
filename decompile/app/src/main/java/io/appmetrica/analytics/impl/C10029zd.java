package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.zd */
/* loaded from: classes8.dex */
public final class C10029zd {
    /* renamed from: a */
    public static final C10000y9 m7004a(C10029zd c10029zd, EnumC8945H9 enumC8945H9) {
        int i;
        c10029zd.getClass();
        C10000y9 c10000y9 = new C10000y9();
        switch (enumC8945H9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c10000y9.f9361a = i;
        return c10000y9;
    }
}
