package com.blackhub.bronline.launcher.p021di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.DefaultDispatcher"})
/* loaded from: classes7.dex */
public final class DispatcherModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
    public final DispatcherModule module;

    public DispatcherModule_ProvidesDefaultDispatcherFactory(DispatcherModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesDefaultDispatcher(this.module);
    }

    public static DispatcherModule_ProvidesDefaultDispatcherFactory create(DispatcherModule module) {
        return new DispatcherModule_ProvidesDefaultDispatcherFactory(module);
    }

    public static CoroutineDispatcher providesDefaultDispatcher(DispatcherModule instance) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(instance.providesDefaultDispatcher());
    }
}
