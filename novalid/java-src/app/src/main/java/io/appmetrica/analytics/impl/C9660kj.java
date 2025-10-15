package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.kj */
/* loaded from: classes6.dex */
public final class C9660kj extends C9571h5 {
    public C9660kj(@NonNull Context context, @NonNull C9637jl c9637jl, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull InterfaceC8827Cg interfaceC8827Cg, @NonNull AbstractC9521f5 abstractC9521f5) {
        this(context, c9396a5, new C9516f0(), new TimePassedChecker(), new C9696m5(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, interfaceC8827Cg, C9676la.m6362h().m6384u().m6969d(), PackageManagerUtils.getAppVersionCodeInt(context), C9676la.m6362h().m6372i()));
    }

    @Override // io.appmetrica.analytics.impl.C9571h5, io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    /* renamed from: c */
    public final CounterConfigurationReporterType mo5025c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C9660kj(Context context, C9396a5 c9396a5, C9516f0 c9516f0, TimePassedChecker timePassedChecker, C9696m5 c9696m5) {
        super(context, c9396a5, c9516f0, timePassedChecker, c9696m5);
    }
}
