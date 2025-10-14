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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gifts/model/GiftsOpenPrizeModel;", "", "screen", "", "status", "valueOfStandardGifts", "valueOfLegendaryGifts", "valueOfBC", "allGifts", "", "Lcom/blackhub/bronline/game/gui/gifts/model/GiftsOpenPrizeGiftModel;", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getAllGifts", "()Ljava/util/List;", "getScreen", "()I", "getStatus", "getValueOfBC", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValueOfLegendaryGifts", "getValueOfStandardGifts", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/blackhub/bronline/game/gui/gifts/model/GiftsOpenPrizeModel;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
