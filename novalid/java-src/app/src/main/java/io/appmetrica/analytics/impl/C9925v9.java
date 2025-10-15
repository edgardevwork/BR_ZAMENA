package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.v9 */
/* loaded from: classes5.dex */
public final class C9925v9 implements IExecutionPolicy {

    /* renamed from: c */
    public static final EnumSet f9217c = EnumSet.of(EnumC9356Yd.OFFLINE);

    /* renamed from: a */
    public final C9946w5 f9218a = new C9946w5();

    /* renamed from: b */
    public final Context f9219b;

    public C9925v9(@NonNull Context context) {
        this.f9219b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C9946w5 c9946w5 = this.f9218a;
        Context context = this.f9219b;
        c9946w5.getClass();
        SafePackageManager safePackageManager = AbstractC9380Zd.f7639a;
        return !f9217c.contains((EnumC9356Yd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC9356Yd.UNDEFINED, new C9332Xd()));
    }
}
