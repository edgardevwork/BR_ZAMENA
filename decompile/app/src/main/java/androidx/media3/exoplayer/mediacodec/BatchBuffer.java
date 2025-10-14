package androidx.media3.exoplayer.mediacodec;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;

    @VisibleForTesting
    public static final int MAX_SIZE_BYTES = 3072000;
    public long lastSampleTimeUs;
    public int maxSampleCount;
    public int sampleCount;

    public BatchBuffer() {
        super(2);
        this.maxSampleCount = 32;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public void setMaxSampleCount(@IntRange(from = 1) int i) {
        Assertions.checkArgument(i > 0);
        this.maxSampleCount = i;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.lastSampleTimeUs;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public boolean hasSamples() {
        return this.sampleCount > 0;
    }

    public boolean append(DecoderInputBuffer decoderInputBuffer) {
        Assertions.checkArgument(!decoderInputBuffer.isEncrypted());
        Assertions.checkArgument(!decoderInputBuffer.hasSupplementalData());
        Assertions.checkArgument(!decoderInputBuffer.isEndOfStream());
        if (!canAppendSampleBuffer(decoderInputBuffer)) {
            return false;
        }
        int i = this.sampleCount;
        this.sampleCount = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.lastSampleTimeUs = decoderInputBuffer.timeUs;
        return true;
    }

    public final boolean canAppendSampleBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.sampleCount >= this.maxSampleCount) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.data;
        return byteBuffer2 == null || (byteBuffer = this.data) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }
}
