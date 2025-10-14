package androidx.media3.common.audio;

import androidx.media3.common.C2732C;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes4.dex */
public final class SpeedChangingAudioProcessor extends BaseAudioProcessor {
    public long bytesRead;
    public boolean endOfStreamQueuedToSonic;
    public final SpeedProvider speedProvider;
    public final SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
    public float currentSpeed = 1.0f;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iScaleLargeTimestamp;
        long j = this.bytesRead;
        AudioProcessor.AudioFormat audioFormat = this.inputAudioFormat;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, audioFormat.sampleRate * audioFormat.bytesPerFrame);
        float speed = this.speedProvider.getSpeed(jScaleLargeTimestamp);
        if (speed != this.currentSpeed) {
            this.currentSpeed = speed;
            if (isUsingSonic()) {
                this.sonicAudioProcessor.setSpeed(speed);
                this.sonicAudioProcessor.setPitch(speed);
            }
            flush();
        }
        int iLimit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(jScaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != C2732C.TIME_UNSET) {
            long j2 = nextSpeedChangeTimeUs - jScaleLargeTimestamp;
            AudioProcessor.AudioFormat audioFormat2 = this.inputAudioFormat;
            iScaleLargeTimestamp = (int) Util.scaleLargeTimestamp(j2, audioFormat2.sampleRate * audioFormat2.bytesPerFrame, 1000000L);
            int i = this.inputAudioFormat.bytesPerFrame;
            int i2 = i - (iScaleLargeTimestamp % i);
            if (i2 != i) {
                iScaleLargeTimestamp += i2;
            }
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + iScaleLargeTimestamp));
        } else {
            iScaleLargeTimestamp = -1;
        }
        long jPosition = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (iScaleLargeTimestamp != -1 && byteBuffer.position() - jPosition == iScaleLargeTimestamp) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                byteBufferReplaceOutputBuffer.put(byteBuffer);
            }
            byteBufferReplaceOutputBuffer.flip();
        }
        this.bytesRead += byteBuffer.position() - jPosition;
        byteBuffer.limit(iLimit);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        return isUsingSonic() ? this.sonicAudioProcessor.getOutput() : super.getOutput();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        this.sonicAudioProcessor.flush();
        this.endOfStreamQueuedToSonic = false;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.currentSpeed = 1.0f;
        this.bytesRead = 0L;
        this.sonicAudioProcessor.reset();
        this.endOfStreamQueuedToSonic = false;
    }

    public final boolean isUsingSonic() {
        return this.currentSpeed != 1.0f;
    }
}
