package ru.rustore.sdk.billingclient.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/product/ProductSubscription;", "", "subscriptionPeriod", "Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;", "freeTrialPeriod", "gracePeriod", "introductoryPrice", "", "introductoryPriceAmount", "introductoryPricePeriod", "(Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;Ljava/lang/String;Ljava/lang/String;Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;)V", "getFreeTrialPeriod", "()Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;", "getGracePeriod", "getIntroductoryPrice", "()Ljava/lang/String;", "getIntroductoryPriceAmount", "getIntroductoryPricePeriod", "getSubscriptionPeriod", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductSubscription {
    private final SubscriptionPeriod freeTrialPeriod;
    private final SubscriptionPeriod gracePeriod;
    private final String introductoryPrice;
    private final String introductoryPriceAmount;
    private final SubscriptionPeriod introductoryPricePeriod;
    private final SubscriptionPeriod subscriptionPeriod;

    public ProductSubscription(SubscriptionPeriod subscriptionPeriod, SubscriptionPeriod subscriptionPeriod2, SubscriptionPeriod subscriptionPeriod3, String str, String str2, SubscriptionPeriod subscriptionPeriod4) {
        this.subscriptionPeriod = subscriptionPeriod;
        this.freeTrialPeriod = subscriptionPeriod2;
        this.gracePeriod = subscriptionPeriod3;
        this.introductoryPrice = str;
        this.introductoryPriceAmount = str2;
        this.introductoryPricePeriod = subscriptionPeriod4;
    }

    public static /* synthetic */ ProductSubscription copy$default(ProductSubscription productSubscription, SubscriptionPeriod subscriptionPeriod, SubscriptionPeriod subscriptionPeriod2, SubscriptionPeriod subscriptionPeriod3, String str, String str2, SubscriptionPeriod subscriptionPeriod4, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionPeriod = productSubscription.subscriptionPeriod;
        }
        if ((i & 2) != 0) {
            subscriptionPeriod2 = productSubscription.freeTrialPeriod;
        }
        SubscriptionPeriod subscriptionPeriod5 = subscriptionPeriod2;
        if ((i & 4) != 0) {
            subscriptionPeriod3 = productSubscription.gracePeriod;
        }
        SubscriptionPeriod subscriptionPeriod6 = subscriptionPeriod3;
        if ((i & 8) != 0) {
            str = productSubscription.introductoryPrice;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = productSubscription.introductoryPriceAmount;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            subscriptionPeriod4 = productSubscription.introductoryPricePeriod;
        }
        return productSubscription.copy(subscriptionPeriod, subscriptionPeriod5, subscriptionPeriod6, str3, str4, subscriptionPeriod4);
    }

    /* renamed from: component1, reason: from getter */
    public final SubscriptionPeriod getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionPeriod getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    /* renamed from: component3, reason: from getter */
    public final SubscriptionPeriod getGracePeriod() {
        return this.gracePeriod;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIntroductoryPrice() {
        return this.introductoryPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIntroductoryPriceAmount() {
        return this.introductoryPriceAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final SubscriptionPeriod getIntroductoryPricePeriod() {
        return this.introductoryPricePeriod;
    }

    public final ProductSubscription copy(SubscriptionPeriod subscriptionPeriod, SubscriptionPeriod freeTrialPeriod, SubscriptionPeriod gracePeriod, String introductoryPrice, String introductoryPriceAmount, SubscriptionPeriod introductoryPricePeriod) {
        return new ProductSubscription(subscriptionPeriod, freeTrialPeriod, gracePeriod, introductoryPrice, introductoryPriceAmount, introductoryPricePeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSubscription)) {
            return false;
        }
        ProductSubscription productSubscription = (ProductSubscription) other;
        return Intrinsics.areEqual(this.subscriptionPeriod, productSubscription.subscriptionPeriod) && Intrinsics.areEqual(this.freeTrialPeriod, productSubscription.freeTrialPeriod) && Intrinsics.areEqual(this.gracePeriod, productSubscription.gracePeriod) && Intrinsics.areEqual(this.introductoryPrice, productSubscription.introductoryPrice) && Intrinsics.areEqual(this.introductoryPriceAmount, productSubscription.introductoryPriceAmount) && Intrinsics.areEqual(this.introductoryPricePeriod, productSubscription.introductoryPricePeriod);
    }

    public final SubscriptionPeriod getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final SubscriptionPeriod getGracePeriod() {
        return this.gracePeriod;
    }

    public final String getIntroductoryPrice() {
        return this.introductoryPrice;
    }

    public final String getIntroductoryPriceAmount() {
        return this.introductoryPriceAmount;
    }

    public final SubscriptionPeriod getIntroductoryPricePeriod() {
        return this.introductoryPricePeriod;
    }

    public final SubscriptionPeriod getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public int hashCode() {
        SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
        int iHashCode = (subscriptionPeriod == null ? 0 : subscriptionPeriod.hashCode()) * 31;
        SubscriptionPeriod subscriptionPeriod2 = this.freeTrialPeriod;
        int iHashCode2 = (iHashCode + (subscriptionPeriod2 == null ? 0 : subscriptionPeriod2.hashCode())) * 31;
        SubscriptionPeriod subscriptionPeriod3 = this.gracePeriod;
        int iHashCode3 = (iHashCode2 + (subscriptionPeriod3 == null ? 0 : subscriptionPeriod3.hashCode())) * 31;
        String str = this.introductoryPrice;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.introductoryPriceAmount;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubscriptionPeriod subscriptionPeriod4 = this.introductoryPricePeriod;
        return iHashCode5 + (subscriptionPeriod4 != null ? subscriptionPeriod4.hashCode() : 0);
    }

    public String toString() {
        return "ProductSubscription(subscriptionPeriod=" + this.subscriptionPeriod + ", freeTrialPeriod=" + this.freeTrialPeriod + ", gracePeriod=" + this.gracePeriod + ", introductoryPrice=" + this.introductoryPrice + ", introductoryPriceAmount=" + this.introductoryPriceAmount + ", introductoryPricePeriod=" + this.introductoryPricePeriod + ')';
    }
}
