package com.sdkit.paylib.paylibdomain.api.mobileb.interactors;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MoblieBOtpCodeInteractor;", "", "requestSmsWithVerifyCode", "Lkotlin/Result;", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "requestSmsWithVerifyCode-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPhoneNumber", "", "otpCode", "", "verifyPhoneNumber-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface MoblieBOtpCodeInteractor {
    /* renamed from: requestSmsWithVerifyCode-IoAF18A, reason: not valid java name */
    Object mo15369requestSmsWithVerifyCodeIoAF18A(Continuation<? super Result<SmsConfirmConstraints>> continuation);

    /* renamed from: verifyPhoneNumber-gIAlu-s, reason: not valid java name */
    Object mo15370verifyPhoneNumbergIAlus(String str, Continuation<? super Result<Unit>> continuation);
}
