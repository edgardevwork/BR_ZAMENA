package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.Card;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bO\u0010PJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0099\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010 \u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010!\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006Q"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "component7", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "component8", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionTariffPlan;", "component9", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "component10", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionProductInfo;", "component11", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionApplicationInfo;", "component12", "purchaseId", "name", "description", "visualAmount", "amount", FirebaseAnalytics.Param.CURRENCY, "purchaseState", "subscription", "tariffPlans", "paymentInfo", "productInfo", "applicationInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPurchaseId", "()Ljava/lang/String;", "b", "getName", "c", "getDescription", "d", "getVisualAmount", "e", "getAmount", "f", "getCurrency", "g", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "getPurchaseState", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;", "h", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "getSubscription", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "i", "Ljava/util/List;", "getTariffPlans", "()Ljava/util/List;", "j", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "getPaymentInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;", "k", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionProductInfo;", "getProductInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionProductInfo;", "l", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionApplicationInfo;", "getApplicationInfo", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionApplicationInfo;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/purchases/PurchaseState;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;Ljava/util/List;Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/Card;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionProductInfo;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionApplicationInfo;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PurchaseSubscriptionInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String purchaseId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: from kotlin metadata */
    public final String description;

    /* renamed from: d, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: e, reason: from kotlin metadata */
    public final String amount;

    /* renamed from: f, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: g, reason: from kotlin metadata */
    public final PurchaseState purchaseState;

    /* renamed from: h, reason: from kotlin metadata */
    public final PurchaseSubscriptionDetails subscription;

    /* renamed from: i, reason: from kotlin metadata */
    public final List tariffPlans;

    /* renamed from: j, reason: from kotlin metadata */
    public final Card paymentInfo;

    /* renamed from: k, reason: from kotlin metadata */
    public final SubscriptionProductInfo productInfo;

    /* renamed from: l, reason: from kotlin metadata */
    public final SubscriptionApplicationInfo applicationInfo;

    public PurchaseSubscriptionInfo(String purchaseId, String name, String str, String str2, String str3, String str4, PurchaseState purchaseState, PurchaseSubscriptionDetails purchaseSubscriptionDetails, List<PurchaseSubscriptionTariffPlan> list, Card card, SubscriptionProductInfo subscriptionProductInfo, SubscriptionApplicationInfo subscriptionApplicationInfo) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.purchaseId = purchaseId;
        this.name = name;
        this.description = str;
        this.visualAmount = str2;
        this.amount = str3;
        this.currency = str4;
        this.purchaseState = purchaseState;
        this.subscription = purchaseSubscriptionDetails;
        this.tariffPlans = list;
        this.paymentInfo = card;
        this.productInfo = subscriptionProductInfo;
        this.applicationInfo = subscriptionApplicationInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component10, reason: from getter */
    public final Card getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final SubscriptionProductInfo getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final SubscriptionApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component8, reason: from getter */
    public final PurchaseSubscriptionDetails getSubscription() {
        return this.subscription;
    }

    public final List<PurchaseSubscriptionTariffPlan> component9() {
        return this.tariffPlans;
    }

    public final PurchaseSubscriptionInfo copy(String purchaseId, String name, String description, String visualAmount, String amount, String currency, PurchaseState purchaseState, PurchaseSubscriptionDetails subscription, List<PurchaseSubscriptionTariffPlan> tariffPlans, Card paymentInfo, SubscriptionProductInfo productInfo, SubscriptionApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        return new PurchaseSubscriptionInfo(purchaseId, name, description, visualAmount, amount, currency, purchaseState, subscription, tariffPlans, paymentInfo, productInfo, applicationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseSubscriptionInfo)) {
            return false;
        }
        PurchaseSubscriptionInfo purchaseSubscriptionInfo = (PurchaseSubscriptionInfo) other;
        return Intrinsics.areEqual(this.purchaseId, purchaseSubscriptionInfo.purchaseId) && Intrinsics.areEqual(this.name, purchaseSubscriptionInfo.name) && Intrinsics.areEqual(this.description, purchaseSubscriptionInfo.description) && Intrinsics.areEqual(this.visualAmount, purchaseSubscriptionInfo.visualAmount) && Intrinsics.areEqual(this.amount, purchaseSubscriptionInfo.amount) && Intrinsics.areEqual(this.currency, purchaseSubscriptionInfo.currency) && this.purchaseState == purchaseSubscriptionInfo.purchaseState && Intrinsics.areEqual(this.subscription, purchaseSubscriptionInfo.subscription) && Intrinsics.areEqual(this.tariffPlans, purchaseSubscriptionInfo.tariffPlans) && Intrinsics.areEqual(this.paymentInfo, purchaseSubscriptionInfo.paymentInfo) && Intrinsics.areEqual(this.productInfo, purchaseSubscriptionInfo.productInfo) && Intrinsics.areEqual(this.applicationInfo, purchaseSubscriptionInfo.applicationInfo);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final SubscriptionApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final Card getPaymentInfo() {
        return this.paymentInfo;
    }

    public final SubscriptionProductInfo getProductInfo() {
        return this.productInfo;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final PurchaseSubscriptionDetails getSubscription() {
        return this.subscription;
    }

    public final List<PurchaseSubscriptionTariffPlan> getTariffPlans() {
        return this.tariffPlans;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.name, this.purchaseId.hashCode() * 31, 31);
        String str = this.description;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.visualAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (this.purchaseState.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        PurchaseSubscriptionDetails purchaseSubscriptionDetails = this.subscription;
        int iHashCode5 = (iHashCode4 + (purchaseSubscriptionDetails == null ? 0 : purchaseSubscriptionDetails.hashCode())) * 31;
        List list = this.tariffPlans;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Card card = this.paymentInfo;
        int iHashCode7 = (iHashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        SubscriptionProductInfo subscriptionProductInfo = this.productInfo;
        int iHashCode8 = (iHashCode7 + (subscriptionProductInfo == null ? 0 : subscriptionProductInfo.hashCode())) * 31;
        SubscriptionApplicationInfo subscriptionApplicationInfo = this.applicationInfo;
        return iHashCode8 + (subscriptionApplicationInfo != null ? subscriptionApplicationInfo.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseSubscriptionInfo(purchaseId=" + this.purchaseId + ", name=" + this.name + ", description=" + this.description + ", visualAmount=" + this.visualAmount + ", amount=" + this.amount + ", currency=" + this.currency + ", purchaseState=" + this.purchaseState + ", subscription=" + this.subscription + ", tariffPlans=" + this.tariffPlans + ", paymentInfo=" + this.paymentInfo + ", productInfo=" + this.productInfo + ", applicationInfo=" + this.applicationInfo + ')';
    }
}
