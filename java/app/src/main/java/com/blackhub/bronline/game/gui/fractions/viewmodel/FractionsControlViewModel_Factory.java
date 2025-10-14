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
public final class FractionsControlViewModel_Factory implements Factory<FractionsControlViewModel> {
    public final Provider<FractionActionsWithJSON> actionsWithJSONProvider;

    public FractionsControlViewModel_Factory(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FractionsControlViewModel get() {
        return newInstance(this.actionsWithJSONProvider.get());
    }

    public static FractionsControlViewModel_Factory create(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        return new FractionsControlViewModel_Factory(actionsWithJSONProvider);
    }

    public static FractionsControlViewModel newInstance(FractionActionsWithJSON actionsWithJSON) {
        return new FractionsControlViewModel(actionsWithJSON);
    }
}
