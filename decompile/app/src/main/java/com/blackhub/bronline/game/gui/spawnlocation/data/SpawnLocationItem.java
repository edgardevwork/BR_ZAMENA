package com.blackhub.bronline.game.gui.spawnlocation.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpawnLocationItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationItem;", "", "id", "", "place", "placeName", "", "(IILjava/lang/String;)V", "getId", "()I", "getPlace", "getPlaceName", "()Ljava/lang/String;", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
