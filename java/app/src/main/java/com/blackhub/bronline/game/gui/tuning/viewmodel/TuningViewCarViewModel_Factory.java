package com.blackhub.bronline.game.gui.tuning.viewmodel;

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
public final class TuningViewCarViewModel_Factory implements Factory<TuningViewCarViewModel> {
    public final Provider<TuningActionWithJSON> actionWithJsonProvider;

    public TuningViewCarViewModel_Factory(Provider<TuningActionWithJSON> actionWithJsonProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public TuningViewCarViewModel get() {
        return newInstance(this.actionWithJsonProvider.get());
    }

    public static TuningViewCarViewModel_Factory create(Provider<TuningActionWithJSON> actionWithJsonProvider) {
        return new TuningViewCarViewModel_Factory(actionWithJsonProvider);
    }

    public static TuningViewCarViewModel newInstance(TuningActionWithJSON actionWithJson) {
        return new TuningViewCarViewModel(actionWithJson);
    }
}
