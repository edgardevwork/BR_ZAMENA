package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* renamed from: io.appmetrica.analytics.location.impl.j */
/* loaded from: classes8.dex */
public final class RunnableC10053j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10052i f9438a;

    /* renamed from: b */
    public final /* synthetic */ C10054k f9439b;

    public RunnableC10053j(C10054k c10054k, C10052i c10052i) {
        this.f9439b = c10054k;
        this.f9438a = c10052i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10059p c10059p = this.f9439b.f9442c;
        C10052i c10052i = this.f9438a;
        c10059p.f9458a = c10052i;
        CacheArguments cacheArguments = c10052i.f9437b;
        c10059p.f9459b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
