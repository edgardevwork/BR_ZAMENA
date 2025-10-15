package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

/* renamed from: io.appmetrica.analytics.impl.ec */
/* loaded from: classes8.dex */
public final class C9503ec implements InterfaceC8826Cf {

    /* renamed from: a */
    public final /* synthetic */ C9528fc f8003a;

    public C9503ec(C9528fc c9528fc) {
        this.f8003a = c9528fc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8826Cf
    /* renamed from: a */
    public final void mo5031a(@Nullable C8901Ff c8901Ff) {
        if (c8901Ff == null) {
            return;
        }
        C9252U5 c9252u5 = new C9252U5("", "", 0);
        c9252u5.setValueBytes(c8901Ff.m5147a());
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        this.f8003a.mo5440a(c9252u5);
    }
}
