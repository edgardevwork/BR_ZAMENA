package com.blackhub.bronline.game.gui.rateapp.viewmodel;

import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class RateAppViewModel_Factory implements Factory<RateAppViewModel> {
    public final Provider<RateAppActionWithJson> actionsWithJsonProvider;
    public final Provider<RateAppAnalytics> rateAppAnalyticsProvider;

    public RateAppViewModel_Factory(Provider<RateAppActionWithJson> actionsWithJsonProvider, Provider<RateAppAnalytics> rateAppAnalyticsProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
        this.rateAppAnalyticsProvider = rateAppAnalyticsProvider;
    }

    @Override // javax.inject.Provider
    public RateAppViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get(), this.rateAppAnalyticsProvider.get());
    }

    public static RateAppViewModel_Factory create(Provider<RateAppActionWithJson> actionsWithJsonProvider, Provider<RateAppAnalytics> rateAppAnalyticsProvider) {
        return new RateAppViewModel_Factory(actionsWithJsonProvider, rateAppAnalyticsProvider);
    }

    public static RateAppViewModel newInstance(RateAppActionWithJson actionsWithJson, RateAppAnalytics rateAppAnalytics) {
        return new RateAppViewModel(actionsWithJson, rateAppAnalytics);
    }
}
