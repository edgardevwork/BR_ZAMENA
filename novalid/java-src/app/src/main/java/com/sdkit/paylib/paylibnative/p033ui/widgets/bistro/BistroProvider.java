package com.sdkit.paylib.paylibnative.p033ui.widgets.bistro;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public interface BistroProvider extends InterfaceC8424j {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void init$default(BistroProvider bistroProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            bistroProvider.mo3485a(z);
        }
    }

    /* renamed from: a */
    void mo3484a();

    /* renamed from: a */
    void mo3485a(boolean z);

    /* renamed from: d */
    Object mo3486d(Continuation continuation);
}
