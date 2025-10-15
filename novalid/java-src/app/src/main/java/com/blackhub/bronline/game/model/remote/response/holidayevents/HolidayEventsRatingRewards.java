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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsRatingRewards;", "", "id", "", "name", "", "nameStore", "rarity", "typeId", "internalId", CatchStreamerKeys.COUNT_KEY, "imageName", "(ILjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V", "getCount", "()I", "getId", "getImageName", "()Ljava/lang/String;", "getInternalId", "getName", "getNameStore", "getRarity", "getTypeId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
