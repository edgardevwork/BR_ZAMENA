package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SumContactsViewModel_Factory implements Factory<SumContactsViewModel> {
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public SumContactsViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public SumContactsViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get());
    }

    public static SumContactsViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new SumContactsViewModel_Factory(preferencesRepositoryProvider);
    }

    public static SumContactsViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new SumContactsViewModel(preferencesRepository);
    }
}
