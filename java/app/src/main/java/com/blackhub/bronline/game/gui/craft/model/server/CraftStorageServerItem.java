package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftStorageServerItem.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftStorageServerItem {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName("n")
    @Nullable
    public final Integer isItemNew;

    @SerializedName(CmcdConfiguration.KEY_SESSION_ID)
    public final int serverId;

    @SerializedName("tm")
    @Nullable
    public final Long timeUntilItemDestruction;

    public static /* synthetic */ CraftStorageServerItem copy$default(CraftStorageServerItem craftStorageServerItem, int i, int i2, Long l, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = craftStorageServerItem.id;
        }
        if ((i3 & 2) != 0) {
            i2 = craftStorageServerItem.serverId;
        }
        if ((i3 & 4) != 0) {
            l = craftStorageServerItem.timeUntilItemDestruction;
        }
        if ((i3 & 8) != 0) {
            num = craftStorageServerItem.isItemNew;
        }
        return craftStorageServerItem.copy(i, i2, l, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getServerId() {
        return this.serverId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getTimeUntilItemDestruction() {
        return this.timeUntilItemDestruction;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getIsItemNew() {
        return this.isItemNew;
    }

    @NotNull
    public final CraftStorageServerItem copy(int id, int serverId, @Nullable Long timeUntilItemDestruction, @Nullable Integer isItemNew) {
        return new CraftStorageServerItem(id, serverId, timeUntilItemDestruction, isItemNew);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftStorageServerItem)) {
            return false;
        }
        CraftStorageServerItem craftStorageServerItem = (CraftStorageServerItem) other;
        return this.id == craftStorageServerItem.id && this.serverId == craftStorageServerItem.serverId && Intrinsics.areEqual(this.timeUntilItemDestruction, craftStorageServerItem.timeUntilItemDestruction) && Intrinsics.areEqual(this.isItemNew, craftStorageServerItem.isItemNew);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.serverId)) * 31;
        Long l = this.timeUntilItemDestruction;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.isItemNew;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CraftStorageServerItem(id=" + this.id + ", serverId=" + this.serverId + ", timeUntilItemDestruction=" + this.timeUntilItemDestruction + ", isItemNew=" + this.isItemNew + ")";
    }

    public CraftStorageServerItem(int i, int i2, @Nullable Long l, @Nullable Integer num) {
        this.id = i;
        this.serverId = i2;
        this.timeUntilItemDestruction = l;
        this.isItemNew = num;
    }

    public /* synthetic */ CraftStorageServerItem(int i, int i2, Long l, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : l, (i3 & 8) != 0 ? null : num);
    }

    public final int getId() {
        return this.id;
    }

    public final int getServerId() {
        return this.serverId;
    }

    @Nullable
    public final Long getTimeUntilItemDestruction() {
        return this.timeUntilItemDestruction;
    }

    @Nullable
    public final Integer isItemNew() {
        return this.isItemNew;
    }
}

