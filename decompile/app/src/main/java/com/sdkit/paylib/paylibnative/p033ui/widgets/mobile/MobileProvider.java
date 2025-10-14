package com.sdkit.paylib.paylibnative.p033ui.widgets.mobile;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public interface MobileProvider extends InterfaceC8424j {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void init$default(MobileProvider mobileProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            mobileProvider.mo3602a(z);
        }
    }

    /* renamed from: a */
    void mo3601a();

    /* renamed from: a */
    void mo3602a(boolean z);

    /* renamed from: e */
    Object mo3603e(Continuation continuation);
}
