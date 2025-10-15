package com.blackhub.bronline.game.core.utils.payment;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class BillingClientWrapper_Factory implements Factory<BillingClientWrapper> {
    public final Provider<Application> applicationProvider;

    public BillingClientWrapper_Factory(Provider<Application> applicationProvider) {
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public BillingClientWrapper get() {
        return newInstance(this.applicationProvider.get());
    }

    public static BillingClientWrapper_Factory create(Provider<Application> applicationProvider) {
        return new BillingClientWrapper_Factory(applicationProvider);
    }

    public static BillingClientWrapper newInstance(Application application) {
        return new BillingClientWrapper(application);
    }
}
