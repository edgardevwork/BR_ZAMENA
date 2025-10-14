package com.blackhub.bronline.game.gui.spawnlocation.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpawnLocationItem.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class SpawnLocationItem {
    public static final int $stable = 8;

    @SerializedName("id")
    public final int id;

    @SerializedName("place")
    public final int place;

    @SerializedName("place_name")
    @NotNull
    public final String placeName;
    public boolean selected;

    public static /* synthetic */ SpawnLocationItem copy$default(SpawnLocationItem spawnLocationItem, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = spawnLocationItem.id;
        }
        if ((i3 & 2) != 0) {
            i2 = spawnLocationItem.place;
        }
        if ((i3 & 4) != 0) {
            str = spawnLocationItem.placeName;
        }
        return spawnLocationItem.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlace() {
        return this.place;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlaceName() {
        return this.placeName;
    }

    @NotNull
    public final SpawnLocationItem copy(int id, int place, @NotNull String placeName) {
        Intrinsics.checkNotNullParameter(placeName, "placeName");
        return new SpawnLocationItem(id, place, placeName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpawnLocationItem)) {
            return false;
        }
        SpawnLocationItem spawnLocationItem = (SpawnLocationItem) other;
        return this.id == spawnLocationItem.id && this.place == spawnLocationItem.place && Intrinsics.areEqual(this.placeName, spawnLocationItem.placeName);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.place)) * 31) + this.placeName.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpawnLocationItem(id=" + this.id + ", place=" + this.place + ", placeName=" + this.placeName + ")";
    }

    public SpawnLocationItem(int i, int i2, @NotNull String placeName) {
        Intrinsics.checkNotNullParameter(placeName, "placeName");
        this.id = i;
        this.place = i2;
        this.placeName = placeName;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPlace() {
        return this.place;
    }

    @NotNull
    public final String getPlaceName() {
        return this.placeName;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}

