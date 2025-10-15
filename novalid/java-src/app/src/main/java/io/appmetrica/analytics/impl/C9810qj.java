package io.appmetrica.analytics.impl;

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
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qj */
/* loaded from: classes6.dex */
public final class C9810qj implements ServiceContext {

    /* renamed from: a */
    public final ModuleServiceLifecycleController f8952a;

    /* renamed from: b */
    public final C9754od f8953b = new C9754od(getContext());

    /* renamed from: c */
    public final C9020Kc f8954c = new C9020Kc();

    /* renamed from: d */
    public final C8979Ij f8955d = new C8979Ij(getContext(), new C8955Hj(new C9105O1()));

    /* renamed from: e */
    public final C8880Ej f8956e = new C8880Ej(getContext(), C9676la.m6362h().m6386w(), C9398a7.m5836a(getContext()).m5847h());

    /* renamed from: f */
    public final C9950w9 f8957f = new C9950w9();

    /* renamed from: g */
    public final C9847s6 f8958g = new C9847s6();

    public C9810qj(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f8952a = moduleServiceLifecycleController;
    }

    @NotNull
    /* renamed from: a */
    public final C9754od m6710a() {
        return this.f8953b;
    }

    @NotNull
    /* renamed from: b */
    public final C9020Kc m6711b() {
        return this.f8954c;
    }

    @NotNull
    /* renamed from: c */
    public final C8880Ej m6712c() {
        return this.f8956e;
    }

    @NotNull
    /* renamed from: d */
    public final C8979Ij m6713d() {
        return this.f8955d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return C9676la.f8552C.f8554B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C9676la.f8552C.m6372i().f6322b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        C9676la c9676la = C9676la.f8552C;
        C9394a3 c9394a3 = c9676la.f8559e;
        if (c9394a3 == null) {
            synchronized (c9676la) {
                try {
                    c9394a3 = c9676la.f8559e;
                    if (c9394a3 == null) {
                        c9394a3 = new C9394a3(c9676la.f8558d.m6966a(), c9676la.m6372i().f6321a);
                        c9676la.f8559e = c9394a3;
                    }
                } finally {
                }
            }
        }
        return c9394a3;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final Context getContext() {
        return C9676la.f8552C.f8555a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.f8958g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C9676la.f8552C.m6370f();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f8957f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C9676la.f8552C.f8554B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return C9676la.f8552C.m6373j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f8952a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f8953b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C9676la.f8552C.m6379p();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C9676la.f8552C.m6382s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f8954c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f8956e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f8955d;
    }
}
