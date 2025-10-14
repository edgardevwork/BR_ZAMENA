package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.hg */
/* loaded from: classes8.dex */
public class C9582hg extends AbstractCallableC9215Sg {

    /* renamed from: e */
    public final C9168Qg f8280e;

    public C9582hg(@NotNull C9616j0 c9616j0, @Nullable InterfaceC9511ek interfaceC9511ek, @NotNull C9168Qg c9168Qg) {
        super(c9616j0, interfaceC9511ek);
        this.f8280e = c9168Qg;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: a */
    public final void mo5573a(@Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC9215Sg
    /* renamed from: a */
    public final void mo5404a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        C9168Qg c9168Qg = this.f8280e;
        iAppMetricaService.reportData(c9168Qg.f7163c, c9168Qg.f7161a.m5658d(c9168Qg.f7165e.m5812c()));
    }
}
