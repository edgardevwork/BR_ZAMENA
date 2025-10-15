package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Bundleable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.BundleUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class Timeline implements Bundleable {
    public static final Timeline EMPTY = new Timeline() { // from class: androidx.media3.common.Timeline.1
        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public Window getWindow(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final String FIELD_WINDOWS = Util.intToStringMaxRadix(0);
    public static final String FIELD_PERIODS = Util.intToStringMaxRadix(1);
    public static final String FIELD_SHUFFLED_WINDOW_INDICES = Util.intToStringMaxRadix(2);

    @UnstableApi
    @Deprecated
    public static final Bundleable.Creator<Timeline> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Timeline$$ExternalSyntheticLambda2
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Timeline.fromBundle(bundle);
        }
    };

    public abstract int getIndexOfPeriod(Object obj);

    public abstract Period getPeriod(int i, Period period, boolean z);

    public abstract int getPeriodCount();

    public abstract Object getUidOfPeriod(int i);

    public abstract Window getWindow(int i, Window window, long j);

    public abstract int getWindowCount();

    public static final class Window implements Bundleable {

        @UnstableApi
        public long defaultPositionUs;

        @UnstableApi
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @UnstableApi
        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;

        @Nullable
        public MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public Object manifest;

        @UnstableApi
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Nullable
        @UnstableApi
        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        public static final Object FAKE_WINDOW_UID = new Object();
        public static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setMediaId("androidx.media3.common.Timeline").setUri(Uri.EMPTY).build();
        public static final String FIELD_MEDIA_ITEM = Util.intToStringMaxRadix(1);
        public static final String FIELD_PRESENTATION_START_TIME_MS = Util.intToStringMaxRadix(2);
        public static final String FIELD_WINDOW_START_TIME_MS = Util.intToStringMaxRadix(3);
        public static final String FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = Util.intToStringMaxRadix(4);
        public static final String FIELD_IS_SEEKABLE = Util.intToStringMaxRadix(5);
        public static final String FIELD_IS_DYNAMIC = Util.intToStringMaxRadix(6);
        public static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(7);
        public static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(8);
        public static final String FIELD_DEFAULT_POSITION_US = Util.intToStringMaxRadix(9);
        public static final String FIELD_DURATION_US = Util.intToStringMaxRadix(10);
        public static final String FIELD_FIRST_PERIOD_INDEX = Util.intToStringMaxRadix(11);
        public static final String FIELD_LAST_PERIOD_INDEX = Util.intToStringMaxRadix(12);
        public static final String FIELD_POSITION_IN_FIRST_PERIOD_US = Util.intToStringMaxRadix(13);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<Window> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Timeline$Window$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Window.fromBundle(bundle);
            }
        };
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = PLACEHOLDER_MEDIA_ITEM;

        @CanIgnoreReturnValue
        @UnstableApi
        public Window set(Object obj, @Nullable MediaItem mediaItem, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            MediaItem.LocalConfiguration localConfiguration;
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : PLACEHOLDER_MEDIA_ITEM;
            this.tag = (mediaItem == null || (localConfiguration = mediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j4;
            this.durationUs = j5;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j6;
            this.isPlaceholder = false;
            return this;
        }

        public long getDefaultPositionMs() {
            return Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public boolean isLive() {
            Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            Object obj = this.manifest;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode3 = (iHashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j = this.presentationStartTimeMs;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!MediaItem.EMPTY.equals(this.mediaItem)) {
                bundle.putBundle(FIELD_MEDIA_ITEM, this.mediaItem.toBundle());
            }
            long j = this.presentationStartTimeMs;
            if (j != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_PRESENTATION_START_TIME_MS, j);
            }
            long j2 = this.windowStartTimeMs;
            if (j2 != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_WINDOW_START_TIME_MS, j2);
            }
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            if (j3 != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, j3);
            }
            boolean z = this.isSeekable;
            if (z) {
                bundle.putBoolean(FIELD_IS_SEEKABLE, z);
            }
            boolean z2 = this.isDynamic;
            if (z2) {
                bundle.putBoolean(FIELD_IS_DYNAMIC, z2);
            }
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(FIELD_LIVE_CONFIGURATION, liveConfiguration.toBundle());
            }
            boolean z3 = this.isPlaceholder;
            if (z3) {
                bundle.putBoolean(FIELD_IS_PLACEHOLDER, z3);
            }
            long j4 = this.defaultPositionUs;
            if (j4 != 0) {
                bundle.putLong(FIELD_DEFAULT_POSITION_US, j4);
            }
            long j5 = this.durationUs;
            if (j5 != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j5);
            }
            int i = this.firstPeriodIndex;
            if (i != 0) {
                bundle.putInt(FIELD_FIRST_PERIOD_INDEX, i);
            }
            int i2 = this.lastPeriodIndex;
            if (i2 != 0) {
                bundle.putInt(FIELD_LAST_PERIOD_INDEX, i2);
            }
            long j6 = this.positionInFirstPeriodUs;
            if (j6 != 0) {
                bundle.putLong(FIELD_POSITION_IN_FIRST_PERIOD_US, j6);
            }
            return bundle;
        }

        @UnstableApi
        public static Window fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_MEDIA_ITEM);
            MediaItem mediaItemFromBundle = bundle2 != null ? MediaItem.fromBundle(bundle2) : MediaItem.EMPTY;
            long j = bundle.getLong(FIELD_PRESENTATION_START_TIME_MS, C2732C.TIME_UNSET);
            long j2 = bundle.getLong(FIELD_WINDOW_START_TIME_MS, C2732C.TIME_UNSET);
            long j3 = bundle.getLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, C2732C.TIME_UNSET);
            boolean z = bundle.getBoolean(FIELD_IS_SEEKABLE, false);
            boolean z2 = bundle.getBoolean(FIELD_IS_DYNAMIC, false);
            Bundle bundle3 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
            MediaItem.LiveConfiguration liveConfigurationFromBundle = bundle3 != null ? MediaItem.LiveConfiguration.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(FIELD_IS_PLACEHOLDER, false);
            long j4 = bundle.getLong(FIELD_DEFAULT_POSITION_US, 0L);
            long j5 = bundle.getLong(FIELD_DURATION_US, C2732C.TIME_UNSET);
            int i = bundle.getInt(FIELD_FIRST_PERIOD_INDEX, 0);
            int i2 = bundle.getInt(FIELD_LAST_PERIOD_INDEX, 0);
            long j6 = bundle.getLong(FIELD_POSITION_IN_FIRST_PERIOD_US, 0L);
            Window window = new Window();
            window.set(FAKE_WINDOW_UID, mediaItemFromBundle, null, j, j2, j3, z, z2, liveConfigurationFromBundle, j4, j5, i, i2, j6);
            window.isPlaceholder = z3;
            return window;
        }
    }

    public static final class Period implements Bundleable {
        public AdPlaybackState adPlaybackState = AdPlaybackState.NONE;

        @UnstableApi
        public long durationUs;

        /* renamed from: id */
        @Nullable
        public Object f306id;
        public boolean isPlaceholder;

        @UnstableApi
        public long positionInWindowUs;

        @Nullable
        public Object uid;
        public int windowIndex;
        public static final String FIELD_WINDOW_INDEX = Util.intToStringMaxRadix(0);
        public static final String FIELD_DURATION_US = Util.intToStringMaxRadix(1);
        public static final String FIELD_POSITION_IN_WINDOW_US = Util.intToStringMaxRadix(2);
        public static final String FIELD_PLACEHOLDER = Util.intToStringMaxRadix(3);
        public static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(4);

        @UnstableApi
        @Deprecated
        public static final Bundleable.Creator<Period> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.Timeline$Period$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Period.fromBundle(bundle);
            }
        };

        @CanIgnoreReturnValue
        @UnstableApi
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, AdPlaybackState.NONE, false);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.f306id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z;
            return this;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInWindowMs() {
            return Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        @Nullable
        public Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public long getAdGroupTimeUs(int i) {
            return this.adPlaybackState.getAdGroup(i).timeUs;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.adPlaybackState.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.adPlaybackState.getAdGroup(i).hasUnplayedAds();
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public int getAdCountInAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).count;
        }

        public long getAdDurationUs(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            return adGroup.count != -1 ? adGroup.durationsUs[i2] : C2732C.TIME_UNSET;
        }

        @UnstableApi
        public int getAdState(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.states[i2];
            }
            return 0;
        }

        @UnstableApi
        public boolean isLivePostrollPlaceholder(int i) {
            return i == getAdGroupCount() - 1 && this.adPlaybackState.isLivePostrollPlaceholder(i);
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        @UnstableApi
        public boolean isServerSideInsertedAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).isServerSideInserted;
        }

        @UnstableApi
        public long getContentResumeOffsetUs(int i) {
            return this.adPlaybackState.getAdGroup(i).contentResumeOffsetUs;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.areEqual(this.f306id, period.f306id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Util.areEqual(this.adPlaybackState, period.adPlaybackState);
        }

        public int hashCode() {
            Object obj = this.f306id;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.positionInWindowUs;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.adPlaybackState.hashCode();
        }

        @Override // androidx.media3.common.Bundleable
        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.windowIndex;
            if (i != 0) {
                bundle.putInt(FIELD_WINDOW_INDEX, i);
            }
            long j = this.durationUs;
            if (j != C2732C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j);
            }
            long j2 = this.positionInWindowUs;
            if (j2 != 0) {
                bundle.putLong(FIELD_POSITION_IN_WINDOW_US, j2);
            }
            boolean z = this.isPlaceholder;
            if (z) {
                bundle.putBoolean(FIELD_PLACEHOLDER, z);
            }
            if (!this.adPlaybackState.equals(AdPlaybackState.NONE)) {
                bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle());
            }
            return bundle;
        }

        @UnstableApi
        public static Period fromBundle(Bundle bundle) {
            AdPlaybackState adPlaybackStateFromBundle;
            int i = bundle.getInt(FIELD_WINDOW_INDEX, 0);
            long j = bundle.getLong(FIELD_DURATION_US, C2732C.TIME_UNSET);
            long j2 = bundle.getLong(FIELD_POSITION_IN_WINDOW_US, 0L);
            boolean z = bundle.getBoolean(FIELD_PLACEHOLDER, false);
            Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            if (bundle2 != null) {
                adPlaybackStateFromBundle = AdPlaybackState.fromBundle(bundle2);
            } else {
                adPlaybackStateFromBundle = AdPlaybackState.NONE;
            }
            AdPlaybackState adPlaybackState = adPlaybackStateFromBundle;
            Period period = new Period();
            period.set(null, null, i, j, j2, adPlaybackState, z);
            return period;
        }
    }

    @UnstableApi
    public Timeline() {
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getLastWindowIndex(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getLastWindowIndex(z) ? getFirstWindowIndex(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getFirstWindowIndex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getFirstWindowIndex(z) ? getLastWindowIndex(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public final Window getWindow(int i, Window window) {
        return getWindow(i, window, 0L);
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period).windowIndex;
        if (getWindow(i3, window).lastPeriodIndex != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public final boolean isLastPeriod(int i, Period period, Window window, int i2, boolean z) {
        return getNextPeriodIndex(i, period, window, i2, z) == -1;
    }

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @UnstableApi
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j) {
        return getPeriodPositionUs(window, period, i, j);
    }

    @Deprecated
    @Nullable
    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @UnstableApi
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j, long j2) {
        return getPeriodPositionUs(window, period, i, j, j2);
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j) {
        return (Pair) Assertions.checkNotNull(getPeriodPositionUs(window, period, i, j, 0L));
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j, long j2) {
        Assertions.checkIndex(i, 0, getWindowCount());
        getWindow(i, window, j2);
        if (j == C2732C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == C2732C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        getPeriod(i2, period);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, period).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, period, true);
        long jMin = j - period.positionInWindowUs;
        long j3 = period.durationUs;
        if (j3 != C2732C.TIME_UNSET) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(Math.max(0L, jMin)));
    }

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public final Period getPeriod(int i, Period period) {
        return getPeriod(i, period, false);
    }

    public boolean equals(@Nullable Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, window).equals(timeline.getWindow(i, window2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != timeline.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != timeline.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = 217 + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public final Bundle toBundle() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, window, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.putBinder(bundle, FIELD_WINDOWS, new BundleListRetriever(arrayList));
        BundleUtil.putBinder(bundle, FIELD_PERIODS, new BundleListRetriever(arrayList2));
        bundle.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, iArr);
        return bundle;
    }

    @UnstableApi
    public final Timeline copyWithSingleWindow(int i) {
        if (getWindowCount() == 1) {
            return this;
        }
        Window window = getWindow(i, new Window(), 0L);
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = window.firstPeriodIndex;
        while (true) {
            int i3 = window.lastPeriodIndex;
            if (i2 <= i3) {
                Period period = getPeriod(i2, new Period(), true);
                period.windowIndex = 0;
                builder.add((ImmutableList.Builder) period);
                i2++;
            } else {
                window.lastPeriodIndex = i3 - window.firstPeriodIndex;
                window.firstPeriodIndex = 0;
                return new RemotableTimeline(ImmutableList.m1172of(window), builder.build(), new int[]{0});
            }
        }
    }

    @UnstableApi
    public static Timeline fromBundle(Bundle bundle) {
        ImmutableList immutableListFromBundleListRetriever = fromBundleListRetriever(new Function() { // from class: androidx.media3.common.Timeline$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Timeline.Window.fromBundle((Bundle) obj);
            }
        }, BundleUtil.getBinder(bundle, FIELD_WINDOWS));
        ImmutableList immutableListFromBundleListRetriever2 = fromBundleListRetriever(new Function() { // from class: androidx.media3.common.Timeline$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Timeline.Period.fromBundle((Bundle) obj);
            }
        }, BundleUtil.getBinder(bundle, FIELD_PERIODS));
        int[] intArray = bundle.getIntArray(FIELD_SHUFFLED_WINDOW_INDICES);
        if (intArray == null) {
            intArray = generateUnshuffledIndices(immutableListFromBundleListRetriever.size());
        }
        return new RemotableTimeline(immutableListFromBundleListRetriever, immutableListFromBundleListRetriever2, intArray);
    }

    public static <T> ImmutableList<T> fromBundleListRetriever(Function<Bundle, T> function, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.m1171of();
        }
        return BundleCollectionUtil.fromBundleList(function, BundleListRetriever.getList(iBinder));
    }

    public static int[] generateUnshuffledIndices(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    @UnstableApi
    /* loaded from: classes4.dex */
    public static final class RemotableTimeline extends Timeline {
        public final ImmutableList<Period> periods;
        public final int[] shuffledWindowIndices;
        public final int[] windowIndicesInShuffled;
        public final ImmutableList<Window> windows;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
            Assertions.checkArgument(immutableList.size() == iArr.length);
            this.windows = immutableList;
            this.periods = immutableList2;
            this.shuffledWindowIndices = iArr;
            this.windowIndicesInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.windowIndicesInShuffled[iArr[i]] = i;
            }
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.windows.size();
        }

        @Override // androidx.media3.common.Timeline
        public Window getWindow(int i, Window window, long j) {
            Window window2 = this.windows.get(i);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getLastWindowIndex(z)) {
                return z ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return getFirstWindowIndex(z);
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getFirstWindowIndex(z)) {
                return z ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return getLastWindowIndex(z);
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.shuffledWindowIndices[getWindowCount() - 1];
            }
            return getWindowCount() - 1;
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.shuffledWindowIndices[0];
            }
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
            Period period2 = this.periods.get(i);
            period.set(period2.f306id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i) {
            throw new UnsupportedOperationException();
        }
    }
}
