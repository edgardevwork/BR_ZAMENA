package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.w5 */
/* loaded from: classes8.dex */
public final class C9946w5 {
    /* renamed from: a */
    public final EnumC9356Yd m6917a(@NonNull Context context) {
        SafePackageManager safePackageManager = AbstractC9380Zd.f7639a;
        return (EnumC9356Yd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC9356Yd.UNDEFINED, new C9332Xd());
    }
}
