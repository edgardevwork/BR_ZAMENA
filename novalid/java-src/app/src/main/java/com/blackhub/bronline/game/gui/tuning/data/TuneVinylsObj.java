package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneVinylsObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "", "id", "", "nameVinyl", "", "(ILjava/lang/String;)V", "firstRender", "", "getFirstRender", "()Z", "setFirstRender", "(Z)V", "getId", "()I", "getNameVinyl", "()Ljava/lang/String;", "selected", "getSelected", "setSelected", "startVinyl", "getStartVinyl", "setStartVinyl", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
