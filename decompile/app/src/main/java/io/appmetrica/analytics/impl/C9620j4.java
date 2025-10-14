package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: io.appmetrica.analytics.impl.j4 */
/* loaded from: classes5.dex */
public final class C9620j4 {

    /* renamed from: a */
    public final C8907Fl f8401a;

    /* renamed from: b */
    public final C9198S f8402b;

    /* renamed from: c */
    public final Context f8403c;

    public C9620j4(C8907Fl c8907Fl, C9198S c9198s, Context context) {
        this.f8401a = c8907Fl;
        this.f8402b = c9198s;
        this.f8403c = context;
    }

    /* renamed from: a */
    public final C9595i4 m6300a(HashMap map) throws ExecutionException, InterruptedException {
        C9637jl c9637jlM5201e = this.f8401a.m5201e();
        C9198S c9198s = this.f8402b;
        Context context = this.f8403c;
        c9198s.getClass();
        AdvertisingIdsHolder advertisingIdsHolderMo5536a = c9198s.mo5536a(context, new C9879td());
        return new C9595i4(C9595i4.m6275a(c9637jlM5201e.f8455d), C9595i4.m6275a(c9637jlM5201e.f8452a), C9595i4.m6275a(c9637jlM5201e.f8453b), C9595i4.m6275a(c9637jlM5201e.f8461j), C9595i4.m6275a(c9637jlM5201e.f8460i), C9595i4.m6275a(AbstractC9452cb.m5964a(AbstractC9029Kl.m5335a(c9637jlM5201e.f8462k))), C9595i4.m6275a(AbstractC9452cb.m5964a(map)), new IdentifiersResult(advertisingIdsHolderMo5536a.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderMo5536a.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderMo5536a.getGoogle().mStatus, advertisingIdsHolderMo5536a.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderMo5536a.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderMo5536a.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderMo5536a.getHuawei().mStatus, advertisingIdsHolderMo5536a.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderMo5536a.getYandex().mAdTrackingInfo != null ? advertisingIdsHolderMo5536a.getYandex().mAdTrackingInfo.advId : null, advertisingIdsHolderMo5536a.getYandex().mStatus, advertisingIdsHolderMo5536a.getYandex().mErrorExplanation), C9595i4.m6275a(AbstractC9452cb.m5965a(c9637jlM5201e.f8459h)), AbstractC8958Hm.m5254a(), c9637jlM5201e.f8466o + c9637jlM5201e.f8449A.f6734a, C9595i4.m6273a(c9637jlM5201e.f8465n.f6316f), new Bundle());
    }
}
