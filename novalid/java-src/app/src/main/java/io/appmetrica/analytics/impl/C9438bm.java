package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.bm */
/* loaded from: classes6.dex */
public final class C9438bm extends AbstractC8964I4 {

    /* renamed from: g */
    public final InterfaceC9030Km f7801g;

    public C9438bm(@NonNull String str, @NonNull String str2, @NonNull InterfaceC9030Km interfaceC9030Km, @NonNull InterfaceC9839rn interfaceC9839rn, @NonNull AbstractC9201S2 abstractC9201S2) {
        super(0, str, str2, interfaceC9839rn, abstractC9201S2);
        this.f7801g = interfaceC9030Km;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC8964I4
    /* renamed from: a */
    public final void mo4996a(@NonNull C9514en c9514en) {
        String str = (String) this.f7801g.mo5338a((String) this.f6764f);
        c9514en.f8039d.f8217a = str == null ? new byte[0] : str.getBytes();
    }

    @VisibleForTesting
    /* renamed from: h */
    public final InterfaceC9030Km m5925h() {
        return this.f7801g;
    }
}
