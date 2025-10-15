package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010*\u001a\u00020\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\ba\u0010bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003JÝ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010*\u001a\u00020\u00162\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\t\u0010.\u001a\u00020\u0002HÖ\u0001J\u0013\u00100\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u00108R\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u00108R\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u00108R\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u0019\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u00108R\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u00108R\u0019\u0010'\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u00106\u001a\u0004\bT\u00108R\u0019\u0010)\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010*\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010+\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006c"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCard;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCardPaymentWay;", "component14", "component15", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", "component16", "", "component17", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;", "component18", "id", "name", "status", "maskedNumber", "expiryDate", "cardholder", "paymentSystem", "paymentSystemImage", "paymentOperator", "paymentOperatorCode", "paymentOperatorImage", "paymentWayName", "paymentWayLogo", "paymentWay", "image", "bankInfo", "loyaltyAvailability", "loyalty", "copy", "toString", "hashCode", "other", "equals", "a", "I", "getId", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getStatus", "d", "getMaskedNumber", "e", "getExpiryDate", "f", "getCardholder", "g", "getPaymentSystem", "h", "getPaymentSystemImage", "i", "getPaymentOperator", "j", "getPaymentOperatorCode", "k", "getPaymentOperatorImage", "l", "getPaymentWayName", "m", "getPaymentWayLogo", "n", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCardPaymentWay;", "getPaymentWay", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCardPaymentWay;", "o", "getImage", "p", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", "getBankInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;", ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY, "Z", "getLoyaltyAvailability", "()Z", "r", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;", "getLoyalty", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;", SegmentConstantPool.INITSTRING, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceCardPaymentWay;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceBankInfo;ZLcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceLoyalty;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceCard {

    /* renamed from: a, reason: from kotlin metadata */
    public final int id;

    /* renamed from: b, reason: from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: from kotlin metadata */
    public final String status;

    /* renamed from: d, reason: from kotlin metadata */
    public final String maskedNumber;

    /* renamed from: e, reason: from kotlin metadata */
    public final String expiryDate;

    /* renamed from: f, reason: from kotlin metadata */
    public final String cardholder;

    /* renamed from: g, reason: from kotlin metadata */
    public final String paymentSystem;

    /* renamed from: h, reason: from kotlin metadata */
    public final String paymentSystemImage;

    /* renamed from: i, reason: from kotlin metadata */
    public final String paymentOperator;

    /* renamed from: j, reason: from kotlin metadata */
    public final String paymentOperatorCode;

    /* renamed from: k, reason: from kotlin metadata */
    public final String paymentOperatorImage;

    /* renamed from: l, reason: from kotlin metadata */
    public final String paymentWayName;

    /* renamed from: m, reason: from kotlin metadata */
    public final String paymentWayLogo;

    /* renamed from: n, reason: from kotlin metadata */
    public final InvoiceCardPaymentWay paymentWay;

    /* renamed from: o, reason: from kotlin metadata */
    public final String image;

    /* renamed from: p, reason: from kotlin metadata */
    public final InvoiceBankInfo bankInfo;

    /* renamed from: q, reason: from kotlin metadata */
    public final boolean loyaltyAvailability;

    /* renamed from: r, reason: from kotlin metadata */
    public final InvoiceLoyalty loyalty;

    public InvoiceCard(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InvoiceCardPaymentWay invoiceCardPaymentWay, String str13, InvoiceBankInfo invoiceBankInfo, boolean z, InvoiceLoyalty invoiceLoyalty) {
        this.id = i;
        this.name = str;
        this.status = str2;
        this.maskedNumber = str3;
        this.expiryDate = str4;
        this.cardholder = str5;
        this.paymentSystem = str6;
        this.paymentSystemImage = str7;
        this.paymentOperator = str8;
        this.paymentOperatorCode = str9;
        this.paymentOperatorImage = str10;
        this.paymentWayName = str11;
        this.paymentWayLogo = str12;
        this.paymentWay = invoiceCardPaymentWay;
        this.image = str13;
        this.bankInfo = invoiceBankInfo;
        this.loyaltyAvailability = z;
        this.loyalty = invoiceLoyalty;
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPaymentOperatorCode() {
        return this.paymentOperatorCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPaymentOperatorImage() {
        return this.paymentOperatorImage;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPaymentWayName() {
        return this.paymentWayName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPaymentWayLogo() {
        return this.paymentWayLogo;
    }

    /* renamed from: component14, reason: from getter */
    public final InvoiceCardPaymentWay getPaymentWay() {
        return this.paymentWay;
    }

    /* renamed from: component15, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component16, reason: from getter */
    public final InvoiceBankInfo getBankInfo() {
        return this.bankInfo;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getLoyaltyAvailability() {
        return this.loyaltyAvailability;
    }

    /* renamed from: component18, reason: from getter */
    public final InvoiceLoyalty getLoyalty() {
        return this.loyalty;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMaskedNumber() {
        return this.maskedNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCardholder() {
        return this.cardholder;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaymentOperator() {
        return this.paymentOperator;
    }

    public final InvoiceCard copy(int id, String name, String status, String maskedNumber, String expiryDate, String cardholder, String paymentSystem, String paymentSystemImage, String paymentOperator, String paymentOperatorCode, String paymentOperatorImage, String paymentWayName, String paymentWayLogo, InvoiceCardPaymentWay paymentWay, String image, InvoiceBankInfo bankInfo, boolean loyaltyAvailability, InvoiceLoyalty loyalty) {
        return new InvoiceCard(id, name, status, maskedNumber, expiryDate, cardholder, paymentSystem, paymentSystemImage, paymentOperator, paymentOperatorCode, paymentOperatorImage, paymentWayName, paymentWayLogo, paymentWay, image, bankInfo, loyaltyAvailability, loyalty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceCard)) {
            return false;
        }
        InvoiceCard invoiceCard = (InvoiceCard) other;
        return this.id == invoiceCard.id && Intrinsics.areEqual(this.name, invoiceCard.name) && Intrinsics.areEqual(this.status, invoiceCard.status) && Intrinsics.areEqual(this.maskedNumber, invoiceCard.maskedNumber) && Intrinsics.areEqual(this.expiryDate, invoiceCard.expiryDate) && Intrinsics.areEqual(this.cardholder, invoiceCard.cardholder) && Intrinsics.areEqual(this.paymentSystem, invoiceCard.paymentSystem) && Intrinsics.areEqual(this.paymentSystemImage, invoiceCard.paymentSystemImage) && Intrinsics.areEqual(this.paymentOperator, invoiceCard.paymentOperator) && Intrinsics.areEqual(this.paymentOperatorCode, invoiceCard.paymentOperatorCode) && Intrinsics.areEqual(this.paymentOperatorImage, invoiceCard.paymentOperatorImage) && Intrinsics.areEqual(this.paymentWayName, invoiceCard.paymentWayName) && Intrinsics.areEqual(this.paymentWayLogo, invoiceCard.paymentWayLogo) && this.paymentWay == invoiceCard.paymentWay && Intrinsics.areEqual(this.image, invoiceCard.image) && Intrinsics.areEqual(this.bankInfo, invoiceCard.bankInfo) && this.loyaltyAvailability == invoiceCard.loyaltyAvailability && Intrinsics.areEqual(this.loyalty, invoiceCard.loyalty);
    }

    public final InvoiceBankInfo getBankInfo() {
        return this.bankInfo;
    }

    public final String getCardholder() {
        return this.cardholder;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final InvoiceLoyalty getLoyalty() {
        return this.loyalty;
    }

    public final boolean getLoyaltyAvailability() {
        return this.loyaltyAvailability;
    }

    public final String getMaskedNumber() {
        return this.maskedNumber;
    }

    public final String getName() {
        return this.name;
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

    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    public final String getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final InvoiceCardPaymentWay getPaymentWay() {
        return this.paymentWay;
    }

    public final String getPaymentWayLogo() {
        return this.paymentWayLogo;
    }

    public final String getPaymentWayName() {
        return this.paymentWayName;
    }

    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maskedNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardholder;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentSystem;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentSystemImage;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paymentOperator;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentOperatorCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentOperatorImage;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentWayName;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentWayLogo;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        InvoiceCardPaymentWay invoiceCardPaymentWay = this.paymentWay;
        int iHashCode14 = (iHashCode13 + (invoiceCardPaymentWay == null ? 0 : invoiceCardPaymentWay.hashCode())) * 31;
        String str13 = this.image;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        InvoiceBankInfo invoiceBankInfo = this.bankInfo;
        int iHashCode16 = (iHashCode15 + (invoiceBankInfo == null ? 0 : invoiceBankInfo.hashCode())) * 31;
        boolean z = this.loyaltyAvailability;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode16 + i) * 31;
        InvoiceLoyalty invoiceLoyalty = this.loyalty;
        return i2 + (invoiceLoyalty != null ? invoiceLoyalty.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceCard(id=" + this.id + ", name=" + this.name + ", status=" + this.status + ", maskedNumber=" + this.maskedNumber + ", expiryDate=" + this.expiryDate + ", cardholder=" + this.cardholder + ", paymentSystem=" + this.paymentSystem + ", paymentSystemImage=" + this.paymentSystemImage + ", paymentOperator=" + this.paymentOperator + ", paymentOperatorCode=" + this.paymentOperatorCode + ", paymentOperatorImage=" + this.paymentOperatorImage + ", paymentWayName=" + this.paymentWayName + ", paymentWayLogo=" + this.paymentWayLogo + ", paymentWay=" + this.paymentWay + ", image=" + this.image + ", bankInfo=" + this.bankInfo + ", loyaltyAvailability=" + this.loyaltyAvailability + ", loyalty=" + this.loyalty + ')';
    }

    public /* synthetic */ InvoiceCard(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InvoiceCardPaymentWay invoiceCardPaymentWay, String str13, InvoiceBankInfo invoiceBankInfo, boolean z, InvoiceLoyalty invoiceLoyalty, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, str7, str8, str9, str10, str11, str12, (i2 & 8192) != 0 ? null : invoiceCardPaymentWay, (i2 & 16384) != 0 ? null : str13, (i2 & 32768) != 0 ? null : invoiceBankInfo, z, invoiceLoyalty);
    }
}
