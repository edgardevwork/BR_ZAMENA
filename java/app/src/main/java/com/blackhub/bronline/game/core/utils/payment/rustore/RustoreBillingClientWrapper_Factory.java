package com.blackhub.bronline.game.core.utils.payment.rustore;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class RustoreBillingClientWrapper_Factory implements Factory<RustoreBillingClientWrapper> {
    public final Provider<Application> appContextProvider;

    public RustoreBillingClientWrapper_Factory(Provider<Application> appContextProvider) {
        this.appContextProvider = appContextProvider;
    }

    @Override // javax.inject.Provider
    public RustoreBillingClientWrapper get() {
        return newInstance(this.appContextProvider.get());
    }

    public static RustoreBillingClientWrapper_Factory create(Provider<Application> appContextProvider) {
        return new RustoreBillingClientWrapper_Factory(appContextProvider);
    }

    public static RustoreBillingClientWrapper newInstance(Application appContext) {
        return new RustoreBillingClientWrapper(appContext);
    }
}
