package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethod;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "component1", "", "component2", "component3", FirebaseAnalytics.Param.METHOD, "action", "disclaimer", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "getMethod", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;", "b", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "c", "getDisclaimer", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/AvailablePaymentMethodType;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class AvailablePaymentMethod {

    /* renamed from: a, reason: from kotlin metadata */
    public final AvailablePaymentMethodType method;

    /* renamed from: b, reason: from kotlin metadata */
    public final String action;

    /* renamed from: c, reason: from kotlin metadata */
    public final String disclaimer;

    public AvailablePaymentMethod(AvailablePaymentMethodType availablePaymentMethodType, String str, String str2) {
        this.method = availablePaymentMethodType;
        this.action = str;
        this.disclaimer = str2;
    }

    public static /* synthetic */ AvailablePaymentMethod copy$default(AvailablePaymentMethod availablePaymentMethod, AvailablePaymentMethodType availablePaymentMethodType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            availablePaymentMethodType = availablePaymentMethod.method;
        }
        if ((i & 2) != 0) {
            str = availablePaymentMethod.action;
        }
        if ((i & 4) != 0) {
            str2 = availablePaymentMethod.disclaimer;
        }
        return availablePaymentMethod.copy(availablePaymentMethodType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final AvailablePaymentMethodType getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final AvailablePaymentMethod copy(AvailablePaymentMethodType method, String action, String disclaimer) {
        return new AvailablePaymentMethod(method, action, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePaymentMethod)) {
            return false;
        }
        AvailablePaymentMethod availablePaymentMethod = (AvailablePaymentMethod) other;
        return this.method == availablePaymentMethod.method && Intrinsics.areEqual(this.action, availablePaymentMethod.action) && Intrinsics.areEqual(this.disclaimer, availablePaymentMethod.disclaimer);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final AvailablePaymentMethodType getMethod() {
        return this.method;
    }

    public int hashCode() {
        AvailablePaymentMethodType availablePaymentMethodType = this.method;
        int iHashCode = (availablePaymentMethodType == null ? 0 : availablePaymentMethodType.hashCode()) * 31;
        String str = this.action;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disclaimer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvailablePaymentMethod(method=");
        sb.append(this.method);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", disclaimer=");
        return C8032c.m1430a(sb, this.disclaimer, ')');
    }
}
