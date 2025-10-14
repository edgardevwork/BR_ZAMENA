package com.blackhub.bronline.game.model.remote.response.bprewards;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsAwardsDto.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsAwardsDto {
    public static final int $stable = 8;

    @SerializedName("id")
    public final int id;

    @SerializedName("image")
    @NotNull
    public final List<String> imageList;

    @SerializedName("name")
    @NotNull
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BpRewardsAwardsDto copy$default(BpRewardsAwardsDto bpRewardsAwardsDto, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bpRewardsAwardsDto.id;
        }
        if ((i2 & 2) != 0) {
            str = bpRewardsAwardsDto.name;
        }
        if ((i2 & 4) != 0) {
            list = bpRewardsAwardsDto.imageList;
        }
        return bpRewardsAwardsDto.copy(i, str, list);
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
    public final List<String> component3() {
        return this.imageList;
    }

    @NotNull
    public final BpRewardsAwardsDto copy(int id, @NotNull String name, @NotNull List<String> imageList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        return new BpRewardsAwardsDto(id, name, imageList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsAwardsDto)) {
            return false;
        }
        BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) other;
        return this.id == bpRewardsAwardsDto.id && Intrinsics.areEqual(this.name, bpRewardsAwardsDto.name) && Intrinsics.areEqual(this.imageList, bpRewardsAwardsDto.imageList);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.imageList.hashCode();
    }

    @NotNull
    public String toString() {
        return "BpRewardsAwardsDto(id=" + this.id + ", name=" + this.name + ", imageList=" + this.imageList + ")";
    }

    public BpRewardsAwardsDto(int i, @NotNull String name, @NotNull List<String> imageList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        this.id = i;
        this.name = name;
        this.imageList = imageList;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getImageList() {
        return this.imageList;
    }
}

