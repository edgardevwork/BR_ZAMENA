package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperation;", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperationType;", "component1", "", "component2", "component3", "operation", "code", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperationType;", "getOperation", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperationType;", "b", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "c", "getValue", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentOperationType;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PaymentOperation {

    /* renamed from: a, reason: from kotlin metadata */
    public final PaymentOperationType operation;

    /* renamed from: b, reason: from kotlin metadata */
    public final String code;

    /* renamed from: c, reason: from kotlin metadata */
    public final String value;

    public PaymentOperation(PaymentOperationType operation, String code, String value) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(value, "value");
        this.operation = operation;
        this.code = code;
        this.value = value;
    }

    public static /* synthetic */ PaymentOperation copy$default(PaymentOperation paymentOperation, PaymentOperationType paymentOperationType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentOperationType = paymentOperation.operation;
        }
        if ((i & 2) != 0) {
            str = paymentOperation.code;
        }
        if ((i & 4) != 0) {
            str2 = paymentOperation.value;
        }
        return paymentOperation.copy(paymentOperationType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentOperationType getOperation() {
        return this.operation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final PaymentOperation copy(PaymentOperationType operation, String code, String value) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(value, "value");
        return new PaymentOperation(operation, code, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOperation)) {
            return false;
        }
        PaymentOperation paymentOperation = (PaymentOperation) other;
        return this.operation == paymentOperation.operation && Intrinsics.areEqual(this.code, paymentOperation.code) && Intrinsics.areEqual(this.value, paymentOperation.value);
    }

    public final String getCode() {
        return this.code;
    }

    public final PaymentOperationType getOperation() {
        return this.operation;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + C8031b.m1429a(this.code, this.operation.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentOperation(operation=");
        sb.append(this.operation);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", value=");
        return C8032c.m1430a(sb, this.value, ')');
    }
}
