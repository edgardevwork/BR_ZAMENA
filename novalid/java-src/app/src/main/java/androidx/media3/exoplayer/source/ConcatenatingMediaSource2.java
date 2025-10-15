package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C2732C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

@UnstableApi
/* loaded from: classes.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    public static final int MSG_UPDATE_TIMELINE = 0;

    @GuardedBy("this")
    public MediaItem mediaItem;
    public final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    public final ImmutableList<MediaSourceHolder> mediaSourceHolders;

    @Nullable
    public Handler playbackThreadHandler;
    public boolean timelineUpdateScheduled;

    public static long getChildWindowSequenceNumber(long j, int i, int i2) {
        return (j * i) + i2;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i) {
        return 0;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        public int index;

        @Nullable
        public MediaItem mediaItem;

        @Nullable
        public MediaSource.Factory mediaSourceFactory;
        public final ImmutableList.Builder<MediaSourceHolder> mediaSourceHoldersBuilder = ImmutableList.builder();

        @CanIgnoreReturnValue
        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, C2732C.TIME_UNSET);
        }

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem, long j) {
            Assertions.checkNotNull(mediaItem);
            if (j == C2732C.TIME_UNSET) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j);
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, C2732C.TIME_UNSET);
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource, long j) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j == C2732C.TIME_UNSET) ? false : true, "Progressive media source must define an initial placeholder duration.");
            ImmutableList.Builder<MediaSourceHolder> builder = this.mediaSourceHoldersBuilder;
            int i = this.index;
            this.index = i + 1;
            builder.add((ImmutableList.Builder<MediaSourceHolder>) new MediaSourceHolder(mediaSource, i, Util.msToUs(j)));
            return this;
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.build());
        }
    }

    public ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<MediaSourceHolder> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.ConcatenatingMediaSource2$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            prepareChildSource(Integer.valueOf(i), this.mediaSourceHolders.get(i).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        long jLongValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(mediaSourceHolder.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid))).longValue();
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l;
        return (j == C2732C.TIME_UNSET || mediaPeriodId == null || mediaPeriodId.isAd() || (l = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j : j + Util.usToMs(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        updateTimeline();
        return true;
    }

    public final void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(0).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    public final void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    public final void disableUnusedMediaSources() {
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    @Nullable
    public final ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        int i;
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        Timeline timeline;
        long j;
        Timeline.Period period;
        boolean z3;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period2 = new Timeline.Period();
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        ImmutableList.Builder builder3 = ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        int i2 = 0;
        Object obj3 = null;
        int periodCount = 0;
        boolean z7 = false;
        boolean z8 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i2 < size) {
            MediaSourceHolder mediaSourceHolder = concatenatingMediaSource2.mediaSourceHolders.get(i2);
            Timeline timeline2 = mediaSourceHolder.mediaSource.getTimeline();
            Assertions.checkArgument(timeline2.isEmpty() ^ z4, "Can't concatenate empty child Timeline.");
            builder.add((ImmutableList.Builder) timeline2);
            builder2.add((ImmutableList.Builder) Integer.valueOf(periodCount));
            periodCount += timeline2.getPeriodCount();
            int i3 = 0;
            while (i3 < timeline2.getWindowCount()) {
                timeline2.getWindow(i3, window);
                if (!z7) {
                    obj3 = window.manifest;
                    z7 = true;
                }
                if (z5 && Util.areEqual(obj3, window.manifest)) {
                    i = i2;
                    z = true;
                } else {
                    i = i2;
                    z = false;
                }
                long j5 = window.durationUs;
                if (j5 == C2732C.TIME_UNSET) {
                    j5 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j5 == C2732C.TIME_UNSET) {
                        return null;
                    }
                }
                j2 += j5;
                if (mediaSourceHolder.index == 0 && i3 == 0) {
                    z2 = z;
                    obj = obj3;
                    j3 = window.defaultPositionUs;
                    j4 = -window.positionInFirstPeriodUs;
                } else {
                    z2 = z;
                    obj = obj3;
                }
                z6 &= window.isSeekable || window.isPlaceholder;
                z8 |= window.isDynamic;
                int i4 = window.firstPeriodIndex;
                while (i4 <= window.lastPeriodIndex) {
                    builder3.add((ImmutableList.Builder) Long.valueOf(j4));
                    timeline2.getPeriod(i4, period2, true);
                    int i5 = periodCount;
                    long j6 = period2.durationUs;
                    if (j6 == C2732C.TIME_UNSET) {
                        Assertions.checkArgument(window.firstPeriodIndex == window.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j6 = window.positionInFirstPeriodUs + j5;
                    }
                    if (i4 != window.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i3 == 0) || j6 == C2732C.TIME_UNSET)) {
                        obj2 = obj;
                        timeline = timeline2;
                        j = 0;
                    } else {
                        Timeline timeline3 = timeline2;
                        obj2 = obj;
                        j = -window.positionInFirstPeriodUs;
                        j6 += j;
                        timeline = timeline3;
                    }
                    Object objCheckNotNull = Assertions.checkNotNull(period2.uid);
                    Timeline.Window window2 = window;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(objCheckNotNull)) {
                        period = period2;
                    } else {
                        period = period2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(objCheckNotNull).equals(Long.valueOf(j))) {
                            z3 = false;
                        }
                        Assertions.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                        mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j));
                        j4 += j6;
                        i4++;
                        periodCount = i5;
                        obj = obj2;
                        timeline2 = timeline;
                        window = window2;
                        period2 = period;
                    }
                    z3 = true;
                    Assertions.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j));
                    j4 += j6;
                    i4++;
                    periodCount = i5;
                    obj = obj2;
                    timeline2 = timeline;
                    window = window2;
                    period2 = period;
                }
                i3++;
                i2 = i;
                z5 = z2;
                obj3 = obj;
            }
            i2++;
            z4 = true;
            concatenatingMediaSource2 = this;
        }
        return new ConcatenatedTimeline(getMediaItem(), builder.build(), builder2.build(), builder3.build(), z6, z8, j2, j3, z5 ? obj3 : null);
    }

    public static Object getPeriodUid(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % i);
    }

    public static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / i;
    }

    /* loaded from: classes3.dex */
    public static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i, long j) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i;
            this.initialPlaceholderDurationUs = j;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ConcatenatedTimeline extends Timeline {
        public final long defaultPositionUs;
        public final long durationUs;
        public final ImmutableList<Integer> firstPeriodIndices;
        public final boolean isDynamic;
        public final boolean isSeekable;

        @Nullable
        public final Object manifest;
        public final MediaItem mediaItem;
        public final ImmutableList<Long> periodOffsetsInWindowUs;
        public final ImmutableList<Timeline> timelines;

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public ConcatenatedTimeline(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z, boolean z2, long j, long j2, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.durationUs = j;
            this.defaultPositionUs = j2;
            this.manifest = obj;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, C2732C.TIME_UNSET, C2732C.TIME_UNSET, C2732C.TIME_UNSET, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i).longValue();
            period.durationUs = getPeriodDurationUs(period, i);
            if (z) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        private int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i + 1), false, false);
        }

        public final long getPeriodDurationUs(Timeline.Period period, int i) {
            long jLongValue;
            if (period.durationUs == C2732C.TIME_UNSET) {
                return C2732C.TIME_UNSET;
            }
            long jLongValue2 = this.periodOffsetsInWindowUs.get(i).longValue();
            if (i == this.periodOffsetsInWindowUs.size() - 1) {
                jLongValue = this.durationUs;
            } else {
                jLongValue = this.periodOffsetsInWindowUs.get(i + 1).longValue();
            }
            return jLongValue - jLongValue2;
        }
    }
}
