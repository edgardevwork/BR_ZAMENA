package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Fb */
/* loaded from: classes8.dex */
public final class C8897Fb implements InterfaceC8872Eb, InterfaceC9762ol {

    /* renamed from: a */
    public final Context f6580a;

    /* renamed from: b */
    public final InterfaceC8971Ib f6581b;

    /* renamed from: c */
    public final LocationClient f6582c;

    /* renamed from: d */
    public final C9986xk f6583d;

    /* renamed from: e */
    public final C8855Dj f6584e;

    /* renamed from: f */
    public final LastKnownLocationExtractorProviderFactory f6585f;

    /* renamed from: g */
    public final LocationReceiverProviderFactory f6586g;

    public C8897Fb(@NotNull Context context, @NotNull InterfaceC8971Ib interfaceC8971Ib, @NotNull LocationClient locationClient) {
        this.f6580a = context;
        this.f6581b = interfaceC8971Ib;
        this.f6582c = locationClient;
        C9091Nb c9091Nb = new C9091Nb();
        this.f6583d = new C9986xk(new C9821r5(c9091Nb, C9676la.m6362h().m6376m().getAskForPermissionStrategy()));
        this.f6584e = C9676la.m6362h().m6376m();
        ((C9043Lb) interfaceC8971Ib).m5350a(c9091Nb, true);
        ((C9043Lb) interfaceC8971Ib).m5350a(locationClient, true);
        this.f6585f = locationClient.getLastKnownExtractorProviderFactory();
        this.f6586g = locationClient.getLocationReceiverProviderFactory();
    }

    @NotNull
    /* renamed from: a */
    public final C9986xk m5138a() {
        return this.f6583d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: b */
    public final void mo5114b(@NotNull Object obj) {
        ((C9043Lb) this.f6581b).m5351a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f6585f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @Nullable
    public final Location getLocation() {
        return this.f6582c.getLocation();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f6586g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f6583d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    public final void init() {
        this.f6582c.init(this.f6580a, this.f6583d, C9676la.f8552C.f8558d.m6968c(), this.f6584e.mo4992d());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerMo4993e = this.f6584e.mo4993e();
        if (moduleLocationSourcesServiceControllerMo4993e != null) {
            moduleLocationSourcesServiceControllerMo4993e.init();
        } else {
            LocationClient locationClient = this.f6582c;
            locationClient.registerLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f6582c;
            locationClient2.registerLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C9043Lb) this.f6581b).m5349a(this.f6584e.mo4994f());
        C9676la.f8552C.f8575u.m6405a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((C9043Lb) this.f6581b).m5350a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6582c.registerLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6582c.unregisterLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f6582c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NotNull C9637jl c9637jl) {
        C9919v3 c9919v3 = c9637jl.f8476y;
        if (c9919v3 != null) {
            long j = c9919v3.f9210a;
            this.f6582c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f6582c.registerLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f6582c.unregisterLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: a */
    public final void mo5112a(@NotNull Object obj) {
        ((C9043Lb) this.f6581b).m5353b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8872Eb
    /* renamed from: a */
    public final void mo5113a(boolean z) {
        ((C9043Lb) this.f6581b).m5352a(z);
    }
}
