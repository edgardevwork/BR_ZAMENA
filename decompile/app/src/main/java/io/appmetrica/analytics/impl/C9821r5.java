package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.r5 */
/* loaded from: classes6.dex */
public final class C9821r5 implements PermissionStrategy {

    /* renamed from: a */
    public final PermissionStrategy[] f8983a;

    public C9821r5(@NotNull PermissionStrategy... permissionStrategyArr) {
        this.f8983a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        for (PermissionStrategy permissionStrategy : this.f8983a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f8983a) + ')';
    }
}
