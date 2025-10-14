package io.appmetrica.analytics.modulesapi.internal.client;

import androidx.exifinterface.media.ExifInterface;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/ModuleServiceConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "featuresConfig", "getFeaturesConfig", "()Ljava/lang/Object;", "identifiers", "Lio/appmetrica/analytics/coreapi/internal/identifiers/SdkIdentifiers;", "getIdentifiers", "()Lio/appmetrica/analytics/coreapi/internal/identifiers/SdkIdentifiers;", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ModuleServiceConfig<T> {
    T getFeaturesConfig();

    @NotNull
    SdkIdentifiers getIdentifiers();
}
