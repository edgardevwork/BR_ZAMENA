package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceReceiptStatus;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b9\u0010:J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J|\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u000eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'¨\u0006;"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Receipt;", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceiptStatus;", "component1", "", "component2", "Ljava/util/Date;", "component3", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Integer;", "component9", "receiptStatus", "receiptId", "receiptDate", "receiptFiscalNumber", "ecrRegistrationNumber", "receiptFiscalNumberOfDocument", "receiptFiscalAttributeOfDocument", "totalSum", "receiptUrl", "copy", "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceiptStatus;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/domain/entity/Receipt;", "toString", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceiptStatus;", "getReceiptStatus", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceiptStatus;", "b", "Ljava/lang/String;", "getReceiptId", "()Ljava/lang/String;", "c", "Ljava/util/Date;", "getReceiptDate", "()Ljava/util/Date;", "d", "getReceiptFiscalNumber", "e", "getEcrRegistrationNumber", "f", "getReceiptFiscalNumberOfDocument", "g", "getReceiptFiscalAttributeOfDocument", "h", "Ljava/lang/Integer;", "getTotalSum", "i", "getReceiptUrl", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceReceiptStatus;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Receipt {

    /* renamed from: a, reason: from kotlin metadata */
    public final InvoiceReceiptStatus receiptStatus;

    /* renamed from: b, reason: from kotlin metadata */
    public final String receiptId;

    /* renamed from: c, reason: from kotlin metadata */
    public final Date receiptDate;

    /* renamed from: d, reason: from kotlin metadata */
    public final String receiptFiscalNumber;

    /* renamed from: e, reason: from kotlin metadata */
    public final String ecrRegistrationNumber;

    /* renamed from: f, reason: from kotlin metadata */
    public final String receiptFiscalNumberOfDocument;

    /* renamed from: g, reason: from kotlin metadata */
    public final String receiptFiscalAttributeOfDocument;

    /* renamed from: h, reason: from kotlin metadata */
    public final Integer totalSum;

    /* renamed from: i, reason: from kotlin metadata */
    public final String receiptUrl;

    public Receipt() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final InvoiceReceiptStatus getReceiptStatus() {
        return this.receiptStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiptId() {
        return this.receiptId;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getReceiptDate() {
        return this.receiptDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReceiptFiscalNumber() {
        return this.receiptFiscalNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEcrRegistrationNumber() {
        return this.ecrRegistrationNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReceiptFiscalNumberOfDocument() {
        return this.receiptFiscalNumberOfDocument;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReceiptFiscalAttributeOfDocument() {
        return this.receiptFiscalAttributeOfDocument;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getTotalSum() {
        return this.totalSum;
    }

    /* renamed from: component9, reason: from getter */
    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    public final Receipt copy(InvoiceReceiptStatus receiptStatus, String receiptId, Date receiptDate, String receiptFiscalNumber, String ecrRegistrationNumber, String receiptFiscalNumberOfDocument, String receiptFiscalAttributeOfDocument, Integer totalSum, String receiptUrl) {
        return new Receipt(receiptStatus, receiptId, receiptDate, receiptFiscalNumber, ecrRegistrationNumber, receiptFiscalNumberOfDocument, receiptFiscalAttributeOfDocument, totalSum, receiptUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) other;
        return this.receiptStatus == receipt.receiptStatus && Intrinsics.areEqual(this.receiptId, receipt.receiptId) && Intrinsics.areEqual(this.receiptDate, receipt.receiptDate) && Intrinsics.areEqual(this.receiptFiscalNumber, receipt.receiptFiscalNumber) && Intrinsics.areEqual(this.ecrRegistrationNumber, receipt.ecrRegistrationNumber) && Intrinsics.areEqual(this.receiptFiscalNumberOfDocument, receipt.receiptFiscalNumberOfDocument) && Intrinsics.areEqual(this.receiptFiscalAttributeOfDocument, receipt.receiptFiscalAttributeOfDocument) && Intrinsics.areEqual(this.totalSum, receipt.totalSum) && Intrinsics.areEqual(this.receiptUrl, receipt.receiptUrl);
    }

    public final String getEcrRegistrationNumber() {
        return this.ecrRegistrationNumber;
    }

    public final Date getReceiptDate() {
        return this.receiptDate;
    }

    public final String getReceiptFiscalAttributeOfDocument() {
        return this.receiptFiscalAttributeOfDocument;
    }

    public final String getReceiptFiscalNumber() {
        return this.receiptFiscalNumber;
    }

    public final String getReceiptFiscalNumberOfDocument() {
        return this.receiptFiscalNumberOfDocument;
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public final InvoiceReceiptStatus getReceiptStatus() {
        return this.receiptStatus;
    }

    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    public final Integer getTotalSum() {
        return this.totalSum;
    }

    public int hashCode() {
        InvoiceReceiptStatus invoiceReceiptStatus = this.receiptStatus;
        int iHashCode = (invoiceReceiptStatus == null ? 0 : invoiceReceiptStatus.hashCode()) * 31;
        String str = this.receiptId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.receiptDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.receiptFiscalNumber;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ecrRegistrationNumber;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiptFiscalNumberOfDocument;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.receiptFiscalAttributeOfDocument;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.totalSum;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.receiptUrl;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Receipt(receiptStatus=");
        sb.append(this.receiptStatus);
        sb.append(", receiptId=");
        sb.append(this.receiptId);
        sb.append(", receiptDate=");
        sb.append(this.receiptDate);
        sb.append(", receiptFiscalNumber=");
        sb.append(this.receiptFiscalNumber);
        sb.append(", ecrRegistrationNumber=");
        sb.append(this.ecrRegistrationNumber);
        sb.append(", receiptFiscalNumberOfDocument=");
        sb.append(this.receiptFiscalNumberOfDocument);
        sb.append(", receiptFiscalAttributeOfDocument=");
        sb.append(this.receiptFiscalAttributeOfDocument);
        sb.append(", totalSum=");
        sb.append(this.totalSum);
        sb.append(", receiptUrl=");
        return C8032c.m1430a(sb, this.receiptUrl, ')');
    }

    public Receipt(InvoiceReceiptStatus invoiceReceiptStatus, String str, Date date, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.receiptStatus = invoiceReceiptStatus;
        this.receiptId = str;
        this.receiptDate = date;
        this.receiptFiscalNumber = str2;
        this.ecrRegistrationNumber = str3;
        this.receiptFiscalNumberOfDocument = str4;
        this.receiptFiscalAttributeOfDocument = str5;
        this.totalSum = num;
        this.receiptUrl = str6;
    }

    public /* synthetic */ Receipt(InvoiceReceiptStatus invoiceReceiptStatus, String str, Date date, String str2, String str3, String str4, String str5, Integer num, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : invoiceReceiptStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) == 0 ? str6 : null);
    }
}
