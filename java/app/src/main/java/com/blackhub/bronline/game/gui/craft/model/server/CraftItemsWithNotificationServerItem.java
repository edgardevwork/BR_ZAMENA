package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftItemsWithNotificationServerItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class CraftItemsWithNotificationServerItem {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    public static /* synthetic */ CraftItemsWithNotificationServerItem copy$default(CraftItemsWithNotificationServerItem craftItemsWithNotificationServerItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftItemsWithNotificationServerItem.id;
        }
        return craftItemsWithNotificationServerItem.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final CraftItemsWithNotificationServerItem copy(int id) {
        return new CraftItemsWithNotificationServerItem(id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CraftItemsWithNotificationServerItem) && this.id == ((CraftItemsWithNotificationServerItem) other).id;
    }

    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        return "CraftItemsWithNotificationServerItem(id=" + this.id + ")";
    }

    public CraftItemsWithNotificationServerItem(int i) {
        this.id = i;
    }

    public final int getId() {
        return this.id;
    }
}

