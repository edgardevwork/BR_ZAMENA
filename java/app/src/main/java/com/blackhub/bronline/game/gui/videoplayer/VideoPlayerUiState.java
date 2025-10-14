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

