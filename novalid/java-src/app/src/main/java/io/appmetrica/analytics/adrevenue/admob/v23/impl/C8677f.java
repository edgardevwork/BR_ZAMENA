package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.f */
/* loaded from: classes8.dex */
public final class C8677f extends AbstractC8676e {
    public C8677f(@NonNull C8673b c8673b, @NonNull ClientContext clientContext) {
        super(c8673b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, InterstitialAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        InterstitialAd interstitialAd = (InterstitialAd) objArr[1];
        this.f6011a.getClass();
        m4891a(C8673b.m4890a(adValue, ModuleAdType.INTERSTITIAL, interstitialAd.getResponseInfo(), interstitialAd.getAdUnitId()));
        return true;
    }
}
