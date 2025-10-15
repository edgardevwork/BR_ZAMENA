package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* renamed from: io.appmetrica.analytics.impl.xk */
/* loaded from: classes5.dex */
public final class C9986xk implements PermissionExtractor {

    /* renamed from: b */
    public static final String f9325b = "[SimplePermissionExtractor]";

    /* renamed from: a */
    public final PermissionStrategy f9326a;

    public C9986xk(@NonNull PermissionStrategy permissionStrategy) {
        this.f9326a = permissionStrategy;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final PermissionStrategy m6972a() {
        return this.f9326a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NonNull Context context, @NonNull String str) {
        if (this.f9326a.forbidUsePermission(str)) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
