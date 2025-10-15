package com.sdkit.paylib.paylibpayment.api.network.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.ConfirmPurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.CreatePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.DeletePurchaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchasesResponse;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J=\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J1\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J1\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/purchases/PurchasesNetworkClient;", "", "confirmPurchase", "Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/ConfirmPurchaseResponse;", "purchaseId", "", "developerPayload", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPurchase", "Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/CreatePurchaseResponse;", "productId", "orderId", "productQuantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePurchase", "Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/DeletePurchaseResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/PurchaseInfoResponse;", "purchaseState", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "waitSec", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseInfoV2", "getPurchases", "Lcom/sdkit/paylib/paylibpayment/api/network/response/purchases/PurchasesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchasesV2", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PurchasesNetworkClient {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object confirmPurchase$default(PurchasesNetworkClient purchasesNetworkClient, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPurchase");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return purchasesNetworkClient.confirmPurchase(str, str2, continuation);
        }

        public static /* synthetic */ Object createPurchase$default(PurchasesNetworkClient purchasesNetworkClient, String str, String str2, Integer num, String str3, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return purchasesNetworkClient.createPurchase(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPurchase");
        }

        public static /* synthetic */ Object getPurchaseInfo$default(PurchasesNetworkClient purchasesNetworkClient, String str, PurchaseState purchaseState, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPurchaseInfo");
            }
            if ((i & 2) != 0) {
                purchaseState = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return purchasesNetworkClient.getPurchaseInfo(str, purchaseState, num, continuation);
        }

        public static /* synthetic */ Object getPurchaseInfoV2$default(PurchasesNetworkClient purchasesNetworkClient, String str, PurchaseState purchaseState, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPurchaseInfoV2");
            }
            if ((i & 2) != 0) {
                purchaseState = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return purchasesNetworkClient.getPurchaseInfoV2(str, purchaseState, num, continuation);
        }
    }

    Object confirmPurchase(String str, String str2, Continuation<? super ConfirmPurchaseResponse> continuation);

    Object createPurchase(String str, String str2, Integer num, String str3, Continuation<? super CreatePurchaseResponse> continuation);

    Object deletePurchase(String str, Continuation<? super DeletePurchaseResponse> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getPurchaseInfoV2")
    Object getPurchaseInfo(String str, PurchaseState purchaseState, Integer num, Continuation<? super PurchaseInfoResponse> continuation);

    Object getPurchaseInfoV2(String str, PurchaseState purchaseState, Integer num, Continuation<? super PurchaseInfoResponse> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getPurchasesV2")
    Object getPurchases(Continuation<? super PurchasesResponse> continuation);

    Object getPurchasesV2(Continuation<? super PurchasesResponse> continuation);
}
