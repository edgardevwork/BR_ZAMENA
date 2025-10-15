package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.DummyTrackOutput;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes4.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    public static final String TAG = "BaseMediaChunkOutput";
    public final SampleQueue[] sampleQueues;
    public final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.sampleQueues[i3];
                }
                i3++;
            } else {
                Log.m631e(TAG, "Unmatched track of type: " + i2);
                return new DummyTrackOutput();
            }
        }
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i] = sampleQueueArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }
}
