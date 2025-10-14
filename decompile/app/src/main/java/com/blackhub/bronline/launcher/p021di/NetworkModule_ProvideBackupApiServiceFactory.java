package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.launcher.network.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.BackupUrlAPI"})
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideBackupApiServiceFactory implements Factory<Api> {
    public final NetworkModule module;

    public NetworkModule_ProvideBackupApiServiceFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Api get() {
        return provideBackupApiService(this.module);
    }

    public static NetworkModule_ProvideBackupApiServiceFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBackupApiServiceFactory(module);
    }

    public static Api provideBackupApiService(NetworkModule instance) {
        return (Api) Preconditions.checkNotNullFromProvides(instance.provideBackupApiService());
    }
}
