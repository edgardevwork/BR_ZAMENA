package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00180\u0017H&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006%"}, m7105d2 = {"Lio/appmetrica/analytics/locationapi/internal/LocationClient;", "Lio/appmetrica/analytics/locationapi/internal/LocationControllerObserver;", "lastKnownExtractorProviderFactory", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "getLastKnownExtractorProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "locationReceiverProviderFactory", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "getLocationReceiverProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "init", "", "context", "Landroid/content/Context;", "permissionExtractor", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "executor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "consumers", "", "Lio/appmetrica/analytics/coreapi/internal/backport/Consumer;", "registerLocationSource", "lastKnownLocationExtractorProvider", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "locationReceiverProvider", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProvider;", "unregisterLocationSource", "updateCacheArguments", "cacheArguments", "Lio/appmetrica/analytics/locationapi/internal/CacheArguments;", "updateLocationFilter", "locationFilter", "Lio/appmetrica/analytics/locationapi/internal/LocationFilter;", "location-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface LocationClient extends LocationControllerObserver {
    @NotNull
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    @Nullable
    Location getLocation();

    @NotNull
    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    void init(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor executor, @NotNull List<? extends Consumer<Location>> consumers);

    void registerLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void unregisterLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void updateCacheArguments(@NotNull CacheArguments cacheArguments);

    void updateLocationFilter(@NotNull LocationFilter locationFilter);
}
