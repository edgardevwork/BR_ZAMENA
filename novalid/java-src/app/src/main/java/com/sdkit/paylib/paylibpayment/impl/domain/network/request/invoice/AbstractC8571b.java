package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperationType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8571b {

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5125a;

        static {
            int[] iArr = new int[PaymentOperationType.values().length];
            try {
                iArr[PaymentOperationType.PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentOperationType.PREPARE_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentOperationType.PAYMENT_LOYALTY_POINTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentOperationType.RECURRENT_LOYALTY_POINTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5125a = iArr;
        }
    }

    /* renamed from: a */
    public static final PaymentOperationTypeJson m4230a(PaymentOperationType paymentOperationType) {
        Intrinsics.checkNotNullParameter(paymentOperationType, "<this>");
        int i = a.f5125a[paymentOperationType.ordinal()];
        if (i == 1) {
            return PaymentOperationTypeJson.PAYMENT;
        }
        if (i == 2) {
            return PaymentOperationTypeJson.PREPARE_PAYMENT;
        }
        if (i == 3) {
            return PaymentOperationTypeJson.PAYMENT_LOYALTY_POINTS;
        }
        if (i == 4) {
            return PaymentOperationTypeJson.RECURRENT_LOYALTY_POINTS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
