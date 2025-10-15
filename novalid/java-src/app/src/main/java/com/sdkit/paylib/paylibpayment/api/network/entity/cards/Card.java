package com.sdkit.paylib.paylibpayment.api.network.entity.cards;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bN\u0010OJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J»\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010$\u001a\u00020\u0002HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u00109R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006P"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "", "", "component1", "component2", "component3", "component4", "component5", "Landroid/net/Uri;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/BankInfo;", "component15", "cardId", "name", "maskedNumber", "expirationDate", "cardholder", "imageUrl", "paymentSystem", "paymentSystemImageUrl", "paymentOperator", "paymentOperatorCode", "paymentOperatorImageUrl", "paymentWay", "paymentWayCode", "paymentWayImageUrl", "bankInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", "b", "getName", "c", "getMaskedNumber", "d", "getExpirationDate", "e", "getCardholder", "f", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "g", "getPaymentSystem", "h", "getPaymentSystemImageUrl", "i", "getPaymentOperator", "j", "getPaymentOperatorCode", "k", "getPaymentOperatorImageUrl", "l", "getPaymentWay", "m", "getPaymentWayCode", "n", "getPaymentWayImageUrl", "o", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/BankInfo;", "getBankInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/BankInfo;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/BankInfo;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Card {

    /* renamed from: a, reason: from kotlin metadata */
    public final String cardId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: from kotlin metadata */
    public final String maskedNumber;

    /* renamed from: d, reason: from kotlin metadata */
    public final String expirationDate;

    /* renamed from: e, reason: from kotlin metadata */
    public final String cardholder;

    /* renamed from: f, reason: from kotlin metadata */
    public final Uri imageUrl;

    /* renamed from: g, reason: from kotlin metadata */
    public final String paymentSystem;

    /* renamed from: h, reason: from kotlin metadata */
    public final Uri paymentSystemImageUrl;

    /* renamed from: i, reason: from kotlin metadata */
    public final String paymentOperator;

    /* renamed from: j, reason: from kotlin metadata */
    public final String paymentOperatorCode;

    /* renamed from: k, reason: from kotlin metadata */
    public final String paymentOperatorImageUrl;

    /* renamed from: l, reason: from kotlin metadata */
    public final String paymentWay;

    /* renamed from: m, reason: from kotlin metadata */
    public final String paymentWayCode;

    /* renamed from: n, reason: from kotlin metadata */
    public final Uri paymentWayImageUrl;

    /* renamed from: o, reason: from kotlin metadata */
    public final BankInfo bankInfo;

    public Card(String cardId, String str, String str2, String str3, String str4, Uri uri, String str5, Uri uri2, String str6, String str7, String str8, String str9, String str10, Uri uri3, BankInfo bankInfo) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.cardId = cardId;
        this.name = str;
        this.maskedNumber = str2;
        this.expirationDate = str3;
        this.cardholder = str4;
        this.imageUrl = uri;
        this.paymentSystem = str5;
        this.paymentSystemImageUrl = uri2;
        this.paymentOperator = str6;
        this.paymentOperatorCode = str7;
        this.paymentOperatorImageUrl = str8;
        this.paymentWay = str9;
        this.paymentWayCode = str10;
        this.paymentWayImageUrl = uri3;
        this.bankInfo = bankInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPaymentOperatorCode() {
        return this.paymentOperatorCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPaymentOperatorImageUrl() {
        return this.paymentOperatorImageUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPaymentWay() {
        return this.paymentWay;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPaymentWayCode() {
        return this.paymentWayCode;
    }

    /* renamed from: component14, reason: from getter */
    public final Uri getPaymentWayImageUrl() {
        return this.paymentWayImageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final BankInfo getBankInfo() {
        return this.bankInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMaskedNumber() {
        return this.maskedNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCardholder() {
        return this.cardholder;
    }

    /* renamed from: component6, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    /* renamed from: component8, reason: from getter */
    public final Uri getPaymentSystemImageUrl() {
        return this.paymentSystemImageUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaymentOperator() {
        return this.paymentOperator;
    }

    public final Card copy(String cardId, String name, String maskedNumber, String expirationDate, String cardholder, Uri imageUrl, String paymentSystem, Uri paymentSystemImageUrl, String paymentOperator, String paymentOperatorCode, String paymentOperatorImageUrl, String paymentWay, String paymentWayCode, Uri paymentWayImageUrl, BankInfo bankInfo) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return new Card(cardId, name, maskedNumber, expirationDate, cardholder, imageUrl, paymentSystem, paymentSystemImageUrl, paymentOperator, paymentOperatorCode, paymentOperatorImageUrl, paymentWay, paymentWayCode, paymentWayImageUrl, bankInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(this.cardId, card.cardId) && Intrinsics.areEqual(this.name, card.name) && Intrinsics.areEqual(this.maskedNumber, card.maskedNumber) && Intrinsics.areEqual(this.expirationDate, card.expirationDate) && Intrinsics.areEqual(this.cardholder, card.cardholder) && Intrinsics.areEqual(this.imageUrl, card.imageUrl) && Intrinsics.areEqual(this.paymentSystem, card.paymentSystem) && Intrinsics.areEqual(this.paymentSystemImageUrl, card.paymentSystemImageUrl) && Intrinsics.areEqual(this.paymentOperator, card.paymentOperator) && Intrinsics.areEqual(this.paymentOperatorCode, card.paymentOperatorCode) && Intrinsics.areEqual(this.paymentOperatorImageUrl, card.paymentOperatorImageUrl) && Intrinsics.areEqual(this.paymentWay, card.paymentWay) && Intrinsics.areEqual(this.paymentWayCode, card.paymentWayCode) && Intrinsics.areEqual(this.paymentWayImageUrl, card.paymentWayImageUrl) && Intrinsics.areEqual(this.bankInfo, card.bankInfo);
    }

    public final BankInfo getBankInfo() {
        return this.bankInfo;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCardholder() {
        return this.cardholder;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final Uri getImageUrl() {
        return this.imageUrl;
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

    public final String getPaymentOperatorImageUrl() {
        return this.paymentOperatorImageUrl;
    }

    public final String getPaymentSystem() {
        return this.paymentSystem;
    }

    public final Uri getPaymentSystemImageUrl() {
        return this.paymentSystemImageUrl;
    }

    public final String getPaymentWay() {
        return this.paymentWay;
    }

    public final String getPaymentWayCode() {
        return this.paymentWayCode;
    }

    public final Uri getPaymentWayImageUrl() {
        return this.paymentWayImageUrl;
    }

    public int hashCode() {
        int iHashCode = this.cardId.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maskedNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardholder;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.imageUrl;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.paymentSystem;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Uri uri2 = this.paymentSystemImageUrl;
        int iHashCode8 = (iHashCode7 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str6 = this.paymentOperator;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentOperatorCode;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paymentOperatorImageUrl;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentWay;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentWayCode;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Uri uri3 = this.paymentWayImageUrl;
        int iHashCode14 = (iHashCode13 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        BankInfo bankInfo = this.bankInfo;
        return iHashCode14 + (bankInfo != null ? bankInfo.hashCode() : 0);
    }

    public String toString() {
        return "Card(cardId=" + this.cardId + ", name=" + this.name + ", maskedNumber=" + this.maskedNumber + ", expirationDate=" + this.expirationDate + ", cardholder=" + this.cardholder + ", imageUrl=" + this.imageUrl + ", paymentSystem=" + this.paymentSystem + ", paymentSystemImageUrl=" + this.paymentSystemImageUrl + ", paymentOperator=" + this.paymentOperator + ", paymentOperatorCode=" + this.paymentOperatorCode + ", paymentOperatorImageUrl=" + this.paymentOperatorImageUrl + ", paymentWay=" + this.paymentWay + ", paymentWayCode=" + this.paymentWayCode + ", paymentWayImageUrl=" + this.paymentWayImageUrl + ", bankInfo=" + this.bankInfo + ')';
    }

    public /* synthetic */ Card(String str, String str2, String str3, String str4, String str5, Uri uri, String str6, Uri uri2, String str7, String str8, String str9, String str10, String str11, Uri uri3, BankInfo bankInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : uri, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : uri2, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : uri3, (i & 16384) == 0 ? bankInfo : null);
    }
}
