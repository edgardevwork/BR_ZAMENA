package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MenuSettingWinterViewModel_Factory implements Factory<MenuSettingWinterViewModel> {
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public MenuSettingWinterViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public MenuSettingWinterViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get());
    }

    public static MenuSettingWinterViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new MenuSettingWinterViewModel_Factory(preferencesRepositoryProvider);
    }

    public static MenuSettingWinterViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new MenuSettingWinterViewModel(preferencesRepository);
    }
}
