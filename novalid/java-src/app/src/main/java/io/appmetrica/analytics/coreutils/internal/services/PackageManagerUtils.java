package io.appmetrica.analytics.coreutils.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtils;", "", "Landroid/content/Context;", "context", "", "getAppVersionCodeString", "", "getAppVersionCodeInt", "getAppVersionName", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "authority", "", "hasContentProvider", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class PackageManagerUtils {

    @NotNull
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* renamed from: a */
    private static final SafePackageManager f6202a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    @JvmStatic
    public static final int getAppVersionCodeInt(@NotNull Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    public static final String getAppVersionCodeString(@NotNull Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @JvmStatic
    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? IdManager.DEFAULT_VERSION_NAME : str;
    }

    @JvmStatic
    @Nullable
    public static final PackageInfo getPackageInfo(@NotNull Context context) {
        return f6202a.getPackageInfo(context, context.getPackageName());
    }

    @JvmStatic
    public static final boolean hasContentProvider(@NotNull Context context, @NotNull String authority) {
        return resolveContentProvider(context, authority) != null;
    }

    @JvmStatic
    @Nullable
    public static final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String authority) {
        return f6202a.resolveContentProvider(context, authority);
    }
}
