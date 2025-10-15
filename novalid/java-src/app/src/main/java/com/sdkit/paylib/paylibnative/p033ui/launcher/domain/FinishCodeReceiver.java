package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes8.dex */
public interface FinishCodeReceiver {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void notifyPaymentComplete$default(FinishCodeReceiver finishCodeReceiver, EnumC8105d enumC8105d, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyPaymentComplete");
            }
            if ((i & 1) != 0) {
                enumC8105d = null;
            }
            finishCodeReceiver.mo2267a(enumC8105d);
        }
    }

    /* renamed from: a */
    void mo2267a(EnumC8105d enumC8105d);

    Flow resultObserver();
}
