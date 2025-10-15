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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "", "id", "", "name", "", "imageList", "", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getImageList", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
