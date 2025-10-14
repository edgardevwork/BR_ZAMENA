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

