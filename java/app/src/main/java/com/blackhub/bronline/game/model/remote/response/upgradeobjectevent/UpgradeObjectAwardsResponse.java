package com.blackhub.bronline.game.model.remote.response.upgradeobjectevent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectAwardsResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class UpgradeObjectAwardsResponse {
    public static final int $stable = 8;

    @SerializedName("awardsLevel")
    @NotNull
    public final List<AwardsLevelDto> awardsLevelDto;

    @SerializedName("awardsTop")
    @NotNull
    public final List<AwardsTopDto> awardsTopDto;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpgradeObjectAwardsResponse copy$default(UpgradeObjectAwardsResponse upgradeObjectAwardsResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = upgradeObjectAwardsResponse.awardsLevelDto;
        }
        if ((i & 2) != 0) {
            list2 = upgradeObjectAwardsResponse.awardsTopDto;
        }
        return upgradeObjectAwardsResponse.copy(list, list2);
    }

    @NotNull
    public final List<AwardsLevelDto> component1() {
        return this.awardsLevelDto;
    }

    @NotNull
    public final List<AwardsTopDto> component2() {
        return this.awardsTopDto;
    }

    @NotNull
    public final UpgradeObjectAwardsResponse copy(@NotNull List<AwardsLevelDto> awardsLevelDto, @NotNull List<AwardsTopDto> awardsTopDto) {
        Intrinsics.checkNotNullParameter(awardsLevelDto, "awardsLevelDto");
        Intrinsics.checkNotNullParameter(awardsTopDto, "awardsTopDto");
        return new UpgradeObjectAwardsResponse(awardsLevelDto, awardsTopDto);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeObjectAwardsResponse)) {
            return false;
        }
        UpgradeObjectAwardsResponse upgradeObjectAwardsResponse = (UpgradeObjectAwardsResponse) other;
        return Intrinsics.areEqual(this.awardsLevelDto, upgradeObjectAwardsResponse.awardsLevelDto) && Intrinsics.areEqual(this.awardsTopDto, upgradeObjectAwardsResponse.awardsTopDto);
    }

    public int hashCode() {
        return (this.awardsLevelDto.hashCode() * 31) + this.awardsTopDto.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectAwardsResponse(awardsLevelDto=" + this.awardsLevelDto + ", awardsTopDto=" + this.awardsTopDto + ")";
    }

    public UpgradeObjectAwardsResponse(@NotNull List<AwardsLevelDto> awardsLevelDto, @NotNull List<AwardsTopDto> awardsTopDto) {
        Intrinsics.checkNotNullParameter(awardsLevelDto, "awardsLevelDto");
        Intrinsics.checkNotNullParameter(awardsTopDto, "awardsTopDto");
        this.awardsLevelDto = awardsLevelDto;
        this.awardsTopDto = awardsTopDto;
    }

    @NotNull
    public final List<AwardsLevelDto> getAwardsLevelDto() {
        return this.awardsLevelDto;
    }

    @NotNull
    public final List<AwardsTopDto> getAwardsTopDto() {
        return this.awardsTopDto;
    }
}

