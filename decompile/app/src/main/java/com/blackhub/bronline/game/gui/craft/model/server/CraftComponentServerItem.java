package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftComponentServerItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/server/CraftComponentServerItem;", "", "id", "", FirebaseAnalytics.Param.QUANTITY, "(II)V", "getId", "()I", "getQuantity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
