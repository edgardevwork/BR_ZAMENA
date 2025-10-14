package com.blackhub.bronline.launcher.p021di;

import android.content.Context;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
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
public final class DatabaseModule_ProvideLauncherDatabaseFactory implements Factory<LauncherDatabase> {
    public final Provider<Context> contextProvider;
    public final DatabaseModule module;

    public DatabaseModule_ProvideLauncherDatabaseFactory(DatabaseModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public LauncherDatabase get() {
        return provideLauncherDatabase(this.module, this.contextProvider.get());
    }

    public static DatabaseModule_ProvideLauncherDatabaseFactory create(DatabaseModule module, Provider<Context> contextProvider) {
        return new DatabaseModule_ProvideLauncherDatabaseFactory(module, contextProvider);
    }

    public static LauncherDatabase provideLauncherDatabase(DatabaseModule instance, Context context) {
        return (LauncherDatabase) Preconditions.checkNotNullFromProvides(instance.provideLauncherDatabase(context));
    }
}
