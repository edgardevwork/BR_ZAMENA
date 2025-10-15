package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.k */
/* loaded from: classes5.dex */
public final class C10054k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a */
    public final Context f9440a;

    /* renamed from: b */
    public final PermissionExtractor f9441b;

    /* renamed from: c */
    public final C10059p f9442c;

    /* renamed from: d */
    public final IHandlerExecutor f9443d;

    /* renamed from: e */
    public final C10057n f9444e;

    /* renamed from: f */
    public final LocationDataCacheUpdateScheduler f9445f;

    /* renamed from: g */
    public boolean f9446g;

    /* renamed from: h */
    public final HashMap f9447h = new HashMap();

    /* renamed from: i */
    public final HashMap f9448i = new HashMap();

    public C10054k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull C10059p c10059p) {
        this.f9440a = context;
        this.f9442c = c10059p;
        this.f9441b = permissionExtractor;
        this.f9443d = iHandlerExecutor;
        this.f9444e = new C10057n(c10059p);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, c10059p.m7036a(), "loc");
        this.f9445f = locationDataCacheUpdateScheduler;
        c10059p.m7036a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    @Nullable
    /* renamed from: a */
    public final Location m7025a() {
        return (Location) this.f9442c.f9459b.getData();
    }

    /* renamed from: b */
    public final synchronized void m7029b() {
        try {
            this.f9445f.startUpdates();
            Iterator it = this.f9448i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m7032c() {
        this.f9445f.stopUpdates();
        Iterator it = this.f9448i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f9446g) {
            this.f9446g = true;
            m7029b();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f9446g) {
            this.f9446g = false;
            m7032c();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f9447h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    @AnyThread
    /* renamed from: a */
    public final void m7026a(@NonNull C10052i c10052i) {
        this.f9443d.execute(new RunnableC10053j(this, c10052i));
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m7027a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f9440a, this.f9441b, this.f9443d, this.f9444e);
        this.f9447h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f9446g) {
            extractor.updateLastKnownLocation();
        }
    }

    @AnyThread
    /* renamed from: b */
    public final synchronized void m7030b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f9447h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    @AnyThread
    /* renamed from: b */
    public final synchronized void m7031b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f9448i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f9446g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    @AnyThread
    /* renamed from: a */
    public final synchronized void m7028a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f9440a, this.f9441b, this.f9443d, this.f9444e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f9448i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f9446g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
