package com.blackhub.bronline.game.gui.spawnlocation.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpawnLocationList.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class SpawnLocationList {
    public static final int $stable = 8;

    @NotNull
    public List<Integer> listOfAvailability;

    @SerializedName("spawnLocation")
    @NotNull
    public List<SpawnLocationItem> spawnLocationList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpawnLocationList copy$default(SpawnLocationList spawnLocationList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spawnLocationList.spawnLocationList;
        }
        return spawnLocationList.copy(list);
    }

    @NotNull
    public final List<SpawnLocationItem> component1() {
        return this.spawnLocationList;
    }

    @NotNull
    public final SpawnLocationList copy(@NotNull List<SpawnLocationItem> spawnLocationList) {
        Intrinsics.checkNotNullParameter(spawnLocationList, "spawnLocationList");
        return new SpawnLocationList(spawnLocationList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpawnLocationList) && Intrinsics.areEqual(this.spawnLocationList, ((SpawnLocationList) other).spawnLocationList);
    }

    public int hashCode() {
        return this.spawnLocationList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpawnLocationList(spawnLocationList=" + this.spawnLocationList + ")";
    }

    public SpawnLocationList(@NotNull List<SpawnLocationItem> spawnLocationList) {
        Intrinsics.checkNotNullParameter(spawnLocationList, "spawnLocationList");
        this.spawnLocationList = spawnLocationList;
        this.listOfAvailability = new ArrayList();
    }

    @NotNull
    public final List<SpawnLocationItem> getSpawnLocationList() {
        return this.spawnLocationList;
    }

    public final void setSpawnLocationList(@NotNull List<SpawnLocationItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.spawnLocationList = list;
    }

    @NotNull
    public final List<Integer> getListOfAvailability() {
        return this.listOfAvailability;
    }

    public final void setListOfAvailability(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listOfAvailability = list;
    }
}

