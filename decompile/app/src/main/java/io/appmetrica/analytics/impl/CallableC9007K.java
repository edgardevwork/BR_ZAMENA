package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.K */
/* loaded from: classes8.dex */
public final class CallableC9007K implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f6846a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9360Yh f6847b;

    /* renamed from: c */
    public final /* synthetic */ C9198S f6848c;

    public CallableC9007K(C9198S c9198s, Context context, InterfaceC9360Yh interfaceC9360Yh) {
        this.f6848c = c9198s;
        this.f6846a = context;
        this.f6847b = interfaceC9360Yh;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AdvertisingIdsHolder advertisingIdsHolder = this.f6848c.f7226m;
        C9198S c9198s = this.f6848c;
        AdTrackingInfoResult adTrackingInfoResultM5532a = C9198S.m5532a(c9198s, this.f6846a);
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultM5532a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.OK;
        if (identifierStatus != identifierStatus2) {
            adTrackingInfoResultM5532a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultM5532a.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultM5533b = C9198S.m5533b(this.f6848c, this.f6846a);
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultM5533b.mStatus;
        if (identifierStatus3 != identifierStatus2) {
            adTrackingInfoResultM5533b = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultM5533b.mErrorExplanation);
        }
        C9198S c9198s2 = this.f6848c;
        AdTrackingInfoResult adTrackingInfoResultMo5042a = c9198s2.f7220g.mo5339a(c9198s2.f7216c) ? c9198s2.f7223j.mo5042a(this.f6846a, this.f6847b) : new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultMo5042a.mStatus;
        if (identifierStatus4 != identifierStatus2) {
            adTrackingInfoResultMo5042a = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultMo5042a.mErrorExplanation);
        }
        c9198s.f7226m = new AdvertisingIdsHolder(adTrackingInfoResultM5532a, adTrackingInfoResultM5533b, adTrackingInfoResultMo5042a);
        return null;
    }
}
