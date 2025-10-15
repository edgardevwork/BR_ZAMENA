package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bN\u0010OJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J¹\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010$\u001a\u00020\u0002HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010+\u001a\u0004\bI\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006P"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/Invoice;", "", "", "component1", "component2", "component3", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "component15", "id", "image", "date", "status", "orderNumber", FirebaseAnalytics.Param.CURRENCY, "description", "language", "organizationName", "organizationInn", "trademarks", "tradeName", "visualName", "visualAmount", "paymentInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getImage", "c", "getDate", "d", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "getStatus", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;", "e", "getOrderNumber", "f", "getCurrency", "g", "getDescription", "h", "getLanguage", "i", "getOrganizationName", "j", "getOrganizationInn", "k", "getTrademarks", "l", "getTradeName", "m", "getVisualName", "n", "getVisualAmount", "o", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "getPaymentInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Invoice {

    /* renamed from: a, reason: from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: from kotlin metadata */
    public final String image;

    /* renamed from: c, reason: from kotlin metadata */
    public final String date;

    /* renamed from: d, reason: from kotlin metadata */
    public final InvoiceStatus status;

    /* renamed from: e, reason: from kotlin metadata */
    public final String orderNumber;

    /* renamed from: f, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: g, reason: from kotlin metadata */
    public final String description;

    /* renamed from: h, reason: from kotlin metadata */
    public final String language;

    /* renamed from: i, reason: from kotlin metadata */
    public final String organizationName;

    /* renamed from: j, reason: from kotlin metadata */
    public final String organizationInn;

    /* renamed from: k, reason: from kotlin metadata */
    public final String trademarks;

    /* renamed from: l, reason: from kotlin metadata */
    public final String tradeName;

    /* renamed from: m, reason: from kotlin metadata */
    public final String visualName;

    /* renamed from: n, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: o, reason: from kotlin metadata */
    public final InvoicePaymentInfo paymentInfo;

    public Invoice(String id, String str, String str2, InvoiceStatus status, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InvoicePaymentInfo invoicePaymentInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.image = str;
        this.date = str2;
        this.status = status;
        this.orderNumber = str3;
        this.currency = str4;
        this.description = str5;
        this.language = str6;
        this.organizationName = str7;
        this.organizationInn = str8;
        this.trademarks = str9;
        this.tradeName = str10;
        this.visualName = str11;
        this.visualAmount = str12;
        this.paymentInfo = invoicePaymentInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOrganizationInn() {
        return this.organizationInn;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTrademarks() {
        return this.trademarks;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTradeName() {
        return this.tradeName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVisualName() {
        return this.visualName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    /* renamed from: component15, reason: from getter */
    public final InvoicePaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final InvoiceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final Invoice copy(String id, String image, String date, InvoiceStatus status, String orderNumber, String currency, String description, String language, String organizationName, String organizationInn, String trademarks, String tradeName, String visualName, String visualAmount, InvoicePaymentInfo paymentInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Invoice(id, image, date, status, orderNumber, currency, description, language, organizationName, organizationInn, trademarks, tradeName, visualName, visualAmount, paymentInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) other;
        return Intrinsics.areEqual(this.id, invoice.id) && Intrinsics.areEqual(this.image, invoice.image) && Intrinsics.areEqual(this.date, invoice.date) && this.status == invoice.status && Intrinsics.areEqual(this.orderNumber, invoice.orderNumber) && Intrinsics.areEqual(this.currency, invoice.currency) && Intrinsics.areEqual(this.description, invoice.description) && Intrinsics.areEqual(this.language, invoice.language) && Intrinsics.areEqual(this.organizationName, invoice.organizationName) && Intrinsics.areEqual(this.organizationInn, invoice.organizationInn) && Intrinsics.areEqual(this.trademarks, invoice.trademarks) && Intrinsics.areEqual(this.tradeName, invoice.tradeName) && Intrinsics.areEqual(this.visualName, invoice.visualName) && Intrinsics.areEqual(this.visualAmount, invoice.visualAmount) && Intrinsics.areEqual(this.paymentInfo, invoice.paymentInfo);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getOrganizationInn() {
        return this.organizationInn;
    }

    public final String getOrganizationName() {
        return this.organizationName;
    }

    public final InvoicePaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final InvoiceStatus getStatus() {
        return this.status;
    }

    public final String getTradeName() {
        return this.tradeName;
    }

    public final String getTrademarks() {
        return this.trademarks;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public final String getVisualName() {
        return this.visualName;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.date;
        int iHashCode3 = (this.status.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.orderNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.language;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.organizationName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.organizationInn;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.trademarks;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tradeName;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.visualName;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.visualAmount;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        InvoicePaymentInfo invoicePaymentInfo = this.paymentInfo;
        return iHashCode13 + (invoicePaymentInfo != null ? invoicePaymentInfo.hashCode() : 0);
    }

    public String toString() {
        return "Invoice(id=" + this.id + ", image=" + this.image + ", date=" + this.date + ", status=" + this.status + ", orderNumber=" + this.orderNumber + ", currency=" + this.currency + ", description=" + this.description + ", language=" + this.language + ", organizationName=" + this.organizationName + ", organizationInn=" + this.organizationInn + ", trademarks=" + this.trademarks + ", tradeName=" + this.tradeName + ", visualName=" + this.visualName + ", visualAmount=" + this.visualAmount + ", paymentInfo=" + this.paymentInfo + ')';
    }
}
