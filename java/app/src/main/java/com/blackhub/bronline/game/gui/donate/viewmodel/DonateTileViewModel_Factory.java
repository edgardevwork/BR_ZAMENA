package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class DonateTileViewModel_Factory implements Factory<DonateTileViewModel> {
    public final Provider<DonateActionWithJSON> actionWithJsonProvider;

    public DonateTileViewModel_Factory(Provider<DonateActionWithJSON> actionWithJsonProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public DonateTileViewModel get() {
        return newInstance(this.actionWithJsonProvider.get());
    }

    public static DonateTileViewModel_Factory create(Provider<DonateActionWithJSON> actionWithJsonProvider) {
        return new DonateTileViewModel_Factory(actionWithJsonProvider);
    }

    public static DonateTileViewModel newInstance(DonateActionWithJSON actionWithJson) {
        return new DonateTileViewModel(actionWithJson);
    }
}
