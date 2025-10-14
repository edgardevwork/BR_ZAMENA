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
public final class RaiseChargeViewModel_Factory implements Factory<RaiseChargeViewModel> {
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public RaiseChargeViewModel_Factory(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public RaiseChargeViewModel get() {
        return newInstance(this.preferencesRepositoryProvider.get());
    }

    public static RaiseChargeViewModel_Factory create(Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new RaiseChargeViewModel_Factory(preferencesRepositoryProvider);
    }

    public static RaiseChargeViewModel newInstance(PreferencesRepository preferencesRepository) {
        return new RaiseChargeViewModel(preferencesRepository);
    }
}
