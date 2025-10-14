package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonComponentItem.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftJsonComponentItem {
    public static final int $stable = 0;

    @SerializedName("component_id")
    public final int componentId;

    @SerializedName("required_quantity")
    public final int requiredQuantity;

    public static /* synthetic */ CraftJsonComponentItem copy$default(CraftJsonComponentItem craftJsonComponentItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = craftJsonComponentItem.componentId;
        }
        if ((i3 & 2) != 0) {
            i2 = craftJsonComponentItem.requiredQuantity;
        }
        return craftJsonComponentItem.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getComponentId() {
        return this.componentId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequiredQuantity() {
        return this.requiredQuantity;
    }

    @NotNull
    public final CraftJsonComponentItem copy(int componentId, int requiredQuantity) {
        return new CraftJsonComponentItem(componentId, requiredQuantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonComponentItem)) {
            return false;
        }
        CraftJsonComponentItem craftJsonComponentItem = (CraftJsonComponentItem) other;
        return this.componentId == craftJsonComponentItem.componentId && this.requiredQuantity == craftJsonComponentItem.requiredQuantity;
    }

    public int hashCode() {
        return (Integer.hashCode(this.componentId) * 31) + Integer.hashCode(this.requiredQuantity);
    }

    @NotNull
    public String toString() {
        return "CraftJsonComponentItem(componentId=" + this.componentId + ", requiredQuantity=" + this.requiredQuantity + ")";
    }

    public CraftJsonComponentItem(int i, int i2) {
        this.componentId = i;
        this.requiredQuantity = i2;
    }

    public final int getComponentId() {
        return this.componentId;
    }

    public final int getRequiredQuantity() {
        return this.requiredQuantity;
    }
}

