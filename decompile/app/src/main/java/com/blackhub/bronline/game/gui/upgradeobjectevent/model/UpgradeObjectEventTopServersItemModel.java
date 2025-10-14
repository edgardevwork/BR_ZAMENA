package com.blackhub.bronline.game.gui.upgradeobjectevent.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopServersItemModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopServersItemModel;", "", "serverId", "", "serverLevel", "", "(ILjava/lang/String;)V", "getServerId", "()I", "getServerLevel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventTopServersItemModel {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int serverId;

    @SerializedName("slv")
    @NotNull
    public final String serverLevel;

    public UpgradeObjectEventTopServersItemModel() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpgradeObjectEventTopServersItemModel copy$default(UpgradeObjectEventTopServersItemModel upgradeObjectEventTopServersItemModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = upgradeObjectEventTopServersItemModel.serverId;
        }
        if ((i2 & 2) != 0) {
            str = upgradeObjectEventTopServersItemModel.serverLevel;
        }
        return upgradeObjectEventTopServersItemModel.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getServerId() {
        return this.serverId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getServerLevel() {
        return this.serverLevel;
    }

    @NotNull
    public final UpgradeObjectEventTopServersItemModel copy(int serverId, @NotNull String serverLevel) {
        Intrinsics.checkNotNullParameter(serverLevel, "serverLevel");
        return new UpgradeObjectEventTopServersItemModel(serverId, serverLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeObjectEventTopServersItemModel)) {
            return false;
        }
        UpgradeObjectEventTopServersItemModel upgradeObjectEventTopServersItemModel = (UpgradeObjectEventTopServersItemModel) other;
        return this.serverId == upgradeObjectEventTopServersItemModel.serverId && Intrinsics.areEqual(this.serverLevel, upgradeObjectEventTopServersItemModel.serverLevel);
    }

    public int hashCode() {
        return (Integer.hashCode(this.serverId) * 31) + this.serverLevel.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventTopServersItemModel(serverId=" + this.serverId + ", serverLevel=" + this.serverLevel + ")";
    }

    public UpgradeObjectEventTopServersItemModel(int i, @NotNull String serverLevel) {
        Intrinsics.checkNotNullParameter(serverLevel, "serverLevel");
        this.serverId = i;
        this.serverLevel = serverLevel;
    }

    public final int getServerId() {
        return this.serverId;
    }

    public /* synthetic */ UpgradeObjectEventTopServersItemModel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final String getServerLevel() {
        return this.serverLevel;
    }
}
