package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u008e\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\tR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\tR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\tR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010$\u001a\u0004\b=\u0010&¨\u0006@"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;", "", "", "component1", "component2", "", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "serviceCode", "serviceName", "changeRate", "balance", "minAmount", "maxAmount", "visualAmount", "label", "visualLabel", "actionMessage", "image", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getServiceCode", "()Ljava/lang/String;", "b", "getServiceName", "c", "D", "getChangeRate", "()D", "d", "Ljava/lang/Integer;", "getBalance", "e", "getMinAmount", "f", "getMaxAmount", "g", "getVisualAmount", "h", "getLabel", "i", "getVisualLabel", "j", "getActionMessage", "k", "getImage", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceLoyalty {

    /* renamed from: a, reason: from kotlin metadata */
    public final String serviceCode;

    /* renamed from: b, reason: from kotlin metadata */
    public final String serviceName;

    /* renamed from: c, reason: from kotlin metadata */
    public final double changeRate;

    /* renamed from: d, reason: from kotlin metadata */
    public final Integer balance;

    /* renamed from: e, reason: from kotlin metadata */
    public final Integer minAmount;

    /* renamed from: f, reason: from kotlin metadata */
    public final Integer maxAmount;

    /* renamed from: g, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: h, reason: from kotlin metadata */
    public final String label;

    /* renamed from: i, reason: from kotlin metadata */
    public final String visualLabel;

    /* renamed from: j, reason: from kotlin metadata */
    public final String actionMessage;

    /* renamed from: k, reason: from kotlin metadata */
    public final String image;

    public InvoiceLoyalty(String serviceCode, String serviceName, double d, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.changeRate = d;
        this.balance = num;
        this.minAmount = num2;
        this.maxAmount = num3;
        this.visualAmount = str;
        this.label = str2;
        this.visualLabel = str3;
        this.actionMessage = str4;
        this.image = str5;
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceCode() {
        return this.serviceCode;
    }

    /* renamed from: component10, reason: from getter */
    public final String getActionMessage() {
        return this.actionMessage;
    }

    /* renamed from: component11, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* renamed from: component3, reason: from getter */
    public final double getChangeRate() {
        return this.changeRate;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBalance() {
        return this.balance;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVisualLabel() {
        return this.visualLabel;
    }

    public final InvoiceLoyalty copy(String serviceCode, String serviceName, double changeRate, Integer balance, Integer minAmount, Integer maxAmount, String visualAmount, String label, String visualLabel, String actionMessage, String image) {
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        return new InvoiceLoyalty(serviceCode, serviceName, changeRate, balance, minAmount, maxAmount, visualAmount, label, visualLabel, actionMessage, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceLoyalty)) {
            return false;
        }
        InvoiceLoyalty invoiceLoyalty = (InvoiceLoyalty) other;
        return Intrinsics.areEqual(this.serviceCode, invoiceLoyalty.serviceCode) && Intrinsics.areEqual(this.serviceName, invoiceLoyalty.serviceName) && Double.compare(this.changeRate, invoiceLoyalty.changeRate) == 0 && Intrinsics.areEqual(this.balance, invoiceLoyalty.balance) && Intrinsics.areEqual(this.minAmount, invoiceLoyalty.minAmount) && Intrinsics.areEqual(this.maxAmount, invoiceLoyalty.maxAmount) && Intrinsics.areEqual(this.visualAmount, invoiceLoyalty.visualAmount) && Intrinsics.areEqual(this.label, invoiceLoyalty.label) && Intrinsics.areEqual(this.visualLabel, invoiceLoyalty.visualLabel) && Intrinsics.areEqual(this.actionMessage, invoiceLoyalty.actionMessage) && Intrinsics.areEqual(this.image, invoiceLoyalty.image);
    }

    public final String getActionMessage() {
        return this.actionMessage;
    }

    public final Integer getBalance() {
        return this.balance;
    }

    public final double getChangeRate() {
        return this.changeRate;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLabel() {
        return this.label;
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

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public final String getVisualLabel() {
        return this.visualLabel;
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this.changeRate) + C8031b.m1429a(this.serviceName, this.serviceCode.hashCode() * 31, 31)) * 31;
        Integer num = this.balance;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minAmount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxAmount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.visualAmount;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.visualLabel;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionMessage;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceLoyalty(serviceCode=" + this.serviceCode + ", serviceName=" + this.serviceName + ", changeRate=" + this.changeRate + ", balance=" + this.balance + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", visualAmount=" + this.visualAmount + ", label=" + this.label + ", visualLabel=" + this.visualLabel + ", actionMessage=" + this.actionMessage + ", image=" + this.image + ')';
    }
}
