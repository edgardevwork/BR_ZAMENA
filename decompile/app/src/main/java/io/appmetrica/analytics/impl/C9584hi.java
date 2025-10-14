package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.hi */
/* loaded from: classes5.dex */
public final class C9584hi {

    /* renamed from: a */
    public final Context f8283a;

    /* renamed from: b */
    public final SafePackageManager f8284b;

    public C9584hi(Context context, SafePackageManager safePackageManager) {
        this.f8283a = context;
        this.f8284b = safePackageManager;
    }

    /* renamed from: a */
    public final ArrayList m6258a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f8284b;
        Context context = this.f8283a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new PermissionState(str, false));
            } else {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }
}
