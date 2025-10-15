package androidx.media3.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2732C;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class IndexSeeker implements Seeker {

    @VisibleForTesting
    public static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    public final int averageBitrate;
    public final long dataEndPosition;
    public long durationUs;
    public final LongArray positions;
    public final LongArray timesUs;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public IndexSeeker(long j, long j2, long j3) {
        this.durationUs = j;
        this.dataEndPosition = j3;
        LongArray longArray = new LongArray();
        this.timesUs = longArray;
        LongArray longArray2 = new LongArray();
        this.positions = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
        int i = C2732C.RATE_UNSET_INT;
        if (j != C2732C.TIME_UNSET) {
            long jScaleLargeValue = Util.scaleLargeValue(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jScaleLargeValue > 0 && jScaleLargeValue <= ParserMinimalBase.MAX_INT_L) {
                i = (int) jScaleLargeValue;
            }
            this.averageBitrate = i;
            return;
        }
        this.averageBitrate = C2732C.RATE_UNSET_INT;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j, true, true));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i), this.positions.get(i)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.timesUs.add(j);
        this.positions.add(j2);
    }

    public boolean isTimeUsInIndex(long j) {
        LongArray longArray = this.timesUs;
        return j - longArray.get(longArray.size() - 1) < 100000;
    }

    public void setDurationUs(long j) {
        this.durationUs = j;
    }
}
