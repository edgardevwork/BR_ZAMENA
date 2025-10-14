package com.blackhub.bronline.game.gui.upgradeobjectevent.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopListItemModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventTopListItemModel {
    public static final int $stable = 0;

    @SerializedName("tl")
    @Nullable
    public final Integer playerLevel;

    @SerializedName("tn")
    @Nullable
    public final String playerName;

    @SerializedName("ts")
    @Nullable
    public final Integer serverId;

    public static /* synthetic */ UpgradeObjectEventTopListItemModel copy$default(UpgradeObjectEventTopListItemModel upgradeObjectEventTopListItemModel, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeObjectEventTopListItemModel.playerName;
        }
        if ((i & 2) != 0) {
            num = upgradeObjectEventTopListItemModel.playerLevel;
        }
        if ((i & 4) != 0) {
            num2 = upgradeObjectEventTopListItemModel.serverId;
        }
        return upgradeObjectEventTopListItemModel.copy(str, num, num2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPlayerLevel() {
        return this.playerLevel;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getServerId() {
        return this.serverId;
    }

    @NotNull
    public final UpgradeObjectEventTopListItemModel copy(@Nullable String playerName, @Nullable Integer playerLevel, @Nullable Integer serverId) {
        return new UpgradeObjectEventTopListItemModel(playerName, playerLevel, serverId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeObjectEventTopListItemModel)) {
            return false;
        }
        UpgradeObjectEventTopListItemModel upgradeObjectEventTopListItemModel = (UpgradeObjectEventTopListItemModel) other;
        return Intrinsics.areEqual(this.playerName, upgradeObjectEventTopListItemModel.playerName) && Intrinsics.areEqual(this.playerLevel, upgradeObjectEventTopListItemModel.playerLevel) && Intrinsics.areEqual(this.serverId, upgradeObjectEventTopListItemModel.serverId);
    }

    public int hashCode() {
        String str = this.playerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.playerLevel;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.serverId;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventTopListItemModel(playerName=" + this.playerName + ", playerLevel=" + this.playerLevel + ", serverId=" + this.serverId + ")";
    }

    public UpgradeObjectEventTopListItemModel(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.playerName = str;
        this.playerLevel = num;
        this.serverId = num2;
    }

    @Nullable
    public final String getPlayerName() {
        return this.playerName;
    }

    @Nullable
    public final Integer getPlayerLevel() {
        return this.playerLevel;
    }

    @Nullable
    public final Integer getServerId() {
        return this.serverId;
    }
}

