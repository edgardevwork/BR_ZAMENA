package com.sdkit.paylib.paylibdomain.api.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003JT\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\r\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0010\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006,"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatusPayload;", "", "Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;", "component1", "", "component2", "", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "paymentStatus", "isRequestWithLongPollingTimedOut", "userMessage", "traceId", "isSubscription", "cardNumber", "copy", "(Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatusPayload;", "toString", "", "hashCode", "other", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;", "getPaymentStatus", "()Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;", "b", "Z", "()Z", "c", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "d", "getTraceId", "e", "Ljava/lang/Boolean;", "f", "getCardNumber", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class PaymentStatusPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final PaymentStatus paymentStatus;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean isRequestWithLongPollingTimedOut;

    /* renamed from: c, reason: from kotlin metadata */
    public final String userMessage;

    /* renamed from: d, reason: from kotlin metadata */
    public final String traceId;

    /* renamed from: e, reason: from kotlin metadata */
    public final Boolean isSubscription;

    /* renamed from: f, reason: from kotlin metadata */
    public final String cardNumber;

    public PaymentStatusPayload(PaymentStatus paymentStatus, boolean z, String str, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        this.paymentStatus = paymentStatus;
        this.isRequestWithLongPollingTimedOut = z;
        this.userMessage = str;
        this.traceId = str2;
        this.isSubscription = bool;
        this.cardNumber = str3;
    }

    public static /* synthetic */ PaymentStatusPayload copy$default(PaymentStatusPayload paymentStatusPayload, PaymentStatus paymentStatus, boolean z, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentStatus = paymentStatusPayload.paymentStatus;
        }
        if ((i & 2) != 0) {
            z = paymentStatusPayload.isRequestWithLongPollingTimedOut;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = paymentStatusPayload.userMessage;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = paymentStatusPayload.traceId;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            bool = paymentStatusPayload.isSubscription;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str3 = paymentStatusPayload.cardNumber;
        }
        return paymentStatusPayload.copy(paymentStatus, z2, str4, str5, bool2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRequestWithLongPollingTimedOut() {
        return this.isRequestWithLongPollingTimedOut;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final PaymentStatusPayload copy(PaymentStatus paymentStatus, boolean isRequestWithLongPollingTimedOut, String userMessage, String traceId, Boolean isSubscription, String cardNumber) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        return new PaymentStatusPayload(paymentStatus, isRequestWithLongPollingTimedOut, userMessage, traceId, isSubscription, cardNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentStatusPayload)) {
            return false;
        }
        PaymentStatusPayload paymentStatusPayload = (PaymentStatusPayload) other;
        return this.paymentStatus == paymentStatusPayload.paymentStatus && this.isRequestWithLongPollingTimedOut == paymentStatusPayload.isRequestWithLongPollingTimedOut && Intrinsics.areEqual(this.userMessage, paymentStatusPayload.userMessage) && Intrinsics.areEqual(this.traceId, paymentStatusPayload.traceId) && Intrinsics.areEqual(this.isSubscription, paymentStatusPayload.isSubscription) && Intrinsics.areEqual(this.cardNumber, paymentStatusPayload.cardNumber);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.paymentStatus.hashCode() * 31;
        boolean z = this.isRequestWithLongPollingTimedOut;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        String str = this.userMessage;
        int iHashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.traceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSubscription;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.cardNumber;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isRequestWithLongPollingTimedOut() {
        return this.isRequestWithLongPollingTimedOut;
    }

    public final Boolean isSubscription() {
        return this.isSubscription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentStatusPayload(paymentStatus=");
        sb.append(this.paymentStatus);
        sb.append(", isRequestWithLongPollingTimedOut=");
        sb.append(this.isRequestWithLongPollingTimedOut);
        sb.append(", userMessage=");
        sb.append(this.userMessage);
        sb.append(", traceId=");
        sb.append(this.traceId);
        sb.append(", isSubscription=");
        sb.append(this.isSubscription);
        sb.append(", cardNumber=");
        return C8032c.m1430a(sb, this.cardNumber, ')');
    }
}
