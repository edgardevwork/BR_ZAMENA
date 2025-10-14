package androidx.media3.exoplayer.video;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;

/* loaded from: classes.dex */
public final class VideoFrameRenderControl {
    public final FrameRenderer frameRenderer;
    public long outputStreamOffsetUs;

    @Nullable
    public VideoSize pendingOutputVideoSize;
    public final VideoFrameReleaseControl videoFrameReleaseControl;
    public final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    public final TimedValueQueue<VideoSize> videoSizeChanges = new TimedValueQueue<>();
    public final TimedValueQueue<Long> streamOffsets = new TimedValueQueue<>();
    public final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    public VideoSize reportedVideoSize = VideoSize.UNKNOWN;
    public long lastPresentationTimeUs = C2732C.TIME_UNSET;

    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j, long j2, long j3, boolean z);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.lastPresentationTimeUs = C2732C.TIME_UNSET;
        if (this.streamOffsets.size() > 0) {
            Long l = (Long) getLastAndClear(this.streamOffsets);
            l.longValue();
            this.streamOffsets.add(0L, l);
        }
        if (this.pendingOutputVideoSize == null) {
            if (this.videoSizeChanges.size() > 0) {
                this.pendingOutputVideoSize = (VideoSize) getLastAndClear(this.videoSizeChanges);
                return;
            }
            return;
        }
        this.videoSizeChanges.clear();
    }

    public boolean isReady() {
        return this.videoFrameReleaseControl.isReady(true);
    }

    public boolean hasReleasedFrame(long j) {
        long j2 = this.lastPresentationTimeUs;
        return j2 != C2732C.TIME_UNSET && j2 >= j;
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        Assertions.checkArgument(f > 0.0f);
        this.videoFrameReleaseControl.setPlaybackSpeed(f);
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamOffset(jElement)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(jElement, j, j2, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = jElement;
                dropFrame();
            }
        }
    }

    public void onOutputSizeChanged(int i, int i2) {
        VideoSize videoSize = new VideoSize(i, i2);
        if (Util.areEqual(this.pendingOutputVideoSize, videoSize)) {
            return;
        }
        this.pendingOutputVideoSize = videoSize;
    }

    public void onOutputFrameAvailableForRendering(long j) {
        VideoSize videoSize = this.pendingOutputVideoSize;
        if (videoSize != null) {
            this.videoSizeChanges.add(j, videoSize);
            this.pendingOutputVideoSize = null;
        }
        this.presentationTimestampsUs.add(j);
    }

    public void onStreamOffsetChange(long j, long j2) {
        this.streamOffsets.add(j, Long.valueOf(j2));
    }

    public final void dropFrame() {
        Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()));
        this.frameRenderer.dropFrame();
    }

    public final void renderFrame(boolean z) {
        long jLongValue = ((Long) Assertions.checkStateNotNull(Long.valueOf(this.presentationTimestampsUs.remove()))).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public final boolean maybeUpdateOutputStreamOffset(long j) {
        Long lPollFloor = this.streamOffsets.pollFloor(j);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = lPollFloor.longValue();
        return true;
    }

    public final boolean maybeUpdateVideoSize(long j) {
        VideoSize videoSizePollFloor = this.videoSizeChanges.pollFloor(j);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = videoSizePollFloor;
        return true;
    }

    public static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        Assertions.checkArgument(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) Assertions.checkNotNull(timedValueQueue.pollFirst());
    }
}
