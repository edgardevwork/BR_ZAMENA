package com.blackhub.bronline.game.gui.minigameshelper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MiniGamesHelperViewModel_Factory implements Factory<MiniGamesHelperViewModel> {
    public final Provider<MiniGamesHelperWithJSON> actionWithJSONProvider;

    public MiniGamesHelperViewModel_Factory(Provider<MiniGamesHelperWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public MiniGamesHelperViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static MiniGamesHelperViewModel_Factory create(Provider<MiniGamesHelperWithJSON> actionWithJSONProvider) {
        return new MiniGamesHelperViewModel_Factory(actionWithJSONProvider);
    }

    public static MiniGamesHelperViewModel newInstance(MiniGamesHelperWithJSON actionWithJSON) {
        return new MiniGamesHelperViewModel(actionWithJSON);
    }
}
