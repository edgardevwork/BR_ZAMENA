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
public final class MenuSettingGraphicViewModel_Factory implements Factory<MenuSettingGraphicViewModel> {
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public MenuSettingGraphicViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public MenuSettingGraphicViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get());
    }

    public static MenuSettingGraphicViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new MenuSettingGraphicViewModel_Factory(preferencesRepositoryProvider);
    }

    public static MenuSettingGraphicViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new MenuSettingGraphicViewModel(preferencesRepository);
    }
}
