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

