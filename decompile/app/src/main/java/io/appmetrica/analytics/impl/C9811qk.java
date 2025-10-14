package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.qk */
/* loaded from: classes6.dex */
public final class C9811qk implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C9836rk f8959a;

    public C9811qk(C9836rk c9836rk) {
        this.f8959a = c9836rk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C9836rk c9836rk = this.f8959a;
        if (c9836rk.f9019b.hasPermission(c9836rk.f9018a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
