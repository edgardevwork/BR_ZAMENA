package ru.rustore.sdk.billingclient.model.purchase;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.model.product.ProductType;

@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0016HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0019J¾\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00162\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u000eHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006C"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/Purchase;", "", "purchaseId", "", "productId", "productType", "Lru/rustore/sdk/billingclient/model/product/ProductType;", "invoiceId", "language", "purchaseTime", "Ljava/util/Date;", "orderId", "amountLabel", "amount", "", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.QUANTITY, "purchaseState", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseState;", "developerPayload", "subscriptionToken", "sandbox", "", "(Ljava/lang/String;Ljava/lang/String;Lru/rustore/sdk/billingclient/model/product/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/rustore/sdk/billingclient/model/purchase/PurchaseState;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmountLabel", "()Ljava/lang/String;", "getCurrency", "getDeveloperPayload", "getInvoiceId", "getLanguage", "getOrderId", "getProductId", "getProductType", "()Lru/rustore/sdk/billingclient/model/product/ProductType;", "getPurchaseId", "getPurchaseState", "()Lru/rustore/sdk/billingclient/model/purchase/PurchaseState;", "getPurchaseTime", "()Ljava/util/Date;", "getQuantity", "getSandbox", "()Z", "getSubscriptionToken", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/rustore/sdk/billingclient/model/product/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/rustore/sdk/billingclient/model/purchase/PurchaseState;Ljava/lang/String;Ljava/lang/String;Z)Lru/rustore/sdk/billingclient/model/purchase/Purchase;", "equals", "other", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Purchase {
    private final Integer amount;
    private final String amountLabel;
    private final String currency;
    private final String developerPayload;
    private final String invoiceId;
    private final String language;
    private final String orderId;
    private final String productId;
    private final ProductType productType;
    private final String purchaseId;
    private final PurchaseState purchaseState;
    private final Date purchaseTime;
    private final Integer quantity;
    private final boolean sandbox;
    private final String subscriptionToken;

    public Purchase(String str, String productId, ProductType productType, String str2, String str3, Date date, String str4, String str5, Integer num, String str6, Integer num2, PurchaseState purchaseState, String str7, String str8, boolean z) {
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
        this.subscriptionToken = str8;
        this.sandbox = z;
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

    /* renamed from: component14, reason: from getter */
    public final String getSubscriptionToken() {
        return this.subscriptionToken;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getSandbox() {
        return this.sandbox;
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

    public final Purchase copy(String purchaseId, String productId, ProductType productType, String invoiceId, String language, Date purchaseTime, String orderId, String amountLabel, Integer amount, String currency, Integer quantity, PurchaseState purchaseState, String developerPayload, String subscriptionToken, boolean sandbox) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new Purchase(purchaseId, productId, productType, invoiceId, language, purchaseTime, orderId, amountLabel, amount, currency, quantity, purchaseState, developerPayload, subscriptionToken, sandbox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) other;
        return Intrinsics.areEqual(this.purchaseId, purchase.purchaseId) && Intrinsics.areEqual(this.productId, purchase.productId) && this.productType == purchase.productType && Intrinsics.areEqual(this.invoiceId, purchase.invoiceId) && Intrinsics.areEqual(this.language, purchase.language) && Intrinsics.areEqual(this.purchaseTime, purchase.purchaseTime) && Intrinsics.areEqual(this.orderId, purchase.orderId) && Intrinsics.areEqual(this.amountLabel, purchase.amountLabel) && Intrinsics.areEqual(this.amount, purchase.amount) && Intrinsics.areEqual(this.currency, purchase.currency) && Intrinsics.areEqual(this.quantity, purchase.quantity) && this.purchaseState == purchase.purchaseState && Intrinsics.areEqual(this.developerPayload, purchase.developerPayload) && Intrinsics.areEqual(this.subscriptionToken, purchase.subscriptionToken) && this.sandbox == purchase.sandbox;
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

    public final boolean getSandbox() {
        return this.sandbox;
    }

    public final String getSubscriptionToken() {
        return this.subscriptionToken;
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
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subscriptionToken;
        return Boolean.hashCode(this.sandbox) + ((iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "Purchase(purchaseId=" + this.purchaseId + ", productId=" + this.productId + ", productType=" + this.productType + ", invoiceId=" + this.invoiceId + ", language=" + this.language + ", purchaseTime=" + this.purchaseTime + ", orderId=" + this.orderId + ", amountLabel=" + this.amountLabel + ", amount=" + this.amount + ", currency=" + this.currency + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", developerPayload=" + this.developerPayload + ", subscriptionToken=" + this.subscriptionToken + ", sandbox=" + this.sandbox + ')';
    }
}
