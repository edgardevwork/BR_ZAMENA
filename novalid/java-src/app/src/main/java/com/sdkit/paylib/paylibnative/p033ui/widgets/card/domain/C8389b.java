package com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain;

import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Loyalty;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.domain.b */
/* loaded from: classes6.dex */
public final class C8389b implements InterfaceC8388a {
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain.InterfaceC8388a
    /* renamed from: a */
    public EnumC8391d mo3547a(CardWithLoyalty card) {
        EnumC8391d enumC8391d;
        Intrinsics.checkNotNullParameter(card, "card");
        if (!card.getLoyaltyAvailability()) {
            card = null;
        }
        if (card == null) {
            return null;
        }
        Loyalty loyalty = card.getLoyalty();
        if (loyalty == null) {
            return EnumC8391d.LOYALTY_NOT_AVAILABLE;
        }
        Integer maxAmount = loyalty.getMaxAmount();
        if (maxAmount != null) {
            if ((maxAmount.intValue() > 0 ? maxAmount : null) != null && (enumC8391d = EnumC8391d.BONUSES_AVAILABLE) != null) {
                return enumC8391d;
            }
        }
        return EnumC8391d.NO_BONUSES;
    }
}
