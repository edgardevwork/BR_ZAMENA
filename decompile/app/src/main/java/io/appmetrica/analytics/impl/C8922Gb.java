package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Gb */
/* loaded from: classes8.dex */
public final class C8922Gb implements InterfaceC8872Eb {

    /* renamed from: a */
    public final C9117Od f6660a = new C9117Od();

    /* renamed from: b */
    public final C9777pb f6661b = new C9777pb();

    /* renamed from: c */
    public final C9139Pb f6662c = new C9139Pb();

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: a */
    public final void mo5112a(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: a */
    public final void mo5113a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: b */
    public final void mo5114b(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f6661b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @Nullable
    public final Location getLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f6662c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return this.f6660a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
    }
}
