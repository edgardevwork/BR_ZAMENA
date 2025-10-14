package com.sdkit.paylib.paylibdomain.api.invoice;

import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.ExternalPayRoute;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.ExternalPayType;
import com.sdkit.paylib.paylibdomain.api.invoice.entity.LoyaltyPoints;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.Invoice;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;

@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0080\u0001\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J>\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b)\u0010*J2\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b/\u00100\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicesInteractor;", "", "cancelInvoice", "Lkotlin/Result;", "", "invoiceId", "", "cancelInvoice-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvoice", "Lcom/sdkit/paylib/paylibpayment/api/network/response/invoice/GetInvoiceResponse;", "includeLoyaltyInfo", "", "getInvoice-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvoices", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/Invoice;", "pageIndex", "", "pageSize", "dates", "Lkotlin/ranges/ClosedRange;", "Ljava/util/Date;", "statuses", "amounts", "Lkotlin/ranges/IntRange;", "maskedPan", "orderNumber", "getInvoices-eH_QyT8", "(IILkotlin/ranges/ClosedRange;Ljava/util/List;Lkotlin/ranges/IntRange;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentStatusForExecutedInvoice", "Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatusPayload;", "waitSec", "", "getPaymentStatusForExecutedInvoice-0E7RQCE", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payByCard", "cardId", "loyaltyPoints", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/LoyaltyPoints;", "payByCard-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/LoyaltyPoints;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payExternally", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayRoute;", "payType", "Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;", "payExternally-0E7RQCE", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/ExternalPayType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface InvoicesInteractor {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* renamed from: getInvoices-eH_QyT8$default, reason: not valid java name */
        public static /* synthetic */ Object m15365getInvoiceseH_QyT8$default(InvoicesInteractor invoicesInteractor, int i, int i2, ClosedRange closedRange, List list, IntRange intRange, String str, String str2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return invoicesInteractor.mo15361getInvoiceseH_QyT8(i, i2, (i3 & 4) != 0 ? null : closedRange, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : intRange, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInvoices-eH_QyT8");
        }

        /* renamed from: payByCard-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m15366payByCardBWLJW6A$default(InvoicesInteractor invoicesInteractor, String str, String str2, LoyaltyPoints loyaltyPoints, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: payByCard-BWLJW6A");
            }
            if ((i & 4) != 0) {
                loyaltyPoints = null;
            }
            return invoicesInteractor.mo15363payByCardBWLJW6A(str, str2, loyaltyPoints, continuation);
        }
    }

    /* renamed from: cancelInvoice-gIAlu-s, reason: not valid java name */
    Object mo15359cancelInvoicegIAlus(String str, Continuation<? super Result<Unit>> continuation);

    /* renamed from: getInvoice-0E7RQCE, reason: not valid java name */
    Object mo15360getInvoice0E7RQCE(String str, boolean z, Continuation<? super Result<GetInvoiceResponse>> continuation);

    /* renamed from: getInvoices-eH_QyT8, reason: not valid java name */
    Object mo15361getInvoiceseH_QyT8(int i, int i2, ClosedRange<Date> closedRange, List<String> list, IntRange intRange, String str, String str2, Continuation<? super Result<? extends List<Invoice>>> continuation);

    /* renamed from: getPaymentStatusForExecutedInvoice-0E7RQCE, reason: not valid java name */
    Object mo15362getPaymentStatusForExecutedInvoice0E7RQCE(String str, long j, Continuation<? super Result<PaymentStatusPayload>> continuation);

    /* renamed from: payByCard-BWLJW6A, reason: not valid java name */
    Object mo15363payByCardBWLJW6A(String str, String str2, LoyaltyPoints loyaltyPoints, Continuation<? super Result<Unit>> continuation);

    /* renamed from: payExternally-0E7RQCE, reason: not valid java name */
    Object mo15364payExternally0E7RQCE(String str, ExternalPayType externalPayType, Continuation<? super Result<? extends ExternalPayRoute>> continuation);
}
