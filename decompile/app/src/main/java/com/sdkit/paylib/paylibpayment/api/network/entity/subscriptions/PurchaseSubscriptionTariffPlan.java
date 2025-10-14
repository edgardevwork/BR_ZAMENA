package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003JL\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionTariffPlan;", "", "", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", "component5", "name", "periodDuration", FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.CURRENCY, "nextPeriod", "copy", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;Ljava/lang/Integer;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionTariffPlan;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "getPeriodDuration", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "c", "Ljava/lang/Integer;", "getPrice", "d", "getCurrency", "e", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", "getNextPeriod", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;Ljava/lang/Integer;Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PurchaseSubscriptionTariffPlan {

    /* renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    public final SubscriptionPeriod periodDuration;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer price;

    /* renamed from: d, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: e, reason: from kotlin metadata */
    public final SubscriptionPeriodType nextPeriod;

    public PurchaseSubscriptionTariffPlan(String str, SubscriptionPeriod subscriptionPeriod, Integer num, String str2, SubscriptionPeriodType subscriptionPeriodType) {
        this.name = str;
        this.periodDuration = subscriptionPeriod;
        this.price = num;
        this.currency = str2;
        this.nextPeriod = subscriptionPeriodType;
    }

    public static /* synthetic */ PurchaseSubscriptionTariffPlan copy$default(PurchaseSubscriptionTariffPlan purchaseSubscriptionTariffPlan, String str, SubscriptionPeriod subscriptionPeriod, Integer num, String str2, SubscriptionPeriodType subscriptionPeriodType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseSubscriptionTariffPlan.name;
        }
        if ((i & 2) != 0) {
            subscriptionPeriod = purchaseSubscriptionTariffPlan.periodDuration;
        }
        SubscriptionPeriod subscriptionPeriod2 = subscriptionPeriod;
        if ((i & 4) != 0) {
            num = purchaseSubscriptionTariffPlan.price;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str2 = purchaseSubscriptionTariffPlan.currency;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            subscriptionPeriodType = purchaseSubscriptionTariffPlan.nextPeriod;
        }
        return purchaseSubscriptionTariffPlan.copy(str, subscriptionPeriod2, num2, str3, subscriptionPeriodType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionPeriod getPeriodDuration() {
        return this.periodDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component5, reason: from getter */
    public final SubscriptionPeriodType getNextPeriod() {
        return this.nextPeriod;
    }

    public final PurchaseSubscriptionTariffPlan copy(String name, SubscriptionPeriod periodDuration, Integer price, String currency, SubscriptionPeriodType nextPeriod) {
        return new PurchaseSubscriptionTariffPlan(name, periodDuration, price, currency, nextPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseSubscriptionTariffPlan)) {
            return false;
        }
        PurchaseSubscriptionTariffPlan purchaseSubscriptionTariffPlan = (PurchaseSubscriptionTariffPlan) other;
        return Intrinsics.areEqual(this.name, purchaseSubscriptionTariffPlan.name) && Intrinsics.areEqual(this.periodDuration, purchaseSubscriptionTariffPlan.periodDuration) && Intrinsics.areEqual(this.price, purchaseSubscriptionTariffPlan.price) && Intrinsics.areEqual(this.currency, purchaseSubscriptionTariffPlan.currency) && this.nextPeriod == purchaseSubscriptionTariffPlan.nextPeriod;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getName() {
        return this.name;
    }

    public final SubscriptionPeriodType getNextPeriod() {
        return this.nextPeriod;
    }

    public final SubscriptionPeriod getPeriodDuration() {
        return this.periodDuration;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SubscriptionPeriod subscriptionPeriod = this.periodDuration;
        int iHashCode2 = (iHashCode + (subscriptionPeriod == null ? 0 : subscriptionPeriod.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubscriptionPeriodType subscriptionPeriodType = this.nextPeriod;
        return iHashCode4 + (subscriptionPeriodType != null ? subscriptionPeriodType.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseSubscriptionTariffPlan(name=" + this.name + ", periodDuration=" + this.periodDuration + ", price=" + this.price + ", currency=" + this.currency + ", nextPeriod=" + this.nextPeriod + ')';
    }
}
