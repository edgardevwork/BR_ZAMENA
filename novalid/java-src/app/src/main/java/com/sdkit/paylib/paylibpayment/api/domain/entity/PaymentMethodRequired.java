package com.sdkit.paylib.paylibpayment.api.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentMethodRequired;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", "component1", "invoice", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", "getInvoice", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Invoice;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class PaymentMethodRequired extends PaymentAction {

    /* renamed from: a, reason: from kotlin metadata */
    public final Invoice invoice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodRequired(Invoice invoice) {
        super(null);
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        this.invoice = invoice;
    }

    public static /* synthetic */ PaymentMethodRequired copy$default(PaymentMethodRequired paymentMethodRequired, Invoice invoice, int i, Object obj) {
        if ((i & 1) != 0) {
            invoice = paymentMethodRequired.invoice;
        }
        return paymentMethodRequired.copy(invoice);
    }

    /* renamed from: component1, reason: from getter */
    public final Invoice getInvoice() {
        return this.invoice;
    }

    public final PaymentMethodRequired copy(Invoice invoice) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        return new PaymentMethodRequired(invoice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaymentMethodRequired) && Intrinsics.areEqual(this.invoice, ((PaymentMethodRequired) other).invoice);
    }

    public final Invoice getInvoice() {
        return this.invoice;
    }

    public int hashCode() {
        return this.invoice.hashCode();
    }

    public String toString() {
        return "PaymentMethodRequired(invoice=" + this.invoice + ')';
    }
}
