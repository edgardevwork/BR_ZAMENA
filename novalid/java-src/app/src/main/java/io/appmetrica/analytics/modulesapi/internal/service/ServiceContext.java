package io.appmetrica.analytics.modulesapi.internal.service;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006B"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "", "activationBarrier", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrier;", "getActivationBarrier", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrier;", "applicationStateProvider", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateProvider;", "getApplicationStateProvider", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateProvider;", "chargeTypeProvider", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeTypeProvider;", "getChargeTypeProvider", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeTypeProvider;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "cryptoProvider", "Lio/appmetrica/analytics/coreapi/internal/crypto/CryptoProvider;", "getCryptoProvider", "()Lio/appmetrica/analytics/coreapi/internal/crypto/CryptoProvider;", "dataSendingRestrictionController", "Lio/appmetrica/analytics/coreapi/internal/control/DataSendingRestrictionController;", "getDataSendingRestrictionController", "()Lio/appmetrica/analytics/coreapi/internal/control/DataSendingRestrictionController;", "executorProvider", "Lio/appmetrica/analytics/modulesapi/internal/common/ExecutorProvider;", "getExecutorProvider", "()Lio/appmetrica/analytics/modulesapi/internal/common/ExecutorProvider;", "firstExecutionConditionService", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/FirstExecutionConditionService;", "getFirstExecutionConditionService", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/FirstExecutionConditionService;", "locationServiceApi", "Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceApi;", "getLocationServiceApi", "()Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceApi;", "moduleServiceLifecycleController", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceLifecycleController;", "getModuleServiceLifecycleController", "()Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceLifecycleController;", "networkContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceNetworkContext;", "getNetworkContext", "()Lio/appmetrica/analytics/modulesapi/internal/service/ServiceNetworkContext;", "platformIdentifiers", "Lio/appmetrica/analytics/coreapi/internal/identifiers/PlatformIdentifiers;", "getPlatformIdentifiers", "()Lio/appmetrica/analytics/coreapi/internal/identifiers/PlatformIdentifiers;", "sdkEnvironmentProvider", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/SdkEnvironmentProvider;", "getSdkEnvironmentProvider", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/SdkEnvironmentProvider;", "selfReporter", "Lio/appmetrica/analytics/modulesapi/internal/common/ModuleSelfReporter;", "getSelfReporter", "()Lio/appmetrica/analytics/modulesapi/internal/common/ModuleSelfReporter;", "serviceStorageProvider", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceStorageProvider;", "getServiceStorageProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ServiceStorageProvider;", "serviceWakeLock", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceWakeLock;", "getServiceWakeLock", "()Lio/appmetrica/analytics/modulesapi/internal/service/ServiceWakeLock;", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ServiceContext {
    @NotNull
    ActivationBarrier getActivationBarrier();

    @NotNull
    ApplicationStateProvider getApplicationStateProvider();

    @NotNull
    ChargeTypeProvider getChargeTypeProvider();

    @NotNull
    Context getContext();

    @NotNull
    CryptoProvider getCryptoProvider();

    @NotNull
    DataSendingRestrictionController getDataSendingRestrictionController();

    @NotNull
    ExecutorProvider getExecutorProvider();

    @NotNull
    FirstExecutionConditionService getFirstExecutionConditionService();

    @NotNull
    LocationServiceApi getLocationServiceApi();

    @NotNull
    ModuleServiceLifecycleController getModuleServiceLifecycleController();

    @NotNull
    ServiceNetworkContext getNetworkContext();

    @NotNull
    PlatformIdentifiers getPlatformIdentifiers();

    @NotNull
    SdkEnvironmentProvider getSdkEnvironmentProvider();

    @NotNull
    ModuleSelfReporter getSelfReporter();

    @NotNull
    ServiceStorageProvider getServiceStorageProvider();

    @NotNull
    ServiceWakeLock getServiceWakeLock();
}
