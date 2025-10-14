package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Mm */
/* loaded from: classes6.dex */
public final class C9078Mm extends AbstractCallableC9215Sg {

    /* renamed from: e */
    public final int f7002e;

    /* renamed from: f */
    public final Bundle f7003f;

    public C9078Mm(@NotNull C9616j0 c9616j0, @Nullable InterfaceC9511ek interfaceC9511ek, int i, @NotNull Bundle bundle) {
        super(c9616j0, interfaceC9511ek);
        this.f7002e = i;
        this.f7003f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: a */
    public final void mo5404a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f7002e, this.f7003f);
    }
}
