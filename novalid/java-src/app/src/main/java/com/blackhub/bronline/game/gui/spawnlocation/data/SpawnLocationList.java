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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0005¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationList;", "", "spawnLocationList", "", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "(Ljava/util/List;)V", "listOfAvailability", "", "", "getListOfAvailability", "()Ljava/util/List;", "setListOfAvailability", "getSpawnLocationList", "setSpawnLocationList", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
