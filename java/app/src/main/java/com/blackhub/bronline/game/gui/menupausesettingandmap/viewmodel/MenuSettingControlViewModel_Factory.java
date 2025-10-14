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
public final class MenuSettingControlViewModel_Factory implements Factory<MenuSettingControlViewModel> {
    public final Provider<NewMenuActionWithJSON> actionWithJsonProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public MenuSettingControlViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider, Provider<NewMenuActionWithJSON> actionWithJsonProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
        this.actionWithJsonProvider = actionWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public MenuSettingControlViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get(), this.actionWithJsonProvider.get());
    }

    public static MenuSettingControlViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider, Provider<NewMenuActionWithJSON> actionWithJsonProvider) {
        return new MenuSettingControlViewModel_Factory(preferencesRepositoryProvider, actionWithJsonProvider);
    }

    public static MenuSettingControlViewModel newInstance(PreferencesRepository preferencesRepository, NewMenuActionWithJSON actionWithJson) {
        return new MenuSettingControlViewModel(preferencesRepository, actionWithJson);
    }
}
