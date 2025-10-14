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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000eR\u0011\u0010\"\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b#\u0010\u000e¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;", "", "tabValue", "", "isCheckBoxChecked", "", "productCount", FirebaseAnalytics.Param.PRICE, "", "priceForAll", "priceForPublish", "addsValue", "(IZIJJII)V", "getAddsValue", "()I", "bottomText", "getBottomText", "checkBoxBorderColor", "getCheckBoxBorderColor", "checkBoxColor", "getCheckBoxColor", "greenButtonText", "getGreenButtonText", "()Z", "isMinusBtnEnabled", "isNeedToShowRedButton", "isNeedToShowSeller", "isNeedToShowTextFieldAndVipStatus", "getPrice", "()J", "getPriceForAll", "getPriceForPublish", "getProductCount", "getTabValue", "title", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
