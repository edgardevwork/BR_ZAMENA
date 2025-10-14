package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.d */
/* loaded from: classes6.dex */
public interface InterfaceC8418d {
    /* renamed from: b */
    InterfaceC8450a mo3658b();

    /* renamed from: d */
    InterfaceC8445a mo3659d();

    /* renamed from: e */
    InterfaceC8387d mo3660e();

    /* renamed from: f */
    InterfaceC8379a mo3661f();

    /* renamed from: g */
    InterfaceC8403a mo3662g();

    /* renamed from: h */
    InterfaceC8429c mo3663h();

    /* renamed from: k */
    StateFlow mo3664k();

    /* renamed from: m */
    Flow mo3665m();

    void onStart();
}
