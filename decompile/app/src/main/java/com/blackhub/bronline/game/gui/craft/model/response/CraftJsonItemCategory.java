package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonItemCategory.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategory;", "", "categoryId", "", "categoryName", "", "iconCDN", "(ILjava/lang/String;Ljava/lang/String;)V", "getCategoryId", "()I", "getCategoryName", "()Ljava/lang/String;", "getIconCDN", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CraftJsonItemCategory {
    public static final int $stable = 0;

    @SerializedName("categoryId")
    public final int categoryId;

    @SerializedName("categoryName")
    @NotNull
    public final String categoryName;

    @SerializedName("iconCDN")
    @NotNull
    public final String iconCDN;

    public static /* synthetic */ CraftJsonItemCategory copy$default(CraftJsonItemCategory craftJsonItemCategory, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftJsonItemCategory.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = craftJsonItemCategory.categoryName;
        }
        if ((i2 & 4) != 0) {
            str2 = craftJsonItemCategory.iconCDN;
        }
        return craftJsonItemCategory.copy(i, str, str2);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIconCDN() {
        return this.iconCDN;
    }

    @NotNull
    public final CraftJsonItemCategory copy(int categoryId, @NotNull String categoryName, @NotNull String iconCDN) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(iconCDN, "iconCDN");
        return new CraftJsonItemCategory(categoryId, categoryName, iconCDN);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonItemCategory)) {
            return false;
        }
        CraftJsonItemCategory craftJsonItemCategory = (CraftJsonItemCategory) other;
        return this.categoryId == craftJsonItemCategory.categoryId && Intrinsics.areEqual(this.categoryName, craftJsonItemCategory.categoryName) && Intrinsics.areEqual(this.iconCDN, craftJsonItemCategory.iconCDN);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.categoryId) * 31) + this.categoryName.hashCode()) * 31) + this.iconCDN.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftJsonItemCategory(categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", iconCDN=" + this.iconCDN + ")";
    }

    public CraftJsonItemCategory(int i, @NotNull String categoryName, @NotNull String iconCDN) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(iconCDN, "iconCDN");
        this.categoryId = i;
        this.categoryName = categoryName;
        this.iconCDN = iconCDN;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final String getIconCDN() {
        return this.iconCDN;
    }
}
