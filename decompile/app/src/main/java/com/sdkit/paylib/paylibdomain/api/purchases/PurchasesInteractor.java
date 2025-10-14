package com.sdkit.paylib.paylibdomain.api.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.CreatedPurchaseInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJN\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0014J(\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u0003H§@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "", "confirmPurchase", "Lkotlin/Result;", "", "purchaseId", "", "developerPayload", "confirmPurchase-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPurchase", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/CreatedPurchaseInfo;", "productId", "orderId", "productQuantity", "", "createPurchase-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePurchase", "deletePurchase-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/Purchase;", "getPurchaseInfo-gIAlu-s", "getPurchaseInfoV2", "getPurchaseInfoV2-gIAlu-s", "getPurchases", "", "getPurchases-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchasesV2", "getPurchasesV2-IoAF18A", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PurchasesInteractor {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* renamed from: confirmPurchase-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m15379confirmPurchase0E7RQCE$default(PurchasesInteractor purchasesInteractor, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPurchase-0E7RQCE");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return purchasesInteractor.mo15372confirmPurchase0E7RQCE(str, str2, continuation);
        }

        /* renamed from: createPurchase-yxL6bBk$default, reason: not valid java name */
        public static /* synthetic */ Object m15380createPurchaseyxL6bBk$default(PurchasesInteractor purchasesInteractor, String str, String str2, Integer num, String str3, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return purchasesInteractor.mo15373createPurchaseyxL6bBk(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPurchase-yxL6bBk");
        }
    }

    /* renamed from: confirmPurchase-0E7RQCE, reason: not valid java name */
    Object mo15372confirmPurchase0E7RQCE(String str, String str2, Continuation<? super Result<Unit>> continuation);

    /* renamed from: createPurchase-yxL6bBk, reason: not valid java name */
    Object mo15373createPurchaseyxL6bBk(String str, String str2, Integer num, String str3, Continuation<? super Result<CreatedPurchaseInfo>> continuation);

    /* renamed from: deletePurchase-gIAlu-s, reason: not valid java name */
    Object mo15374deletePurchasegIAlus(String str, Continuation<? super Result<Unit>> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getPurchaseInfoV2")
    /* renamed from: getPurchaseInfo-gIAlu-s, reason: not valid java name */
    Object mo15375getPurchaseInfogIAlus(String str, Continuation<? super Result<Purchase>> continuation);

    /* renamed from: getPurchaseInfoV2-gIAlu-s, reason: not valid java name */
    Object mo15376getPurchaseInfoV2gIAlus(String str, Continuation<? super Result<Purchase>> continuation);

    @Deprecated(message = "Deprecated. Используйте метод getPurchasesV2")
    /* renamed from: getPurchases-IoAF18A, reason: not valid java name */
    Object mo15377getPurchasesIoAF18A(Continuation<? super Result<? extends List<Purchase>>> continuation);

    /* renamed from: getPurchasesV2-IoAF18A, reason: not valid java name */
    Object mo15378getPurchasesV2IoAF18A(Continuation<? super Result<? extends List<Purchase>>> continuation);
}
