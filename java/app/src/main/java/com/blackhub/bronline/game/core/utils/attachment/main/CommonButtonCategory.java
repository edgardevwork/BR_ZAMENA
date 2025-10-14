package com.blackhub.bronline.game.core.utils.attachment.main;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonButtonCategory.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class CommonButtonCategory {
    public static final int $stable = 8;
    public final int categoryId;

    @NotNull
    public final String categoryName;
    public final boolean hasUpdates;

    @Nullable
    public final Bitmap iconCDN;
    public final boolean isSelected;

    @Nullable
    public final List<Integer> objectGrades;

    @Nullable
    public final List<String> objectImages;

    public CommonButtonCategory() {
        this(0, null, null, false, false, null, null, 127, null);
    }

    public static /* synthetic */ CommonButtonCategory copy$default(CommonButtonCategory commonButtonCategory, int i, String str, Bitmap bitmap, boolean z, boolean z2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commonButtonCategory.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = commonButtonCategory.categoryName;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            bitmap = commonButtonCategory.iconCDN;
        }
        Bitmap bitmap2 = bitmap;
        if ((i2 & 8) != 0) {
            z = commonButtonCategory.isSelected;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = commonButtonCategory.hasUpdates;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            list = commonButtonCategory.objectGrades;
        }
        List list3 = list;
        if ((i2 & 64) != 0) {
            list2 = commonButtonCategory.objectImages;
        }
        return commonButtonCategory.copy(i, str2, bitmap2, z3, z4, list3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getIconCDN() {
        return this.iconCDN;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasUpdates() {
        return this.hasUpdates;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.objectGrades;
    }

    @Nullable
    public final List<String> component7() {
        return this.objectImages;
    }

    @NotNull
    public final CommonButtonCategory copy(int categoryId, @NotNull String categoryName, @Nullable Bitmap iconCDN, boolean isSelected, boolean hasUpdates, @Nullable List<Integer> objectGrades, @Nullable List<String> objectImages) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        return new CommonButtonCategory(categoryId, categoryName, iconCDN, isSelected, hasUpdates, objectGrades, objectImages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonButtonCategory)) {
            return false;
        }
        CommonButtonCategory commonButtonCategory = (CommonButtonCategory) other;
        return this.categoryId == commonButtonCategory.categoryId && Intrinsics.areEqual(this.categoryName, commonButtonCategory.categoryName) && Intrinsics.areEqual(this.iconCDN, commonButtonCategory.iconCDN) && this.isSelected == commonButtonCategory.isSelected && this.hasUpdates == commonButtonCategory.hasUpdates && Intrinsics.areEqual(this.objectGrades, commonButtonCategory.objectGrades) && Intrinsics.areEqual(this.objectImages, commonButtonCategory.objectImages);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.categoryId) * 31) + this.categoryName.hashCode()) * 31;
        Bitmap bitmap = this.iconCDN;
        int iHashCode2 = (((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.hasUpdates)) * 31;
        List<Integer> list = this.objectGrades;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.objectImages;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonButtonCategory(categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", iconCDN=" + this.iconCDN + ", isSelected=" + this.isSelected + ", hasUpdates=" + this.hasUpdates + ", objectGrades=" + this.objectGrades + ", objectImages=" + this.objectImages + ")";
    }

    public CommonButtonCategory(int i, @NotNull String categoryName, @Nullable Bitmap bitmap, boolean z, boolean z2, @Nullable List<Integer> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        this.categoryId = i;
        this.categoryName = categoryName;
        this.iconCDN = bitmap;
        this.isSelected = z;
        this.hasUpdates = z2;
        this.objectGrades = list;
        this.objectImages = list2;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public /* synthetic */ CommonButtonCategory(int i, String str, Bitmap bitmap, boolean z, boolean z2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? null : bitmap, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2);
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    public final Bitmap getIconCDN() {
        return this.iconCDN;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean getHasUpdates() {
        return this.hasUpdates;
    }

    @Nullable
    public final List<Integer> getObjectGrades() {
        return this.objectGrades;
    }

    @Nullable
    public final List<String> getObjectImages() {
        return this.objectImages;
    }

    @ColorRes
    public final int getIconColor() {
        return this.isSelected ? R.color.blue_black : R.color.white;
    }

    @ColorRes
    public final int getIconBgColor() {
        return this.isSelected ? R.color.white : R.color.transparent;
    }
}

