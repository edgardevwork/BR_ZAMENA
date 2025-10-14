package com.sdkit.paylib.paylibdomain.api.cards;

import com.sdkit.paylib.paylibpayment.api.domain.entity.WayToAddCard;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.Card;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u0004H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/cards/CardsInteractor;", "", "addCard", "Lkotlin/Result;", "", "orderId", "wayToAddCard", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;", "addCard-0E7RQCE", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/WayToAddCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCard", "", "cardId", "deleteCard-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCards", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "getCards-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface CardsInteractor {
    /* renamed from: addCard-0E7RQCE */
    Object mo15351addCard0E7RQCE(String str, WayToAddCard wayToAddCard, Continuation<? super Result<String>> continuation);

    /* renamed from: deleteCard-gIAlu-s */
    Object mo15352deleteCardgIAlus(String str, Continuation<? super Result<Unit>> continuation);

    /* renamed from: getCards-IoAF18A */
    Object mo15353getCardsIoAF18A(Continuation<? super Result<? extends List<Card>>> continuation);
}
