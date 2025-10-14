package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceBottomSheetInfo.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceBottomSheetInfo {
    public static final int $stable = 0;
    public final int addsValue;
    public final boolean isCheckBoxChecked;
    public final boolean isNeedToShowRedButton;
    public final long price;
    public final long priceForAll;
    public final int priceForPublish;
    public final int productCount;
    public final int tabValue;

    public MarketplaceBottomSheetInfo() {
        this(0, false, 0, 0L, 0L, 0, 0, 127, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTabValue() {
        return this.tabValue;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckBoxChecked() {
        return this.isCheckBoxChecked;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProductCount() {
        return this.productCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPriceForAll() {
        return this.priceForAll;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPriceForPublish() {
        return this.priceForPublish;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAddsValue() {
        return this.addsValue;
    }

    @NotNull
    public final MarketplaceBottomSheetInfo copy(int tabValue, boolean isCheckBoxChecked, int productCount, long price, long priceForAll, int priceForPublish, int addsValue) {
        return new MarketplaceBottomSheetInfo(tabValue, isCheckBoxChecked, productCount, price, priceForAll, priceForPublish, addsValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceBottomSheetInfo)) {
            return false;
        }
        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = (MarketplaceBottomSheetInfo) other;
        return this.tabValue == marketplaceBottomSheetInfo.tabValue && this.isCheckBoxChecked == marketplaceBottomSheetInfo.isCheckBoxChecked && this.productCount == marketplaceBottomSheetInfo.productCount && this.price == marketplaceBottomSheetInfo.price && this.priceForAll == marketplaceBottomSheetInfo.priceForAll && this.priceForPublish == marketplaceBottomSheetInfo.priceForPublish && this.addsValue == marketplaceBottomSheetInfo.addsValue;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.tabValue) * 31) + Boolean.hashCode(this.isCheckBoxChecked)) * 31) + Integer.hashCode(this.productCount)) * 31) + Long.hashCode(this.price)) * 31) + Long.hashCode(this.priceForAll)) * 31) + Integer.hashCode(this.priceForPublish)) * 31) + Integer.hashCode(this.addsValue);
    }

    @NotNull
    public String toString() {
        return "MarketplaceBottomSheetInfo(tabValue=" + this.tabValue + ", isCheckBoxChecked=" + this.isCheckBoxChecked + ", productCount=" + this.productCount + ", price=" + this.price + ", priceForAll=" + this.priceForAll + ", priceForPublish=" + this.priceForPublish + ", addsValue=" + this.addsValue + ")";
    }

    public MarketplaceBottomSheetInfo(int i, boolean z, int i2, long j, long j2, int i3, int i4) {
        this.tabValue = i;
        this.isCheckBoxChecked = z;
        this.productCount = i2;
        this.price = j;
        this.priceForAll = j2;
        this.priceForPublish = i3;
        this.addsValue = i4;
        this.isNeedToShowRedButton = i == 5;
    }

    public /* synthetic */ MarketplaceBottomSheetInfo(int i, boolean z, int i2, long j, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 2 : i, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 0L : j, (i5 & 16) == 0 ? j2 : 0L, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0);
    }

    public final int getTabValue() {
        return this.tabValue;
    }

    public final boolean isCheckBoxChecked() {
        return this.isCheckBoxChecked;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public final long getPrice() {
        return this.price;
    }

    public final long getPriceForAll() {
        return this.priceForAll;
    }

    public final int getPriceForPublish() {
        return this.priceForPublish;
    }

    public final int getAddsValue() {
        return this.addsValue;
    }

    /* renamed from: isNeedToShowRedButton, reason: from getter */
    public final boolean getIsNeedToShowRedButton() {
        return this.isNeedToShowRedButton;
    }

    public final boolean isNeedToShowSeller() {
        int i = this.tabValue;
        return i == 2 || i == 4;
    }

    public final boolean isNeedToShowTextFieldAndVipStatus() {
        int i = this.tabValue;
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean isMinusBtnEnabled() {
        return this.productCount > 1;
    }

    @StringRes
    public final int getBottomText() {
        int i = this.tabValue;
        return (i == 2 || i == 4) ? R.string.marketplace_bottom_sheet_your_for_pay : R.string.marketplace_bottom_sheet_your_revenue;
    }

    @StringRes
    public final int getTitle() {
        int i = this.tabValue;
        return (i == 2 || i == 4) ? R.string.marketplace_bottom_sheet_title_buy : i != 5 ? R.string.marketplace_bottom_sheet_title_sell : R.string.marketplace_bottom_sheet_title_edit;
    }

    @StringRes
    public final int getGreenButtonText() {
        int i = this.tabValue;
        return (i == 5 || i == 6) ? R.string.common_apply_migrate : R.string.common_buy;
    }

    @ColorRes
    public final int getCheckBoxColor() {
        return this.isCheckBoxChecked ? R.color.yellow_orange : R.color.dark_gray_30;
    }

    @ColorRes
    public final int getCheckBoxBorderColor() {
        return this.isCheckBoxChecked ? R.color.yellow_orange : R.color.white;
    }
}

