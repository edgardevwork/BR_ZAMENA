package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.C2732C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    public float adjustedPlaybackSpeed;
    public long currentTargetLiveOffsetUs;
    public final float fallbackMaxPlaybackSpeed;
    public final float fallbackMinPlaybackSpeed;
    public long idealTargetLiveOffsetUs;
    public long lastPlaybackSpeedUpdateMs;
    public final long maxLiveOffsetErrorUsForUnitSpeed;
    public float maxPlaybackSpeed;
    public long maxTargetLiveOffsetUs;
    public long mediaConfigurationTargetLiveOffsetUs;
    public float minPlaybackSpeed;
    public final float minPossibleLiveOffsetSmoothingFactor;
    public long minTargetLiveOffsetUs;
    public final long minUpdateIntervalMs;
    public final float proportionalControlFactor;
    public long smoothedMinPossibleLiveOffsetDeviationUs;
    public long smoothedMinPossibleLiveOffsetUs;
    public long targetLiveOffsetOverrideUs;
    public final long targetLiveOffsetRebufferDeltaUs;

    public static long smooth(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        public float fallbackMinPlaybackSpeed = 0.97f;
        public float fallbackMaxPlaybackSpeed = 1.03f;
        public long minUpdateIntervalMs = 1000;
        public float proportionalControlFactorUs = 1.0E-7f;
        public long maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(20);
        public long targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(500);
        public float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        @CanIgnoreReturnValue
        public Builder setFallbackMinPlaybackSpeed(float f) {
            Assertions.checkArgument(0.0f < f && f <= 1.0f);
            this.fallbackMinPlaybackSpeed = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFallbackMaxPlaybackSpeed(float f) {
            Assertions.checkArgument(f >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinUpdateIntervalMs(long j) {
            Assertions.checkArgument(j > 0);
            this.minUpdateIntervalMs = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProportionalControlFactor(float f) {
            Assertions.checkArgument(f > 0.0f);
            this.proportionalControlFactorUs = f / 1000000.0f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            Assertions.checkArgument(j > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            Assertions.checkArgument(j >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(j);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f) {
            Assertions.checkArgument(f >= 0.0f && f < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f;
            return this;
        }

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    public DefaultLivePlaybackSpeedControl(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.fallbackMinPlaybackSpeed = f;
        this.fallbackMaxPlaybackSpeed = f2;
        this.minUpdateIntervalMs = j;
        this.proportionalControlFactor = f3;
        this.maxLiveOffsetErrorUsForUnitSpeed = j2;
        this.targetLiveOffsetRebufferDeltaUs = j3;
        this.minPossibleLiveOffsetSmoothingFactor = f4;
        this.mediaConfigurationTargetLiveOffsetUs = C2732C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = C2732C.TIME_UNSET;
        this.minTargetLiveOffsetUs = C2732C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = C2732C.TIME_UNSET;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f2;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = C2732C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = C2732C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = C2732C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = C2732C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.mediaConfigurationTargetLiveOffsetUs = Util.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = Util.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f;
        float f2 = liveConfiguration.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            f2 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = C2732C.TIME_UNSET;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.targetLiveOffsetOverrideUs = j;
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.currentTargetLiveOffsetUs;
        if (j == C2732C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j2;
        long j3 = this.maxTargetLiveOffsetUs;
        if (j3 != C2732C.TIME_UNSET && j2 > j3) {
            this.currentTargetLiveOffsetUs = j3;
        }
        this.lastPlaybackSpeedUpdateMs = C2732C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j2) {
        if (this.mediaConfigurationTargetLiveOffsetUs == C2732C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j, j2);
        if (this.lastPlaybackSpeedUpdateMs != C2732C.TIME_UNSET && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j);
        long j3 = j - this.currentTargetLiveOffsetUs;
        if (Math.abs(j3) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = Util.constrainValue((this.proportionalControlFactor * j3) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    public final void maybeResetTargetLiveOffsetUs() {
        long j;
        long j2 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j2 != C2732C.TIME_UNSET) {
            j = this.targetLiveOffsetOverrideUs;
            if (j == C2732C.TIME_UNSET) {
                long j3 = this.minTargetLiveOffsetUs;
                if (j3 != C2732C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.maxTargetLiveOffsetUs;
                if (j == C2732C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j) {
            return;
        }
        this.idealTargetLiveOffsetUs = j;
        this.currentTargetLiveOffsetUs = j;
        this.smoothedMinPossibleLiveOffsetUs = C2732C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C2732C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = C2732C.TIME_UNSET;
    }

    public final void updateSmoothedMinPossibleLiveOffsetUs(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.smoothedMinPossibleLiveOffsetUs;
        if (j4 == C2732C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j3;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long jMax = Math.max(j3, smooth(j4, j3, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = jMax;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j3 - jMax), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    public final void adjustTargetLiveOffsetUs(long j) {
        long j2 = this.smoothedMinPossibleLiveOffsetUs + (this.smoothedMinPossibleLiveOffsetDeviationUs * 3);
        if (this.currentTargetLiveOffsetUs > j2) {
            float fMsToUs = Util.msToUs(this.minUpdateIntervalMs);
            this.currentTargetLiveOffsetUs = Longs.max(j2, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * fMsToUs)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = Util.constrainValue(j - ((long) (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j2);
        this.currentTargetLiveOffsetUs = jConstrainValue;
        long j3 = this.maxTargetLiveOffsetUs;
        if (j3 == C2732C.TIME_UNSET || jConstrainValue <= j3) {
            return;
        }
        this.currentTargetLiveOffsetUs = j3;
    }
}
