package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.appopen.AppOpenAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.c */
/* loaded from: classes8.dex */
public final class C8674c extends AbstractC8676e {
    public C8674c(@NonNull C8673b c8673b, @NonNull ClientContext clientContext) {
        super(c8673b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, AppOpenAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        AppOpenAd appOpenAd = (AppOpenAd) objArr[1];
        this.f6011a.getClass();
        m4891a(C8673b.m4890a(adValue, ModuleAdType.OTHER, appOpenAd.getResponseInfo(), appOpenAd.getAdUnitId()));
        return true;
    }
}
