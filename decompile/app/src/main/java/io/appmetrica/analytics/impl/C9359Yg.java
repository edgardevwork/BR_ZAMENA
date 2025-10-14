package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.Yg */
/* loaded from: classes6.dex */
public final class C9359Yg extends C9571h5 {

    /* renamed from: x */
    public final String f7596x;

    /* renamed from: y */
    public final C8892F6 f7597y;

    public C9359Yg(@NonNull Context context, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull C8892F6 c8892f6, @NonNull C9637jl c9637jl, @NonNull AbstractC9521f5 abstractC9521f5) {
        this(context, c9396a5, new C9516f0(), new TimePassedChecker(), new C9696m5(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, new C9239Tg(c8892f6), C9676la.m6362h().m6384u().m6969d(), PackageManagerUtils.getAppVersionCodeInt(context), C9676la.m6362h().m6372i()), c8892f6);
    }

    @Override // io.appmetrica.analytics.impl.C9571h5, io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC8821Ca
    /* renamed from: a */
    public final synchronized void mo5023a(@NonNull C8840D4 c8840d4) {
        super.mo5023a(c8840d4);
        this.f7597y.m5127a(this.f7596x, c8840d4.f6453i);
    }

    public C9359Yg(Context context, C9396a5 c9396a5, C9516f0 c9516f0, TimePassedChecker timePassedChecker, C9696m5 c9696m5, C8892F6 c8892f6) {
        super(context, c9396a5, c9516f0, timePassedChecker, c9696m5);
        this.f7596x = c9396a5.m5827b();
        this.f7597y = c8892f6;
    }
}
