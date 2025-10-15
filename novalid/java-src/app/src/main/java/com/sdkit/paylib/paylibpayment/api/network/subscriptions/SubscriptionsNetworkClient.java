package com.sdkit.paylib.paylibpayment.api.network.subscriptions;

import com.blackhub.bronline.game.gui.fractions.Const;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.ChangePaymentMethodResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionDefaultResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionsResponse;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u00060\bj\u0002`\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J7\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00060\bj\u0002`\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/subscriptions/SubscriptionsNetworkClient;", "", "changePaymentMethod", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/ChangePaymentMethodResponse;", "purchaseId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableRecurrent", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/SubscriptionDefaultResponse;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/DisableRecurrentResponse;", "enableRecurrent", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/EnableRecurrentResponse;", "getSubscriptionInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/SubscriptionInfoResponse;", "getSubscriptionInfoV2", "getSubscriptions", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/SubscriptionsResponse;", "isActive", "", Const.PAGE_KEY, "", "size", "sort", "", "(ZIILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionsV2", "status", "(IIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPromo", "Lcom/sdkit/paylib/paylibpayment/api/network/response/subscriptions/ResetPromoResponse;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface SubscriptionsNetworkClient {
    Object changePaymentMethod(String str, Continuation<? super ChangePaymentMethodResponse> continuation);

    Object disableRecurrent(String str, Continuation<? super SubscriptionDefaultResponse> continuation);

    Object enableRecurrent(String str, Continuation<? super SubscriptionDefaultResponse> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getSubscriptionInfoV2")
    Object getSubscriptionInfo(String str, Continuation<? super SubscriptionInfoResponse> continuation);

    Object getSubscriptionInfoV2(String str, Continuation<? super SubscriptionInfoResponse> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getSubscriptionsV2")
    Object getSubscriptions(boolean z, int i, int i2, List<String> list, Continuation<? super SubscriptionsResponse> continuation);

    Object getSubscriptionsV2(int i, int i2, int i3, String str, Continuation<? super SubscriptionsResponse> continuation);

    Object resetPromo(String str, Continuation<? super SubscriptionDefaultResponse> continuation);
}
