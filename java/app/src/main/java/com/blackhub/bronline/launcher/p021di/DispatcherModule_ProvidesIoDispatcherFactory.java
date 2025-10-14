package com.blackhub.bronline.launcher.p021di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.IoDispatcher"})
/* loaded from: classes7.dex */
public final class DispatcherModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
    public final DispatcherModule module;

    public DispatcherModule_ProvidesIoDispatcherFactory(DispatcherModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesIoDispatcher(this.module);
    }

    public static DispatcherModule_ProvidesIoDispatcherFactory create(DispatcherModule module) {
        return new DispatcherModule_ProvidesIoDispatcherFactory(module);
    }

    public static CoroutineDispatcher providesIoDispatcher(DispatcherModule instance) {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(instance.providesIoDispatcher());
    }
}
