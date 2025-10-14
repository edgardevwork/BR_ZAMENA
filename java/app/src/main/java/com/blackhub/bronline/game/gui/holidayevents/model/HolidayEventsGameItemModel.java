package com.blackhub.bronline.game.gui.holidayevents.model;

import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsGameItemModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsGameItemModel {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap gameImage;

    @NotNull
    public final String gameName;
    public final int id;
    public final boolean isPlayable;
    public final boolean isSelected;

    public HolidayEventsGameItemModel() {
        this(0, false, false, null, null, 31, null);
    }

    public static /* synthetic */ HolidayEventsGameItemModel copy$default(HolidayEventsGameItemModel holidayEventsGameItemModel, int i, boolean z, boolean z2, String str, Bitmap bitmap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = holidayEventsGameItemModel.id;
        }
        if ((i2 & 2) != 0) {
            z = holidayEventsGameItemModel.isSelected;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = holidayEventsGameItemModel.isPlayable;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            str = holidayEventsGameItemModel.gameName;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            bitmap = holidayEventsGameItemModel.gameImage;
        }
        return holidayEventsGameItemModel.copy(i, z3, z4, str2, bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPlayable() {
        return this.isPlayable;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bitmap getGameImage() {
        return this.gameImage;
    }

    @NotNull
    public final HolidayEventsGameItemModel copy(int id, boolean isSelected, boolean isPlayable, @NotNull String gameName, @Nullable Bitmap gameImage) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        return new HolidayEventsGameItemModel(id, isSelected, isPlayable, gameName, gameImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsGameItemModel)) {
            return false;
        }
        HolidayEventsGameItemModel holidayEventsGameItemModel = (HolidayEventsGameItemModel) other;
        return this.id == holidayEventsGameItemModel.id && this.isSelected == holidayEventsGameItemModel.isSelected && this.isPlayable == holidayEventsGameItemModel.isPlayable && Intrinsics.areEqual(this.gameName, holidayEventsGameItemModel.gameName) && Intrinsics.areEqual(this.gameImage, holidayEventsGameItemModel.gameImage);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isPlayable)) * 31) + this.gameName.hashCode()) * 31;
        Bitmap bitmap = this.gameImage;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "HolidayEventsGameItemModel(id=" + this.id + ", isSelected=" + this.isSelected + ", isPlayable=" + this.isPlayable + ", gameName=" + this.gameName + ", gameImage=" + this.gameImage + ")";
    }

    public HolidayEventsGameItemModel(int i, boolean z, boolean z2, @NotNull String gameName, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        this.id = i;
        this.isSelected = z;
        this.isPlayable = z2;
        this.gameName = gameName;
        this.gameImage = bitmap;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isPlayable() {
        return this.isPlayable;
    }

    public /* synthetic */ HolidayEventsGameItemModel(int i, boolean z, boolean z2, String str, Bitmap bitmap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0 ? z2 : false, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 16) != 0 ? null : bitmap);
    }

    @NotNull
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final Bitmap getGameImage() {
        return this.gameImage;
    }

    @DimenRes
    public final int getBorderWidth() {
        return this.isSelected ? R.dimen._2wdp : R.dimen.minus_one_dp;
    }
}

