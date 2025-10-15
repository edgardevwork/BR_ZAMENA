package io.appmetrica.analytics.coreutils.internal.cache;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.a */
/* loaded from: classes7.dex */
public final class RunnableC8730a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f6175a;

    public RunnableC8730a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f6175a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6175a.f6171b.updateLastKnown();
    }
}
