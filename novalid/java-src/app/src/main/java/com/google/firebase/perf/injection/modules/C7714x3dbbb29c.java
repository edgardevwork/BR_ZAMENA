package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory */
/* loaded from: classes7.dex */
public final class C7714x3dbbb29c implements Factory<Provider<TransportFactory>> {
    private final FirebasePerformanceModule module;

    public C7714x3dbbb29c(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }

    public static C7714x3dbbb29c create(FirebasePerformanceModule firebasePerformanceModule) {
        return new C7714x3dbbb29c(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        return (Provider) Preconditions.checkNotNullFromProvides(firebasePerformanceModule.providesTransportFactoryProvider());
    }
}
