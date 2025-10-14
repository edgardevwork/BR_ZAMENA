package com.sdkit.paylib.paylibdomain.api.mobileb.interactors;

import androidx.autofill.HintConstants;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\u0004H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MobileBPaymentsInteractor;", "", "getDisclaimer", "Lkotlin/Result;", "", "getDisclaimer-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPayment", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "startPayment-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface MobileBPaymentsInteractor {
    /* renamed from: getDisclaimer-IoAF18A, reason: not valid java name */
    Object mo15367getDisclaimerIoAF18A(Continuation<? super Result<String>> continuation);

    /* renamed from: startPayment-gIAlu-s, reason: not valid java name */
    Object mo15368startPaymentgIAlus(String str, Continuation<? super Result<SmsConfirmConstraints>> continuation);
}
