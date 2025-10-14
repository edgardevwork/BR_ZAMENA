package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.G */
/* loaded from: classes7.dex */
public final class C8910G implements InterfaceC8835D {

    /* renamed from: a */
    public final InterfaceC8835D f6635a;

    public C8910G(@NonNull InterfaceC8835D interfaceC8835D) {
        this.f6635a = interfaceC8835D;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8835D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo5041a(@NonNull Context context) {
        return m5206a(new C8860E(this, context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8835D
    @NonNull
    /* renamed from: a */
    public final AdTrackingInfoResult mo5042a(@NonNull Context context, @NonNull InterfaceC9360Yh interfaceC9360Yh) {
        return m5206a(new C8885F(this, context, interfaceC9360Yh));
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m5206a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
