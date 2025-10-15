package com.sdkit.paylib.paylibdomain.api.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/ConfirmPaymentResult;", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;", "component1", "", "component2", "paymentAction", "traceId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;", "getPaymentAction", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;", "b", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class ConfirmPaymentResult {

    /* renamed from: a, reason: from kotlin metadata */
    public final PaymentAction paymentAction;

    /* renamed from: b, reason: from kotlin metadata */
    public final String traceId;

    public ConfirmPaymentResult(PaymentAction paymentAction, String str) {
        Intrinsics.checkNotNullParameter(paymentAction, "paymentAction");
        this.paymentAction = paymentAction;
        this.traceId = str;
    }

    public static /* synthetic */ ConfirmPaymentResult copy$default(ConfirmPaymentResult confirmPaymentResult, PaymentAction paymentAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentAction = confirmPaymentResult.paymentAction;
        }
        if ((i & 2) != 0) {
            str = confirmPaymentResult.traceId;
        }
        return confirmPaymentResult.copy(paymentAction, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentAction getPaymentAction() {
        return this.paymentAction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    public final ConfirmPaymentResult copy(PaymentAction paymentAction, String traceId) {
        Intrinsics.checkNotNullParameter(paymentAction, "paymentAction");
        return new ConfirmPaymentResult(paymentAction, traceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmPaymentResult)) {
            return false;
        }
        ConfirmPaymentResult confirmPaymentResult = (ConfirmPaymentResult) other;
        return Intrinsics.areEqual(this.paymentAction, confirmPaymentResult.paymentAction) && Intrinsics.areEqual(this.traceId, confirmPaymentResult.traceId);
    }

    public final PaymentAction getPaymentAction() {
        return this.paymentAction;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        int iHashCode = this.paymentAction.hashCode() * 31;
        String str = this.traceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPaymentResult(paymentAction=");
        sb.append(this.paymentAction);
        sb.append(", traceId=");
        return C8032c.m1430a(sb, this.traceId, ')');
    }

    public /* synthetic */ ConfirmPaymentResult(PaymentAction paymentAction, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentAction, (i & 2) != 0 ? null : str);
    }
}
