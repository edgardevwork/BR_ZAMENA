package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class EntertainmentGamesViewModel_Factory implements Factory<EntertainmentGamesViewModel> {
    public final Provider<EntertainmentSystemActionsWithJSON> actionWithJsonProvider;

    public EntertainmentGamesViewModel_Factory(Provider<EntertainmentSystemActionsWithJSON> actionWithJsonProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public EntertainmentGamesViewModel get() {
        return newInstance(this.actionWithJsonProvider.get());
    }

    public static EntertainmentGamesViewModel_Factory create(Provider<EntertainmentSystemActionsWithJSON> actionWithJsonProvider) {
        return new EntertainmentGamesViewModel_Factory(actionWithJsonProvider);
    }

    public static EntertainmentGamesViewModel newInstance(EntertainmentSystemActionsWithJSON actionWithJson) {
        return new EntertainmentGamesViewModel(actionWithJson);
    }
}
