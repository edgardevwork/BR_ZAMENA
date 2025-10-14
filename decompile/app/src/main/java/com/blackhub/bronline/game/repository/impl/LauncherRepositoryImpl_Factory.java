package com.blackhub.bronline.game.repository.impl;

import com.blackhub.bronline.game.sources.remote.LauncherDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LauncherRepositoryImpl_Factory implements Factory<LauncherRepositoryImpl> {
    public final Provider<LauncherDataSource> launcherDataSourceProvider;

    public LauncherRepositoryImpl_Factory(Provider<LauncherDataSource> launcherDataSourceProvider) {
        this.launcherDataSourceProvider = launcherDataSourceProvider;
    }

    @Override // javax.inject.Provider
    public LauncherRepositoryImpl get() {
        return newInstance(this.launcherDataSourceProvider.get());
    }

    public static LauncherRepositoryImpl_Factory create(Provider<LauncherDataSource> launcherDataSourceProvider) {
        return new LauncherRepositoryImpl_Factory(launcherDataSourceProvider);
    }

    public static LauncherRepositoryImpl newInstance(LauncherDataSource launcherDataSource) {
        return new LauncherRepositoryImpl(launcherDataSource);
    }
}
