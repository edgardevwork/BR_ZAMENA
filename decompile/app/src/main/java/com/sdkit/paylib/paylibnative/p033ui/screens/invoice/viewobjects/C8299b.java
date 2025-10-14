package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8301d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.b */
/* loaded from: classes6.dex */
public final class C8299b implements InterfaceC8298a {

    /* renamed from: a */
    public final C8301d f3148a;

    public C8299b(InterfaceC8131b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f3148a = new C8301d(null, null, false, false, false, !config.mo2007b(), config.isSandbox(), false);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.InterfaceC8298a
    /* renamed from: a */
    public C8301d mo2888a(C8302e c8302e, AsyncState state, C8301d.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AsyncState.Loading ? true : state instanceof AsyncState.None) {
            C8301d c8301d = this.f3148a;
            return c8301d.m2893a((98 & 1) != 0 ? c8301d.f3150a : c8302e, (98 & 2) != 0 ? c8301d.f3151b : null, (98 & 4) != 0 ? c8301d.f3152c : true, (98 & 8) != 0 ? c8301d.f3153d : true, (98 & 16) != 0 ? c8301d.f3154e : false, (98 & 32) != 0 ? c8301d.f3155f : false, (98 & 64) != 0 ? c8301d.f3156g : false, (98 & 128) != 0 ? c8301d.f3157h : z);
        }
        if (!(state instanceof AsyncState.Content)) {
            return this.f3148a;
        }
        C8301d c8301d2 = this.f3148a;
        return c8301d2.m2893a((98 & 1) != 0 ? c8301d2.f3150a : c8302e, (98 & 2) != 0 ? c8301d2.f3151b : aVar, (98 & 4) != 0 ? c8301d2.f3152c : true, (98 & 8) != 0 ? c8301d2.f3153d : false, (98 & 16) != 0 ? c8301d2.f3154e : true, (98 & 32) != 0 ? c8301d2.f3155f : false, (98 & 64) != 0 ? c8301d2.f3156g : false, (98 & 128) != 0 ? c8301d2.f3157h : z);
    }
}
