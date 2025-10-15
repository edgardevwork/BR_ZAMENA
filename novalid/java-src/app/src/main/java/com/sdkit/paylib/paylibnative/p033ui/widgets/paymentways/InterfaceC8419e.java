package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.e */
/* loaded from: classes6.dex */
public interface InterfaceC8419e {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.e$a */
    public enum a {
        SBOLPAY,
        BISTRO,
        TBANK,
        MOBILE,
        WEBPAY,
        CARD
    }

    /* renamed from: a */
    Object mo3666a(Continuation continuation);

    /* renamed from: a */
    void mo3667a();

    /* renamed from: c */
    void mo3668c();

    /* renamed from: i */
    Flow mo3669i();

    /* renamed from: j */
    void mo3670j();

    /* renamed from: l */
    Flow mo3671l();
}
