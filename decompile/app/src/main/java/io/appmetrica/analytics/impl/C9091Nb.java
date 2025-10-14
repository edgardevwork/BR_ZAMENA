package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Nb */
/* loaded from: classes6.dex */
public final class C9091Nb implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b */
    @NotNull
    public static final C9067Mb f7027b = new C9067Mb();

    /* renamed from: c */
    public static final List f7028c = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});

    /* renamed from: a */
    public volatile boolean f7029a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f7028c.contains(str)) {
            return !this.f7029a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f7029a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f7029a = false;
    }

    @NotNull
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f7029a + ", locationPermissions=" + f7028c + ')';
    }
}
