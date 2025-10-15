package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.h */
/* loaded from: classes7.dex */
public final class C8746h implements InterfaceC8740b {
    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC8740b
    @NotNull
    /* renamed from: a */
    public final C8741c mo4914a(@NotNull Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new C8741c(IdentifierStatus.OK, new C8739a("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new C8741c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            return new C8741c(IdentifierStatus.UNKNOWN, null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
