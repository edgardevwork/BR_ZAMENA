package ru.rustore.sdk.metrics.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.f0 */
/* loaded from: classes8.dex */
public final class C11619f0 {
    /* renamed from: a */
    public static final PackageInfo m7497a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String str2;
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            str2 = "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }";
        } else {
            packageInfo = packageManager.getPackageInfo(str, 0);
            str2 = "getPackageInfo";
        }
        Intrinsics.checkNotNullExpressionValue(packageInfo, str2);
        return packageInfo;
    }
}
