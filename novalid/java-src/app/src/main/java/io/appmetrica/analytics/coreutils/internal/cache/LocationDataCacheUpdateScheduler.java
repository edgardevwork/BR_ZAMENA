package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a */
    private final ICommonExecutor f6170a;

    /* renamed from: b */
    private final ILastKnownUpdater f6171b;

    /* renamed from: c */
    private final UpdateConditionsChecker f6172c;

    /* renamed from: d */
    private final RunnableC8730a f6173d = new RunnableC8730a(this);

    /* renamed from: e */
    private final RunnableC8731b f6174e = new RunnableC8731b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f6170a = iCommonExecutor;
        this.f6171b = iLastKnownUpdater;
        this.f6172c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f6170a.remove(this.f6173d);
        this.f6170a.executeDelayed(this.f6173d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f6170a.execute(this.f6174e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f6170a.remove(this.f6173d);
        this.f6170a.remove(this.f6174e);
    }
}
