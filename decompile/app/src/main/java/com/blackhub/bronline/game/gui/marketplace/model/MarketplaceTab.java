package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceTab.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003JY\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010!R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010!\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010!\"\u0004\b&\u0010#R\u0011\u0010'\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8F¢\u0006\u0006\u001a\u0004\b2\u0010 ¨\u0006@"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;", "", "isHasPlatinumVip", "", "tabValue", "", "tabName", "", "icon", "titleIcon", "isSelected", "isHaveUpdates", "savedSortFilter", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;", "(ZILjava/lang/String;IIZZLcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;)V", "elementsAlpha", "", "getElementsAlpha", "()F", "filterAlpha", "getFilterAlpha", "hintDescription", "getHintDescription", "()I", "hintTitle", "getHintTitle", "getIcon", "iconBgColor", "getIconBgColor", "iconColorList", "", "getIconColorList", "()Ljava/util/List;", "()Z", "setHaveUpdates", "(Z)V", "isInventoryTab", "isProfileTab", "setSelected", "padding", "getPadding", "getSavedSortFilter", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;", "setSavedSortFilter", "(Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;)V", "getTabName", "()Ljava/lang/String;", "getTabValue", "getTitleIcon", "titleIconColorList", "getTitleIconColorList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceTab {
    public static final int $stable = 8;
    public final int icon;
    public final boolean isHasPlatinumVip;
    public boolean isHaveUpdates;
    public boolean isSelected;

    @NotNull
    public MarketplaceSortFilter savedSortFilter;

    @NotNull
    public final String tabName;
    public final int tabValue;
    public final int titleIcon;

    public MarketplaceTab() {
        this(false, 0, null, 0, 0, false, false, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHasPlatinumVip() {
        return this.isHasPlatinumVip;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTabValue() {
        return this.tabValue;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTitleIcon() {
        return this.titleIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsHaveUpdates() {
        return this.isHaveUpdates;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final MarketplaceSortFilter getSavedSortFilter() {
        return this.savedSortFilter;
    }

    @NotNull
    public final MarketplaceTab copy(boolean isHasPlatinumVip, int tabValue, @NotNull String tabName, @DrawableRes int icon, @DrawableRes int titleIcon, boolean isSelected, boolean isHaveUpdates, @NotNull MarketplaceSortFilter savedSortFilter) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(savedSortFilter, "savedSortFilter");
        return new MarketplaceTab(isHasPlatinumVip, tabValue, tabName, icon, titleIcon, isSelected, isHaveUpdates, savedSortFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceTab)) {
            return false;
        }
        MarketplaceTab marketplaceTab = (MarketplaceTab) other;
        return this.isHasPlatinumVip == marketplaceTab.isHasPlatinumVip && this.tabValue == marketplaceTab.tabValue && Intrinsics.areEqual(this.tabName, marketplaceTab.tabName) && this.icon == marketplaceTab.icon && this.titleIcon == marketplaceTab.titleIcon && this.isSelected == marketplaceTab.isSelected && this.isHaveUpdates == marketplaceTab.isHaveUpdates && this.savedSortFilter == marketplaceTab.savedSortFilter;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isHasPlatinumVip) * 31) + Integer.hashCode(this.tabValue)) * 31) + this.tabName.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.titleIcon)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isHaveUpdates)) * 31) + this.savedSortFilter.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketplaceTab(isHasPlatinumVip=" + this.isHasPlatinumVip + ", tabValue=" + this.tabValue + ", tabName=" + this.tabName + ", icon=" + this.icon + ", titleIcon=" + this.titleIcon + ", isSelected=" + this.isSelected + ", isHaveUpdates=" + this.isHaveUpdates + ", savedSortFilter=" + this.savedSortFilter + ")";
    }

    public MarketplaceTab(boolean z, int i, @NotNull String tabName, @DrawableRes int i2, @DrawableRes int i3, boolean z2, boolean z3, @NotNull MarketplaceSortFilter savedSortFilter) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(savedSortFilter, "savedSortFilter");
        this.isHasPlatinumVip = z;
        this.tabValue = i;
        this.tabName = tabName;
        this.icon = i2;
        this.titleIcon = i3;
        this.isSelected = z2;
        this.isHaveUpdates = z3;
        this.savedSortFilter = savedSortFilter;
    }

    public final boolean isHasPlatinumVip() {
        return this.isHasPlatinumVip;
    }

    public final int getTabValue() {
        return this.tabValue;
    }

    public /* synthetic */ MarketplaceTab(boolean z, int i, String str, int i2, int i3, boolean z2, boolean z3, MarketplaceSortFilter marketplaceSortFilter, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 8) != 0 ? R.drawable.ic_marketplace : i2, (i4 & 16) != 0 ? R.drawable.ic_br_logo : i3, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? MarketplaceSortFilter.DESCENDING : marketplaceSortFilter);
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getTitleIcon() {
        return this.titleIcon;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final boolean isHaveUpdates() {
        return this.isHaveUpdates;
    }

    public final void setHaveUpdates(boolean z) {
        this.isHaveUpdates = z;
    }

    @NotNull
    public final MarketplaceSortFilter getSavedSortFilter() {
        return this.savedSortFilter;
    }

    public final void setSavedSortFilter(@NotNull MarketplaceSortFilter marketplaceSortFilter) {
        Intrinsics.checkNotNullParameter(marketplaceSortFilter, "<set-?>");
        this.savedSortFilter = marketplaceSortFilter;
    }

    public final boolean isProfileTab() {
        return this.tabValue == 1;
    }

    public final boolean isInventoryTab() {
        return this.tabValue == 6;
    }

    public final float getElementsAlpha() {
        return isProfileTab() ? 0.0f : 1.0f;
    }

    public final float getFilterAlpha() {
        return (isProfileTab() || isInventoryTab()) ? 0.0f : 1.0f;
    }

    @NotNull
    public final List<Integer> getTitleIconColorList() {
        int i = this.tabValue;
        if (i == 1 || i == 2) {
            if (this.isHasPlatinumVip) {
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.yellow), Integer.valueOf(R.color.yellow_orange)});
            }
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)});
    }

    @NotNull
    public final List<Integer> getIconColorList() {
        if (this.isHasPlatinumVip && !this.isSelected && this.tabValue == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.yellow), Integer.valueOf(R.color.yellow_orange)});
        }
        if (this.isSelected) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.blue_black), Integer.valueOf(R.color.blue_black)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)});
    }

    @ColorRes
    public final int getIconBgColor() {
        return this.isSelected ? R.color.white : R.color.transparent;
    }

    @DimenRes
    public final int getPadding() {
        return this.tabValue == 5 ? R.dimen._2wdp : R.dimen._0wdp;
    }

    public final int getHintTitle() {
        int i = this.tabValue;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.string.common_empty : R.string.marketplace_my_store_tab : R.string.marketplace_favorites_tab : R.string.marketplace_history_tab : R.string.marketplace_home_page_hint : R.string.marketplace_profile_tab;
    }

    public final int getHintDescription() {
        int i = this.tabValue;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.string.common_empty : R.string.marketplace_my_store_hint_description : R.string.marketplace_favorites_hint_description : R.string.marketplace_history_hint_description : R.string.marketplace_home_page_hint_description : R.string.marketplace_profile_hint_description;
    }
}
