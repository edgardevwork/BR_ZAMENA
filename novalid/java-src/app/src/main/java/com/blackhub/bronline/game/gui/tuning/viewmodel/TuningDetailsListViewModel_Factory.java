package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TuningDetailsListViewModel_Factory implements Factory<TuningDetailsListViewModel> {
    public final Provider<TuningActionWithJSON> actionWithJsonProvider;
    public final Provider<CostCalculation> costCalculationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public TuningDetailsListViewModel_Factory(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<CostCalculation> costCalculationProvider, Provider<StringResource> stringResourcesProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.costCalculationProvider = costCalculationProvider;
        this.stringResourcesProvider = stringResourcesProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public TuningDetailsListViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.costCalculationProvider.get(), this.stringResourcesProvider.get(), this.localNotificationProvider.get());
    }

    public static TuningDetailsListViewModel_Factory create(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<CostCalculation> costCalculationProvider, Provider<StringResource> stringResourcesProvider, Provider<LocalNotification> localNotificationProvider) {
        return new TuningDetailsListViewModel_Factory(actionWithJsonProvider, costCalculationProvider, stringResourcesProvider, localNotificationProvider);
    }

    public static TuningDetailsListViewModel newInstance(TuningActionWithJSON actionWithJson, CostCalculation costCalculation, StringResource stringResources, LocalNotification localNotification) {
        return new TuningDetailsListViewModel(actionWithJson, costCalculation, stringResources, localNotification);
    }
}
