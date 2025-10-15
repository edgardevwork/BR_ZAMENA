package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/SafePackageManagerHelperForR;", "", "()V", "extractPackageInstaller", "", "packageManager", "Landroid/content/pm/PackageManager;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
@TargetApi(30)
/* loaded from: classes7.dex */
public final class SafePackageManagerHelperForR {

    @NotNull
    public static final SafePackageManagerHelperForR INSTANCE = new SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    @JvmStatic
    @Nullable
    public static final String extractPackageInstaller(@NotNull PackageManager packageManager, @NotNull String packageName) {
        return packageManager.getInstallSourceInfo(packageName).getInstallingPackageName();
    }
}
