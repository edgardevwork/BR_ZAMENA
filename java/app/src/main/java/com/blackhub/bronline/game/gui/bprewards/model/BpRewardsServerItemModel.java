package com.blackhub.bronline.game.gui.bprewards.model;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsKeys;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsServerItemModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsServerItemModel {
    public static final int $stable = 8;

    @SerializedName("ds")
    public final int daysLeft;

    @SerializedName(BpRewardsKeys.ID_FOR_IMAGES_EL_KEY)
    @Nullable
    public final Integer idForImages;

    @NotNull
    public BpRewardsImageModel imageModel;
    public final boolean isEmptyItem;

    @SerializedName("st")
    public int isHaveAlarm;

    @SerializedName("id")
    public final int itemIdOnServer;

    @SerializedName("n")
    @NotNull
    public String itemName;

    @Nullable
    public String itemNameForPreview;

    @SerializedName(BpRewardsKeys.PLATE_TEXT)
    @NotNull
    public final List<String> plateText;

    @SerializedName("td")
    public final int prizeType;

    @SerializedName("ct")
    public final int quantity;

    @SerializedName("r")
    public final int rarity;

    @NotNull
    public String rewardDays;

    @SerializedName("c")
    @Nullable
    public final Integer skinModelId;

    @SerializedName("sp")
    public final int sprayPrice;

    public BpRewardsServerItemModel() {
        this(0, null, 0, 0, null, null, 0, 0, null, 0, 0, false, null, null, null, 32767, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemIdOnServer() {
        return this.itemIdOnServer;
    }

    /* renamed from: component10, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    /* renamed from: component11, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsEmptyItem() {
        return this.isEmptyItem;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getRewardDays() {
        return this.rewardDays;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final BpRewardsImageModel getImageModel() {
        return this.imageModel;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getItemNameForPreview() {
        return this.itemNameForPreview;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrizeType() {
        return this.prizeType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIsHaveAlarm() {
        return this.isHaveAlarm;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getIdForImages() {
        return this.idForImages;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getSkinModelId() {
        return this.skinModelId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDaysLeft() {
        return this.daysLeft;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSprayPrice() {
        return this.sprayPrice;
    }

    @NotNull
    public final List<String> component9() {
        return this.plateText;
    }

    @NotNull
    public final BpRewardsServerItemModel copy(int itemIdOnServer, @NotNull String itemName, int prizeType, int isHaveAlarm, @Nullable Integer idForImages, @Nullable Integer skinModelId, int daysLeft, int sprayPrice, @NotNull List<String> plateText, int rarity, int quantity, boolean isEmptyItem, @NotNull String rewardDays, @NotNull BpRewardsImageModel imageModel, @Nullable String itemNameForPreview) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(plateText, "plateText");
        Intrinsics.checkNotNullParameter(rewardDays, "rewardDays");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        return new BpRewardsServerItemModel(itemIdOnServer, itemName, prizeType, isHaveAlarm, idForImages, skinModelId, daysLeft, sprayPrice, plateText, rarity, quantity, isEmptyItem, rewardDays, imageModel, itemNameForPreview);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsServerItemModel)) {
            return false;
        }
        BpRewardsServerItemModel bpRewardsServerItemModel = (BpRewardsServerItemModel) other;
        return this.itemIdOnServer == bpRewardsServerItemModel.itemIdOnServer && Intrinsics.areEqual(this.itemName, bpRewardsServerItemModel.itemName) && this.prizeType == bpRewardsServerItemModel.prizeType && this.isHaveAlarm == bpRewardsServerItemModel.isHaveAlarm && Intrinsics.areEqual(this.idForImages, bpRewardsServerItemModel.idForImages) && Intrinsics.areEqual(this.skinModelId, bpRewardsServerItemModel.skinModelId) && this.daysLeft == bpRewardsServerItemModel.daysLeft && this.sprayPrice == bpRewardsServerItemModel.sprayPrice && Intrinsics.areEqual(this.plateText, bpRewardsServerItemModel.plateText) && this.rarity == bpRewardsServerItemModel.rarity && this.quantity == bpRewardsServerItemModel.quantity && this.isEmptyItem == bpRewardsServerItemModel.isEmptyItem && Intrinsics.areEqual(this.rewardDays, bpRewardsServerItemModel.rewardDays) && Intrinsics.areEqual(this.imageModel, bpRewardsServerItemModel.imageModel) && Intrinsics.areEqual(this.itemNameForPreview, bpRewardsServerItemModel.itemNameForPreview);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.itemIdOnServer) * 31) + this.itemName.hashCode()) * 31) + Integer.hashCode(this.prizeType)) * 31) + Integer.hashCode(this.isHaveAlarm)) * 31;
        Integer num = this.idForImages;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.skinModelId;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.daysLeft)) * 31) + Integer.hashCode(this.sprayPrice)) * 31) + this.plateText.hashCode()) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isEmptyItem)) * 31) + this.rewardDays.hashCode()) * 31) + this.imageModel.hashCode()) * 31;
        String str = this.itemNameForPreview;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BpRewardsServerItemModel(itemIdOnServer=" + this.itemIdOnServer + ", itemName=" + this.itemName + ", prizeType=" + this.prizeType + ", isHaveAlarm=" + this.isHaveAlarm + ", idForImages=" + this.idForImages + ", skinModelId=" + this.skinModelId + ", daysLeft=" + this.daysLeft + ", sprayPrice=" + this.sprayPrice + ", plateText=" + this.plateText + ", rarity=" + this.rarity + ", quantity=" + this.quantity + ", isEmptyItem=" + this.isEmptyItem + ", rewardDays=" + this.rewardDays + ", imageModel=" + this.imageModel + ", itemNameForPreview=" + this.itemNameForPreview + ")";
    }

    public BpRewardsServerItemModel(int i, @NotNull String itemName, int i2, int i3, @Nullable Integer num, @Nullable Integer num2, int i4, int i5, @NotNull List<String> plateText, int i6, int i7, boolean z, @NotNull String rewardDays, @NotNull BpRewardsImageModel imageModel, @Nullable String str) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(plateText, "plateText");
        Intrinsics.checkNotNullParameter(rewardDays, "rewardDays");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        this.itemIdOnServer = i;
        this.itemName = itemName;
        this.prizeType = i2;
        this.isHaveAlarm = i3;
        this.idForImages = num;
        this.skinModelId = num2;
        this.daysLeft = i4;
        this.sprayPrice = i5;
        this.plateText = plateText;
        this.rarity = i6;
        this.quantity = i7;
        this.isEmptyItem = z;
        this.rewardDays = rewardDays;
        this.imageModel = imageModel;
        this.itemNameForPreview = str;
    }

    public final int getItemIdOnServer() {
        return this.itemIdOnServer;
    }

    public /* synthetic */ BpRewardsServerItemModel(int i, String str, int i2, int i3, Integer num, Integer num2, int i4, int i5, List list, int i6, int i7, boolean z, String str2, BpRewardsImageModel bpRewardsImageModel, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2, (i8 & 64) != 0 ? 0 : i4, (i8 & 128) != 0 ? 0 : i5, (i8 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i8 & 512) != 0 ? 1 : i6, (i8 & 1024) != 0 ? 0 : i7, (i8 & 2048) == 0 ? z : false, (i8 & 4096) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i8 & 8192) != 0 ? new BpRewardsImageModel(0, null, null, 0, 15, null) : bpRewardsImageModel, (i8 & 16384) == 0 ? str3 : null);
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    public final void setItemName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemName = str;
    }

    public final int getPrizeType() {
        return this.prizeType;
    }

    public final int isHaveAlarm() {
        return this.isHaveAlarm;
    }

    public final void setHaveAlarm(int i) {
        this.isHaveAlarm = i;
    }

    @Nullable
    public final Integer getIdForImages() {
        return this.idForImages;
    }

    @Nullable
    public final Integer getSkinModelId() {
        return this.skinModelId;
    }

    public final int getDaysLeft() {
        return this.daysLeft;
    }

    public final int getSprayPrice() {
        return this.sprayPrice;
    }

    @NotNull
    public final List<String> getPlateText() {
        return this.plateText;
    }

    public final int getRarity() {
        return this.rarity;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final boolean isEmptyItem() {
        return this.isEmptyItem;
    }

    @NotNull
    public final String getRewardDays() {
        return this.rewardDays;
    }

    public final void setRewardDays(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardDays = str;
    }

    @NotNull
    public final BpRewardsImageModel getImageModel() {
        return this.imageModel;
    }

    public final void setImageModel(@NotNull BpRewardsImageModel bpRewardsImageModel) {
        Intrinsics.checkNotNullParameter(bpRewardsImageModel, "<set-?>");
        this.imageModel = bpRewardsImageModel;
    }

    @Nullable
    public final String getItemNameForPreview() {
        return this.itemNameForPreview;
    }

    public final void setItemNameForPreview(@Nullable String str) {
        this.itemNameForPreview = str;
    }

    @ColorRes
    public final int getBorderColor() {
        int i = this.rarity;
        return i == CommonRarityEnum.COMMON.getValue() ? R.color.white : i == CommonRarityEnum.UNCOMMON.getValue() ? R.color.green : i == CommonRarityEnum.RARE.getValue() ? R.color.light_blue : i == CommonRarityEnum.EPIC.getValue() ? R.color.purpur : i == CommonRarityEnum.LEGENDARY.getValue() ? R.color.yellow : R.color.white;
    }
}

