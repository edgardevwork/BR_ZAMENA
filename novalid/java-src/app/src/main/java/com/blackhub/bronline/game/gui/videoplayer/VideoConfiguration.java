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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;", "", "videoFile", "Ljava/io/File;", "waitTimeDuration", "", "isSkippable", "", "(Ljava/io/File;JZ)V", "()Z", "getVideoFile", "()Ljava/io/File;", "getWaitTimeDuration", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
