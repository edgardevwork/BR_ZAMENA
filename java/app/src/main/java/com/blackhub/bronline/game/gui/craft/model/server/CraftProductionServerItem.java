package com.blackhub.bronline.game.gui.craft.model.server;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftProductionServerItem.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftProductionServerItem {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName(CmcdConfiguration.KEY_SESSION_ID)
    public final int serverId;

    @SerializedName("tm")
    @Nullable
    public final Integer timeUntilItemPreparation;

    public static /* synthetic */ CraftProductionServerItem copy$default(CraftProductionServerItem craftProductionServerItem, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = craftProductionServerItem.id;
        }
        if ((i3 & 2) != 0) {
            i2 = craftProductionServerItem.serverId;
        }
        if ((i3 & 4) != 0) {
            num = craftProductionServerItem.timeUntilItemPreparation;
        }
        return craftProductionServerItem.copy(i, i2, num);
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
    public final Integer getTimeUntilItemPreparation() {
        return this.timeUntilItemPreparation;
    }

    @NotNull
    public final CraftProductionServerItem copy(int id, int serverId, @Nullable Integer timeUntilItemPreparation) {
        return new CraftProductionServerItem(id, serverId, timeUntilItemPreparation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftProductionServerItem)) {
            return false;
        }
        CraftProductionServerItem craftProductionServerItem = (CraftProductionServerItem) other;
        return this.id == craftProductionServerItem.id && this.serverId == craftProductionServerItem.serverId && Intrinsics.areEqual(this.timeUntilItemPreparation, craftProductionServerItem.timeUntilItemPreparation);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.serverId)) * 31;
        Integer num = this.timeUntilItemPreparation;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "CraftProductionServerItem(id=" + this.id + ", serverId=" + this.serverId + ", timeUntilItemPreparation=" + this.timeUntilItemPreparation + ")";
    }

    public CraftProductionServerItem(int i, int i2, @Nullable Integer num) {
        this.id = i;
        this.serverId = i2;
        this.timeUntilItemPreparation = num;
    }

    public final int getId() {
        return this.id;
    }

    public final int getServerId() {
        return this.serverId;
    }

    public /* synthetic */ CraftProductionServerItem(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 0 : num);
    }

    @Nullable
    public final Integer getTimeUntilItemPreparation() {
        return this.timeUntilItemPreparation;
    }
}

