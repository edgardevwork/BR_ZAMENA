package com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8424j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public interface SbolPayProvider extends InterfaceC8424j {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void init$default(SbolPayProvider sbolPayProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            sbolPayProvider.mo3709a(z);
        }
    }

    /* renamed from: a */
    void mo3708a();

    /* renamed from: a */
    void mo3709a(boolean z);

    /* renamed from: d */
    Flow mo3710d();

    /* renamed from: f */
    Object mo3711f(Continuation continuation);
}
