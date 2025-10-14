package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateItemList.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class DonateItemList {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public List<DonateItem> array;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DonateItemList copy$default(DonateItemList donateItemList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = donateItemList.array;
        }
        return donateItemList.copy(list);
    }

    @NotNull
    public final List<DonateItem> component1() {
        return this.array;
    }

    @NotNull
    public final DonateItemList copy(@NotNull List<DonateItem> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new DonateItemList(array);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DonateItemList) && Intrinsics.areEqual(this.array, ((DonateItemList) other).array);
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    @NotNull
    public String toString() {
        return "DonateItemList(array=" + this.array + ")";
    }

    public DonateItemList(@NotNull List<DonateItem> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @NotNull
    public final List<DonateItem> getArray() {
        return this.array;
    }

    public final void setArray(@NotNull List<DonateItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.array = list;
    }
}

