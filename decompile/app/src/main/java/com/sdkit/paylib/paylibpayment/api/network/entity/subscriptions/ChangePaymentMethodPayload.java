package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/ChangePaymentMethodPayload;", "", "", "component1", "component2", "purchaseId", "invoiceId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getInvoiceId", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class ChangePaymentMethodPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final String purchaseId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String invoiceId;

    public ChangePaymentMethodPayload(String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.purchaseId = purchaseId;
        this.invoiceId = invoiceId;
    }

    public static /* synthetic */ ChangePaymentMethodPayload copy$default(ChangePaymentMethodPayload changePaymentMethodPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePaymentMethodPayload.purchaseId;
        }
        if ((i & 2) != 0) {
            str2 = changePaymentMethodPayload.invoiceId;
        }
        return changePaymentMethodPayload.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final ChangePaymentMethodPayload copy(String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return new ChangePaymentMethodPayload(purchaseId, invoiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePaymentMethodPayload)) {
            return false;
        }
        ChangePaymentMethodPayload changePaymentMethodPayload = (ChangePaymentMethodPayload) other;
        return Intrinsics.areEqual(this.purchaseId, changePaymentMethodPayload.purchaseId) && Intrinsics.areEqual(this.invoiceId, changePaymentMethodPayload.invoiceId);
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public int hashCode() {
        return this.invoiceId.hashCode() + (this.purchaseId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangePaymentMethodPayload(purchaseId=");
        sb.append(this.purchaseId);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.invoiceId, ')');
    }
}
