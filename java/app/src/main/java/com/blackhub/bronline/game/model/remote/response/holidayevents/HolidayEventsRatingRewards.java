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

/* compiled from: HolidayEventsRatingRewards.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsRatingRewards {
    public static final int $stable = 0;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public final int count;

    @SerializedName("id")
    public final int id;

    @SerializedName("imageName")
    @NotNull
    public final String imageName;

    @SerializedName("internalId")
    public final int internalId;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("nameStore")
    @NotNull
    public final String nameStore;

    @SerializedName("rarity")
    public final int rarity;

    @SerializedName("typeId")
    public final int typeId;

    public HolidayEventsRatingRewards() {
        this(0, null, null, 0, 0, 0, 0, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final HolidayEventsRatingRewards copy(int id, @NotNull String name, @NotNull String nameStore, int rarity, int typeId, int internalId, int count, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStore, "nameStore");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new HolidayEventsRatingRewards(id, name, nameStore, rarity, typeId, internalId, count, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsRatingRewards)) {
            return false;
        }
        HolidayEventsRatingRewards holidayEventsRatingRewards = (HolidayEventsRatingRewards) other;
        return this.id == holidayEventsRatingRewards.id && Intrinsics.areEqual(this.name, holidayEventsRatingRewards.name) && Intrinsics.areEqual(this.nameStore, holidayEventsRatingRewards.nameStore) && this.rarity == holidayEventsRatingRewards.rarity && this.typeId == holidayEventsRatingRewards.typeId && this.internalId == holidayEventsRatingRewards.internalId && this.count == holidayEventsRatingRewards.count && Intrinsics.areEqual(this.imageName, holidayEventsRatingRewards.imageName);
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.nameStore.hashCode()) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.internalId)) * 31) + Integer.hashCode(this.count)) * 31) + this.imageName.hashCode();
    }

    @NotNull
    public String toString() {
        return "HolidayEventsRatingRewards(id=" + this.id + ", name=" + this.name + ", nameStore=" + this.nameStore + ", rarity=" + this.rarity + ", typeId=" + this.typeId + ", internalId=" + this.internalId + ", count=" + this.count + ", imageName=" + this.imageName + ")";
    }

    public HolidayEventsRatingRewards(int i, @NotNull String name, @NotNull String nameStore, int i2, int i3, int i4, int i5, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStore, "nameStore");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.id = i;
        this.name = name;
        this.nameStore = nameStore;
        this.rarity = i2;
        this.typeId = i3;
        this.internalId = i4;
        this.count = i5;
        this.imageName = imageName;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ HolidayEventsRatingRewards(int i, String str, String str2, int i2, int i3, int i4, int i5, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) == 0 ? i5 : 0, (i6 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNameStore() {
        return this.nameStore;
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

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }
}

