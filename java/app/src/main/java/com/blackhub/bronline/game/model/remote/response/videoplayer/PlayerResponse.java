package com.blackhub.bronline.game.model.remote.response.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayerResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class PlayerResponse {
    public static final int $stable = 8;

    @SerializedName("skipButtonTime")
    public final float skipButtonTime;

    @SerializedName("videos")
    @NotNull
    public final List<PlayerVideoItem> videos;

    @SerializedName("waitTimeDuration")
    public final float waitTimeDuration;

    public PlayerResponse() {
        this(0.0f, 0.0f, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerResponse copy$default(PlayerResponse playerResponse, float f, float f2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = playerResponse.waitTimeDuration;
        }
        if ((i & 2) != 0) {
            f2 = playerResponse.skipButtonTime;
        }
        if ((i & 4) != 0) {
            list = playerResponse.videos;
        }
        return playerResponse.copy(f, f2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWaitTimeDuration() {
        return this.waitTimeDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSkipButtonTime() {
        return this.skipButtonTime;
    }

    @NotNull
    public final List<PlayerVideoItem> component3() {
        return this.videos;
    }

    @NotNull
    public final PlayerResponse copy(float waitTimeDuration, float skipButtonTime, @NotNull List<PlayerVideoItem> videos) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new PlayerResponse(waitTimeDuration, skipButtonTime, videos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerResponse)) {
            return false;
        }
        PlayerResponse playerResponse = (PlayerResponse) other;
        return Float.compare(this.waitTimeDuration, playerResponse.waitTimeDuration) == 0 && Float.compare(this.skipButtonTime, playerResponse.skipButtonTime) == 0 && Intrinsics.areEqual(this.videos, playerResponse.videos);
    }

    public int hashCode() {
        return (((Float.hashCode(this.waitTimeDuration) * 31) + Float.hashCode(this.skipButtonTime)) * 31) + this.videos.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlayerResponse(waitTimeDuration=" + this.waitTimeDuration + ", skipButtonTime=" + this.skipButtonTime + ", videos=" + this.videos + ")";
    }

    public PlayerResponse(float f, float f2, @NotNull List<PlayerVideoItem> videos) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.waitTimeDuration = f;
        this.skipButtonTime = f2;
        this.videos = videos;
    }

    public final float getWaitTimeDuration() {
        return this.waitTimeDuration;
    }

    public final float getSkipButtonTime() {
        return this.skipButtonTime;
    }

    public /* synthetic */ PlayerResponse(float f, float f2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<PlayerVideoItem> getVideos() {
        return this.videos;
    }
}

