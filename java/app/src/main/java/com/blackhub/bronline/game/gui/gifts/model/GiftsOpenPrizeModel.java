package com.blackhub.bronline.game.gui.gifts.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.gifts.GiftsKeys;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsOpenPrizeModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class GiftsOpenPrizeModel {
    public static final int $stable = 8;

    @SerializedName("b")
    @Nullable
    public final List<GiftsOpenPrizeGiftModel> allGifts;

    @SerializedName("t")
    public final int screen;

    @SerializedName("s")
    public final int status;

    @SerializedName("d")
    @Nullable
    public final Integer valueOfBC;

    @SerializedName("pc")
    @Nullable
    public final Integer valueOfLegendaryGifts;

    @SerializedName(GiftsKeys.GET_VALUE_OF_STANDARD_GIFTS_KEY)
    @Nullable
    public final Integer valueOfStandardGifts;

    public GiftsOpenPrizeModel() {
        this(0, 0, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GiftsOpenPrizeModel copy$default(GiftsOpenPrizeModel giftsOpenPrizeModel, int i, int i2, Integer num, Integer num2, Integer num3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = giftsOpenPrizeModel.screen;
        }
        if ((i3 & 2) != 0) {
            i2 = giftsOpenPrizeModel.status;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            num = giftsOpenPrizeModel.valueOfStandardGifts;
        }
        Integer num4 = num;
        if ((i3 & 8) != 0) {
            num2 = giftsOpenPrizeModel.valueOfLegendaryGifts;
        }
        Integer num5 = num2;
        if ((i3 & 16) != 0) {
            num3 = giftsOpenPrizeModel.valueOfBC;
        }
        Integer num6 = num3;
        if ((i3 & 32) != 0) {
            list = giftsOpenPrizeModel.allGifts;
        }
        return giftsOpenPrizeModel.copy(i, i4, num4, num5, num6, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getValueOfStandardGifts() {
        return this.valueOfStandardGifts;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getValueOfLegendaryGifts() {
        return this.valueOfLegendaryGifts;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getValueOfBC() {
        return this.valueOfBC;
    }

    @Nullable
    public final List<GiftsOpenPrizeGiftModel> component6() {
        return this.allGifts;
    }

    @NotNull
    public final GiftsOpenPrizeModel copy(int screen, int status, @Nullable Integer valueOfStandardGifts, @Nullable Integer valueOfLegendaryGifts, @Nullable Integer valueOfBC, @Nullable List<GiftsOpenPrizeGiftModel> allGifts) {
        return new GiftsOpenPrizeModel(screen, status, valueOfStandardGifts, valueOfLegendaryGifts, valueOfBC, allGifts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftsOpenPrizeModel)) {
            return false;
        }
        GiftsOpenPrizeModel giftsOpenPrizeModel = (GiftsOpenPrizeModel) other;
        return this.screen == giftsOpenPrizeModel.screen && this.status == giftsOpenPrizeModel.status && Intrinsics.areEqual(this.valueOfStandardGifts, giftsOpenPrizeModel.valueOfStandardGifts) && Intrinsics.areEqual(this.valueOfLegendaryGifts, giftsOpenPrizeModel.valueOfLegendaryGifts) && Intrinsics.areEqual(this.valueOfBC, giftsOpenPrizeModel.valueOfBC) && Intrinsics.areEqual(this.allGifts, giftsOpenPrizeModel.allGifts);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.screen) * 31) + Integer.hashCode(this.status)) * 31;
        Integer num = this.valueOfStandardGifts;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.valueOfLegendaryGifts;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.valueOfBC;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<GiftsOpenPrizeGiftModel> list = this.allGifts;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GiftsOpenPrizeModel(screen=" + this.screen + ", status=" + this.status + ", valueOfStandardGifts=" + this.valueOfStandardGifts + ", valueOfLegendaryGifts=" + this.valueOfLegendaryGifts + ", valueOfBC=" + this.valueOfBC + ", allGifts=" + this.allGifts + ")";
    }

    public GiftsOpenPrizeModel(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<GiftsOpenPrizeGiftModel> list) {
        this.screen = i;
        this.status = i2;
        this.valueOfStandardGifts = num;
        this.valueOfLegendaryGifts = num2;
        this.valueOfBC = num3;
        this.allGifts = list;
    }

    public /* synthetic */ GiftsOpenPrizeModel(int i, int i2, Integer num, Integer num2, Integer num3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3, (i3 & 32) == 0 ? list : null);
    }

    public final int getScreen() {
        return this.screen;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getValueOfStandardGifts() {
        return this.valueOfStandardGifts;
    }

    @Nullable
    public final Integer getValueOfLegendaryGifts() {
        return this.valueOfLegendaryGifts;
    }

    @Nullable
    public final Integer getValueOfBC() {
        return this.valueOfBC;
    }

    @Nullable
    public final List<GiftsOpenPrizeGiftModel> getAllGifts() {
        return this.allGifts;
    }
}

