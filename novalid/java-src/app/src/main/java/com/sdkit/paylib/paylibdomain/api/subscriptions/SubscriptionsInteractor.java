package com.sdkit.paylib.paylibdomain.api.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.ChangePaymentMethodPayload;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscription;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionInfo;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\bJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\bJN\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H§@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b$\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionsInteractor;", "", "changePaymentMethod", "Lkotlin/Result;", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/ChangePaymentMethodPayload;", "purchaseId", "", "changePaymentMethod-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableRecurrent", "", "disableRecurrent-gIAlu-s", "enableRecurrent", "enableRecurrent-gIAlu-s", "getPurchaseInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionInfo;", "getPurchaseInfo-gIAlu-s", "getSubscriptionInfoV2", "getSubscriptionInfoV2-gIAlu-s", "getSubscriptions", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscription;", "isActive", "", "pageIndex", "", "pageSize", "sort", "getSubscriptions-yxL6bBk", "(ZIILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionsV2", "status", "Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionStatus;", "getSubscriptionsV2-yxL6bBk", "(Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionStatus;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPromo", "resetPromo-gIAlu-s", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface SubscriptionsInteractor {
    /* renamed from: changePaymentMethod-gIAlu-s, reason: not valid java name */
    Object mo15382changePaymentMethodgIAlus(String str, Continuation<? super Result<ChangePaymentMethodPayload>> continuation);

    /* renamed from: disableRecurrent-gIAlu-s, reason: not valid java name */
    Object mo15383disableRecurrentgIAlus(String str, Continuation<? super Result<Unit>> continuation);

    /* renamed from: enableRecurrent-gIAlu-s, reason: not valid java name */
    Object mo15384enableRecurrentgIAlus(String str, Continuation<? super Result<Unit>> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getSubscriptionInfoV2")
    /* renamed from: getPurchaseInfo-gIAlu-s, reason: not valid java name */
    Object mo15385getPurchaseInfogIAlus(String str, Continuation<? super Result<PurchaseSubscriptionInfo>> continuation);

    /* renamed from: getSubscriptionInfoV2-gIAlu-s, reason: not valid java name */
    Object mo15386getSubscriptionInfoV2gIAlus(String str, Continuation<? super Result<PurchaseSubscriptionInfo>> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getSubscriptionsV2")
    /* renamed from: getSubscriptions-yxL6bBk, reason: not valid java name */
    Object mo15387getSubscriptionsyxL6bBk(boolean z, int i, int i2, List<String> list, Continuation<? super Result<? extends List<PurchaseSubscription>>> continuation);

    /* renamed from: getSubscriptionsV2-yxL6bBk, reason: not valid java name */
    Object mo15388getSubscriptionsV2yxL6bBk(SubscriptionStatus subscriptionStatus, int i, int i2, String str, Continuation<? super Result<? extends List<PurchaseSubscription>>> continuation);

    /* renamed from: resetPromo-gIAlu-s, reason: not valid java name */
    Object mo15389resetPromogIAlus(String str, Continuation<? super Result<Unit>> continuation);
}
