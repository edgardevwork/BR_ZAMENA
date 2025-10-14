package com.blackhub.bronline.game.gui.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "typeScreen", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerTypeScreen;", "configuration", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;", "isSkipButtonVisible", "", "skipButtonTime", "", "isNeedClose", "(Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerTypeScreen;Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;ZJZ)V", "getConfiguration", "()Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;", "()Z", "getSkipButtonTime", "()J", "getTypeScreen", "()Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerTypeScreen;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VideoPlayerUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final VideoConfiguration configuration;
    public final boolean isNeedClose;
    public final boolean isSkipButtonVisible;
    public final long skipButtonTime;

    @NotNull
    public final VideoPlayerTypeScreen typeScreen;

    public VideoPlayerUiState() {
        this(null, null, false, 0L, false, 31, null);
    }

    public static /* synthetic */ VideoPlayerUiState copy$default(VideoPlayerUiState videoPlayerUiState, VideoPlayerTypeScreen videoPlayerTypeScreen, VideoConfiguration videoConfiguration, boolean z, long j, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            videoPlayerTypeScreen = videoPlayerUiState.typeScreen;
        }
        if ((i & 2) != 0) {
            videoConfiguration = videoPlayerUiState.configuration;
        }
        VideoConfiguration videoConfiguration2 = videoConfiguration;
        if ((i & 4) != 0) {
            z = videoPlayerUiState.isSkipButtonVisible;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            j = videoPlayerUiState.skipButtonTime;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z2 = videoPlayerUiState.isNeedClose;
        }
        return videoPlayerUiState.copy(videoPlayerTypeScreen, videoConfiguration2, z3, j2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VideoPlayerTypeScreen getTypeScreen() {
        return this.typeScreen;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VideoConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSkipButtonVisible() {
        return this.isSkipButtonVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSkipButtonTime() {
        return this.skipButtonTime;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final VideoPlayerUiState copy(@NotNull VideoPlayerTypeScreen typeScreen, @NotNull VideoConfiguration configuration, boolean isSkipButtonVisible, long skipButtonTime, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(typeScreen, "typeScreen");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new VideoPlayerUiState(typeScreen, configuration, isSkipButtonVisible, skipButtonTime, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlayerUiState)) {
            return false;
        }
        VideoPlayerUiState videoPlayerUiState = (VideoPlayerUiState) other;
        return this.typeScreen == videoPlayerUiState.typeScreen && Intrinsics.areEqual(this.configuration, videoPlayerUiState.configuration) && this.isSkipButtonVisible == videoPlayerUiState.isSkipButtonVisible && this.skipButtonTime == videoPlayerUiState.skipButtonTime && this.isNeedClose == videoPlayerUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((this.typeScreen.hashCode() * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.isSkipButtonVisible)) * 31) + Long.hashCode(this.skipButtonTime)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "VideoPlayerUiState(typeScreen=" + this.typeScreen + ", configuration=" + this.configuration + ", isSkipButtonVisible=" + this.isSkipButtonVisible + ", skipButtonTime=" + this.skipButtonTime + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public VideoPlayerUiState(@NotNull VideoPlayerTypeScreen typeScreen, @NotNull VideoConfiguration configuration, boolean z, long j, boolean z2) {
        Intrinsics.checkNotNullParameter(typeScreen, "typeScreen");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.typeScreen = typeScreen;
        this.configuration = configuration;
        this.isSkipButtonVisible = z;
        this.skipButtonTime = j;
        this.isNeedClose = z2;
    }

    public /* synthetic */ VideoPlayerUiState(VideoPlayerTypeScreen videoPlayerTypeScreen, VideoConfiguration videoConfiguration, boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? VideoPlayerTypeScreen.PLAYER : videoPlayerTypeScreen, (i & 2) != 0 ? new VideoConfiguration(null, 0L, false, 7, null) : videoConfiguration, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? z2 : false);
    }

    @NotNull
    public final VideoPlayerTypeScreen getTypeScreen() {
        return this.typeScreen;
    }

    @NotNull
    public final VideoConfiguration getConfiguration() {
        return this.configuration;
    }

    public final boolean isSkipButtonVisible() {
        return this.isSkipButtonVisible;
    }

    public final long getSkipButtonTime() {
        return this.skipButtonTime;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}
