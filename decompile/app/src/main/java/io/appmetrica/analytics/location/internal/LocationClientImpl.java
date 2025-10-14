package io.appmetrica.analytics.location.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.C10050g;
import io.appmetrica.analytics.location.impl.C10052i;
import io.appmetrica.analytics.location.impl.C10054k;
import io.appmetrica.analytics.location.impl.C10058o;
import io.appmetrica.analytics.location.impl.C10059p;
import io.appmetrica.analytics.location.impl.C10060q;
import io.appmetrica.analytics.location.impl.RunnableC10053j;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\bH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m7105d2 = {"Lio/appmetrica/analytics/location/internal/LocationClientImpl;", "Lio/appmetrica/analytics/locationapi/internal/LocationClient;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "permissionExtractor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "executor", "", "Lio/appmetrica/analytics/coreapi/internal/backport/Consumer;", "Landroid/location/Location;", "consumers", "", "init", "Lio/appmetrica/analytics/locationapi/internal/CacheArguments;", "cacheArguments", "updateCacheArguments", "Lio/appmetrica/analytics/locationapi/internal/LocationFilter;", "locationFilter", "updateLocationFilter", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "lastKnownLocationExtractorProvider", "registerLocationSource", "unregisterLocationSource", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProvider;", "locationReceiverProvider", "startLocationTracking", "stopLocationTracking", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "b", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "getLastKnownExtractorProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "lastKnownExtractorProviderFactory", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "c", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "getLocationReceiverProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "locationReceiverProviderFactory", "getLocation", "()Landroid/location/Location;", "location", SegmentConstantPool.INITSTRING, "()V", "location_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class LocationClientImpl implements LocationClient {

    /* renamed from: a */
    private C10054k f9479a;

    /* renamed from: b */
    private final C10050g f9480b;

    /* renamed from: c */
    private final C10058o f9481c;

    /* renamed from: d */
    private C10052i f9482d;

    public LocationClientImpl() {
        C10060q c10060q = new C10060q();
        this.f9480b = new C10050g(c10060q);
        this.f9481c = new C10058o(c10060q);
        this.f9482d = new C10052i();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    @NotNull
    public LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f9480b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    @Nullable
    public synchronized Location getLocation() {
        C10054k c10054k;
        c10054k = this.f9479a;
        return c10054k != null ? c10054k.m7025a() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    @NotNull
    public LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f9481c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void init(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor executor, @NotNull List<? extends Consumer<Location>> consumers) {
        if (this.f9479a == null) {
            this.f9479a = new C10054k(context, permissionExtractor, executor, new C10059p(consumers, this.f9482d));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.m7027a(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void startLocationTracking() {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.startLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void stopLocationTracking() {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.stopLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.m7030b(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateCacheArguments(@NotNull CacheArguments cacheArguments) {
        C10052i c10052i = new C10052i(this.f9482d.f9436a, cacheArguments);
        this.f9482d = c10052i;
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.f9443d.execute(new RunnableC10053j(c10054k, c10052i));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        C10052i c10052i = new C10052i(locationFilter, this.f9482d.f9437b);
        this.f9482d = c10052i;
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.f9443d.execute(new RunnableC10053j(c10054k, c10052i));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.m7028a(locationReceiverProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        C10054k c10054k = this.f9479a;
        if (c10054k != null) {
            c10054k.m7031b(locationReceiverProvider);
        }
    }
}
