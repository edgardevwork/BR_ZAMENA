package com.blackhub.bronline.game.repository.impl;

import com.blackhub.bronline.game.sources.remote.GiftsDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GiftsRepositoryImpl_Factory implements Factory<GiftsRepositoryImpl> {
    public final Provider<GiftsDataSource> giftsDataSourceProvider;

    public GiftsRepositoryImpl_Factory(Provider<GiftsDataSource> giftsDataSourceProvider) {
        this.giftsDataSourceProvider = giftsDataSourceProvider;
    }

    @Override // javax.inject.Provider
    public GiftsRepositoryImpl get() {
        return newInstance(this.giftsDataSourceProvider.get());
    }

    public static GiftsRepositoryImpl_Factory create(Provider<GiftsDataSource> giftsDataSourceProvider) {
        return new GiftsRepositoryImpl_Factory(giftsDataSourceProvider);
    }

    public static GiftsRepositoryImpl newInstance(GiftsDataSource giftsDataSource) {
        return new GiftsRepositoryImpl(giftsDataSource);
    }
}
