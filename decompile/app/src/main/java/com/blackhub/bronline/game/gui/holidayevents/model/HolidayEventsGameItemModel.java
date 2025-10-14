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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGameItemModel;", "", "id", "", "isSelected", "", "isPlayable", "gameName", "", "gameImage", "Landroid/graphics/Bitmap;", "(IZZLjava/lang/String;Landroid/graphics/Bitmap;)V", "borderWidth", "getBorderWidth", "()I", "getGameImage", "()Landroid/graphics/Bitmap;", "getGameName", "()Ljava/lang/String;", "getId", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
