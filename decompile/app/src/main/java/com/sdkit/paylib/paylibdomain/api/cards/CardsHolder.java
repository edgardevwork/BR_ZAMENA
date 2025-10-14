package com.sdkit.paylib.paylibdomain.api.cards;

import com.sdkit.paylib.paylibpayment.api.domain.entity.CardWithLoyalty;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/cards/CardsHolder;", "", "cards", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/CardWithLoyalty;", "getCards", "()Lkotlinx/coroutines/flow/Flow;", "selectedCard", "getSelectedCard", "findCard", "id", "", "selectCard", "", "updateCardsList", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface CardsHolder {
    CardWithLoyalty findCard(String id);

    Flow<List<CardWithLoyalty>> getCards();

    Flow<CardWithLoyalty> getSelectedCard();

    void selectCard(String id);

    void updateCardsList(List<CardWithLoyalty> cards);
}
