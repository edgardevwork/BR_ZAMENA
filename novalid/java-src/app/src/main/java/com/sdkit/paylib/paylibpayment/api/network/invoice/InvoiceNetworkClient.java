package com.sdkit.paylib.paylibpayment.api.network.invoice;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.CancelInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoicesResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.PostInvoiceResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.RequestSmsResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.VerifyPhoneNumberResponse;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;

@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJi\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J!\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/invoice/InvoiceNetworkClient;", "", "cancelInvoice", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/CancelInvoiceResponse;", "invoiceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFullInvoice", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoiceResponse;", "getInvoice", "invoiceStatus", "waitSec", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvoices", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoicesResponse;", "pageIndex", "", "pageSize", "dates", "Lkotlin/ranges/ClosedRange;", "Ljava/util/Date;", "statuses", "", "amounts", "Lkotlin/ranges/IntRange;", "maskedPan", "orderNumber", "(IILkotlin/ranges/ClosedRange;Ljava/util/List;Lkotlin/ranges/IntRange;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postInvoice", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/PostInvoiceResponse;", "paymentMethod", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSmsWithVerifyCode", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/RequestSmsResponse;", "verifyPhoneNumber", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/VerifyPhoneNumberResponse;", "otpCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface InvoiceNetworkClient {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getInvoices$default(InvoiceNetworkClient invoiceNetworkClient, int i, int i2, ClosedRange closedRange, List list, IntRange intRange, String str, String str2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return invoiceNetworkClient.getInvoices(i, i2, (i3 & 4) != 0 ? null : closedRange, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : intRange, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInvoices");
        }
    }

    Object cancelInvoice(String str, Continuation<? super CancelInvoiceResponse> continuation);

    Object getFullInvoice(String str, Continuation<? super GetInvoiceResponse> continuation);

    Object getInvoice(String str, String str2, Long l, Continuation<? super GetInvoiceResponse> continuation);

    Object getInvoice(String str, Continuation<? super GetInvoiceResponse> continuation);

    Object getInvoices(int i, int i2, ClosedRange<Date> closedRange, List<String> list, IntRange intRange, String str, String str2, Continuation<? super GetInvoicesResponse> continuation);

    Object postInvoice(String str, PaymentMethod paymentMethod, Continuation<? super PostInvoiceResponse> continuation);

    Object requestSmsWithVerifyCode(String str, Continuation<? super RequestSmsResponse> continuation);

    Object verifyPhoneNumber(String str, String str2, Continuation<? super VerifyPhoneNumberResponse> continuation);
}
