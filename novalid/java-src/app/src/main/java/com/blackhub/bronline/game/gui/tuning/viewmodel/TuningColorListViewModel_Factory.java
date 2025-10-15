package com.blackhub.bronline.game.gui.tuning.viewmodel;

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
public final class TuningColorListViewModel_Factory implements Factory<TuningColorListViewModel> {
    public final Provider<TuningActionWithJSON> actionWithJsonProvider;
    public final Provider<CostCalculation> costCalculationProvider;

    public TuningColorListViewModel_Factory(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<CostCalculation> costCalculationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.costCalculationProvider = costCalculationProvider;
    }

    @Override // javax.inject.Provider
    public TuningColorListViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.costCalculationProvider.get());
    }

    public static TuningColorListViewModel_Factory create(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<CostCalculation> costCalculationProvider) {
        return new TuningColorListViewModel_Factory(actionWithJsonProvider, costCalculationProvider);
    }

    public static TuningColorListViewModel newInstance(TuningActionWithJSON actionWithJson, CostCalculation costCalculation) {
        return new TuningColorListViewModel(actionWithJson, costCalculation);
    }
}
