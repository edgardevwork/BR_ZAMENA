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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006$"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderData;", "", "x", "", "y", "companyId", "", "paymentId", "rateId", ClientCookie.COMMENT_ATTR, "", FirebaseAnalytics.Param.PRICE, "(DDIIILjava/lang/String;I)V", "getComment", "()Ljava/lang/String;", "getCompanyId", "()I", "getPaymentId", "getPrice", "getRateId", "getX", "()D", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
