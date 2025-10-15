package com.sdkit.paylib.paylibpayment.api.network.applications;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.ApplicationPurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.BuyApplicationResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.DeleteApplicationPurchaseResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/applications/ApplicationsNetworkClient;", "", "buyApplication", "Lcom/sdkit/paylib/paylibpayment/api/network/response/applications/BuyApplicationResponse;", "appsCode", "", "developerPayload", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteApplicationPurchase", "Lcom/sdkit/paylib/paylibpayment/api/network/response/applications/DeleteApplicationPurchaseResponse;", "purchaseId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApplicationPurchaseInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/response/applications/ApplicationPurchaseInfoResponse;", "purchaseState", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "waitSec", "", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ApplicationsNetworkClient {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object buyApplication$default(ApplicationsNetworkClient applicationsNetworkClient, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buyApplication");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return applicationsNetworkClient.buyApplication(str, str2, continuation);
        }

        public static /* synthetic */ Object getApplicationPurchaseInfo$default(ApplicationsNetworkClient applicationsNetworkClient, String str, PurchaseState purchaseState, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicationPurchaseInfo");
            }
            if ((i & 2) != 0) {
                purchaseState = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return applicationsNetworkClient.getApplicationPurchaseInfo(str, purchaseState, num, continuation);
        }
    }

    Object buyApplication(String str, String str2, Continuation<? super BuyApplicationResponse> continuation);

    Object deleteApplicationPurchase(String str, Continuation<? super DeleteApplicationPurchaseResponse> continuation);

    Object getApplicationPurchaseInfo(String str, PurchaseState purchaseState, Integer num, Continuation<? super ApplicationPurchaseInfoResponse> continuation);
}
