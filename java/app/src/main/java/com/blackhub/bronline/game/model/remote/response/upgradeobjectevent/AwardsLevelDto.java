package com.blackhub.bronline.game.model.remote.response.upgradeobjectevent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AwardsLevelDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class AwardsLevelDto {
    public static final int $stable = 0;

    @SerializedName("description")
    @Nullable
    public final String description;

    @SerializedName("description_store")
    @Nullable
    public final String descriptionStore;

    @SerializedName("place")
    @Nullable
    public final Integer place;

    public static /* synthetic */ AwardsLevelDto copy$default(AwardsLevelDto awardsLevelDto, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awardsLevelDto.description;
        }
        if ((i & 2) != 0) {
            str2 = awardsLevelDto.descriptionStore;
        }
        if ((i & 4) != 0) {
            num = awardsLevelDto.place;
        }
        return awardsLevelDto.copy(str, str2, num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPlace() {
        return this.place;
    }

    @NotNull
    public final AwardsLevelDto copy(@Nullable String description, @Nullable String descriptionStore, @Nullable Integer place) {
        return new AwardsLevelDto(description, descriptionStore, place);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwardsLevelDto)) {
            return false;
        }
        AwardsLevelDto awardsLevelDto = (AwardsLevelDto) other;
        return Intrinsics.areEqual(this.description, awardsLevelDto.description) && Intrinsics.areEqual(this.descriptionStore, awardsLevelDto.descriptionStore) && Intrinsics.areEqual(this.place, awardsLevelDto.place);
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.descriptionStore;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.place;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AwardsLevelDto(description=" + this.description + ", descriptionStore=" + this.descriptionStore + ", place=" + this.place + ")";
    }

    public AwardsLevelDto(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.description = str;
        this.descriptionStore = str2;
        this.place = num;
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
    public final Integer getPlace() {
        return this.place;
    }
}

