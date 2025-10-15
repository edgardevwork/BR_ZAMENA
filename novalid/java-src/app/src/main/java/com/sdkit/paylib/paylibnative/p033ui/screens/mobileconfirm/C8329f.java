package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.f */
/* loaded from: classes5.dex */
public final class C8329f {
    /* renamed from: a */
    public final boolean m3126a(SmsConfirmConstraints smsConfirmConstraints) {
        return ((long) smsConfirmConstraints.getSmsCodeExpiredTime()) < (System.currentTimeMillis() / ((long) 1000)) - smsConfirmConstraints.getSmsSentTime();
    }

    /* renamed from: a */
    public final boolean m3127a(String code, SmsConfirmConstraints smsConstraints, Function0 doOnSmsExpiration, Function0 doOnSmsExpirationAndRetryMeetLimit) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(smsConstraints, "smsConstraints");
        Intrinsics.checkNotNullParameter(doOnSmsExpiration, "doOnSmsExpiration");
        Intrinsics.checkNotNullParameter(doOnSmsExpirationAndRetryMeetLimit, "doOnSmsExpirationAndRetryMeetLimit");
        if (!m3128a(code, new Regex(smsConstraints.getValidationRegex()), smsConstraints.getSmsCodeLength())) {
            return false;
        }
        if (m3126a(smsConstraints) && !smsConstraints.isNewRequestSmsAvailable()) {
            doOnSmsExpirationAndRetryMeetLimit.invoke();
            return false;
        }
        if (!m3126a(smsConstraints)) {
            return true;
        }
        doOnSmsExpiration.invoke();
        return false;
    }

    /* renamed from: a */
    public final boolean m3128a(String code, Regex regex, int i) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches(code) && code.length() == i;
    }
}
