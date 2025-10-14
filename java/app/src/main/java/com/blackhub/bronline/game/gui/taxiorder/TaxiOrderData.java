package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderData.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class TaxiOrderData {
    public static final int $stable = 0;

    @NotNull
    public final String comment;
    public final int companyId;
    public final int paymentId;
    public final int price;
    public final int rateId;
    public final double x;
    public final double y;

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCompanyId() {
        return this.companyId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRateId() {
        return this.rateId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    @NotNull
    public final TaxiOrderData copy(double x, double y, int companyId, int paymentId, int rateId, @NotNull String comment, int price) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new TaxiOrderData(x, y, companyId, paymentId, rateId, comment, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxiOrderData)) {
            return false;
        }
        TaxiOrderData taxiOrderData = (TaxiOrderData) other;
        return Double.compare(this.x, taxiOrderData.x) == 0 && Double.compare(this.y, taxiOrderData.y) == 0 && this.companyId == taxiOrderData.companyId && this.paymentId == taxiOrderData.paymentId && this.rateId == taxiOrderData.rateId && Intrinsics.areEqual(this.comment, taxiOrderData.comment) && this.price == taxiOrderData.price;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.x) * 31) + Double.hashCode(this.y)) * 31) + Integer.hashCode(this.companyId)) * 31) + Integer.hashCode(this.paymentId)) * 31) + Integer.hashCode(this.rateId)) * 31) + this.comment.hashCode()) * 31) + Integer.hashCode(this.price);
    }

    @NotNull
    public String toString() {
        return "TaxiOrderData(x=" + this.x + ", y=" + this.y + ", companyId=" + this.companyId + ", paymentId=" + this.paymentId + ", rateId=" + this.rateId + ", comment=" + this.comment + ", price=" + this.price + ")";
    }

    public TaxiOrderData(double d, double d2, int i, int i2, int i3, @NotNull String comment, int i4) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.x = d;
        this.y = d2;
        this.companyId = i;
        this.paymentId = i2;
        this.rateId = i3;
        this.comment = comment;
        this.price = i4;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final int getCompanyId() {
        return this.companyId;
    }

    public final int getPaymentId() {
        return this.paymentId;
    }

    public final int getRateId() {
        return this.rateId;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final int getPrice() {
        return this.price;
    }
}

