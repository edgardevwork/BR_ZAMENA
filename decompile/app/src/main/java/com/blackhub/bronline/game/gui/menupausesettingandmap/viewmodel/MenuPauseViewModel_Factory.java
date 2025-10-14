package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MenuPauseViewModel_Factory implements Factory<MenuPauseViewModel> {
    public final Provider<NewMenuActionWithJSON> actionsWithJSONProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public MenuPauseViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider, Provider<NewMenuActionWithJSON> actionsWithJSONProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
        this.actionsWithJSONProvider = actionsWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public MenuPauseViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get(), this.actionsWithJSONProvider.get());
    }

    public static MenuPauseViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider, Provider<NewMenuActionWithJSON> actionsWithJSONProvider) {
        return new MenuPauseViewModel_Factory(preferencesRepositoryProvider, actionsWithJSONProvider);
    }

    public static MenuPauseViewModel newInstance(PreferencesRepository preferencesRepository, NewMenuActionWithJSON actionsWithJSON) {
        return new MenuPauseViewModel(preferencesRepository, actionsWithJSON);
    }
}
