package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.impl.C8718a;
import io.appmetrica.analytics.coreutils.impl.C8719b;
import io.appmetrica.analytics.coreutils.impl.C8720c;
import io.appmetrica.analytics.coreutils.impl.C8721d;
import io.appmetrica.analytics.coreutils.impl.C8722e;
import io.appmetrica.analytics.coreutils.impl.C8723f;
import io.appmetrica.analytics.coreutils.impl.C8724g;
import io.appmetrica.analytics.coreutils.impl.C8725h;
import io.appmetrica.analytics.coreutils.impl.C8726i;
import io.appmetrica.analytics.coreutils.impl.C8727j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ \u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ \u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ \u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004J \u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ \u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006%"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/SafePackageManager;", "", "Landroid/content/Context;", "context", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Landroid/content/pm/PackageInfo;", "getPackageInfo", "", "flags", "Landroid/content/ComponentName;", "component", "Landroid/content/pm/ServiceInfo;", "getServiceInfo", "Landroid/content/Intent;", "intent", "Landroid/content/pm/ResolveInfo;", "resolveService", "resolveActivity", "authority", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "Landroid/content/pm/ApplicationInfo;", "getApplicationInfo", "componentName", "Landroid/content/pm/ActivityInfo;", "getActivityInfo", "newState", "", "setComponentEnabledSetting", "(Landroid/content/Context;Landroid/content/ComponentName;II)Lkotlin/Unit;", "name", "", "hasSystemFeature", "getInstallerPackageName", SegmentConstantPool.INITSTRING, "()V", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class SafePackageManager {
    /* renamed from: a */
    private static Object m4905a(Boolean bool, Function0 function0) {
        try {
            Object objInvoke = function0.invoke();
            return objInvoke == null ? bool : objInvoke;
        } catch (Throwable unused) {
            return bool;
        }
    }

    @Nullable
    public final ActivityInfo getActivityInfo(@NotNull Context context, @NotNull ComponentName componentName, int flags) {
        return (ActivityInfo) m4905a(null, new C8718a(context, componentName, flags));
    }

    @Nullable
    public final ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull String str, int flags) {
        return (ApplicationInfo) m4905a(null, new C8719b(context, str, flags));
    }

    @Nullable
    public final String getInstallerPackageName(@NotNull Context context, @NotNull String str) {
        return (String) m4905a(null, new C8720c(context, str));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str) {
        return getPackageInfo(context, str, 0);
    }

    @Nullable
    public final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull ComponentName component, int flags) {
        return (ServiceInfo) m4905a(null, new C8722e(context, component, flags));
    }

    public final boolean hasSystemFeature(@NotNull Context context, @NotNull String name) {
        return ((Boolean) m4905a(Boolean.FALSE, new C8723f(context, name))).booleanValue();
    }

    @Nullable
    public final ResolveInfo resolveActivity(@NotNull Context context, @NotNull Intent intent, int flags) {
        return (ResolveInfo) m4905a(null, new C8724g(context, intent, flags));
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String authority) {
        return (ProviderInfo) m4905a(null, new C8725h(context, authority));
    }

    @Nullable
    public final ResolveInfo resolveService(@NotNull Context context, @NotNull Intent intent, int flags) {
        return (ResolveInfo) m4905a(null, new C8726i(context, intent, flags));
    }

    @Nullable
    public final Unit setComponentEnabledSetting(@NotNull Context context, @NotNull ComponentName componentName, int newState, int flags) {
        return (Unit) m4905a(null, new C8727j(context, componentName, newState, flags));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String str, int flags) {
        return (PackageInfo) m4905a(null, new C8721d(context, str, flags));
    }
}
