package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.q */
/* loaded from: classes7.dex */
public final class C10060q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* renamed from: a */
    public final String f9463a = "location-passive-provider";

    /* renamed from: b */
    public C10061r f9464b;

    @NotNull
    /* renamed from: a */
    public final C10061r m7037a(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return m7039c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @NotNull
    /* renamed from: b */
    public final C10061r m7038b(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return m7039c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    /* renamed from: c */
    public final synchronized C10061r m7039c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        C10061r c10061r;
        try {
            if (this.f9464b == null) {
                this.f9464b = new C10061r(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            c10061r = this.f9464b;
            if (c10061r == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passiveProviderLocationReceiver");
                c10061r = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c10061r;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m7039c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f9463a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return m7039c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
