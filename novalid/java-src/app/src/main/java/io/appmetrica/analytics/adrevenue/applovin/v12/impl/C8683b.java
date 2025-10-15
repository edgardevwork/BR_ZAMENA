package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.adrevenue.applovin.v12.impl.b */
/* loaded from: classes5.dex */
public final class C8683b implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final C8682a f6013a;

    /* renamed from: b */
    public final ClientContext f6014b;

    public C8683b(@NotNull C8682a c8682a, @NotNull ClientContext clientContext) {
        this.f6013a = c8682a;
        this.f6014b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object orNull = ArraysKt___ArraysKt.getOrNull(objArr, 0);
        if (orNull == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) orNull;
        Object orNull2 = ArraysKt___ArraysKt.getOrNull(objArr, 1);
        if (orNull2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) orNull2;
        this.f6013a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : Intrinsics.areEqual(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : Intrinsics.areEqual(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : Intrinsics.areEqual(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : Intrinsics.areEqual(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : Intrinsics.areEqual(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, appLovinSdk.getConfiguration().getCountryCode()));
        if (moduleAdType == ModuleAdType.OTHER) {
            mapMutableMapOf.put("adType", maxAd.getFormat().getLabel());
        }
        this.f6014b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), mapMutableMapOf, false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
