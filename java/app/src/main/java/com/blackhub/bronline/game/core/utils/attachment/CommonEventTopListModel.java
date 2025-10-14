package com.blackhub.bronline.game.core.utils.attachment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonEventTopListModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class CommonEventTopListModel {
    public static final int $stable = 0;

    @NotNull
    public final String playerLevel;

    @NotNull
    public final String playerName;

    @NotNull
    public final String playerPlace;

    @NotNull
    public final String playerRewardOrServer;

    @NotNull
    public final String playerServer;

    public CommonEventTopListModel() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommonEventTopListModel copy$default(CommonEventTopListModel commonEventTopListModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonEventTopListModel.playerPlace;
        }
        if ((i & 2) != 0) {
            str2 = commonEventTopListModel.playerName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = commonEventTopListModel.playerLevel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = commonEventTopListModel.playerRewardOrServer;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = commonEventTopListModel.playerServer;
        }
        return commonEventTopListModel.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlayerPlace() {
        return this.playerPlace;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlayerLevel() {
        return this.playerLevel;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPlayerRewardOrServer() {
        return this.playerRewardOrServer;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPlayerServer() {
        return this.playerServer;
    }

    @NotNull
    public final CommonEventTopListModel copy(@NotNull String playerPlace, @NotNull String playerName, @NotNull String playerLevel, @NotNull String playerRewardOrServer, @NotNull String playerServer) {
        Intrinsics.checkNotNullParameter(playerPlace, "playerPlace");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerLevel, "playerLevel");
        Intrinsics.checkNotNullParameter(playerRewardOrServer, "playerRewardOrServer");
        Intrinsics.checkNotNullParameter(playerServer, "playerServer");
        return new CommonEventTopListModel(playerPlace, playerName, playerLevel, playerRewardOrServer, playerServer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonEventTopListModel)) {
            return false;
        }
        CommonEventTopListModel commonEventTopListModel = (CommonEventTopListModel) other;
        return Intrinsics.areEqual(this.playerPlace, commonEventTopListModel.playerPlace) && Intrinsics.areEqual(this.playerName, commonEventTopListModel.playerName) && Intrinsics.areEqual(this.playerLevel, commonEventTopListModel.playerLevel) && Intrinsics.areEqual(this.playerRewardOrServer, commonEventTopListModel.playerRewardOrServer) && Intrinsics.areEqual(this.playerServer, commonEventTopListModel.playerServer);
    }

    public int hashCode() {
        return (((((((this.playerPlace.hashCode() * 31) + this.playerName.hashCode()) * 31) + this.playerLevel.hashCode()) * 31) + this.playerRewardOrServer.hashCode()) * 31) + this.playerServer.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommonEventTopListModel(playerPlace=" + this.playerPlace + ", playerName=" + this.playerName + ", playerLevel=" + this.playerLevel + ", playerRewardOrServer=" + this.playerRewardOrServer + ", playerServer=" + this.playerServer + ")";
    }

    public CommonEventTopListModel(@NotNull String playerPlace, @NotNull String playerName, @NotNull String playerLevel, @NotNull String playerRewardOrServer, @NotNull String playerServer) {
        Intrinsics.checkNotNullParameter(playerPlace, "playerPlace");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerLevel, "playerLevel");
        Intrinsics.checkNotNullParameter(playerRewardOrServer, "playerRewardOrServer");
        Intrinsics.checkNotNullParameter(playerServer, "playerServer");
        this.playerPlace = playerPlace;
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerRewardOrServer = playerRewardOrServer;
        this.playerServer = playerServer;
    }

    public /* synthetic */ CommonEventTopListModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5);
    }

    @NotNull
    public final String getPlayerPlace() {
        return this.playerPlace;
    }

    @NotNull
    public final String getPlayerName() {
        return this.playerName;
    }

    @NotNull
    public final String getPlayerLevel() {
        return this.playerLevel;
    }

    @NotNull
    public final String getPlayerRewardOrServer() {
        return this.playerRewardOrServer;
    }

    @NotNull
    public final String getPlayerServer() {
        return this.playerServer;
    }
}

