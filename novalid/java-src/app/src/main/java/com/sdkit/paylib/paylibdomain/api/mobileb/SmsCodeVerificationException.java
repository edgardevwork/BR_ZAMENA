package com.sdkit.paylib.paylibdomain.api.mobileb;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.SmsConfirmConstraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/mobileb/SmsCodeVerificationException;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "component1", "constraints", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "getConstraints", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class SmsCodeVerificationException extends Throwable {

    /* renamed from: a, reason: from kotlin metadata */
    public final SmsConfirmConstraints constraints;

    public SmsCodeVerificationException(SmsConfirmConstraints constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.constraints = constraints;
    }

    public static /* synthetic */ SmsCodeVerificationException copy$default(SmsCodeVerificationException smsCodeVerificationException, SmsConfirmConstraints smsConfirmConstraints, int i, Object obj) {
        if ((i & 1) != 0) {
            smsConfirmConstraints = smsCodeVerificationException.constraints;
        }
        return smsCodeVerificationException.copy(smsConfirmConstraints);
    }

    /* renamed from: component1, reason: from getter */
    public final SmsConfirmConstraints getConstraints() {
        return this.constraints;
    }

    public final SmsCodeVerificationException copy(SmsConfirmConstraints constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return new SmsCodeVerificationException(constraints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SmsCodeVerificationException) && Intrinsics.areEqual(this.constraints, ((SmsCodeVerificationException) other).constraints);
    }

    public final SmsConfirmConstraints getConstraints() {
        return this.constraints;
    }

    public int hashCode() {
        return this.constraints.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SmsCodeVerificationException(constraints=" + this.constraints + ')';
    }
}
