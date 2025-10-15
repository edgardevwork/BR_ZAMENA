package com.sdkit.paylib.paylibdomain.api.applications;

import com.sdkit.paylib.paylibpayment.api.network.entity.applications.ApplicationInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\f\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/applications/ApplicationsInteractor;", "", "buyApplication", "Lkotlin/Result;", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/applications/ApplicationInfo;", "appsCode", "", "developerPayload", "buyApplication-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteApplicationPurchase", "", "purchaseId", "deleteApplicationPurchase-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApplicationPurchaseInfo", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/Purchase;", "getApplicationPurchaseInfo-gIAlu-s", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ApplicationsInteractor {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* renamed from: buyApplication-0E7RQCE$default */
        public static /* synthetic */ Object m15350buyApplication0E7RQCE$default(ApplicationsInteractor applicationsInteractor, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buyApplication-0E7RQCE");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return applicationsInteractor.mo15347buyApplication0E7RQCE(str, str2, continuation);
        }
    }

    /* renamed from: buyApplication-0E7RQCE */
    Object mo15347buyApplication0E7RQCE(String str, String str2, Continuation<? super Result<ApplicationInfo>> continuation);

    /* renamed from: deleteApplicationPurchase-gIAlu-s */
    Object mo15348deleteApplicationPurchasegIAlus(String str, Continuation<? super Result<Unit>> continuation);

    /* renamed from: getApplicationPurchaseInfo-gIAlu-s */
    Object mo15349getApplicationPurchaseInfogIAlus(String str, Continuation<? super Result<Purchase>> continuation);
}
