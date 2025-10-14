package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
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
public final class BillingModule_ProvideBillingClientWrapperFactory implements Factory<BillingClientWrapper> {
    public final Provider<Application> applicationProvider;
    public final BillingModule module;

    public BillingModule_ProvideBillingClientWrapperFactory(BillingModule module, Provider<Application> applicationProvider) {
        this.module = module;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public BillingClientWrapper get() {
        return provideBillingClientWrapper(this.module, this.applicationProvider.get());
    }

    public static BillingModule_ProvideBillingClientWrapperFactory create(BillingModule module, Provider<Application> applicationProvider) {
        return new BillingModule_ProvideBillingClientWrapperFactory(module, applicationProvider);
    }

    public static BillingClientWrapper provideBillingClientWrapper(BillingModule instance, Application application) {
        return (BillingClientWrapper) Preconditions.checkNotNullFromProvides(instance.provideBillingClientWrapper(application));
    }
}
