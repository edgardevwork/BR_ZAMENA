package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.AppContext"})
/* loaded from: classes7.dex */
public final class AppModule_ProvideAppContextFactory implements Factory<Context> {
    public final Provider<Application> applicationProvider;
    public final AppModule module;

    public AppModule_ProvideAppContextFactory(AppModule module, Provider<Application> applicationProvider) {
        this.module = module;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideAppContext(this.module, this.applicationProvider.get());
    }

    public static AppModule_ProvideAppContextFactory create(AppModule module, Provider<Application> applicationProvider) {
        return new AppModule_ProvideAppContextFactory(module, applicationProvider);
    }

    public static Context provideAppContext(AppModule instance, Application application) {
        return (Context) Preconditions.checkNotNullFromProvides(instance.provideAppContext(application));
    }
}
