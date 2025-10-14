package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BillingItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/BillingItem;", "", "productId", "", "oldPrice", "", "newPriceIsWithoutDouble", "percentOfSale", "newPriceIsWithDouble", "(Ljava/lang/String;IILjava/lang/String;I)V", "getNewPriceIsWithDouble", "()I", "getNewPriceIsWithoutDouble", "getOldPrice", "getPercentOfSale", "()Ljava/lang/String;", "getProductId", "actualPrice", "isWithDouble", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "valueOfSale", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BillingItem {
    public static final int $stable = 0;
    public final int newPriceIsWithDouble;
    public final int newPriceIsWithoutDouble;
    public final int oldPrice;

    @NotNull
    public final String percentOfSale;

    @NotNull
    public final String productId;

    public BillingItem() {
        this(null, 0, 0, null, 0, 31, null);
    }

    public static /* synthetic */ BillingItem copy$default(BillingItem billingItem, String str, int i, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = billingItem.productId;
        }
        if ((i4 & 2) != 0) {
            i = billingItem.oldPrice;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = billingItem.newPriceIsWithoutDouble;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            str2 = billingItem.percentOfSale;
        }
        String str3 = str2;
        if ((i4 & 16) != 0) {
            i3 = billingItem.newPriceIsWithDouble;
        }
        return billingItem.copy(str, i5, i6, str3, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOldPrice() {
        return this.oldPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNewPriceIsWithoutDouble() {
        return this.newPriceIsWithoutDouble;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPercentOfSale() {
        return this.percentOfSale;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNewPriceIsWithDouble() {
        return this.newPriceIsWithDouble;
    }

    @NotNull
    public final BillingItem copy(@NotNull String productId, int oldPrice, int newPriceIsWithoutDouble, @NotNull String percentOfSale, int newPriceIsWithDouble) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(percentOfSale, "percentOfSale");
        return new BillingItem(productId, oldPrice, newPriceIsWithoutDouble, percentOfSale, newPriceIsWithDouble);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingItem)) {
            return false;
        }
        BillingItem billingItem = (BillingItem) other;
        return Intrinsics.areEqual(this.productId, billingItem.productId) && this.oldPrice == billingItem.oldPrice && this.newPriceIsWithoutDouble == billingItem.newPriceIsWithoutDouble && Intrinsics.areEqual(this.percentOfSale, billingItem.percentOfSale) && this.newPriceIsWithDouble == billingItem.newPriceIsWithDouble;
    }

    public int hashCode() {
        return (((((((this.productId.hashCode() * 31) + Integer.hashCode(this.oldPrice)) * 31) + Integer.hashCode(this.newPriceIsWithoutDouble)) * 31) + this.percentOfSale.hashCode()) * 31) + Integer.hashCode(this.newPriceIsWithDouble);
    }

    @NotNull
    public String toString() {
        return "BillingItem(productId=" + this.productId + ", oldPrice=" + this.oldPrice + ", newPriceIsWithoutDouble=" + this.newPriceIsWithoutDouble + ", percentOfSale=" + this.percentOfSale + ", newPriceIsWithDouble=" + this.newPriceIsWithDouble + ")";
    }

    public BillingItem(@NotNull String productId, int i, int i2, @NotNull String percentOfSale, int i3) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(percentOfSale, "percentOfSale");
        this.productId = productId;
        this.oldPrice = i;
        this.newPriceIsWithoutDouble = i2;
        this.percentOfSale = percentOfSale;
        this.newPriceIsWithDouble = i3;
    }

    public /* synthetic */ BillingItem(String str, int i, int i2, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 16) == 0 ? i3 : 0);
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int getOldPrice() {
        return this.oldPrice;
    }

    public final int getNewPriceIsWithoutDouble() {
        return this.newPriceIsWithoutDouble;
    }

    @NotNull
    public final String getPercentOfSale() {
        return this.percentOfSale;
    }

    public final int getNewPriceIsWithDouble() {
        return this.newPriceIsWithDouble;
    }

    public final int actualPrice(boolean isWithDouble) {
        return isWithDouble ? this.newPriceIsWithDouble : this.newPriceIsWithoutDouble;
    }

    @NotNull
    public final String valueOfSale(boolean isWithDouble) {
        return isWithDouble ? "X2" : this.percentOfSale;
    }
}
