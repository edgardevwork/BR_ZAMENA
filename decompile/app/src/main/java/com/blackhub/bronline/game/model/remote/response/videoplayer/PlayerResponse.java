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
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "", "waitTimeDuration", "", "skipButtonTime", "videos", "", "Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerVideoItem;", "(FFLjava/util/List;)V", "getSkipButtonTime", "()F", "getVideos", "()Ljava/util/List;", "getWaitTimeDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
