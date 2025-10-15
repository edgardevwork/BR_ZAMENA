package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.o */
/* loaded from: classes5.dex */
public final class C10058o implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C10060q f9457a;

    public C10058o(@NotNull C10060q c10060q) {
        this.f9457a = c10060q;
    }

    @NotNull
    /* renamed from: a */
    public final C10060q m7035a() {
        return this.f9457a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f9457a;
    }
}
