package com.sdkit.paylib.paylibdomain.api.invoice.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/invoice/entity/LoyaltyPoints;", "", "", "component1", "", "component2", "serviceCode", "amount", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getServiceCode", "()Ljava/lang/String;", "b", "I", "getAmount", "()I", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;I)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class LoyaltyPoints {

    /* renamed from: a, reason: from kotlin metadata */
    public final String serviceCode;

    /* renamed from: b, reason: from kotlin metadata */
    public final int amount;

    public LoyaltyPoints(String serviceCode, int i) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        this.serviceCode = serviceCode;
        this.amount = i;
    }

    public static /* synthetic */ LoyaltyPoints copy$default(LoyaltyPoints loyaltyPoints, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = loyaltyPoints.serviceCode;
        }
        if ((i2 & 2) != 0) {
            i = loyaltyPoints.amount;
        }
        return loyaltyPoints.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceCode() {
        return this.serviceCode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    public final LoyaltyPoints copy(String serviceCode, int amount) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        return new LoyaltyPoints(serviceCode, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyPoints)) {
            return false;
        }
        LoyaltyPoints loyaltyPoints = (LoyaltyPoints) other;
        return Intrinsics.areEqual(this.serviceCode, loyaltyPoints.serviceCode) && this.amount == loyaltyPoints.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getServiceCode() {
        return this.serviceCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.amount) + (this.serviceCode.hashCode() * 31);
    }

    public String toString() {
        return "LoyaltyPoints(serviceCode=" + this.serviceCode + ", amount=" + this.amount + ')';
    }
}
