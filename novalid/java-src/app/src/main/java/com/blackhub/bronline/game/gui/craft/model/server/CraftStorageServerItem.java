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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/server/CraftStorageServerItem;", "", "id", "", "serverId", "timeUntilItemDestruction", "", "isItemNew", "(IILjava/lang/Long;Ljava/lang/Integer;)V", "getId", "()I", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServerId", "getTimeUntilItemDestruction", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Long;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/craft/model/server/CraftStorageServerItem;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
