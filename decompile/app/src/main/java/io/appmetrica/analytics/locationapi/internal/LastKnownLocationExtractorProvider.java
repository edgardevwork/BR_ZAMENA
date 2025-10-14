package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.LocationListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m7105d2 = {"Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "Lio/appmetrica/analytics/locationapi/internal/Identifiable;", "getExtractor", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractor;", "context", "Landroid/content/Context;", "permissionExtractor", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "executor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/location/LocationListener;", "location-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface LastKnownLocationExtractorProvider extends Identifiable {
    @NotNull
    LastKnownLocationExtractor getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor executor, @NotNull LocationListener locationListener);
}
