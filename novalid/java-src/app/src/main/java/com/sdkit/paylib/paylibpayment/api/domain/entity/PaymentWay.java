package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB'\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay;", "", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;", "component1", "", "component2", "component3", "type", "actionTitle", "disclaimer", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;", "getType", "()Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;", "b", "Ljava/lang/String;", "getActionTitle", "()Ljava/lang/String;", "c", "getDisclaimer", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;Ljava/lang/String;Ljava/lang/String;)V", "Type", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PaymentWay {

    /* renamed from: a, reason: from kotlin metadata */
    public final Type type;

    /* renamed from: b, reason: from kotlin metadata */
    public final String actionTitle;

    /* renamed from: c, reason: from kotlin metadata */
    public final String disclaimer;

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;", "", "(Ljava/lang/String;I)V", "CARD", "MOBILE", "NEW", "TPAY", "SBOLPAY", "SBP", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public enum Type {
        CARD,
        MOBILE,
        NEW,
        TPAY,
        SBOLPAY,
        SBP
    }

    public PaymentWay(Type type, String str, String str2) {
        this.type = type;
        this.actionTitle = str;
        this.disclaimer = str2;
    }

    public static /* synthetic */ PaymentWay copy$default(PaymentWay paymentWay, Type type, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            type = paymentWay.type;
        }
        if ((i & 2) != 0) {
            str = paymentWay.actionTitle;
        }
        if ((i & 4) != 0) {
            str2 = paymentWay.disclaimer;
        }
        return paymentWay.copy(type, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final PaymentWay copy(Type type, String actionTitle, String disclaimer) {
        return new PaymentWay(type, actionTitle, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentWay)) {
            return false;
        }
        PaymentWay paymentWay = (PaymentWay) other;
        return this.type == paymentWay.type && Intrinsics.areEqual(this.actionTitle, paymentWay.actionTitle) && Intrinsics.areEqual(this.disclaimer, paymentWay.disclaimer);
    }

    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.actionTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disclaimer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentWay(type=");
        sb.append(this.type);
        sb.append(", actionTitle=");
        sb.append(this.actionTitle);
        sb.append(", disclaimer=");
        return C8032c.m1430a(sb, this.disclaimer, ')');
    }

    public /* synthetic */ PaymentWay(Type type, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i & 4) != 0 ? null : str2);
    }
}
