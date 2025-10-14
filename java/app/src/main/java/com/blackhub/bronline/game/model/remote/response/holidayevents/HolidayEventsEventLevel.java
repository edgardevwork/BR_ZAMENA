package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsEventLevel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsEventLevel {
    public static final int $stable = 0;

    @SerializedName(CatchStreamerKeys.COST_KEY)
    public final int cost;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public final int count;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("descriptionStore")
    @Nullable
    public final String descriptionStore;

    @SerializedName("id")
    public final int id;

    @SerializedName("imageName")
    @Nullable
    public final String imageName;

    @SerializedName("internalId")
    public final int internalId;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("nameStore")
    @Nullable
    public final String nameStore;

    @SerializedName("rarity")
    public final int rarity;

    @SerializedName("typeId")
    public final int typeId;

    @SerializedName("typeReward")
    @Nullable
    public final Integer typeReward;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCount() {
        return this.count;
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

    /* renamed from: component2, reason: from getter */
    public final int getCost() {
        return this.cost;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    @NotNull
    public final HolidayEventsEventLevel copy(int id, int cost, @NotNull String name, @Nullable String nameStore, @NotNull String description, @Nullable String descriptionStore, int rarity, int typeId, int internalId, int count, @Nullable Integer typeReward, @Nullable String imageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new HolidayEventsEventLevel(id, cost, name, nameStore, description, descriptionStore, rarity, typeId, internalId, count, typeReward, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsEventLevel)) {
            return false;
        }
        HolidayEventsEventLevel holidayEventsEventLevel = (HolidayEventsEventLevel) other;
        return this.id == holidayEventsEventLevel.id && this.cost == holidayEventsEventLevel.cost && Intrinsics.areEqual(this.name, holidayEventsEventLevel.name) && Intrinsics.areEqual(this.nameStore, holidayEventsEventLevel.nameStore) && Intrinsics.areEqual(this.description, holidayEventsEventLevel.description) && Intrinsics.areEqual(this.descriptionStore, holidayEventsEventLevel.descriptionStore) && this.rarity == holidayEventsEventLevel.rarity && this.typeId == holidayEventsEventLevel.typeId && this.internalId == holidayEventsEventLevel.internalId && this.count == holidayEventsEventLevel.count && Intrinsics.areEqual(this.typeReward, holidayEventsEventLevel.typeReward) && Intrinsics.areEqual(this.imageName, holidayEventsEventLevel.imageName);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.cost)) * 31) + this.name.hashCode()) * 31;
        String str = this.nameStore;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
        String str2 = this.descriptionStore;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.internalId)) * 31) + Integer.hashCode(this.count)) * 31;
        Integer num = this.typeReward;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.imageName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsEventLevel(id=" + this.id + ", cost=" + this.cost + ", name=" + this.name + ", nameStore=" + this.nameStore + ", description=" + this.description + ", descriptionStore=" + this.descriptionStore + ", rarity=" + this.rarity + ", typeId=" + this.typeId + ", internalId=" + this.internalId + ", count=" + this.count + ", typeReward=" + this.typeReward + ", imageName=" + this.imageName + ")";
    }

    public HolidayEventsEventLevel(int i, int i2, @NotNull String name, @Nullable String str, @NotNull String description, @Nullable String str2, int i3, int i4, int i5, int i6, @Nullable Integer num, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.cost = i2;
        this.name = name;
        this.nameStore = str;
        this.description = description;
        this.descriptionStore = str2;
        this.rarity = i3;
        this.typeId = i4;
        this.internalId = i5;
        this.count = i6;
        this.typeReward = num;
        this.imageName = str3;
    }

    public final int getId() {
        return this.id;
    }

    public final int getCost() {
        return this.cost;
    }

    public /* synthetic */ HolidayEventsEventLevel(int i, int i2, String str, String str2, String str3, String str4, int i3, int i4, int i5, int i6, Integer num, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, str2, (i7 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, str4, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) != 0 ? 0 : i6, num, str5);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameStore() {
        return this.nameStore;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    public final int getRarity() {
        return this.rarity;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getInternalId() {
        return this.internalId;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getTypeReward() {
        return this.typeReward;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }
}

