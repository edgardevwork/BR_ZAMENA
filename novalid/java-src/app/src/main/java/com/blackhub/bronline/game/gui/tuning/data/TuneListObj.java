package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneListObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/data/TuneListObj;", "", "array", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getArray", "()Ljava/util/ArrayList;", "setArray", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TuneListObj {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public ArrayList<TuneObj> array;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TuneListObj copy$default(TuneListObj tuneListObj, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = tuneListObj.array;
        }
        return tuneListObj.copy(arrayList);
    }

    @NotNull
    public final ArrayList<TuneObj> component1() {
        return this.array;
    }

    @NotNull
    public final TuneListObj copy(@NotNull ArrayList<TuneObj> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new TuneListObj(array);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TuneListObj) && Intrinsics.areEqual(this.array, ((TuneListObj) other).array);
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    @NotNull
    public String toString() {
        return "TuneListObj(array=" + this.array + ")";
    }

    public TuneListObj(@NotNull ArrayList<TuneObj> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @NotNull
    public final ArrayList<TuneObj> getArray() {
        return this.array;
    }

    public final void setArray(@NotNull ArrayList<TuneObj> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.array = arrayList;
    }
}
