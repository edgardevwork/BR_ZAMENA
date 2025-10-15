package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes.dex */
public final class XingSeeker implements Seeker {
    public static final String TAG = "XingSeeker";
    public final int bitrate;
    public final long dataEndPosition;
    public final long dataSize;
    public final long dataStartPosition;
    public final long durationUs;

    @Nullable
    public final long[] tableOfContents;
    public final int xingFrameSize;

    @Nullable
    public static XingSeeker create(long j, XingFrame xingFrame, long j2) {
        long j3 = xingFrame.frameCount;
        if (j3 == -1 && j3 == 0) {
            return null;
        }
        long jSampleCountToDurationUs = Util.sampleCountToDurationUs((j3 * r7.samplesPerFrame) - 1, xingFrame.header.sampleRate);
        long j4 = xingFrame.dataSize;
        if (j4 == -1 || xingFrame.tableOfContents == null) {
            MpegAudioUtil.Header header = xingFrame.header;
            return new XingSeeker(j2, header.frameSize, jSampleCountToDurationUs, header.bitrate);
        }
        if (j != -1 && j != j2 + j4) {
            Log.m635w(TAG, "XING data size mismatch: " + j + ", " + (j2 + xingFrame.dataSize));
        }
        MpegAudioUtil.Header header2 = xingFrame.header;
        return new XingSeeker(j2, header2.frameSize, jSampleCountToDurationUs, header2.bitrate, xingFrame.dataSize, xingFrame.tableOfContents);
    }

    public XingSeeker(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    public XingSeeker(long j, int i, long j2, int i2, long j3, @Nullable long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i;
        this.durationUs = j2;
        this.bitrate = i2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.dataEndPosition = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long jConstrainValue = Util.constrainValue(j, 0L, this.durationUs);
        double d = (jConstrainValue * 100.0d) / this.durationUs;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) Assertions.checkStateNotNull(this.tableOfContents))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d2 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        long j2 = j - this.dataStartPosition;
        if (!isSeekable() || j2 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d = (j2 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j3 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        return timeUsForTableIndex + Math.round((j3 == (iBinarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    public final long getTimeUsForTableIndex(int i) {
        return (this.durationUs * i) / 100;
    }
}
