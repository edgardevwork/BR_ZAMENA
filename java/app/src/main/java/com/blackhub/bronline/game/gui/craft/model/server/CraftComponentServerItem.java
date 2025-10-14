package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftComponentServerItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class CraftComponentServerItem {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName("cc")
    public final int quantity;

    public static /* synthetic */ CraftComponentServerItem copy$default(CraftComponentServerItem craftComponentServerItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = craftComponentServerItem.id;
        }
        if ((i3 & 2) != 0) {
            i2 = craftComponentServerItem.quantity;
        }
        return craftComponentServerItem.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final CraftComponentServerItem copy(int id, int quantity) {
        return new CraftComponentServerItem(id, quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftComponentServerItem)) {
            return false;
        }
        CraftComponentServerItem craftComponentServerItem = (CraftComponentServerItem) other;
        return this.id == craftComponentServerItem.id && this.quantity == craftComponentServerItem.quantity;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + Integer.hashCode(this.quantity);
    }

    @NotNull
    public String toString() {
        return "CraftComponentServerItem(id=" + this.id + ", quantity=" + this.quantity + ")";
    }

    public CraftComponentServerItem(int i, int i2) {
        this.id = i;
        this.quantity = i2;
    }

    public final int getId() {
        return this.id;
    }

    public final int getQuantity() {
        return this.quantity;
    }
}

