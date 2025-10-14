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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/server/CraftProductionServerItem;", "", "id", "", "serverId", "timeUntilItemPreparation", "(IILjava/lang/Integer;)V", "getId", "()I", "getServerId", "getTimeUntilItemPreparation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/blackhub/bronline/game/gui/craft/model/server/CraftProductionServerItem;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
