package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b^\u0010_J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003JÒ\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\t\u0010.\u001a\u00020\u0002HÖ\u0001J\u0013\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\fR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u00109R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010\fR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u00109R\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u00109R\u0019\u0010$\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u0013R\u0019\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u00109R\u0019\u0010&\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010\u0013R\u0019\u0010'\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010\fR\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bZ\u00107\u001a\u0004\b[\u00109R\u0019\u0010*\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\b]\u00109¨\u0006`"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderBundleItem;", "", "", "component1", "", "component2", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceParam;", "component3", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "", "component10", "()Ljava/lang/Double;", "component11", "component12", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxType;", "component13", "component14", "component15", "component16", "positionId", "name", "params", FirebaseAnalytics.Param.QUANTITY, "itemAmount", "itemCode", "itemPrice", FirebaseAnalytics.Param.CURRENCY, "discountType", "discountValue", "interestType", "interestValue", "taxType", "taxSum", "itemCodeSmartPay", "image", "copy", "(ILjava/lang/String;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderBundleItem;", "toString", "hashCode", "other", "", "equals", "a", "I", "getPositionId", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "d", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;", "getQuantity", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;", "e", "Ljava/lang/Integer;", "getItemAmount", "f", "getItemCode", "g", "getItemPrice", "h", "getCurrency", "i", "getDiscountType", "j", "Ljava/lang/Double;", "getDiscountValue", "k", "getInterestType", "l", "getInterestValue", "m", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxType;", "getTaxType", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxType;", "n", "getTaxSum", "o", "getItemCodeSmartPay", "p", "getImage", SegmentConstantPool.INITSTRING, "(ILjava/lang/String;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderQuantity;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceOrderBundleItem {

    /* renamed from: a, reason: from kotlin metadata */
    public final int positionId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: from kotlin metadata */
    public final List params;

    /* renamed from: d, reason: from kotlin metadata */
    public final InvoiceOrderQuantity quantity;

    /* renamed from: e, reason: from kotlin metadata */
    public final Integer itemAmount;

    /* renamed from: f, reason: from kotlin metadata */
    public final String itemCode;

    /* renamed from: g, reason: from kotlin metadata */
    public final Integer itemPrice;

    /* renamed from: h, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: i, reason: from kotlin metadata */
    public final String discountType;

    /* renamed from: j, reason: from kotlin metadata */
    public final Double discountValue;

    /* renamed from: k, reason: from kotlin metadata */
    public final String interestType;

    /* renamed from: l, reason: from kotlin metadata */
    public final Double interestValue;

    /* renamed from: m, reason: from kotlin metadata */
    public final InvoiceOrderTaxType taxType;

    /* renamed from: n, reason: from kotlin metadata */
    public final Integer taxSum;

    /* renamed from: o, reason: from kotlin metadata */
    public final String itemCodeSmartPay;

    /* renamed from: p, reason: from kotlin metadata */
    public final String image;

    public InvoiceOrderBundleItem(int i, String name, List<InvoiceParam> list, InvoiceOrderQuantity invoiceOrderQuantity, Integer num, String str, Integer num2, String str2, String str3, Double d, String str4, Double d2, InvoiceOrderTaxType invoiceOrderTaxType, Integer num3, String str5, String str6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.positionId = i;
        this.name = name;
        this.params = list;
        this.quantity = invoiceOrderQuantity;
        this.itemAmount = num;
        this.itemCode = str;
        this.itemPrice = num2;
        this.currency = str2;
        this.discountType = str3;
        this.discountValue = d;
        this.interestType = str4;
        this.interestValue = d2;
        this.taxType = invoiceOrderTaxType;
        this.taxSum = num3;
        this.itemCodeSmartPay = str5;
        this.image = str6;
    }

    /* renamed from: component1, reason: from getter */
    public final int getPositionId() {
        return this.positionId;
    }

    /* renamed from: component10, reason: from getter */
    public final Double getDiscountValue() {
        return this.discountValue;
    }

    /* renamed from: component11, reason: from getter */
    public final String getInterestType() {
        return this.interestType;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getInterestValue() {
        return this.interestValue;
    }

    /* renamed from: component13, reason: from getter */
    public final InvoiceOrderTaxType getTaxType() {
        return this.taxType;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getTaxSum() {
        return this.taxSum;
    }

    /* renamed from: component15, reason: from getter */
    public final String getItemCodeSmartPay() {
        return this.itemCodeSmartPay;
    }

    /* renamed from: component16, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<InvoiceParam> component3() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final InvoiceOrderQuantity getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getItemAmount() {
        return this.itemAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemCode() {
        return this.itemCode;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getItemPrice() {
        return this.itemPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDiscountType() {
        return this.discountType;
    }

    public final InvoiceOrderBundleItem copy(int positionId, String name, List<InvoiceParam> params, InvoiceOrderQuantity quantity, Integer itemAmount, String itemCode, Integer itemPrice, String currency, String discountType, Double discountValue, String interestType, Double interestValue, InvoiceOrderTaxType taxType, Integer taxSum, String itemCodeSmartPay, String image) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InvoiceOrderBundleItem(positionId, name, params, quantity, itemAmount, itemCode, itemPrice, currency, discountType, discountValue, interestType, interestValue, taxType, taxSum, itemCodeSmartPay, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceOrderBundleItem)) {
            return false;
        }
        InvoiceOrderBundleItem invoiceOrderBundleItem = (InvoiceOrderBundleItem) other;
        return this.positionId == invoiceOrderBundleItem.positionId && Intrinsics.areEqual(this.name, invoiceOrderBundleItem.name) && Intrinsics.areEqual(this.params, invoiceOrderBundleItem.params) && Intrinsics.areEqual(this.quantity, invoiceOrderBundleItem.quantity) && Intrinsics.areEqual(this.itemAmount, invoiceOrderBundleItem.itemAmount) && Intrinsics.areEqual(this.itemCode, invoiceOrderBundleItem.itemCode) && Intrinsics.areEqual(this.itemPrice, invoiceOrderBundleItem.itemPrice) && Intrinsics.areEqual(this.currency, invoiceOrderBundleItem.currency) && Intrinsics.areEqual(this.discountType, invoiceOrderBundleItem.discountType) && Intrinsics.areEqual((Object) this.discountValue, (Object) invoiceOrderBundleItem.discountValue) && Intrinsics.areEqual(this.interestType, invoiceOrderBundleItem.interestType) && Intrinsics.areEqual((Object) this.interestValue, (Object) invoiceOrderBundleItem.interestValue) && this.taxType == invoiceOrderBundleItem.taxType && Intrinsics.areEqual(this.taxSum, invoiceOrderBundleItem.taxSum) && Intrinsics.areEqual(this.itemCodeSmartPay, invoiceOrderBundleItem.itemCodeSmartPay) && Intrinsics.areEqual(this.image, invoiceOrderBundleItem.image);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDiscountType() {
        return this.discountType;
    }

    public final Double getDiscountValue() {
        return this.discountValue;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getInterestType() {
        return this.interestType;
    }

    public final Double getInterestValue() {
        return this.interestValue;
    }

    public final Integer getItemAmount() {
        return this.itemAmount;
    }

    public final String getItemCode() {
        return this.itemCode;
    }

    public final String getItemCodeSmartPay() {
        return this.itemCodeSmartPay;
    }

    public final Integer getItemPrice() {
        return this.itemPrice;
    }

    public final String getName() {
        return this.name;
    }

    public final List<InvoiceParam> getParams() {
        return this.params;
    }

    public final int getPositionId() {
        return this.positionId;
    }

    public final InvoiceOrderQuantity getQuantity() {
        return this.quantity;
    }

    public final Integer getTaxSum() {
        return this.taxSum;
    }

    public final InvoiceOrderTaxType getTaxType() {
        return this.taxType;
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.name, Integer.hashCode(this.positionId) * 31, 31);
        List list = this.params;
        int iHashCode = (iM1429a + (list == null ? 0 : list.hashCode())) * 31;
        InvoiceOrderQuantity invoiceOrderQuantity = this.quantity;
        int iHashCode2 = (iHashCode + (invoiceOrderQuantity == null ? 0 : invoiceOrderQuantity.hashCode())) * 31;
        Integer num = this.itemAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.itemCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.itemPrice;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.discountValue;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.interestType;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.interestValue;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        InvoiceOrderTaxType invoiceOrderTaxType = this.taxType;
        int iHashCode11 = (iHashCode10 + (invoiceOrderTaxType == null ? 0 : invoiceOrderTaxType.hashCode())) * 31;
        Integer num3 = this.taxSum;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.itemCodeSmartPay;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.image;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceOrderBundleItem(positionId=" + this.positionId + ", name=" + this.name + ", params=" + this.params + ", quantity=" + this.quantity + ", itemAmount=" + this.itemAmount + ", itemCode=" + this.itemCode + ", itemPrice=" + this.itemPrice + ", currency=" + this.currency + ", discountType=" + this.discountType + ", discountValue=" + this.discountValue + ", interestType=" + this.interestType + ", interestValue=" + this.interestValue + ", taxType=" + this.taxType + ", taxSum=" + this.taxSum + ", itemCodeSmartPay=" + this.itemCodeSmartPay + ", image=" + this.image + ')';
    }
}
