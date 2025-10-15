package com.blackhub.bronline.game.gui.playerslist.viewmodel;

import com.blackhub.bronline.game.gui.playerslist.network.PlayersListActionWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PlayersListViewModel_Factory implements Factory<PlayersListViewModel> {
    public final Provider<PlayersListActionWithJson> actionsWithJsonProvider;

    public PlayersListViewModel_Factory(Provider<PlayersListActionWithJson> actionsWithJsonProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public PlayersListViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get());
    }

    public static PlayersListViewModel_Factory create(Provider<PlayersListActionWithJson> actionsWithJsonProvider) {
        return new PlayersListViewModel_Factory(actionsWithJsonProvider);
    }

    public static PlayersListViewModel newInstance(PlayersListActionWithJson actionsWithJson) {
        return new PlayersListViewModel(actionsWithJson);
    }
}
