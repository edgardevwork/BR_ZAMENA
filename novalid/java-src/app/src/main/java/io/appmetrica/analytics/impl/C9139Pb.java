package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Pb */
/* loaded from: classes6.dex */
public final class C9139Pb implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C9163Qb f7088a = new C9163Qb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    @NotNull
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f7088a;
    }
}
