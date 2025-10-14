package com.blackhub.bronline.game.model.remote.response.calendar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarRewardsDto.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CalendarRewardsDto {
    public static final int $stable = 8;

    @SerializedName("internalId")
    @Nullable
    public final Integer awardId;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    @Nullable
    public final Integer count;

    @SerializedName("description")
    @Nullable
    public final String description;

    @SerializedName("descriptionStore")
    @Nullable
    public final String descriptionStore;

    @SerializedName("id")
    @Nullable
    public final Integer id;

    @NotNull
    public ImageModel imageModel;

    @SerializedName("imageName")
    @Nullable
    public final String imageName;

    @SerializedName("name")
    @Nullable
    public final String name;

    @SerializedName("nameStore")
    @Nullable
    public final String nameStore;

    @SerializedName("rarity")
    @Nullable
    public final Integer rarity;

    @SerializedName("subCount")
    @Nullable
    public final Integer subCount;

    @SerializedName("typeId")
    @Nullable
    public final Integer typeId;

    @SerializedName("typeReward")
    @Nullable
    public final Integer typeReward;

    public CalendarRewardsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getSubCount() {
        return this.subCount;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getTypeReward() {
        return this.typeReward;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTypeId() {
        return this.typeId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAwardId() {
        return this.awardId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @NotNull
    public final CalendarRewardsDto copy(@Nullable Integer id, @Nullable Integer rarity, @Nullable String name, @Nullable String nameStore, @Nullable String description, @Nullable String descriptionStore, @Nullable Integer typeId, @Nullable Integer awardId, @Nullable Integer count, @Nullable Integer subCount, @Nullable Integer typeReward, @Nullable String imageName, @NotNull ImageModel imageModel) {
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        return new CalendarRewardsDto(id, rarity, name, nameStore, description, descriptionStore, typeId, awardId, count, subCount, typeReward, imageName, imageModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarRewardsDto)) {
            return false;
        }
        CalendarRewardsDto calendarRewardsDto = (CalendarRewardsDto) other;
        return Intrinsics.areEqual(this.id, calendarRewardsDto.id) && Intrinsics.areEqual(this.rarity, calendarRewardsDto.rarity) && Intrinsics.areEqual(this.name, calendarRewardsDto.name) && Intrinsics.areEqual(this.nameStore, calendarRewardsDto.nameStore) && Intrinsics.areEqual(this.description, calendarRewardsDto.description) && Intrinsics.areEqual(this.descriptionStore, calendarRewardsDto.descriptionStore) && Intrinsics.areEqual(this.typeId, calendarRewardsDto.typeId) && Intrinsics.areEqual(this.awardId, calendarRewardsDto.awardId) && Intrinsics.areEqual(this.count, calendarRewardsDto.count) && Intrinsics.areEqual(this.subCount, calendarRewardsDto.subCount) && Intrinsics.areEqual(this.typeReward, calendarRewardsDto.typeReward) && Intrinsics.areEqual(this.imageName, calendarRewardsDto.imageName) && Intrinsics.areEqual(this.imageModel, calendarRewardsDto.imageModel);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rarity;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameStore;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.descriptionStore;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.typeId;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.awardId;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.count;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.subCount;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.typeReward;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.imageName;
        return ((iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.imageModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalendarRewardsDto(id=" + this.id + ", rarity=" + this.rarity + ", name=" + this.name + ", nameStore=" + this.nameStore + ", description=" + this.description + ", descriptionStore=" + this.descriptionStore + ", typeId=" + this.typeId + ", awardId=" + this.awardId + ", count=" + this.count + ", subCount=" + this.subCount + ", typeReward=" + this.typeReward + ", imageName=" + this.imageName + ", imageModel=" + this.imageModel + ")";
    }

    public CalendarRewardsDto(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable String str5, @NotNull ImageModel imageModel) {
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        this.id = num;
        this.rarity = num2;
        this.name = str;
        this.nameStore = str2;
        this.description = str3;
        this.descriptionStore = str4;
        this.typeId = num3;
        this.awardId = num4;
        this.count = num5;
        this.subCount = num6;
        this.typeReward = num7;
        this.imageName = str5;
        this.imageModel = imageModel;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    public /* synthetic */ CalendarRewardsDto(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str5, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? 1 : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : num7, (i & 2048) == 0 ? str5 : null, (i & 4096) != 0 ? new ImageModel(0, null, null, null, null, 31, null) : imageModel);
    }

    @Nullable
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameStore() {
        return this.nameStore;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    @Nullable
    public final Integer getTypeId() {
        return this.typeId;
    }

    @Nullable
    public final Integer getAwardId() {
        return this.awardId;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getSubCount() {
        return this.subCount;
    }

    @Nullable
    public final Integer getTypeReward() {
        return this.typeReward;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final ImageModel getImageModel() {
        return this.imageModel;
    }

    public final void setImageModel(@NotNull ImageModel imageModel) {
        Intrinsics.checkNotNullParameter(imageModel, "<set-?>");
        this.imageModel = imageModel;
    }
}

