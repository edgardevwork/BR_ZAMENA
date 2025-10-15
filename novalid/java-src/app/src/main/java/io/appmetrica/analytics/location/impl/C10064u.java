package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.u */
/* loaded from: classes5.dex */
public class C10064u implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f9472a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f9473b;

    /* renamed from: c */
    public final LocationListener f9474c;

    /* renamed from: d */
    public final String f9475d;

    public C10064u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f9472a = context;
        this.f9473b = permissionResolutionStrategy;
        this.f9474c = locationListener;
        this.f9475d = str;
    }

    @NotNull
    /* renamed from: a */
    public final Context m7043a() {
        return this.f9472a;
    }

    @NotNull
    /* renamed from: b */
    public final LocationListener m7044b() {
        return this.f9474c;
    }

    @NotNull
    /* renamed from: c */
    public final PermissionResolutionStrategy m7045c() {
        return this.f9473b;
    }

    @NotNull
    /* renamed from: d */
    public final String m7046d() {
        return this.f9475d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f9473b.hasNecessaryPermissions(this.f9472a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9472a, "location", "getting last known location for provider " + this.f9475d, "location manager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.location.impl.u$$ExternalSyntheticLambda0
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return C10064u.m7042a(this.f$0, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f9474c.onLocationChanged(location);
            }
        }
    }

    /* renamed from: a */
    public static final Location m7042a(C10064u c10064u, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(c10064u.f9475d);
    }
}
