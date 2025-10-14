package com.blackhub.bronline.game.model.remote.response.christmastree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AwardsTopDto.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/christmastree/AwardsTopDto;", "", "description", "", "descriptionStore", "place", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDescription", "()Ljava/lang/String;", "getDescriptionStore", "getPlace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/model/remote/response/christmastree/AwardsTopDto;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AwardsTopDto {
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

    public static /* synthetic */ AwardsTopDto copy$default(AwardsTopDto awardsTopDto, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awardsTopDto.description;
        }
        if ((i & 2) != 0) {
            str2 = awardsTopDto.descriptionStore;
        }
        if ((i & 4) != 0) {
            num = awardsTopDto.place;
        }
        return awardsTopDto.copy(str, str2, num);
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
    public final AwardsTopDto copy(@Nullable String description, @Nullable String descriptionStore, @Nullable Integer place) {
        return new AwardsTopDto(description, descriptionStore, place);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwardsTopDto)) {
            return false;
        }
        AwardsTopDto awardsTopDto = (AwardsTopDto) other;
        return Intrinsics.areEqual(this.description, awardsTopDto.description) && Intrinsics.areEqual(this.descriptionStore, awardsTopDto.descriptionStore) && Intrinsics.areEqual(this.place, awardsTopDto.place);
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
        return "AwardsTopDto(description=" + this.description + ", descriptionStore=" + this.descriptionStore + ", place=" + this.place + ")";
    }

    public AwardsTopDto(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
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
