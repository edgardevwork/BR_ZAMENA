package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.AppContext"})
/* loaded from: classes7.dex */
public final class DatabaseModule_ProvidePreferencesRepositoryFactory implements Factory<PreferencesRepository> {
    public final Provider<Context> contextProvider;
    public final DatabaseModule module;

    public DatabaseModule_ProvidePreferencesRepositoryFactory(DatabaseModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PreferencesRepository get() {
        return providePreferencesRepository(this.module, this.contextProvider.get());
    }

    public static DatabaseModule_ProvidePreferencesRepositoryFactory create(DatabaseModule module, Provider<Context> contextProvider) {
        return new DatabaseModule_ProvidePreferencesRepositoryFactory(module, contextProvider);
    }

    public static PreferencesRepository providePreferencesRepository(DatabaseModule instance, Context context) {
        return (PreferencesRepository) Preconditions.checkNotNullFromProvides(instance.providePreferencesRepository(context));
    }
}
