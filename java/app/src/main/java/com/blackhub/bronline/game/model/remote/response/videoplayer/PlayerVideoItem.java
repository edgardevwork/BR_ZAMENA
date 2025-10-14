package com.blackhub.bronline.game.model.remote.response.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayerVideoItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class PlayerVideoItem {
    public static final int $stable = 0;

    @SerializedName(ClientCookie.COMMENT_ATTR)
    @NotNull
    public final String comment;

    @SerializedName("skipFlag")
    public final int skipFlag;

    @SerializedName("videoName")
    @NotNull
    public final String videoName;

    public PlayerVideoItem() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ PlayerVideoItem copy$default(PlayerVideoItem playerVideoItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playerVideoItem.comment;
        }
        if ((i2 & 2) != 0) {
            str2 = playerVideoItem.videoName;
        }
        if ((i2 & 4) != 0) {
            i = playerVideoItem.skipFlag;
        }
        return playerVideoItem.copy(str, str2, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVideoName() {
        return this.videoName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSkipFlag() {
        return this.skipFlag;
    }

    @NotNull
    public final PlayerVideoItem copy(@NotNull String comment, @NotNull String videoName, int skipFlag) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(videoName, "videoName");
        return new PlayerVideoItem(comment, videoName, skipFlag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerVideoItem)) {
            return false;
        }
        PlayerVideoItem playerVideoItem = (PlayerVideoItem) other;
        return Intrinsics.areEqual(this.comment, playerVideoItem.comment) && Intrinsics.areEqual(this.videoName, playerVideoItem.videoName) && this.skipFlag == playerVideoItem.skipFlag;
    }

    public int hashCode() {
        return (((this.comment.hashCode() * 31) + this.videoName.hashCode()) * 31) + Integer.hashCode(this.skipFlag);
    }

    @NotNull
    public String toString() {
        return "PlayerVideoItem(comment=" + this.comment + ", videoName=" + this.videoName + ", skipFlag=" + this.skipFlag + ")";
    }

    public PlayerVideoItem(@NotNull String comment, @NotNull String videoName, int i) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(videoName, "videoName");
        this.comment = comment;
        this.videoName = videoName;
        this.skipFlag = i;
    }

    public /* synthetic */ PlayerVideoItem(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getVideoName() {
        return this.videoName;
    }

    public final int getSkipFlag() {
        return this.skipFlag;
    }
}

