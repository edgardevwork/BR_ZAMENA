package com.sdkit.paylib.paylibdomain.api.invoice;

import com.sdkit.paylib.paylibdomain.api.entity.ConfirmPaymentResult;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicePaymentInteractor;", "", "confirmPayment", "Lkotlin/Result;", "Lcom/sdkit/paylib/paylibdomain/api/entity/ConfirmPaymentResult;", "confirmPayment-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentStatusForExecutedInvoice", "Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatusPayload;", "waitSec", "", "getPaymentStatusForExecutedInvoice-gIAlu-s", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface InvoicePaymentInteractor {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* renamed from: getPaymentStatusForExecutedInvoice-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m15358getPaymentStatusForExecutedInvoicegIAlus$default(InvoicePaymentInteractor invoicePaymentInteractor, Long l, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentStatusForExecutedInvoice-gIAlu-s");
            }
            if ((i & 1) != 0) {
                l = null;
            }
            return invoicePaymentInteractor.mo15357getPaymentStatusForExecutedInvoicegIAlus(l, continuation);
        }
    }

    /* renamed from: confirmPayment-IoAF18A, reason: not valid java name */
    Object mo15356confirmPaymentIoAF18A(Continuation<? super Result<ConfirmPaymentResult>> continuation);

    /* renamed from: getPaymentStatusForExecutedInvoice-gIAlu-s, reason: not valid java name */
    Object mo15357getPaymentStatusForExecutedInvoicegIAlus(Long l, Continuation<? super Result<PaymentStatusPayload>> continuation);
}
