package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bQ\u0010RJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003Jº\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010#\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010/R\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0011R\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010$\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006S"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscription;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "", "component13", "()Ljava/lang/Integer;", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "component14", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "component15", "purchaseId", "applicationCode", "applicationName", "applicationImage", "productId", "name", "description", "image", "imagePromo", "visualAmount", "amount", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.QUANTITY, "purchaseState", "subscription", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscription;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getApplicationCode", "c", "getApplicationName", "d", "getApplicationImage", "e", "getProductId", "f", "getName", "g", "getDescription", "h", "getImage", "i", "getImagePromo", "j", "getVisualAmount", "k", "getAmount", "l", "getCurrency", "m", "Ljava/lang/Integer;", "getQuantity", "n", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "getPurchaseState", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "o", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "getSubscription", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PurchaseSubscription {

    /* renamed from: a, reason: from kotlin metadata */
    public final String purchaseId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String applicationCode;

    /* renamed from: c, reason: from kotlin metadata */
    public final String applicationName;

    /* renamed from: d, reason: from kotlin metadata */
    public final String applicationImage;

    /* renamed from: e, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: f, reason: from kotlin metadata */
    public final String name;

    /* renamed from: g, reason: from kotlin metadata */
    public final String description;

    /* renamed from: h, reason: from kotlin metadata */
    public final String image;

    /* renamed from: i, reason: from kotlin metadata */
    public final String imagePromo;

    /* renamed from: j, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: k, reason: from kotlin metadata */
    public final String amount;

    /* renamed from: l, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: m, reason: from kotlin metadata */
    public final Integer quantity;

    /* renamed from: n, reason: from kotlin metadata */
    public final PurchaseState purchaseState;

    /* renamed from: o, reason: from kotlin metadata */
    public final PurchaseSubscriptionDetails subscription;

    public PurchaseSubscription(String purchaseId, String applicationCode, String str, String str2, String productId, String name, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, PurchaseState purchaseState, PurchaseSubscriptionDetails purchaseSubscriptionDetails) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.purchaseId = purchaseId;
        this.applicationCode = applicationCode;
        this.applicationName = str;
        this.applicationImage = str2;
        this.productId = productId;
        this.name = name;
        this.description = str3;
        this.image = str4;
        this.imagePromo = str5;
        this.visualAmount = str6;
        this.amount = str7;
        this.currency = str8;
        this.quantity = num;
        this.purchaseState = purchaseState;
        this.subscription = purchaseSubscriptionDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component14, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component15, reason: from getter */
    public final PurchaseSubscriptionDetails getSubscription() {
        return this.subscription;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApplicationImage() {
        return this.applicationImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component9, reason: from getter */
    public final String getImagePromo() {
        return this.imagePromo;
    }

    public final PurchaseSubscription copy(String purchaseId, String applicationCode, String applicationName, String applicationImage, String productId, String name, String description, String image, String imagePromo, String visualAmount, String amount, String currency, Integer quantity, PurchaseState purchaseState, PurchaseSubscriptionDetails subscription) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        return new PurchaseSubscription(purchaseId, applicationCode, applicationName, applicationImage, productId, name, description, image, imagePromo, visualAmount, amount, currency, quantity, purchaseState, subscription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseSubscription)) {
            return false;
        }
        PurchaseSubscription purchaseSubscription = (PurchaseSubscription) other;
        return Intrinsics.areEqual(this.purchaseId, purchaseSubscription.purchaseId) && Intrinsics.areEqual(this.applicationCode, purchaseSubscription.applicationCode) && Intrinsics.areEqual(this.applicationName, purchaseSubscription.applicationName) && Intrinsics.areEqual(this.applicationImage, purchaseSubscription.applicationImage) && Intrinsics.areEqual(this.productId, purchaseSubscription.productId) && Intrinsics.areEqual(this.name, purchaseSubscription.name) && Intrinsics.areEqual(this.description, purchaseSubscription.description) && Intrinsics.areEqual(this.image, purchaseSubscription.image) && Intrinsics.areEqual(this.imagePromo, purchaseSubscription.imagePromo) && Intrinsics.areEqual(this.visualAmount, purchaseSubscription.visualAmount) && Intrinsics.areEqual(this.amount, purchaseSubscription.amount) && Intrinsics.areEqual(this.currency, purchaseSubscription.currency) && Intrinsics.areEqual(this.quantity, purchaseSubscription.quantity) && this.purchaseState == purchaseSubscription.purchaseState && Intrinsics.areEqual(this.subscription, purchaseSubscription.subscription);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getApplicationCode() {
        return this.applicationCode;
    }

    public final String getApplicationImage() {
        return this.applicationImage;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImagePromo() {
        return this.imagePromo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final PurchaseSubscriptionDetails getSubscription() {
        return this.subscription;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.applicationCode, this.purchaseId.hashCode() * 31, 31);
        String str = this.applicationName;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationImage;
        int iM1429a2 = C8031b.m1429a(this.name, C8031b.m1429a(this.productId, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.description;
        int iHashCode2 = (iM1429a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imagePromo;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.visualAmount;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.amount;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currency;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode8 = (this.purchaseState.hashCode() + ((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        PurchaseSubscriptionDetails purchaseSubscriptionDetails = this.subscription;
        return iHashCode8 + (purchaseSubscriptionDetails != null ? purchaseSubscriptionDetails.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseSubscription(purchaseId=" + this.purchaseId + ", applicationCode=" + this.applicationCode + ", applicationName=" + this.applicationName + ", applicationImage=" + this.applicationImage + ", productId=" + this.productId + ", name=" + this.name + ", description=" + this.description + ", image=" + this.image + ", imagePromo=" + this.imagePromo + ", visualAmount=" + this.visualAmount + ", amount=" + this.amount + ", currency=" + this.currency + ", quantity=" + this.quantity + ", purchaseState=" + this.purchaseState + ", subscription=" + this.subscription + ')';
    }
}
