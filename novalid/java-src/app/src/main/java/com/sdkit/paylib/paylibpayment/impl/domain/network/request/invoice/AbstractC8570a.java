package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8570a {
    /* renamed from: a */
    public static final PaymentOperationJson m4229a(PaymentOperation paymentOperation) {
        Intrinsics.checkNotNullParameter(paymentOperation, "<this>");
        return new PaymentOperationJson(AbstractC8571b.m4230a(paymentOperation.getOperation()), paymentOperation.getCode(), paymentOperation.getValue());
    }
}
