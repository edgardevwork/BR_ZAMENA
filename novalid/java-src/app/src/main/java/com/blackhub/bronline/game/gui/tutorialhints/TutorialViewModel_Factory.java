package com.blackhub.bronline.game.gui.tutorialhints;

import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TutorialViewModel_Factory implements Factory<TutorialViewModel> {
    public final Provider<TutorialHintActionWithJSON> actionWithJSONProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public TutorialViewModel_Factory(Provider<TutorialHintActionWithJSON> actionWithJSONProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public TutorialViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.preferencesRepositoryProvider.get());
    }

    public static TutorialViewModel_Factory create(Provider<TutorialHintActionWithJSON> actionWithJSONProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new TutorialViewModel_Factory(actionWithJSONProvider, preferencesRepositoryProvider);
    }

    public static TutorialViewModel newInstance(TutorialHintActionWithJSON actionWithJSON, PreferencesRepository preferencesRepository) {
        return new TutorialViewModel(actionWithJSON, preferencesRepository);
    }
}
