package io.appmetrica.analytics.modulesapi.internal.client;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.apache.ivy.osgi.core.BundleInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/BundleToServiceConfigConverter;", ExifInterface.GPS_DIRECTION_TRUE, "", "fromBundle", BundleInfo.BUNDLE_TYPE, "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Ljava/lang/Object;", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface BundleToServiceConfigConverter<T> {
    T fromBundle(@NotNull Bundle bundle);
}
