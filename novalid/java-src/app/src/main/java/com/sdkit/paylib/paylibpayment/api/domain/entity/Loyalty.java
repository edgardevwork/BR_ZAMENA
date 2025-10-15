package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JV\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0006R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b¨\u0006)"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Loyalty;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "serviceCode", "minAmount", "maxAmount", "visualAmount", "actionLabel", "visualLabel", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Loyalty;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getServiceCode", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getMinAmount", "c", "getMaxAmount", "d", "getVisualAmount", "e", "getActionLabel", "f", "getVisualLabel", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Loyalty {

    /* renamed from: a, reason: from kotlin metadata */
    public final String serviceCode;

    /* renamed from: b, reason: from kotlin metadata */
    public final Integer minAmount;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer maxAmount;

    /* renamed from: d, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: e, reason: from kotlin metadata */
    public final String actionLabel;

    /* renamed from: f, reason: from kotlin metadata */
    public final String visualLabel;

    public Loyalty(String serviceCode, Integer num, Integer num2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        this.serviceCode = serviceCode;
        this.minAmount = num;
        this.maxAmount = num2;
        this.visualAmount = str;
        this.actionLabel = str2;
        this.visualLabel = str3;
    }

    public static /* synthetic */ Loyalty copy$default(Loyalty loyalty, String str, Integer num, Integer num2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyalty.serviceCode;
        }
        if ((i & 2) != 0) {
            num = loyalty.minAmount;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = loyalty.maxAmount;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            str2 = loyalty.visualAmount;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = loyalty.actionLabel;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = loyalty.visualLabel;
        }
        return loyalty.copy(str, num3, num4, str5, str6, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceCode() {
        return this.serviceCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActionLabel() {
        return this.actionLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVisualLabel() {
        return this.visualLabel;
    }

    public final Loyalty copy(String serviceCode, Integer minAmount, Integer maxAmount, String visualAmount, String actionLabel, String visualLabel) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        return new Loyalty(serviceCode, minAmount, maxAmount, visualAmount, actionLabel, visualLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Loyalty)) {
            return false;
        }
        Loyalty loyalty = (Loyalty) other;
        return Intrinsics.areEqual(this.serviceCode, loyalty.serviceCode) && Intrinsics.areEqual(this.minAmount, loyalty.minAmount) && Intrinsics.areEqual(this.maxAmount, loyalty.maxAmount) && Intrinsics.areEqual(this.visualAmount, loyalty.visualAmount) && Intrinsics.areEqual(this.actionLabel, loyalty.actionLabel) && Intrinsics.areEqual(this.visualLabel, loyalty.visualLabel);
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final Integer getMaxAmount() {
        return this.maxAmount;
    }

    public final Integer getMinAmount() {
        return this.minAmount;
    }

    public final String getServiceCode() {
        return this.serviceCode;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public final String getVisualLabel() {
        return this.visualLabel;
    }

    public int hashCode() {
        int iHashCode = this.serviceCode.hashCode() * 31;
        Integer num = this.minAmount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxAmount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.visualAmount;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.visualLabel;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Loyalty(serviceCode=");
        sb.append(this.serviceCode);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", visualAmount=");
        sb.append(this.visualAmount);
        sb.append(", actionLabel=");
        sb.append(this.actionLabel);
        sb.append(", visualLabel=");
        return C8032c.m1430a(sb, this.visualLabel, ')');
    }
}
