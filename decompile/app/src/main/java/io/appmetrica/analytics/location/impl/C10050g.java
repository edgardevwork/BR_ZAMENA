package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.g */
/* loaded from: classes5.dex */
public final class C10050g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a */
    public final LastKnownLocationExtractorProvider f9431a;

    /* renamed from: b */
    public final C10046c f9432b = new C10046c("location-module-gpl");

    /* renamed from: c */
    public final C10065v f9433c = new C10065v("network", new C10049f(), "location-module-network");

    /* renamed from: d */
    public final C10065v f9434d = new C10065v("gps", new C10048e(), "location-module-gps");

    public C10050g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f9431a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f9432b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f9434d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f9433c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f9431a;
    }
}
