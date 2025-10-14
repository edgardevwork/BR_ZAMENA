package com.blackhub.bronline.game.core.viewmodel;

import android.app.Application;
import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.PaymentApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.blackhub.bronline.launcher.di.BackupUrlAPI"})
/* loaded from: classes3.dex */
public final class JNIActivityViewModel_Factory implements Factory<JNIActivityViewModel> {
    public final Provider<JNIActivityActionWithJSON> actionWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<Api> backupResponseProvider;
    public final Provider<PaymentApi> billingAPIProvider;
    public final Provider<BillingClientWrapper> billingClientWrapperProvider;
    public final Provider<Api> mainResponseProvider;
    public final Provider<PurchaseDatabase> purchaseDatabaseProvider;
    public final Provider<RustoreBillingClientWrapper> rustoreBillingClientWrapperProvider;

    public JNIActivityViewModel_Factory(Provider<Application> applicationProvider, Provider<Api> mainResponseProvider, Provider<Api> backupResponseProvider, Provider<PaymentApi> billingAPIProvider, Provider<BillingClientWrapper> billingClientWrapperProvider, Provider<RustoreBillingClientWrapper> rustoreBillingClientWrapperProvider, Provider<JNIActivityActionWithJSON> actionWithJsonProvider, Provider<PurchaseDatabase> purchaseDatabaseProvider) {
        this.applicationProvider = applicationProvider;
        this.mainResponseProvider = mainResponseProvider;
        this.backupResponseProvider = backupResponseProvider;
        this.billingAPIProvider = billingAPIProvider;
        this.billingClientWrapperProvider = billingClientWrapperProvider;
        this.rustoreBillingClientWrapperProvider = rustoreBillingClientWrapperProvider;
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.purchaseDatabaseProvider = purchaseDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public JNIActivityViewModel get() {
        return newInstance(this.applicationProvider.get(), this.mainResponseProvider.get(), this.backupResponseProvider.get(), this.billingAPIProvider.get(), this.billingClientWrapperProvider.get(), this.rustoreBillingClientWrapperProvider.get(), this.actionWithJsonProvider.get(), this.purchaseDatabaseProvider.get());
    }

    public static JNIActivityViewModel_Factory create(Provider<Application> applicationProvider, Provider<Api> mainResponseProvider, Provider<Api> backupResponseProvider, Provider<PaymentApi> billingAPIProvider, Provider<BillingClientWrapper> billingClientWrapperProvider, Provider<RustoreBillingClientWrapper> rustoreBillingClientWrapperProvider, Provider<JNIActivityActionWithJSON> actionWithJsonProvider, Provider<PurchaseDatabase> purchaseDatabaseProvider) {
        return new JNIActivityViewModel_Factory(applicationProvider, mainResponseProvider, backupResponseProvider, billingAPIProvider, billingClientWrapperProvider, rustoreBillingClientWrapperProvider, actionWithJsonProvider, purchaseDatabaseProvider);
    }

    public static JNIActivityViewModel newInstance(Application application, Api mainResponse, Api backupResponse, PaymentApi billingAPI, BillingClientWrapper billingClientWrapper, RustoreBillingClientWrapper rustoreBillingClientWrapper, JNIActivityActionWithJSON actionWithJson, PurchaseDatabase purchaseDatabase) {
        return new JNIActivityViewModel(application, mainResponse, backupResponse, billingAPI, billingClientWrapper, rustoreBillingClientWrapper, actionWithJson, purchaseDatabase);
    }
}
