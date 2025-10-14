package com.blackhub.bronline.game.gui.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoConfiguration.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class VideoConfiguration {
    public static final int $stable = 8;
    public final boolean isSkippable;

    @Nullable
    public final File videoFile;
    public final long waitTimeDuration;

    public VideoConfiguration() {
        this(null, 0L, false, 7, null);
    }

    public static /* synthetic */ VideoConfiguration copy$default(VideoConfiguration videoConfiguration, File file, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            file = videoConfiguration.videoFile;
        }
        if ((i & 2) != 0) {
            j = videoConfiguration.waitTimeDuration;
        }
        if ((i & 4) != 0) {
            z = videoConfiguration.isSkippable;
        }
        return videoConfiguration.copy(file, j, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final File getVideoFile() {
        return this.videoFile;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWaitTimeDuration() {
        return this.waitTimeDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSkippable() {
        return this.isSkippable;
    }

    @NotNull
    public final VideoConfiguration copy(@Nullable File videoFile, long waitTimeDuration, boolean isSkippable) {
        return new VideoConfiguration(videoFile, waitTimeDuration, isSkippable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoConfiguration)) {
            return false;
        }
        VideoConfiguration videoConfiguration = (VideoConfiguration) other;
        return Intrinsics.areEqual(this.videoFile, videoConfiguration.videoFile) && this.waitTimeDuration == videoConfiguration.waitTimeDuration && this.isSkippable == videoConfiguration.isSkippable;
    }

    public int hashCode() {
        File file = this.videoFile;
        return ((((file == null ? 0 : file.hashCode()) * 31) + Long.hashCode(this.waitTimeDuration)) * 31) + Boolean.hashCode(this.isSkippable);
    }

    @NotNull
    public String toString() {
        return "VideoConfiguration(videoFile=" + this.videoFile + ", waitTimeDuration=" + this.waitTimeDuration + ", isSkippable=" + this.isSkippable + ")";
    }

    public VideoConfiguration(@Nullable File file, long j, boolean z) {
        this.videoFile = file;
        this.waitTimeDuration = j;
        this.isSkippable = z;
    }

    public /* synthetic */ VideoConfiguration(File file, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? true : z);
    }

    @Nullable
    public final File getVideoFile() {
        return this.videoFile;
    }

    public final long getWaitTimeDuration() {
        return this.waitTimeDuration;
    }

    public final boolean isSkippable() {
        return this.isSkippable;
    }
}

