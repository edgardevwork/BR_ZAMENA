package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.r */
/* loaded from: classes7.dex */
public final class C10061r extends C10064u implements LocationReceiver {

    /* renamed from: e */
    public final Looper f9465e;

    /* renamed from: f */
    public final long f9466f;

    public C10061r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f9465e = looper;
        this.f9466f = TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: a */
    public static final Unit m7040a(C10061r c10061r, LocationManager locationManager) {
        locationManager.requestLocationUpdates(c10061r.f9475d, c10061r.f9466f, 0.0f, c10061r.f9474c, c10061r.f9465e);
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final Unit m7041b(C10061r c10061r, LocationManager locationManager) {
        locationManager.removeUpdates(c10061r.f9474c);
        return Unit.INSTANCE;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f9473b.hasNecessaryPermissions(this.f9472a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f9472a, "location", "request location updates for " + this.f9475d + " provider", "location manager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.location.impl.r$$ExternalSyntheticLambda1
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return C10061r.m7040a(this.f$0, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f9472a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.location.impl.r$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C10061r.m7041b(this.f$0, (LocationManager) obj);
            }
        });
    }
}
