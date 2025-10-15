package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.Vd */
/* loaded from: classes5.dex */
public final class C9284Vd extends C9778pc {
    public C9284Vd() {
        super(EnumC9356Yd.UNDEFINED);
        m6636a(1, EnumC9356Yd.WIFI);
        m6636a(0, EnumC9356Yd.CELL);
        m6636a(3, EnumC9356Yd.ETHERNET);
        m6636a(2, EnumC9356Yd.BLUETOOTH);
        m6636a(4, EnumC9356Yd.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            m6636a(6, EnumC9356Yd.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            m6636a(5, EnumC9356Yd.WIFI_AWARE);
        }
    }
}
