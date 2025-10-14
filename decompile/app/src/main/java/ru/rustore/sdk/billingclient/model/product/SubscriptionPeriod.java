package ru.rustore.sdk.billingclient.model.product;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/product/SubscriptionPeriod;", "", "years", "", "months", "days", "(III)V", "getDays", "()I", "getMonths", "getYears", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionPeriod {
    private final int days;
    private final int months;
    private final int years;

    public SubscriptionPeriod(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    public static /* synthetic */ SubscriptionPeriod copy$default(SubscriptionPeriod subscriptionPeriod, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = subscriptionPeriod.years;
        }
        if ((i4 & 2) != 0) {
            i2 = subscriptionPeriod.months;
        }
        if ((i4 & 4) != 0) {
            i3 = subscriptionPeriod.days;
        }
        return subscriptionPeriod.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getYears() {
        return this.years;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMonths() {
        return this.months;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    public final SubscriptionPeriod copy(int years, int months, int days) {
        return new SubscriptionPeriod(years, months, days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPeriod)) {
            return false;
        }
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) other;
        return this.years == subscriptionPeriod.years && this.months == subscriptionPeriod.months && this.days == subscriptionPeriod.days;
    }

    public final int getDays() {
        return this.days;
    }

    public final int getMonths() {
        return this.months;
    }

    public final int getYears() {
        return this.years;
    }

    public int hashCode() {
        return Integer.hashCode(this.days) + C8054b.m1525a(this.months, Integer.hashCode(this.years) * 31, 31);
    }

    public String toString() {
        return "SubscriptionPeriod(years=" + this.years + ", months=" + this.months + ", days=" + this.days + ')';
    }
}
