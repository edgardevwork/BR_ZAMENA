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
public final class GiftsDataSourceImpl_Factory implements Factory<GiftsDataSourceImpl> {
    public final Provider<Api> apiServiceProvider;
    public final Provider<CoroutineDispatcher> ioDispatcherProvider;

    public GiftsDataSourceImpl_Factory(Provider<Api> apiServiceProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.ioDispatcherProvider = ioDispatcherProvider;
    }

    @Override // javax.inject.Provider
    public GiftsDataSourceImpl get() {
        return newInstance(this.apiServiceProvider.get(), this.ioDispatcherProvider.get());
    }

    public static GiftsDataSourceImpl_Factory create(Provider<Api> apiServiceProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
        return new GiftsDataSourceImpl_Factory(apiServiceProvider, ioDispatcherProvider);
    }

    public static GiftsDataSourceImpl newInstance(Api apiService, CoroutineDispatcher ioDispatcher) {
        return new GiftsDataSourceImpl(apiService, ioDispatcher);
    }
}
