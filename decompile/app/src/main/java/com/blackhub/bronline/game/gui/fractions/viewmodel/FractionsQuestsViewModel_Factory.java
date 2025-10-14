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
public final class FractionsQuestsViewModel_Factory implements Factory<FractionsQuestsViewModel> {
    public final Provider<FractionActionsWithJSON> actionsWithJSONProvider;

    public FractionsQuestsViewModel_Factory(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FractionsQuestsViewModel get() {
        return newInstance(this.actionsWithJSONProvider.get());
    }

    public static FractionsQuestsViewModel_Factory create(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        return new FractionsQuestsViewModel_Factory(actionsWithJSONProvider);
    }

    public static FractionsQuestsViewModel newInstance(FractionActionsWithJSON actionsWithJSON) {
        return new FractionsQuestsViewModel(actionsWithJSON);
    }
}
