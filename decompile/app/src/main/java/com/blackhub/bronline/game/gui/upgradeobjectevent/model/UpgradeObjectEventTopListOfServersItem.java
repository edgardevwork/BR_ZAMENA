package com.blackhub.bronline.game.gui.upgradeobjectevent.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopListOfServersItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListOfServersItem;", "", "place", "", "serverName", "level", "isPlayersServer", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setPlayersServer", "(Z)V", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "getPlace", "setPlace", "getServerName", "setServerName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventTopListOfServersItem {
    public static final int $stable = 8;
    public boolean isPlayersServer;

    @NotNull
    public String level;

    @NotNull
    public String place;

    @NotNull
    public String serverName;

    public static /* synthetic */ UpgradeObjectEventTopListOfServersItem copy$default(UpgradeObjectEventTopListOfServersItem upgradeObjectEventTopListOfServersItem, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradeObjectEventTopListOfServersItem.place;
        }
        if ((i & 2) != 0) {
            str2 = upgradeObjectEventTopListOfServersItem.serverName;
        }
        if ((i & 4) != 0) {
            str3 = upgradeObjectEventTopListOfServersItem.level;
        }
        if ((i & 8) != 0) {
            z = upgradeObjectEventTopListOfServersItem.isPlayersServer;
        }
        return upgradeObjectEventTopListOfServersItem.copy(str, str2, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlace() {
        return this.place;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPlayersServer() {
        return this.isPlayersServer;
    }

    @NotNull
    public final UpgradeObjectEventTopListOfServersItem copy(@NotNull String place, @NotNull String serverName, @NotNull String level, boolean isPlayersServer) {
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(level, "level");
        return new UpgradeObjectEventTopListOfServersItem(place, serverName, level, isPlayersServer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeObjectEventTopListOfServersItem)) {
            return false;
        }
        UpgradeObjectEventTopListOfServersItem upgradeObjectEventTopListOfServersItem = (UpgradeObjectEventTopListOfServersItem) other;
        return Intrinsics.areEqual(this.place, upgradeObjectEventTopListOfServersItem.place) && Intrinsics.areEqual(this.serverName, upgradeObjectEventTopListOfServersItem.serverName) && Intrinsics.areEqual(this.level, upgradeObjectEventTopListOfServersItem.level) && this.isPlayersServer == upgradeObjectEventTopListOfServersItem.isPlayersServer;
    }

    public int hashCode() {
        return (((((this.place.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.level.hashCode()) * 31) + Boolean.hashCode(this.isPlayersServer);
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventTopListOfServersItem(place=" + this.place + ", serverName=" + this.serverName + ", level=" + this.level + ", isPlayersServer=" + this.isPlayersServer + ")";
    }

    public UpgradeObjectEventTopListOfServersItem(@NotNull String place, @NotNull String serverName, @NotNull String level, boolean z) {
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(level, "level");
        this.place = place;
        this.serverName = serverName;
        this.level = level;
        this.isPlayersServer = z;
    }

    public /* synthetic */ UpgradeObjectEventTopListOfServersItem(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    @NotNull
    public final String getPlace() {
        return this.place;
    }

    public final void setPlace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.place = str;
    }

    @NotNull
    public final String getServerName() {
        return this.serverName;
    }

    public final void setServerName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverName = str;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final boolean isPlayersServer() {
        return this.isPlayersServer;
    }

    public final void setPlayersServer(boolean z) {
        this.isPlayersServer = z;
    }
}
