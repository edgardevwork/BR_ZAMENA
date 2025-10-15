package com.blackhub.bronline.game.gui.upgradeobjectevent.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopListItemModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListItemModel;", "", "playerName", "", "playerLevel", "", "serverId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPlayerLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlayerName", "()Ljava/lang/String;", "getServerId", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListItemModel;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
