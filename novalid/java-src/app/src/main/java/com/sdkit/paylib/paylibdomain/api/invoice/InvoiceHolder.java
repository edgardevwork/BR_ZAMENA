package com.sdkit.paylib.paylibdomain.api.invoice;

import com.sdkit.paylib.paylibdomain.api.entity.ResultInfo;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoiceHolder;", "", "invoice", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", "getInvoice", "()Lkotlinx/coroutines/flow/Flow;", "invoiceId", "", "getInvoiceId", "()Ljava/lang/String;", "setInvoiceId", "(Ljava/lang/String;)V", "fetchAllInvoiceDetails", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchInvoiceDetails", "Lkotlin/Result;", "Lcom/sdkit/paylib/paylibdomain/api/entity/ResultInfo;", "skipPaidValidation", "", "fetchInvoiceDetails-gIAlu-s", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface InvoiceHolder {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* renamed from: fetchInvoiceDetails-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m15355fetchInvoiceDetailsgIAlus$default(InvoiceHolder invoiceHolder, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchInvoiceDetails-gIAlu-s");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return invoiceHolder.mo15354fetchInvoiceDetailsgIAlus(z, continuation);
        }
    }

    Object fetchAllInvoiceDetails(Continuation<? super Unit> continuation);

    /* renamed from: fetchInvoiceDetails-gIAlu-s, reason: not valid java name */
    Object mo15354fetchInvoiceDetailsgIAlus(boolean z, Continuation<? super Result<ResultInfo>> continuation);

    Flow<Invoice> getInvoice();

    String getInvoiceId();

    void setInvoiceId(String str);
}
