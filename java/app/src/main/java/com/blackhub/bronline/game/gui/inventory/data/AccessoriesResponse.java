package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessoriesResponse.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class AccessoriesResponse {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public final List<InvItems> arrayItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessoriesResponse copy$default(AccessoriesResponse accessoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accessoriesResponse.arrayItems;
        }
        return accessoriesResponse.copy(list);
    }

    @NotNull
    public final List<InvItems> component1() {
        return this.arrayItems;
    }

    @NotNull
    public final AccessoriesResponse copy(@NotNull List<InvItems> arrayItems) {
        Intrinsics.checkNotNullParameter(arrayItems, "arrayItems");
        return new AccessoriesResponse(arrayItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccessoriesResponse) && Intrinsics.areEqual(this.arrayItems, ((AccessoriesResponse) other).arrayItems);
    }

    public int hashCode() {
        return this.arrayItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccessoriesResponse(arrayItems=" + this.arrayItems + ")";
    }

    public AccessoriesResponse(@NotNull List<InvItems> arrayItems) {
        Intrinsics.checkNotNullParameter(arrayItems, "arrayItems");
        this.arrayItems = arrayItems;
    }

    @NotNull
    public final List<InvItems> getArrayItems() {
        return this.arrayItems;
    }
}

