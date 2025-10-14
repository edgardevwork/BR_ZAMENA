package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.J */
/* loaded from: classes8.dex */
public final class CallableC8983J implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C9198S f6798a;

    public CallableC8983J(C9198S c9198s) {
        this.f6798a = c9198s;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C9198S c9198s = this.f6798a;
        AdTrackingInfoResult adTrackingInfoResultM5532a = C9198S.m5532a(c9198s, c9198s.f7224k);
        C9198S c9198s2 = this.f6798a;
        AdTrackingInfoResult adTrackingInfoResultM5533b = C9198S.m5533b(c9198s2, c9198s2.f7224k);
        C9198S c9198s3 = this.f6798a;
        c9198s.f7226m = new AdvertisingIdsHolder(adTrackingInfoResultM5532a, adTrackingInfoResultM5533b, c9198s3.f7220g.mo5339a(c9198s3.f7216c) ? c9198s3.f7223j.mo5042a(c9198s3.f7224k, new C9879td()) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason"));
        return null;
    }
}
