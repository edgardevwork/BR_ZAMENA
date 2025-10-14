package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneVinylsObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuneVinylsObj {
    public static final int $stable = 8;
    public boolean firstRender;

    @SerializedName("id")
    public final int id;

    @SerializedName("nameVinyl")
    @NotNull
    public final String nameVinyl;
    public boolean selected;
    public boolean startVinyl;

    public static /* synthetic */ TuneVinylsObj copy$default(TuneVinylsObj tuneVinylsObj, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tuneVinylsObj.id;
        }
        if ((i2 & 2) != 0) {
            str = tuneVinylsObj.nameVinyl;
        }
        return tuneVinylsObj.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameVinyl() {
        return this.nameVinyl;
    }

    @NotNull
    public final TuneVinylsObj copy(int id, @NotNull String nameVinyl) {
        Intrinsics.checkNotNullParameter(nameVinyl, "nameVinyl");
        return new TuneVinylsObj(id, nameVinyl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuneVinylsObj)) {
            return false;
        }
        TuneVinylsObj tuneVinylsObj = (TuneVinylsObj) other;
        return this.id == tuneVinylsObj.id && Intrinsics.areEqual(this.nameVinyl, tuneVinylsObj.nameVinyl);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.nameVinyl.hashCode();
    }

    @NotNull
    public String toString() {
        return "TuneVinylsObj(id=" + this.id + ", nameVinyl=" + this.nameVinyl + ")";
    }

    public TuneVinylsObj(int i, @NotNull String nameVinyl) {
        Intrinsics.checkNotNullParameter(nameVinyl, "nameVinyl");
        this.id = i;
        this.nameVinyl = nameVinyl;
        this.firstRender = true;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getNameVinyl() {
        return this.nameVinyl;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean getStartVinyl() {
        return this.startVinyl;
    }

    public final void setStartVinyl(boolean z) {
        this.startVinyl = z;
    }

    public final boolean getFirstRender() {
        return this.firstRender;
    }

    public final void setFirstRender(boolean z) {
        this.firstRender = z;
    }
}

