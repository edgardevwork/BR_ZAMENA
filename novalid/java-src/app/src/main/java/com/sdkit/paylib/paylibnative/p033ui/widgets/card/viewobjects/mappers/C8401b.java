package com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers;

import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain.EnumC8391d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain.InterfaceC8388a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8399e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Loyalty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.mappers.b */
/* loaded from: classes6.dex */
public final class C8401b implements InterfaceC8400a {

    /* renamed from: a */
    public final InterfaceC8388a f3824a;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.mappers.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3825a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3826b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3827c;

        static {
            int[] iArr = new int[EnumC8391d.values().length];
            try {
                iArr[EnumC8391d.BONUSES_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8391d.NO_BONUSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8391d.LOYALTY_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3825a = iArr;
            int[] iArr2 = new int[Invoice.LoyaltyInfoState.values().length];
            try {
                iArr2[Invoice.LoyaltyInfoState.READY_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Invoice.LoyaltyInfoState.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Invoice.LoyaltyInfoState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f3826b = iArr2;
            int[] iArr3 = new int[CardWithLoyalty.PaymentWay.values().length];
            try {
                iArr3[CardWithLoyalty.PaymentWay.SBOLPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f3827c = iArr3;
        }
    }

    public C8401b(InterfaceC8388a checkLoyaltyAvailabilityUseCase) {
        Intrinsics.checkNotNullParameter(checkLoyaltyAvailabilityUseCase, "checkLoyaltyAvailabilityUseCase");
        this.f3824a = checkLoyaltyAvailabilityUseCase;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers.InterfaceC8400a
    /* renamed from: a */
    public C8399e mo3596a(Invoice.LoyaltyInfoState loyaltyInfoState, CardWithLoyalty cardWithLoyalty, boolean z) {
        C8399e c8399e;
        C8399e c8399e2;
        String visualLabel;
        Intrinsics.checkNotNullParameter(loyaltyInfoState, "loyaltyInfoState");
        int i = a.f3826b[loyaltyInfoState.ordinal()];
        if (i == 1) {
            c8399e = new C8399e(true, false, null, false, null, null, 62, null);
        } else if (i == 2) {
            EnumC8391d enumC8391dMo3547a = cardWithLoyalty != null ? this.f3824a.mo3547a(cardWithLoyalty) : null;
            int i2 = enumC8391dMo3547a == null ? -1 : a.f3825a[enumC8391dMo3547a.ordinal()];
            if (i2 == -1) {
                c8399e2 = new C8399e(false, true, cardWithLoyalty != null ? m3597a(cardWithLoyalty) : null, false, null, null, 57, null);
            } else if (i2 == 1) {
                Loyalty loyalty = cardWithLoyalty.getLoyalty();
                if (loyalty == null || (visualLabel = loyalty.getVisualLabel()) == null) {
                    visualLabel = "";
                }
                c8399e2 = new C8399e(false, false, null, true, visualLabel, Boolean.valueOf(z), 7, null);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c8399e2 = new C8399e(false, true, m3597a(cardWithLoyalty), false, null, null, 57, null);
            }
            c8399e = (C8399e) AbstractC8375j.m3481a(c8399e2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c8399e = new C8399e(false, true, null, false, null, null, 57, null);
        }
        return (C8399e) AbstractC8375j.m3481a(c8399e);
    }

    /* renamed from: a */
    public final Integer m3597a(CardWithLoyalty cardWithLoyalty) {
        CardWithLoyalty.PaymentWay paymentWay = cardWithLoyalty.getPaymentWay();
        if ((paymentWay == null ? -1 : a.f3827c[paymentWay.ordinal()]) == 1) {
            return Integer.valueOf(C11403R.string.paylib_native_payment_bonuses_spasibo_not_available_sbolpay);
        }
        return null;
    }
}
