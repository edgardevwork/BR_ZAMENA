package com.blackhub.bronline.game.gui.fractions.viewmodel;

import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FractionsMainViewModel_Factory implements Factory<FractionsMainViewModel> {
    public final Provider<FractionActionsWithJSON> actionsWithJSONProvider;

    public FractionsMainViewModel_Factory(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FractionsMainViewModel get() {
        return newInstance(this.actionsWithJSONProvider.get());
    }

    public static FractionsMainViewModel_Factory create(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        return new FractionsMainViewModel_Factory(actionsWithJSONProvider);
    }

    public static FractionsMainViewModel newInstance(FractionActionsWithJSON actionsWithJSON) {
        return new FractionsMainViewModel(actionsWithJSON);
    }
}
