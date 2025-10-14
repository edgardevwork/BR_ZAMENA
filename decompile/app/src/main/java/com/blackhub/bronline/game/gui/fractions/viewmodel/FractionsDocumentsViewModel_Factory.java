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
public final class FractionsDocumentsViewModel_Factory implements Factory<FractionsDocumentsViewModel> {
    public final Provider<FractionActionsWithJSON> actionsWithJSONProvider;

    public FractionsDocumentsViewModel_Factory(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FractionsDocumentsViewModel get() {
        return newInstance(this.actionsWithJSONProvider.get());
    }

    public static FractionsDocumentsViewModel_Factory create(Provider<FractionActionsWithJSON> actionsWithJSONProvider) {
        return new FractionsDocumentsViewModel_Factory(actionsWithJSONProvider);
    }

    public static FractionsDocumentsViewModel newInstance(FractionActionsWithJSON actionsWithJSON) {
        return new FractionsDocumentsViewModel(actionsWithJSON);
    }
}
