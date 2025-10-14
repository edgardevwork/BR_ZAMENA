package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import com.blackhub.bronline.launcher.App;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
    public final Provider<App> appProvider;
    public final AppModule module;

    public AppModule_ProvideApplicationFactory(AppModule module, Provider<App> appProvider) {
        this.module = module;
        this.appProvider = appProvider;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module, this.appProvider.get());
    }

    public static AppModule_ProvideApplicationFactory create(AppModule module, Provider<App> appProvider) {
        return new AppModule_ProvideApplicationFactory(module, appProvider);
    }

    public static Application provideApplication(AppModule instance, App app) {
        return (Application) Preconditions.checkNotNullFromProvides(instance.provideApplication(app));
    }
}
