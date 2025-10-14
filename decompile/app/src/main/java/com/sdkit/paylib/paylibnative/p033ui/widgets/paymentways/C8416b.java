package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.b */
/* loaded from: classes6.dex */
public final class C8416b implements InterfaceC8412a {

    /* renamed from: a */
    public final InterfaceC8097f f3895a;

    /* renamed from: b */
    public final MutableStateFlow f3896b;

    public C8416b(InterfaceC8097f analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f3895a = analytics;
        this.f3896b = StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3643a() {
        return this.f3896b;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a
    /* renamed from: a */
    public void mo3644a(InterfaceC8419e.a selectedWay) {
        Intrinsics.checkNotNullParameter(selectedWay, "selectedWay");
        AbstractC8096e.m1790a(this.f3895a, selectedWay);
        mo3643a().setValue(selectedWay);
    }
}
