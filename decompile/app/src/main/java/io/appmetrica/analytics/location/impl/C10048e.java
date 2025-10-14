package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.e */
/* loaded from: classes5.dex */
public final class C10048e implements InterfaceC10062s {
    @Override // io.appmetrica.analytics.location.impl.InterfaceC10062s
    @NotNull
    /* renamed from: a */
    public final PermissionResolutionStrategy mo7023a(@NotNull PermissionExtractor permissionExtractor) {
        return new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION");
    }
}
