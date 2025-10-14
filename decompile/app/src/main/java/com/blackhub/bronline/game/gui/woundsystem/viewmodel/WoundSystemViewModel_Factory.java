package com.blackhub.bronline.game.gui.woundsystem.viewmodel;

import com.blackhub.bronline.game.gui.woundsystem.network.ActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class WoundSystemViewModel_Factory implements Factory<WoundSystemViewModel> {
    public final Provider<ActionsWithJSON> actionWithJsonProvider;

    public WoundSystemViewModel_Factory(Provider<ActionsWithJSON> actionWithJsonProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public WoundSystemViewModel get() {
        return newInstance(this.actionWithJsonProvider.get());
    }

    public static WoundSystemViewModel_Factory create(Provider<ActionsWithJSON> actionWithJsonProvider) {
        return new WoundSystemViewModel_Factory(actionWithJsonProvider);
    }

    public static WoundSystemViewModel newInstance(ActionsWithJSON actionWithJson) {
        return new WoundSystemViewModel(actionWithJson);
    }
}
