package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Md */
/* loaded from: classes6.dex */
public final class C9069Md extends AbstractCallableC9215Sg {

    /* renamed from: e */
    public final C9213Se f6990e;

    public C9069Md(@NotNull C9616j0 c9616j0, @Nullable InterfaceC9511ek interfaceC9511ek, @NotNull C9213Se c9213Se) {
        super(c9616j0, interfaceC9511ek);
        this.f6990e = c9213Se;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: a */
    public final void mo5404a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        C9213Se c9213Se = this.f6990e;
        synchronized (c9213Se) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c9213Se);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
