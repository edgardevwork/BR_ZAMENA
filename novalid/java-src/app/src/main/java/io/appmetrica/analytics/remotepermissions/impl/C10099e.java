package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.e */
/* loaded from: classes7.dex */
public final class C10099e implements PermissionStrategy {

    /* renamed from: a */
    public Set f9661a = SetsKt__SetsKt.emptySet();

    /* renamed from: a */
    public final synchronized void m7068a(@NotNull Set<String> set) {
        this.f9661a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.f9661a.contains(str);
    }
}
