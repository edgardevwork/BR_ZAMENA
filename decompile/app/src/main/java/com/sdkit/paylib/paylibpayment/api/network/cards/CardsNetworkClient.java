package com.sdkit.paylib.paylibpayment.api.network.cards;

import com.sdkit.paylib.paylibpayment.api.domain.entity.WayToAddCard;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.AddCardResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.CardsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.cards.DeleteCardResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/cards/CardsNetworkClient;", "", "addCard", "Lcom/sdkit/paylib/paylibpayment/api/network/response/cards/AddCardResponse;", "orderId", "", "wayToAddCard", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCard", "Lcom/sdkit/paylib/paylibpayment/api/network/response/cards/DeleteCardResponse;", "cardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCards", "Lcom/sdkit/paylib/paylibpayment/api/network/response/cards/CardsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface CardsNetworkClient {
    Object addCard(String str, WayToAddCard wayToAddCard, Continuation<? super AddCardResponse> continuation);

    Object deleteCard(String str, Continuation<? super DeleteCardResponse> continuation);

    Object getCards(Continuation<? super CardsResponse> continuation);
}
