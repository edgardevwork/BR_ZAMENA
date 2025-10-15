package com.sdkit.paylib.paylibnative.p033ui.routing;

import android.os.Bundle;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects.C8331a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8346b;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import kotlin.Metadata;

/* loaded from: classes8.dex */
public interface InternalPaylibRouter {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void pushBanksScreen$default(InternalPaylibRouter internalPaylibRouter, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushBanksScreen");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            internalPaylibRouter.mo2498c(bundle);
        }

        public static /* synthetic */ void pushCardSavingScreen$default(InternalPaylibRouter internalPaylibRouter, EnumC8265e enumC8265e, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushCardSavingScreen");
            }
            if ((i & 1) != 0) {
                enumC8265e = null;
            }
            internalPaylibRouter.mo2489a(enumC8265e);
        }

        public static /* synthetic */ void pushCardsScreen$default(InternalPaylibRouter internalPaylibRouter, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushCardsScreen");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            internalPaylibRouter.mo2496b(bundle);
        }

        public static /* synthetic */ void pushDeeplinkResultScreen$default(InternalPaylibRouter internalPaylibRouter, boolean z, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushDeeplinkResultScreen");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            internalPaylibRouter.mo2494a(z, bundle);
        }

        public static /* synthetic */ void pushInvoiceDetailsScreen$default(InternalPaylibRouter internalPaylibRouter, AbstractC8128b abstractC8128b, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushInvoiceDetailsScreen");
            }
            if ((i & 1) != 0) {
                abstractC8128b = null;
            }
            internalPaylibRouter.mo2487a(abstractC8128b);
        }

        public static /* synthetic */ void pushPaymentScreen$default(InternalPaylibRouter internalPaylibRouter, Bundle bundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pushPaymentScreen");
            }
            if ((i & 1) != 0) {
                bundle = null;
            }
            internalPaylibRouter.mo2486a(bundle);
        }
    }

    /* renamed from: a */
    void mo2485a();

    /* renamed from: a */
    void mo2486a(Bundle bundle);

    /* renamed from: a */
    void mo2487a(AbstractC8128b abstractC8128b);

    /* renamed from: a */
    void mo2488a(C8261a c8261a, InterfaceC8112a interfaceC8112a);

    /* renamed from: a */
    void mo2489a(EnumC8265e enumC8265e);

    /* renamed from: a */
    void mo2490a(C8331a c8331a);

    /* renamed from: a */
    void mo2491a(C8340d c8340d);

    /* renamed from: a */
    void mo2492a(C8346b c8346b);

    /* renamed from: a */
    void mo2493a(C8357a c8357a);

    /* renamed from: a */
    void mo2494a(boolean z, Bundle bundle);

    /* renamed from: b */
    void mo2495b();

    /* renamed from: b */
    void mo2496b(Bundle bundle);

    /* renamed from: c */
    void mo2497c();

    /* renamed from: c */
    void mo2498c(Bundle bundle);

    /* renamed from: d */
    void mo2499d();

    /* renamed from: e */
    void mo2500e();

    /* renamed from: f */
    void mo2501f();
}
