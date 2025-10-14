package com.sdkit.paylib.paylibnative.p033ui.widgets.tbank;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public interface TBankProvider extends InterfaceC8424j {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void init$default(TBankProvider tBankProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            tBankProvider.mo3735a(z);
        }
    }

    /* renamed from: a */
    void mo3734a();

    /* renamed from: a */
    void mo3735a(boolean z);

    /* renamed from: b */
    Object mo3736b(Continuation continuation);

    /* renamed from: h */
    Flow mo3737h();
}
