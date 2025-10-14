package com.sdkit.paylib.paylibdomain.impl.payment;

import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.payment.a */
/* loaded from: classes5.dex */
public final class C8063a implements PaymentMethodSelector {

    /* renamed from: a */
    public final PaylibLogger f1402a;

    /* renamed from: b */
    public final AtomicReference f1403b;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.payment.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaymentMethod f1404a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentMethod paymentMethod) {
            super(0);
            this.f1404a = paymentMethod;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "selectPaymentMethod(" + this.f1404a + ')';
        }
    }

    public C8063a(PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1402a = loggerFactory.get("PaymentMethodSelectorImpl");
        this.f1403b = new AtomicReference(null);
    }

    @Override // com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector
    public PaymentMethod getPaymentMethod() {
        return (PaymentMethod) this.f1403b.get();
    }

    @Override // com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector
    public void selectPaymentMethod(PaymentMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        PaylibLogger.DefaultImpls.d$default(this.f1402a, null, new a(method), 1, null);
        this.f1403b.set(method);
    }
}
