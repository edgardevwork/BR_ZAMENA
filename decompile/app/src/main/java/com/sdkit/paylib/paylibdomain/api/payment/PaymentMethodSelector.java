package com.sdkit.paylib.paylibdomain.api.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/payment/PaymentMethodSelector;", "", "getPaymentMethod", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "selectPaymentMethod", "", FirebaseAnalytics.Param.METHOD, "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaymentMethodSelector {
    PaymentMethod getPaymentMethod();

    void selectPaymentMethod(PaymentMethod paymentMethod);
}
