package com.blackhub.bronline.game.repository.impl;

import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class UpgradeObjectRepositoryImpl_Factory implements Factory<UpgradeObjectRepositoryImpl> {
    public final Provider<UpgradeObjectEventDataSource> upgradeObjectEventDataSourceProvider;

    public UpgradeObjectRepositoryImpl_Factory(Provider<UpgradeObjectEventDataSource> upgradeObjectEventDataSourceProvider) {
        this.upgradeObjectEventDataSourceProvider = upgradeObjectEventDataSourceProvider;
    }

    @Override // javax.inject.Provider
    public UpgradeObjectRepositoryImpl get() {
        return newInstance(this.upgradeObjectEventDataSourceProvider.get());
    }

    public static UpgradeObjectRepositoryImpl_Factory create(Provider<UpgradeObjectEventDataSource> upgradeObjectEventDataSourceProvider) {
        return new UpgradeObjectRepositoryImpl_Factory(upgradeObjectEventDataSourceProvider);
    }

    public static UpgradeObjectRepositoryImpl newInstance(UpgradeObjectEventDataSource upgradeObjectEventDataSource) {
        return new UpgradeObjectRepositoryImpl(upgradeObjectEventDataSource);
    }
}
