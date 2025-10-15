package com.sdkit.paylib.paylibdomain.impl.cards;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.a */
/* loaded from: classes6.dex */
public final class C8035a implements CardsHolder {

    /* renamed from: a */
    public final PaymentMethodSelector f1107a;

    /* renamed from: b */
    public final MutableStateFlow f1108b;

    /* renamed from: c */
    public final MutableStateFlow f1109c;

    public C8035a(PaymentMethodSelector paymentMethodSelector) {
        Intrinsics.checkNotNullParameter(paymentMethodSelector, "paymentMethodSelector");
        this.f1107a = paymentMethodSelector;
        this.f1108b = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.f1109c = StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsHolder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow getCards() {
        return this.f1108b;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsHolder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow getSelectedCard() {
        return this.f1109c;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsHolder
    public CardWithLoyalty findCard(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator it = ((Iterable) getCards().getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((CardWithLoyalty) next).getId(), id)) {
                break;
            }
        }
        return (CardWithLoyalty) next;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsHolder
    public void selectCard(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        CardWithLoyalty cardWithLoyaltyFindCard = findCard(id);
        if (cardWithLoyaltyFindCard != null) {
            getSelectedCard().setValue(cardWithLoyaltyFindCard);
            this.f1107a.selectPaymentMethod(new PaymentMethod.ByCard(cardWithLoyaltyFindCard.getId()));
        }
    }

    @Override // com.sdkit.paylib.paylibdomain.api.cards.CardsHolder
    public void updateCardsList(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        getCards().setValue(cards);
    }
}
