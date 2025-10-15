package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftItemsWithNotificationServerItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/server/CraftItemsWithNotificationServerItem;", "", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
