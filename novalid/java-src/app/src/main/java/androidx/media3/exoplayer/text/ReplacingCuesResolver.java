package androidx.media3.exoplayer.text;

import androidx.media3.common.C2732C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ReplacingCuesResolver implements CuesResolver {
    public final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        boolean z;
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C2732C.TIME_UNSET);
        if (cuesWithTiming.startTimeUs <= j) {
            long j2 = cuesWithTiming.endTimeUs;
            z = j2 == C2732C.TIME_UNSET || j < j2;
        }
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
            if (this.cuesWithTimingList.get(size).startTimeUs <= j) {
                z = false;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList<Cue> getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return ImmutableList.m1171of();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j2 = cuesWithTiming.endTimeUs;
        if (j2 == C2732C.TIME_UNSET || j < j2) {
            return cuesWithTiming.cues;
        }
        return ImmutableList.m1171of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter > 0) {
            this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).startTimeUs) {
            return C2732C.TIME_UNSET;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i - 1);
                long j3 = cuesWithTiming.endTimeUs;
                return (j3 == C2732C.TIME_UNSET || j3 > j) ? cuesWithTiming.startTimeUs : j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Iterables.getLast(this.cuesWithTimingList);
        long j4 = cuesWithTiming2.endTimeUs;
        return (j4 == C2732C.TIME_UNSET || j < j4) ? cuesWithTiming2.startTimeUs : j4;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
            if (j < cuesWithTiming.startTimeUs) {
                long j2 = this.cuesWithTimingList.get(i - 1).endTimeUs;
                return (j2 == C2732C.TIME_UNSET || j2 <= j || j2 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j2;
            }
        }
        long j3 = ((CuesWithTiming) Iterables.getLast(this.cuesWithTimingList)).endTimeUs;
        if (j3 == C2732C.TIME_UNSET || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    public final int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            if (j < this.cuesWithTimingList.get(i).startTimeUs) {
                return i;
            }
        }
        return this.cuesWithTimingList.size();
    }
}
