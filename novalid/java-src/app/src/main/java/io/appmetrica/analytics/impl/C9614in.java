package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.in */
/* loaded from: classes8.dex */
public final class C9614in implements InterfaceC9762ol {

    /* renamed from: a */
    public final UtilityServiceProvider f8374a;

    public C9614in(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f8374a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NotNull C9637jl c9637jl) {
        this.f8374a.updateConfiguration(new UtilityServiceConfiguration(c9637jl.f8473v, c9637jl.f8472u));
    }
}
