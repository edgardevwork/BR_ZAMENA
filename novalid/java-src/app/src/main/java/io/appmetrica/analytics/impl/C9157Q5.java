package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.Q5 */
/* loaded from: classes6.dex */
public final class C9157Q5 extends BaseRequestConfig.DataSource {

    /* renamed from: a */
    @NonNull
    public final C9637jl f7143a;

    /* renamed from: b */
    @NonNull
    public final SdkEnvironmentProvider f7144b;

    public C9157Q5(@NonNull C9637jl c9637jl, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c9637jl.m6317e(), c9637jl.m6313a(), c9637jl.m6314b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f7143a = c9637jl;
        this.f7144b = sdkEnvironmentProvider;
    }
}
