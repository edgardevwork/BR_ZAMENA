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
public final class MenuSettingSoundViewModel_Factory implements Factory<MenuSettingSoundViewModel> {
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public MenuSettingSoundViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public MenuSettingSoundViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get());
    }

    public static MenuSettingSoundViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new MenuSettingSoundViewModel_Factory(preferencesRepositoryProvider);
    }

    public static MenuSettingSoundViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new MenuSettingSoundViewModel(preferencesRepository);
    }
}
