package com.blackhub.bronline.game.gui.fuelfill.viewmodel;

import com.blackhub.bronline.game.gui.fuelfill.network.FuelFillActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FuelFillViewModel_Factory implements Factory<FuelFillViewModel> {
    public final Provider<FuelFillActionWithJSON> actionWithJSONProvider;

    public FuelFillViewModel_Factory(Provider<FuelFillActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FuelFillViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static FuelFillViewModel_Factory create(Provider<FuelFillActionWithJSON> actionWithJSONProvider) {
        return new FuelFillViewModel_Factory(actionWithJSONProvider);
    }

    public static FuelFillViewModel newInstance(FuelFillActionWithJSON actionWithJSON) {
        return new FuelFillViewModel(actionWithJSON);
    }
}
