package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@UnstableApi
/* loaded from: classes4.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public /* synthetic */ LoadingInfo(Builder builder, C27831 c27831) {
        this(builder);
    }

    public static final class Builder {
        public long lastRebufferRealtimeMs;
        public long playbackPositionUs;
        public float playbackSpeed;

        public /* synthetic */ Builder(LoadingInfo loadingInfo, C27831 c27831) {
            this(loadingInfo);
        }

        public Builder() {
            this.playbackPositionUs = C2732C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C2732C.TIME_UNSET;
        }

        public Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackPositionUs(long j) {
            this.playbackPositionUs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackSpeed(float f) {
            Assertions.checkArgument(f > 0.0f || f == -3.4028235E38f);
            this.playbackSpeed = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLastRebufferRealtimeMs(long j) {
            Assertions.checkArgument(j >= 0 || j == C2732C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j;
            return this;
        }

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }
    }

    public LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean rebufferedSince(long j) {
        long j2 = this.lastRebufferRealtimeMs;
        return (j2 == C2732C.TIME_UNSET || j == C2732C.TIME_UNSET || j2 < j) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }
}
