package io.appmetrica.analytics.coreutils.internal.cache;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.b */
/* loaded from: classes7.dex */
public final class RunnableC8731b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f6176a;

    public RunnableC8731b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f6176a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6176a.f6172c.shouldUpdate()) {
            this.f6176a.f6173d.f6175a.f6171b.updateLastKnown();
        }
    }
}
