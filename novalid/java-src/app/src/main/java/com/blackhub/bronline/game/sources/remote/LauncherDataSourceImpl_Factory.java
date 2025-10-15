package com.blackhub.bronline.game.sources.remote;

import com.blackhub.bronline.launcher.network.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.IoDispatcher"})
/* loaded from: classes3.dex */
public final class LauncherDataSourceImpl_Factory implements Factory<LauncherDataSourceImpl> {
    public final Provider<Api> apiServiceProvider;
    public final Provider<CoroutineDispatcher> ioDispatcherProvider;

    public LauncherDataSourceImpl_Factory(Provider<Api> apiServiceProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.ioDispatcherProvider = ioDispatcherProvider;
    }

    @Override // javax.inject.Provider
    public LauncherDataSourceImpl get() {
        return newInstance(this.apiServiceProvider.get(), this.ioDispatcherProvider.get());
    }

    public static LauncherDataSourceImpl_Factory create(Provider<Api> apiServiceProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
        return new LauncherDataSourceImpl_Factory(apiServiceProvider, ioDispatcherProvider);
    }

    public static LauncherDataSourceImpl newInstance(Api apiService, CoroutineDispatcher ioDispatcher) {
        return new LauncherDataSourceImpl(apiService, ioDispatcher);
    }
}
