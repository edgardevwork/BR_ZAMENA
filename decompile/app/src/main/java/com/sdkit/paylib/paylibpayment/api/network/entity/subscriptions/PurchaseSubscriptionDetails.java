package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JL\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006,"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "", "", "component1", "()Ljava/lang/Boolean;", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "component2", "Ljava/util/Date;", "component3", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", "component4", "component5", "recurrent", "periodDuration", "periodEnd", "currentPeriod", "dateEndOfActivePeriod", "copy", "(Ljava/lang/Boolean;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;Ljava/util/Date;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;Ljava/util/Date;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/PurchaseSubscriptionDetails;", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getRecurrent", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "getPeriodDuration", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;", "c", "Ljava/util/Date;", "getPeriodEnd", "()Ljava/util/Date;", "d", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", "getCurrentPeriod", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;", "e", "getDateEndOfActivePeriod", SegmentConstantPool.INITSTRING, "(Ljava/lang/Boolean;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriod;Ljava/util/Date;Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionPeriodType;Ljava/util/Date;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PurchaseSubscriptionDetails {

    /* renamed from: a, reason: from kotlin metadata */
    public final Boolean recurrent;

    /* renamed from: b, reason: from kotlin metadata */
    public final SubscriptionPeriod periodDuration;

    /* renamed from: c, reason: from kotlin metadata */
    public final Date periodEnd;

    /* renamed from: d, reason: from kotlin metadata */
    public final SubscriptionPeriodType currentPeriod;

    /* renamed from: e, reason: from kotlin metadata */
    public final Date dateEndOfActivePeriod;

    public PurchaseSubscriptionDetails(Boolean bool, SubscriptionPeriod subscriptionPeriod, Date date, SubscriptionPeriodType subscriptionPeriodType, Date date2) {
        this.recurrent = bool;
        this.periodDuration = subscriptionPeriod;
        this.periodEnd = date;
        this.currentPeriod = subscriptionPeriodType;
        this.dateEndOfActivePeriod = date2;
    }

    public static /* synthetic */ PurchaseSubscriptionDetails copy$default(PurchaseSubscriptionDetails purchaseSubscriptionDetails, Boolean bool, SubscriptionPeriod subscriptionPeriod, Date date, SubscriptionPeriodType subscriptionPeriodType, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = purchaseSubscriptionDetails.recurrent;
        }
        if ((i & 2) != 0) {
            subscriptionPeriod = purchaseSubscriptionDetails.periodDuration;
        }
        SubscriptionPeriod subscriptionPeriod2 = subscriptionPeriod;
        if ((i & 4) != 0) {
            date = purchaseSubscriptionDetails.periodEnd;
        }
        Date date3 = date;
        if ((i & 8) != 0) {
            subscriptionPeriodType = purchaseSubscriptionDetails.currentPeriod;
        }
        SubscriptionPeriodType subscriptionPeriodType2 = subscriptionPeriodType;
        if ((i & 16) != 0) {
            date2 = purchaseSubscriptionDetails.dateEndOfActivePeriod;
        }
        return purchaseSubscriptionDetails.copy(bool, subscriptionPeriod2, date3, subscriptionPeriodType2, date2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getRecurrent() {
        return this.recurrent;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionPeriod getPeriodDuration() {
        return this.periodDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getPeriodEnd() {
        return this.periodEnd;
    }

    /* renamed from: component4, reason: from getter */
    public final SubscriptionPeriodType getCurrentPeriod() {
        return this.currentPeriod;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getDateEndOfActivePeriod() {
        return this.dateEndOfActivePeriod;
    }

    public final PurchaseSubscriptionDetails copy(Boolean recurrent, SubscriptionPeriod periodDuration, Date periodEnd, SubscriptionPeriodType currentPeriod, Date dateEndOfActivePeriod) {
        return new PurchaseSubscriptionDetails(recurrent, periodDuration, periodEnd, currentPeriod, dateEndOfActivePeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseSubscriptionDetails)) {
            return false;
        }
        PurchaseSubscriptionDetails purchaseSubscriptionDetails = (PurchaseSubscriptionDetails) other;
        return Intrinsics.areEqual(this.recurrent, purchaseSubscriptionDetails.recurrent) && Intrinsics.areEqual(this.periodDuration, purchaseSubscriptionDetails.periodDuration) && Intrinsics.areEqual(this.periodEnd, purchaseSubscriptionDetails.periodEnd) && this.currentPeriod == purchaseSubscriptionDetails.currentPeriod && Intrinsics.areEqual(this.dateEndOfActivePeriod, purchaseSubscriptionDetails.dateEndOfActivePeriod);
    }

    public final SubscriptionPeriodType getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final Date getDateEndOfActivePeriod() {
        return this.dateEndOfActivePeriod;
    }

    public final SubscriptionPeriod getPeriodDuration() {
        return this.periodDuration;
    }

    public final Date getPeriodEnd() {
        return this.periodEnd;
    }

    public final Boolean getRecurrent() {
        return this.recurrent;
    }

    public int hashCode() {
        Boolean bool = this.recurrent;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SubscriptionPeriod subscriptionPeriod = this.periodDuration;
        int iHashCode2 = (iHashCode + (subscriptionPeriod == null ? 0 : subscriptionPeriod.hashCode())) * 31;
        Date date = this.periodEnd;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        SubscriptionPeriodType subscriptionPeriodType = this.currentPeriod;
        int iHashCode4 = (iHashCode3 + (subscriptionPeriodType == null ? 0 : subscriptionPeriodType.hashCode())) * 31;
        Date date2 = this.dateEndOfActivePeriod;
        return iHashCode4 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseSubscriptionDetails(recurrent=" + this.recurrent + ", periodDuration=" + this.periodDuration + ", periodEnd=" + this.periodEnd + ", currentPeriod=" + this.currentPeriod + ", dateEndOfActivePeriod=" + this.dateEndOfActivePeriod + ')';
    }
}
