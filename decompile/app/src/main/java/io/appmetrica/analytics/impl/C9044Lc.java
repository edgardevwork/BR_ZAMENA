package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Lc */
/* loaded from: classes6.dex */
public final class C9044Lc implements ModuleServiceLifecycleController {

    /* renamed from: a */
    public final C9081N1 f6935a;

    public C9044Lc(@NotNull C9081N1 c9081n1) {
        this.f6935a = c9081n1;
    }

    /* renamed from: a */
    public static final void m5354a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    /* renamed from: b */
    public static final void m5355b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f6935a.m5422b(new InterfaceC9057M1() { // from class: io.appmetrica.analytics.impl.Lc$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC9057M1
            /* renamed from: a */
            public final void mo5123a(Intent intent) {
                C9044Lc.m5354a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f6935a.m5419a(new InterfaceC9057M1() { // from class: io.appmetrica.analytics.impl.Lc$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.InterfaceC9057M1
            /* renamed from: a */
            public final void mo5123a(Intent intent) {
                C9044Lc.m5355b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
