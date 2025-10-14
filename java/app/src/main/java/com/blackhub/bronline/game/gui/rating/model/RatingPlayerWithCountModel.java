package com.blackhub.bronline.game.gui.rating.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RatingPlayerWithCountModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class RatingPlayerWithCountModel {
    public static final int $stable = 0;

    @SerializedName("p")
    public final int counter;

    @SerializedName("n")
    @NotNull
    public final String nick;

    @SerializedName("s")
    public final int playerServer;

    @SerializedName("g")
    @NotNull
    public final String reward;

    public RatingPlayerWithCountModel() {
        this(null, 0, null, 0, 15, null);
    }

    public static /* synthetic */ RatingPlayerWithCountModel copy$default(RatingPlayerWithCountModel ratingPlayerWithCountModel, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ratingPlayerWithCountModel.nick;
        }
        if ((i3 & 2) != 0) {
            i = ratingPlayerWithCountModel.counter;
        }
        if ((i3 & 4) != 0) {
            str2 = ratingPlayerWithCountModel.reward;
        }
        if ((i3 & 8) != 0) {
            i2 = ratingPlayerWithCountModel.playerServer;
        }
        return ratingPlayerWithCountModel.copy(str, i, str2, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNick() {
        return this.nick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReward() {
        return this.reward;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPlayerServer() {
        return this.playerServer;
    }

    @NotNull
    public final RatingPlayerWithCountModel copy(@NotNull String nick, int counter, @NotNull String reward, int playerServer) {
        Intrinsics.checkNotNullParameter(nick, "nick");
        Intrinsics.checkNotNullParameter(reward, "reward");
        return new RatingPlayerWithCountModel(nick, counter, reward, playerServer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingPlayerWithCountModel)) {
            return false;
        }
        RatingPlayerWithCountModel ratingPlayerWithCountModel = (RatingPlayerWithCountModel) other;
        return Intrinsics.areEqual(this.nick, ratingPlayerWithCountModel.nick) && this.counter == ratingPlayerWithCountModel.counter && Intrinsics.areEqual(this.reward, ratingPlayerWithCountModel.reward) && this.playerServer == ratingPlayerWithCountModel.playerServer;
    }

    public int hashCode() {
        return (((((this.nick.hashCode() * 31) + Integer.hashCode(this.counter)) * 31) + this.reward.hashCode()) * 31) + Integer.hashCode(this.playerServer);
    }

    @NotNull
    public String toString() {
        return "RatingPlayerWithCountModel(nick=" + this.nick + ", counter=" + this.counter + ", reward=" + this.reward + ", playerServer=" + this.playerServer + ")";
    }

    public RatingPlayerWithCountModel(@NotNull String nick, int i, @NotNull String reward, int i2) {
        Intrinsics.checkNotNullParameter(nick, "nick");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.nick = nick;
        this.counter = i;
        this.reward = reward;
        this.playerServer = i2;
    }

    public /* synthetic */ RatingPlayerWithCountModel(String str, int i, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 8) != 0 ? 0 : i2);
    }

    @NotNull
    public final String getNick() {
        return this.nick;
    }

    public final int getCounter() {
        return this.counter;
    }

    @NotNull
    public final String getReward() {
        return this.reward;
    }

    public final int getPlayerServer() {
        return this.playerServer;
    }
}

