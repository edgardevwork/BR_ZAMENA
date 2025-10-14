package androidx.media3.extractor.text;

import androidx.media3.common.C2732C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@UnstableApi
/* loaded from: classes3.dex */
public final class CuesWithTimingSubtitle implements Subtitle {
    public static final Ordering<CuesWithTiming> CUES_BY_START_TIME_ASCENDING = Ordering.natural().onResultOf(new Function() { // from class: androidx.media3.extractor.text.CuesWithTimingSubtitle$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
        }
    });
    public static final String TAG = "CuesWithTimingSubtitle";
    public final ImmutableList<ImmutableList<Cue>> eventCues;
    public final long[] eventTimesUs;

    public static long normalizeUnsetStartTimeToZero(long j) {
        if (j == C2732C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    public static /* synthetic */ Comparable lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuesWithTimingSubtitle(List<CuesWithTiming> list) {
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) Iterables.getOnlyElement(list);
            long jNormalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == C2732C.TIME_UNSET) {
                this.eventCues = ImmutableList.m1172of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = ImmutableList.m1173of((ImmutableList) cuesWithTiming.cues, ImmutableList.m1171of());
                this.eventTimesUs = new long[]{jNormalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + jNormalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i = 0;
        for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) immutableListSortedCopyOf.get(i2);
            long jNormalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j = cuesWithTiming2.durationUs + jNormalizeUnsetStartTimeToZero2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.eventTimesUs[i3];
                if (j2 < jNormalizeUnsetStartTimeToZero2) {
                    this.eventTimesUs[i] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.add(cuesWithTiming2.cues);
                    i++;
                } else if (j2 == jNormalizeUnsetStartTimeToZero2 && ((ImmutableList) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, cuesWithTiming2.cues);
                } else {
                    Log.m635w(TAG, "Truncating unsupported overlapping cues.");
                    this.eventTimesUs[i3] = jNormalizeUnsetStartTimeToZero2;
                    arrayList.set(i3, cuesWithTiming2.cues);
                }
            }
            if (cuesWithTiming2.durationUs != C2732C.TIME_UNSET) {
                this.eventTimesUs[i] = j;
                arrayList.add(ImmutableList.m1171of());
                i++;
            }
        }
        this.eventCues = ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (iBinarySearchCeil < this.eventCues.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public ImmutableList<Cue> getCues(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        return iBinarySearchFloor == -1 ? ImmutableList.m1171of() : this.eventCues.get(iBinarySearchFloor);
    }
}
