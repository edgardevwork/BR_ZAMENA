package com.blackhub.bronline.game.model.remote.response.bprewards;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsResponse {
    public static final int $stable = 8;

    @SerializedName("awardsTypes")
    @NotNull
    public final List<BpRewardsAwardsDto> listOfAwardsTypes;

    public BpRewardsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BpRewardsResponse copy$default(BpRewardsResponse bpRewardsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bpRewardsResponse.listOfAwardsTypes;
        }
        return bpRewardsResponse.copy(list);
    }

    @NotNull
    public final List<BpRewardsAwardsDto> component1() {
        return this.listOfAwardsTypes;
    }

    @NotNull
    public final BpRewardsResponse copy(@NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        return new BpRewardsResponse(listOfAwardsTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BpRewardsResponse) && Intrinsics.areEqual(this.listOfAwardsTypes, ((BpRewardsResponse) other).listOfAwardsTypes);
    }

    public int hashCode() {
        return this.listOfAwardsTypes.hashCode();
    }

    @NotNull
    public String toString() {
        return "BpRewardsResponse(listOfAwardsTypes=" + this.listOfAwardsTypes + ")";
    }

    public BpRewardsResponse(@NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        this.listOfAwardsTypes = listOfAwardsTypes;
    }

    public /* synthetic */ BpRewardsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<BpRewardsAwardsDto> getListOfAwardsTypes() {
        return this.listOfAwardsTypes;
    }
}

