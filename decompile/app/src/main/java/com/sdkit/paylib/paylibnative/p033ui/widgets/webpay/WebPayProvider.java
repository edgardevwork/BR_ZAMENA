package com.sdkit.paylib.paylibnative.p033ui.widgets.webpay;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public interface WebPayProvider extends InterfaceC8424j {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void init$default(WebPayProvider webPayProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            webPayProvider.mo3771a(z);
        }
    }

    /* renamed from: a */
    void mo3770a();

    /* renamed from: a */
    void mo3771a(boolean z);

    /* renamed from: c */
    Object mo3772c(Continuation continuation);
}
