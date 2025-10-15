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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "", "awardsLevelDto", "", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/AwardsLevelDto;", "awardsTopDto", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/AwardsTopDto;", "(Ljava/util/List;Ljava/util/List;)V", "getAwardsLevelDto", "()Ljava/util/List;", "getAwardsTopDto", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
