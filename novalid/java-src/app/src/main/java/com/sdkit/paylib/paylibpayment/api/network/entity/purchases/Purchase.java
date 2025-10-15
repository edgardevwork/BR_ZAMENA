package com.sdkit.paylib.paylibpayment.api.network.entity.purchases;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bL\u0010MJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jª\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020\rHÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b>\u0010,R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u000fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010\u000fR\u0019\u0010 \u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010,¨\u0006N"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/Purchase;", "", "", "component1", "component2", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "component3", "component4", "component5", "Ljava/util/Date;", "component6", "component7", "component8", "", "component9", "()Ljava/lang/Integer;", "component10", "component11", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "component12", "component13", "purchaseId", "productId", "productType", "invoiceId", "language", "purchaseTime", "orderId", "amountLabel", "amount", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.QUANTITY, "purchaseState", "developerPayload", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/Purchase;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getProductId", "c", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "getProductType", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "d", "getInvoiceId", "e", "getLanguage", "f", "Ljava/util/Date;", "getPurchaseTime", "()Ljava/util/Date;", "g", "getOrderId", "h", "getAmountLabel", "i", "Ljava/lang/Integer;", "getAmount", "j", "getCurrency", "k", "getQuantity", "l", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "getPurchaseState", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "m", "getDeveloperPayload", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Purchase {

    /* renamed from: a, reason: from kotlin metadata */
    public final String purchaseId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: c, reason: from kotlin metadata */
    public final ProductType productType;

    /* renamed from: d, reason: from kotlin metadata */
    public final String invoiceId;

    /* renamed from: e, reason: from kotlin metadata */
    public final String language;

    /* renamed from: f, reason: from kotlin metadata */
    public final Date purchaseTime;

    /* renamed from: g, reason: from kotlin metadata */
    public final String orderId;

    /* renamed from: h, reason: from kotlin metadata */
    public final String amountLabel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Integer amount;

    /* renamed from: j, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: k, reason: from kotlin metadata */
    public final Integer quantity;

    /* renamed from: l, reason: from kotlin metadata */
    public final PurchaseState purchaseState;

    /* renamed from: m, reason: from kotlin metadata */
    public final String developerPayload;

    public Purchase(String str, String productId, ProductType productType, String str2, String str3, Date date, String str4, String str5, Integer num, String str6, Integer num2, PurchaseState purchaseState, String str7) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.purchaseId = str;
        this.productId = productId;
        this.productType = productType;
        this.invoiceId = str2;
        this.language = str3;
        this.purchaseTime = date;
        this.orderId = str4;
        this.amountLabel = str5;
        this.amount = num;
        this.currency = str6;
        this.quantity = num2;
        this.purchaseState = purchaseState;
        this.developerPayload = str7;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component12, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductType getProductType() {
        return this.productType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getPurchaseTime() {
        return this.purchaseTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAmountLabel() {
        return this.amountLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getAmount() {
        return this.amount;
    }

    public final Purchase copy(String purchaseId, String productId, ProductType productType, String invoiceId, String language, Date purchaseTime, String orderId, String amountLabel, Integer amount, String currency, Integer quantity, PurchaseState purchaseState, String developerPayload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new Purchase(purchaseId, productId, productType, invoiceId, language, purchaseTime, orderId, amountLabel, amount, currency, quantity, purchaseState, developerPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) other;
        return Intrinsics.areEqual(this.purchaseId, purchase.purchaseId) && Intrinsics.areEqual(this.productId, purchase.productId) && this.productType == purchase.productType && Intrinsics.areEqual(this.invoiceId, purchase.invoiceId) && Intrinsics.areEqual(this.language, purchase.language) && Intrinsics.areEqual(this.purchaseTime, purchase.purchaseTime) && Intrinsics.areEqual(this.orderId, purchase.orderId) && Intrinsics.areEqual(this.amountLabel, purchase.amountLabel) && Intrinsics.areEqual(this.amount, purchase.amount) && Intrinsics.areEqual(this.currency, purchase.currency) && Intrinsics.areEqual(this.quantity, purchase.quantity) && this.purchaseState == purchase.purchaseState && Intrinsics.areEqual(this.developerPayload, purchase.developerPayload);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getAmountLabel() {
        return this.amountLabel;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final Date getPurchaseTime() {
        return this.purchaseTime;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.purchaseId;
        int iM1429a = C8031b.m1429a(this.productId, (str == null ? 0 : str.hashCode()) * 31, 31);
        ProductType productType = this.productType;
        int iHashCode = (iM1429a + (productType == null ? 0 : productType.hashCode())) * 31;
        String str2 = this.invoiceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.purchaseTime;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amountLabel;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.quantity;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PurchaseState purchaseState = this.purchaseState;
        int iHashCode10 = (iHashCode9 + (purchaseState == null ? 0 : purchaseState.hashCode())) * 31;
        String str7 = this.developerPayload;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "Purchase(purchaseId=" + this.purchaseId + ", productId=" + this.productId + ", productType=" + this.productType + ", invoiceId=" + this.invoiceId + ", language=" + this.language + ", purchaseTime=" + this.purchaseTime + ", orderId=" + this.orderId + ", amountLabel=" + this.amountLabel + ", amount=" + this.amount + ", currency=" + this.currency + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", developerPayload=" + this.developerPayload + ')';
    }

    public /* synthetic */ Purchase(String str, String str2, ProductType productType, String str3, String str4, Date date, String str5, String str6, Integer num, String str7, Integer num2, PurchaseState purchaseState, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : productType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : date, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : purchaseState, (i & 4096) != 0 ? null : str8);
    }
}
