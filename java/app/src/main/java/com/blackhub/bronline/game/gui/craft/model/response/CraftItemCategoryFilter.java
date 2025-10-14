package com.blackhub.bronline.game.gui.craft.model.response;

import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftFilterCustom.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftItemCategoryFilter {
    public static final int $stable = 8;
    public final int categoryId;
    public final long color;
    public final int customEndPadding;
    public final int filterId;

    @NotNull
    public final String filterName;

    @Nullable
    public final Bitmap iconCDNBitmap;

    @NotNull
    public final String preferenceKey;
    public boolean stateOfCheckBox;

    public /* synthetic */ CraftItemCategoryFilter(int i, String str, long j, int i2, String str2, @DimenRes int i3, boolean z, Bitmap bitmap, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j, i2, str2, i3, z, bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFilterId() {
        return this.filterId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFilterName() {
        return this.filterName;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCustomEndPadding() {
        return this.customEndPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getStateOfCheckBox() {
        return this.stateOfCheckBox;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Bitmap getIconCDNBitmap() {
        return this.iconCDNBitmap;
    }

    @NotNull
    /* renamed from: copy-T042LqI, reason: not valid java name */
    public final CraftItemCategoryFilter m14450copyT042LqI(int filterId, @NotNull String filterName, long color, int categoryId, @NotNull String preferenceKey, @DimenRes int customEndPadding, boolean stateOfCheckBox, @Nullable Bitmap iconCDNBitmap) {
        Intrinsics.checkNotNullParameter(filterName, "filterName");
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return new CraftItemCategoryFilter(filterId, filterName, color, categoryId, preferenceKey, customEndPadding, stateOfCheckBox, iconCDNBitmap, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftItemCategoryFilter)) {
            return false;
        }
        CraftItemCategoryFilter craftItemCategoryFilter = (CraftItemCategoryFilter) other;
        return this.filterId == craftItemCategoryFilter.filterId && Intrinsics.areEqual(this.filterName, craftItemCategoryFilter.filterName) && Color.m11341equalsimpl0(this.color, craftItemCategoryFilter.color) && this.categoryId == craftItemCategoryFilter.categoryId && Intrinsics.areEqual(this.preferenceKey, craftItemCategoryFilter.preferenceKey) && this.customEndPadding == craftItemCategoryFilter.customEndPadding && this.stateOfCheckBox == craftItemCategoryFilter.stateOfCheckBox && Intrinsics.areEqual(this.iconCDNBitmap, craftItemCategoryFilter.iconCDNBitmap);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.filterId) * 31) + this.filterName.hashCode()) * 31) + Color.m11347hashCodeimpl(this.color)) * 31) + Integer.hashCode(this.categoryId)) * 31) + this.preferenceKey.hashCode()) * 31) + Integer.hashCode(this.customEndPadding)) * 31) + Boolean.hashCode(this.stateOfCheckBox)) * 31;
        Bitmap bitmap = this.iconCDNBitmap;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "CraftItemCategoryFilter(filterId=" + this.filterId + ", filterName=" + this.filterName + ", color=" + Color.m11348toStringimpl(this.color) + ", categoryId=" + this.categoryId + ", preferenceKey=" + this.preferenceKey + ", customEndPadding=" + this.customEndPadding + ", stateOfCheckBox=" + this.stateOfCheckBox + ", iconCDNBitmap=" + this.iconCDNBitmap + ")";
    }

    public CraftItemCategoryFilter(int i, String filterName, long j, int i2, String preferenceKey, int i3, boolean z, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(filterName, "filterName");
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.filterId = i;
        this.filterName = filterName;
        this.color = j;
        this.categoryId = i2;
        this.preferenceKey = preferenceKey;
        this.customEndPadding = i3;
        this.stateOfCheckBox = z;
        this.iconCDNBitmap = bitmap;
    }

    public final int getFilterId() {
        return this.filterId;
    }

    @NotNull
    public final String getFilterName() {
        return this.filterName;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m14451getColor0d7_KjU() {
        return this.color;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public /* synthetic */ CraftItemCategoryFilter(int i, String str, long j, int i2, String str2, int i3, boolean z, Bitmap bitmap, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j, i2, (i4 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, i3, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? null : bitmap, null);
    }

    @NotNull
    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    public final int getCustomEndPadding() {
        return this.customEndPadding;
    }

    public final boolean getStateOfCheckBox() {
        return this.stateOfCheckBox;
    }

    public final void setStateOfCheckBox(boolean z) {
        this.stateOfCheckBox = z;
    }

    @Nullable
    public final Bitmap getIconCDNBitmap() {
        return this.iconCDNBitmap;
    }
}

