package io.appmetrica.analytics.modulesapi.internal.client;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H&¨\u0006\u0007"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigUpdateListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onServiceConfigUpdated", "", "config", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleServiceConfig;", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ServiceConfigUpdateListener<T> {
    void onServiceConfigUpdated(@NotNull ModuleServiceConfig<T> config);
}
