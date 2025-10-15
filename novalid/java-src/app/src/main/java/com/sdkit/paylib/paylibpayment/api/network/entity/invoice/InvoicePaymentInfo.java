package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogKeys;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010\u0018\u0012\b\u00102\u001a\u0004\u0018\u00010\u001a\u0012\b\u00103\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bs\u0010tJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0091\u0002\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\t\u00105\u001a\u00020\u0004HÖ\u0001J\t\u00107\u001a\u000206HÖ\u0001J\u0013\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010BR\u0019\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010BR\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010BR\u0019\u0010'\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010BR\u0019\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010BR\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bV\u0010BR\u0019\u0010*\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010BR\u0019\u0010+\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010BR\u0019\u0010,\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b[\u0010@\u001a\u0004\b\\\u0010BR\u0019\u0010-\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010.\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\ba\u0010@\u001a\u0004\bb\u0010BR\u0019\u0010/\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bc\u0010@\u001a\u0004\bd\u0010BR\u0019\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\be\u0010@\u001a\u0004\bf\u0010BR\u0019\u00101\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u00102\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0019\u00103\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006u"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentInfo;", "", "Ljava/util/Date;", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentParams;", "component16", "component17", "component18", "component19", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", "component20", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeviceInfo;", "component21", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceAppliedLoyalty;", "component22", "paymentDate", "paymentId", "partnerClientId", "cardId", "cardName", "paymentStatus", "maskedPan", "expirationDate", "cardholderName", "cardImage", "paymentSystem", "paymentSystemImage", "paymentOperator", "paymentOperatorCode", "paymentOperatorImage", "paymentParams", "paymentWay", "paymentWayCode", "paymentWayLogo", "bankInfo", "deviceInfo", "loyaltyInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getPaymentDate", "()Ljava/util/Date;", "b", "Ljava/lang/String;", "getPaymentId", "()Ljava/lang/String;", "c", "getPartnerClientId", "d", "getCardId", "e", "getCardName", "f", "getPaymentStatus", "g", "getMaskedPan", "h", "getExpirationDate", "i", "getCardholderName", "j", "getCardImage", "k", "getPaymentSystem", "l", "getPaymentSystemImage", "m", "getPaymentOperator", "n", "getPaymentOperatorCode", "o", "getPaymentOperatorImage", "p", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentParams;", "getPaymentParams", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentParams;", ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY, "getPaymentWay", "r", "getPaymentWayCode", "s", "getPaymentWayLogo", "t", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", "getBankInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", "u", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeviceInfo;", "getDeviceInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeviceInfo;", "v", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceAppliedLoyalty;", "getLoyaltyInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceAppliedLoyalty;", SegmentConstantPool.INITSTRING, "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoicePaymentParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeviceInfo;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceAppliedLoyalty;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoicePaymentInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final Date paymentDate;

    /* renamed from: b, reason: from kotlin metadata */
    public final String paymentId;

    /* renamed from: c, reason: from kotlin metadata */
    public final String partnerClientId;

    /* renamed from: d, reason: from kotlin metadata */
    public final String cardId;

    /* renamed from: e, reason: from kotlin metadata */
    public final String cardName;

    /* renamed from: f, reason: from kotlin metadata */
    public final String paymentStatus;

    /* renamed from: g, reason: from kotlin metadata */
    public final String maskedPan;

    /* renamed from: h, reason: from kotlin metadata */
    public final String expirationDate;

    /* renamed from: i, reason: from kotlin metadata */
    public final String cardholderName;

    /* renamed from: j, reason: from kotlin metadata */
    public final String cardImage;

    /* renamed from: k, reason: from kotlin metadata */
    public final String paymentSystem;

    /* renamed from: l, reason: from kotlin metadata */
    public final String paymentSystemImage;

    /* renamed from: m, reason: from kotlin metadata */
    public final String paymentOperator;

    /* renamed from: n, reason: from kotlin metadata */
    public final String paymentOperatorCode;

    /* renamed from: o, reason: from kotlin metadata */
    public final String paymentOperatorImage;

    /* renamed from: p, reason: from kotlin metadata */
    public final InvoicePaymentParams paymentParams;

    /* renamed from: q, reason: from kotlin metadata */
    public final String paymentWay;

    /* renamed from: r, reason: from kotlin metadata */
    public final String paymentWayCode;

    /* renamed from: s, reason: from kotlin metadata */
    public final String paymentWayLogo;

    /* renamed from: t, reason: from kotlin metadata */
    public final InvoiceBankInfo bankInfo;

    /* renamed from: u, reason: from kotlin metadata */
    public final InvoiceDeviceInfo deviceInfo;

    /* renamed from: v, reason: from kotlin metadata */
    public final InvoiceAppliedLoyalty loyaltyInfo;

    public InvoicePaymentInfo(Date date, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, InvoicePaymentParams invoicePaymentParams, String str15, String str16, String str17, InvoiceBankInfo invoiceBankInfo, InvoiceDeviceInfo invoiceDeviceInfo, InvoiceAppliedLoyalty invoiceAppliedLoyalty) {
        this.paymentDate = date;
        this.paymentId = str;
        this.partnerClientId = str2;
        this.cardId = str3;
        this.cardName = str4;
        this.paymentStatus = str5;
        this.maskedPan = str6;
        this.expirationDate = str7;
        this.cardholderName = str8;
        this.cardImage = str9;
        this.paymentSystem = str10;
        this.paymentSystemImage = str11;
        this.paymentOperator = str12;
        this.paymentOperatorCode = str13;
        this.paymentOperatorImage = str14;
        this.paymentParams = invoicePaymentParams;
        this.paymentWay = str15;
        this.paymentWayCode = str16;
        this.paymentWayLogo = str17;
        this.bankInfo = invoiceBankInfo;
        this.deviceInfo = invoiceDeviceInfo;
        this.loyaltyInfo = invoiceAppliedLoyalty;
    }

    /* renamed from: component1, reason: from getter */
    public final Date getPaymentDate() {
        return this.paymentDate;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCardImage() {
        return this.cardImage;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPaymentOperator() {
        return this.paymentOperator;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPaymentOperatorCode() {
        return this.paymentOperatorCode;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPaymentOperatorImage() {
        return this.paymentOperatorImage;
    }

    /* renamed from: component16, reason: from getter */
    public final InvoicePaymentParams getPaymentParams() {
        return this.paymentParams;
    }

    /* renamed from: component17, reason: from getter */
    public final String getPaymentWay() {
        return this.paymentWay;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPaymentWayCode() {
        return this.paymentWayCode;
    }

    /* renamed from: component19, reason: from getter */
    public final String getPaymentWayLogo() {
        return this.paymentWayLogo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component20, reason: from getter */
    public final InvoiceBankInfo getBankInfo() {
        return this.bankInfo;
    }

    /* renamed from: component21, reason: from getter */
    public final InvoiceDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component22, reason: from getter */
    public final InvoiceAppliedLoyalty getLoyaltyInfo() {
        return this.loyaltyInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPartnerClientId() {
        return this.partnerClientId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    /* renamed from: component8, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCardholderName() {
        return this.cardholderName;
    }

    public final InvoicePaymentInfo copy(Date paymentDate, String paymentId, String partnerClientId, String cardId, String cardName, String paymentStatus, String maskedPan, String expirationDate, String cardholderName, String cardImage, String paymentSystem, String paymentSystemImage, String paymentOperator, String paymentOperatorCode, String paymentOperatorImage, InvoicePaymentParams paymentParams, String paymentWay, String paymentWayCode, String paymentWayLogo, InvoiceBankInfo bankInfo, InvoiceDeviceInfo deviceInfo, InvoiceAppliedLoyalty loyaltyInfo) {
        return new InvoicePaymentInfo(paymentDate, paymentId, partnerClientId, cardId, cardName, paymentStatus, maskedPan, expirationDate, cardholderName, cardImage, paymentSystem, paymentSystemImage, paymentOperator, paymentOperatorCode, paymentOperatorImage, paymentParams, paymentWay, paymentWayCode, paymentWayLogo, bankInfo, deviceInfo, loyaltyInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoicePaymentInfo)) {
            return false;
        }
        InvoicePaymentInfo invoicePaymentInfo = (InvoicePaymentInfo) other;
        return Intrinsics.areEqual(this.paymentDate, invoicePaymentInfo.paymentDate) && Intrinsics.areEqual(this.paymentId, invoicePaymentInfo.paymentId) && Intrinsics.areEqual(this.partnerClientId, invoicePaymentInfo.partnerClientId) && Intrinsics.areEqual(this.cardId, invoicePaymentInfo.cardId) && Intrinsics.areEqual(this.cardName, invoicePaymentInfo.cardName) && Intrinsics.areEqual(this.paymentStatus, invoicePaymentInfo.paymentStatus) && Intrinsics.areEqual(this.maskedPan, invoicePaymentInfo.maskedPan) && Intrinsics.areEqual(this.expirationDate, invoicePaymentInfo.expirationDate) && Intrinsics.areEqual(this.cardholderName, invoicePaymentInfo.cardholderName) && Intrinsics.areEqual(this.cardImage, invoicePaymentInfo.cardImage) && Intrinsics.areEqual(this.paymentSystem, invoicePaymentInfo.paymentSystem) && Intrinsics.areEqual(this.paymentSystemImage, invoicePaymentInfo.paymentSystemImage) && Intrinsics.areEqual(this.paymentOperator, invoicePaymentInfo.paymentOperator) && Intrinsics.areEqual(this.paymentOperatorCode, invoicePaymentInfo.paymentOperatorCode) && Intrinsics.areEqual(this.paymentOperatorImage, invoicePaymentInfo.paymentOperatorImage) && Intrinsics.areEqual(this.paymentParams, invoicePaymentInfo.paymentParams) && Intrinsics.areEqual(this.paymentWay, invoicePaymentInfo.paymentWay) && Intrinsics.areEqual(this.paymentWayCode, invoicePaymentInfo.paymentWayCode) && Intrinsics.areEqual(this.paymentWayLogo, invoicePaymentInfo.paymentWayLogo) && Intrinsics.areEqual(this.bankInfo, invoicePaymentInfo.bankInfo) && Intrinsics.areEqual(this.deviceInfo, invoicePaymentInfo.deviceInfo) && Intrinsics.areEqual(this.loyaltyInfo, invoicePaymentInfo.loyaltyInfo);
    }

    public final InvoiceBankInfo getBankInfo() {
        return this.bankInfo;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCardImage() {
        return this.cardImage;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardholderName() {
        return this.cardholderName;
    }

    public final InvoiceDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final InvoiceAppliedLoyalty getLoyaltyInfo() {
        return this.loyaltyInfo;
    }

    public final String getMaskedPan() {
        return this.maskedPan;
    }

    public final String getPartnerClientId() {
        return this.partnerClientId;
    }

    public final Date getPaymentDate() {
        return this.paymentDate;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentOperator() {
        return this.paymentOperator;
    }

    public final String getPaymentOperatorCode() {
        return this.paymentOperatorCode;
    }

    public final String getPaymentOperatorImage() {
        return this.paymentOperatorImage;
    }

    public final InvoicePaymentParams getPaymentParams() {
        return this.paymentParams;
    }

    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    public final String getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getPaymentWay() {
        return this.paymentWay;
    }

    public final String getPaymentWayCode() {
        return this.paymentWayCode;
    }

    public final String getPaymentWayLogo() {
        return this.paymentWayLogo;
    }

    public int hashCode() {
        Date date = this.paymentDate;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        String str = this.paymentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.partnerClientId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentStatus;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maskedPan;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.expirationDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardholderName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardImage;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentSystem;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentSystemImage;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentOperator;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.paymentOperatorCode;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.paymentOperatorImage;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        InvoicePaymentParams invoicePaymentParams = this.paymentParams;
        int iHashCode16 = (iHashCode15 + (invoicePaymentParams == null ? 0 : invoicePaymentParams.hashCode())) * 31;
        String str15 = this.paymentWay;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.paymentWayCode;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.paymentWayLogo;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        InvoiceBankInfo invoiceBankInfo = this.bankInfo;
        int iHashCode20 = (iHashCode19 + (invoiceBankInfo == null ? 0 : invoiceBankInfo.hashCode())) * 31;
        InvoiceDeviceInfo invoiceDeviceInfo = this.deviceInfo;
        int iHashCode21 = (iHashCode20 + (invoiceDeviceInfo == null ? 0 : invoiceDeviceInfo.hashCode())) * 31;
        InvoiceAppliedLoyalty invoiceAppliedLoyalty = this.loyaltyInfo;
        return iHashCode21 + (invoiceAppliedLoyalty != null ? invoiceAppliedLoyalty.hashCode() : 0);
    }

    public String toString() {
        return "InvoicePaymentInfo(paymentDate=" + this.paymentDate + ", paymentId=" + this.paymentId + ", partnerClientId=" + this.partnerClientId + ", cardId=" + this.cardId + ", cardName=" + this.cardName + ", paymentStatus=" + this.paymentStatus + ", maskedPan=" + this.maskedPan + ", expirationDate=" + this.expirationDate + ", cardholderName=" + this.cardholderName + ", cardImage=" + this.cardImage + ", paymentSystem=" + this.paymentSystem + ", paymentSystemImage=" + this.paymentSystemImage + ", paymentOperator=" + this.paymentOperator + ", paymentOperatorCode=" + this.paymentOperatorCode + ", paymentOperatorImage=" + this.paymentOperatorImage + ", paymentParams=" + this.paymentParams + ", paymentWay=" + this.paymentWay + ", paymentWayCode=" + this.paymentWayCode + ", paymentWayLogo=" + this.paymentWayLogo + ", bankInfo=" + this.bankInfo + ", deviceInfo=" + this.deviceInfo + ", loyaltyInfo=" + this.loyaltyInfo + ')';
    }
}
