package com.sdkit.paylib.paylibdomain.impl.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.utils.b */
/* loaded from: classes6.dex */
public abstract class AbstractC8075b {
    /* renamed from: a */
    public static final PackageInfo m1690a(Context appContext, String packageName) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        int i = Build.VERSION.SDK_INT;
        PackageManager packageManager = appContext.getPackageManager();
        return i >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
    }

    /* renamed from: a */
    public static final Object m1691a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public static final List m1692a(Context appContext, Intent intent) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int i = Build.VERSION.SDK_INT;
        PackageManager packageManager = appContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = i >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "if (Build.VERSION.SDK_IN…tivities(intent, 0)\n    }");
        return listQueryIntentActivities;
    }
}
