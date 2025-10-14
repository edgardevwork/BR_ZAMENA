package com.blackhub.bronline.launcher.viewmodel;

import android.app.Application;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.repository.LauncherRepository;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.network.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.CdnAPI", "com.blackhub.bronline.launcher.di.BackupCdnAPI"})
/* loaded from: classes7.dex */
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
    public final Provider<Application> applicationProvider;
    public final Provider<Api> backupCdnApiProvider;
    public final Provider<LauncherDatabase> launcherDatabaseProvider;
    public final Provider<LauncherRepository> launcherRepositoryProvider;
    public final Provider<Api> mainCdnApiProvider;
    public final Provider<StringResource> stringResourceProvider;

    public MainActivityViewModel_Factory(Provider<StringResource> stringResourceProvider, Provider<LauncherDatabase> launcherDatabaseProvider, Provider<LauncherRepository> launcherRepositoryProvider, Provider<Application> applicationProvider, Provider<Api> mainCdnApiProvider, Provider<Api> backupCdnApiProvider) {
        this.stringResourceProvider = stringResourceProvider;
        this.launcherDatabaseProvider = launcherDatabaseProvider;
        this.launcherRepositoryProvider = launcherRepositoryProvider;
        this.applicationProvider = applicationProvider;
        this.mainCdnApiProvider = mainCdnApiProvider;
        this.backupCdnApiProvider = backupCdnApiProvider;
    }

    @Override // javax.inject.Provider
    public MainActivityViewModel get() {
        return newInstance(this.stringResourceProvider.get(), this.launcherDatabaseProvider.get(), this.launcherRepositoryProvider.get(), this.applicationProvider.get(), this.mainCdnApiProvider.get(), this.backupCdnApiProvider.get());
    }

    public static MainActivityViewModel_Factory create(Provider<StringResource> stringResourceProvider, Provider<LauncherDatabase> launcherDatabaseProvider, Provider<LauncherRepository> launcherRepositoryProvider, Provider<Application> applicationProvider, Provider<Api> mainCdnApiProvider, Provider<Api> backupCdnApiProvider) {
        return new MainActivityViewModel_Factory(stringResourceProvider, launcherDatabaseProvider, launcherRepositoryProvider, applicationProvider, mainCdnApiProvider, backupCdnApiProvider);
    }

    public static MainActivityViewModel newInstance(StringResource stringResource, LauncherDatabase launcherDatabase, LauncherRepository launcherRepository, Application application, Api mainCdnApi, Api backupCdnApi) {
        return new MainActivityViewModel(stringResource, launcherDatabase, launcherRepository, application, mainCdnApi, backupCdnApi);
    }
}
