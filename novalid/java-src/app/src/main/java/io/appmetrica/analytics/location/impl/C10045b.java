package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.b */
/* loaded from: classes5.dex */
public final class C10045b implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f9425a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f9426b;

    /* renamed from: c */
    public final LocationListener f9427c;

    /* renamed from: d */
    public final IHandlerExecutor f9428d;

    /* renamed from: e */
    public final C10047d f9429e = new C10047d();

    public C10045b(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull IHandlerExecutor iHandlerExecutor) {
        this.f9425a = context;
        this.f9426b = permissionResolutionStrategy;
        this.f9427c = locationListener;
        this.f9428d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f9426b.hasNecessaryPermissions(this.f9425a)) {
            try {
                C10047d c10047d = this.f9429e;
                Context context = this.f9425a;
                LocationListener locationListener = this.f9427c;
                IHandlerExecutor iHandlerExecutor = this.f9428d;
                c10047d.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                } else {
                    gplLibraryWrapper = new C10044a();
                }
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
