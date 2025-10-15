package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
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
public final class BillingModule_ProvideRustoreBillingClientWrapperFactory implements Factory<RustoreBillingClientWrapper> {
    public final Provider<Application> applicationProvider;
    public final BillingModule module;

    public BillingModule_ProvideRustoreBillingClientWrapperFactory(BillingModule module, Provider<Application> applicationProvider) {
        this.module = module;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public RustoreBillingClientWrapper get() {
        return provideRustoreBillingClientWrapper(this.module, this.applicationProvider.get());
    }

    public static BillingModule_ProvideRustoreBillingClientWrapperFactory create(BillingModule module, Provider<Application> applicationProvider) {
        return new BillingModule_ProvideRustoreBillingClientWrapperFactory(module, applicationProvider);
    }

    public static RustoreBillingClientWrapper provideRustoreBillingClientWrapper(BillingModule instance, Application application) {
        return (RustoreBillingClientWrapper) Preconditions.checkNotNullFromProvides(instance.provideRustoreBillingClientWrapper(application));
    }
}
