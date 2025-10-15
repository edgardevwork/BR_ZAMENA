package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class AnalyticsModule_ProvideRateAppAnalyticsFactory implements Factory<RateAppAnalytics> {
    public final AnalyticsModule module;

    public AnalyticsModule_ProvideRateAppAnalyticsFactory(AnalyticsModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RateAppAnalytics get() {
        return provideRateAppAnalytics(this.module);
    }

    public static AnalyticsModule_ProvideRateAppAnalyticsFactory create(AnalyticsModule module) {
        return new AnalyticsModule_ProvideRateAppAnalyticsFactory(module);
    }

    public static RateAppAnalytics provideRateAppAnalytics(AnalyticsModule instance) {
        return (RateAppAnalytics) Preconditions.checkNotNullFromProvides(instance.provideRateAppAnalytics());
    }
}
