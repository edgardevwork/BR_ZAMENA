package androidx.media3.p008ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2732C;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.p008ui.TimeBar;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    public static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    public long[] adGroupTimesMs;
    public final float buttonAlphaDisabled;
    public final float buttonAlphaEnabled;
    public final ComponentListener componentListener;
    public long currentBufferedPosition;
    public long currentPosition;
    public long currentWindowOffset;

    @Nullable
    public final TextView durationView;
    public long[] extraAdGroupTimesMs;
    public boolean[] extraPlayedAdGroups;

    @Nullable
    public final View fastForwardButton;
    public final StringBuilder formatBuilder;
    public final Formatter formatter;
    public final Runnable hideAction;
    public long hideAtMs;
    public boolean isAttachedToWindow;
    public boolean multiWindowTimeBar;

    @Nullable
    public final View nextButton;

    @Nullable
    public final View pauseButton;
    public final Timeline.Period period;

    @Nullable
    public final View playButton;
    public boolean[] playedAdGroups;

    @Nullable
    public Player player;

    @Nullable
    public final TextView positionView;

    @Nullable
    public final View previousButton;

    @Nullable
    public ProgressUpdateListener progressUpdateListener;
    public final String repeatAllButtonContentDescription;
    public final Drawable repeatAllButtonDrawable;
    public final String repeatOffButtonContentDescription;
    public final Drawable repeatOffButtonDrawable;
    public final String repeatOneButtonContentDescription;
    public final Drawable repeatOneButtonDrawable;

    @Nullable
    public final ImageView repeatToggleButton;
    public int repeatToggleModes;

    @Nullable
    public final View rewindButton;
    public boolean scrubbing;
    public boolean showFastForwardButton;
    public boolean showMultiWindowTimeBar;
    public boolean showNextButton;
    public boolean showPlayButtonIfSuppressed;
    public boolean showPreviousButton;
    public boolean showRewindButton;
    public boolean showShuffleButton;
    public int showTimeoutMs;

    @Nullable
    public final ImageView shuffleButton;
    public final Drawable shuffleOffButtonDrawable;
    public final String shuffleOffContentDescription;
    public final Drawable shuffleOnButtonDrawable;
    public final String shuffleOnContentDescription;

    @Nullable
    public final TimeBar timeBar;
    public int timeBarMinUpdateIntervalMs;
    public final Runnable updateProgressAction;
    public final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    public final View vrButton;
    public final Timeline.Window window;

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = C2997R.layout.exo_legacy_player_control_view;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = C2732C.TIME_UNSET;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C2997R.styleable.LegacyPlayerControlView, i, 0);
            try {
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(C2997R.styleable.LegacyPlayerControlView_show_timeout, this.showTimeoutMs);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(C2997R.styleable.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = typedArrayObtainStyledAttributes.getBoolean(C2997R.styleable.LegacyPlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = typedArrayObtainStyledAttributes.getBoolean(C2997R.styleable.LegacyPlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = typedArrayObtainStyledAttributes.getBoolean(C2997R.styleable.LegacyPlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = typedArrayObtainStyledAttributes.getBoolean(C2997R.styleable.LegacyPlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = typedArrayObtainStyledAttributes.getBoolean(C2997R.styleable.LegacyPlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C2997R.styleable.LegacyPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new Runnable() { // from class: androidx.media3.ui.LegacyPlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.updateProgress();
            }
        };
        this.hideAction = new Runnable() { // from class: androidx.media3.ui.LegacyPlayerControlView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.hide();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i2 = C2997R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i2);
        View viewFindViewById = findViewById(C2997R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i2);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(C2997R.id.exo_duration);
        this.positionView = (TextView) findViewById(C2997R.id.exo_position);
        TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        View viewFindViewById2 = findViewById(C2997R.id.exo_play);
        this.playButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(C2997R.id.exo_pause);
        this.pauseButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        View viewFindViewById4 = findViewById(C2997R.id.exo_prev);
        this.previousButton = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(componentListener);
        }
        View viewFindViewById5 = findViewById(C2997R.id.exo_next);
        this.nextButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(C2997R.id.exo_rew);
        this.rewindButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(C2997R.id.exo_ffwd);
        this.fastForwardButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(C2997R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(C2997R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View viewFindViewById8 = findViewById(C2997R.id.exo_vr);
        this.vrButton = viewFindViewById8;
        setShowVrButton(false);
        updateButton(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(C2997R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(C2997R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = Util.getDrawable(context, resources, C2997R.drawable.exo_legacy_controls_repeat_off);
        this.repeatOneButtonDrawable = Util.getDrawable(context, resources, C2997R.drawable.exo_legacy_controls_repeat_one);
        this.repeatAllButtonDrawable = Util.getDrawable(context, resources, C2997R.drawable.exo_legacy_controls_repeat_all);
        this.shuffleOnButtonDrawable = Util.getDrawable(context, resources, C2997R.drawable.exo_legacy_controls_shuffle_on);
        this.shuffleOffButtonDrawable = Util.getDrawable(context, resources, C2997R.drawable.exo_legacy_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(C2997R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(C2997R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(C2997R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(C2997R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(C2997R.string.exo_controls_shuffle_off_description);
        this.currentPosition = C2732C.TIME_UNSET;
        this.currentBufferedPosition = C2732C.TIME_UNSET;
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C2732C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public final void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = jUptimeMillis + i;
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, i);
                return;
            }
            return;
        }
        this.hideAtMs = C2732C.TIME_UNSET;
    }

    public final void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    public final void updatePlayPauseButton() {
        boolean z;
        boolean z2;
        if (isVisible() && this.isAttachedToWindow) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            View view = this.playButton;
            boolean z3 = true;
            if (view != null) {
                z = !zShouldShowPlayButton && view.isFocused();
                if (Util.SDK_INT < 21) {
                    z2 = z;
                } else {
                    z2 = !zShouldShowPlayButton && Api21.isAccessibilityFocused(this.playButton);
                }
                this.playButton.setVisibility(zShouldShowPlayButton ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z |= zShouldShowPlayButton && view2.isFocused();
                if (Util.SDK_INT < 21) {
                    z3 = z;
                } else if (!zShouldShowPlayButton || !Api21.isAccessibilityFocused(this.pauseButton)) {
                    z3 = false;
                }
                z2 |= z3;
                this.pauseButton.setVisibility(zShouldShowPlayButton ? 8 : 0);
            }
            if (z) {
                requestPlayPauseFocus();
            }
            if (z2) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    public final void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            updateButton(this.showPreviousButton, zIsCommandAvailable3, this.previousButton);
            updateButton(this.showRewindButton, zIsCommandAvailable4, this.rewindButton);
            updateButton(this.showFastForwardButton, zIsCommandAvailable5, this.fastForwardButton);
            updateButton(this.showNextButton, zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    public final void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    public final void updateShuffleButton() {
        ImageView imageView;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
            ImageView imageView2 = this.shuffleButton;
            if (player.getShuffleModeEnabled()) {
                str = this.shuffleOnContentDescription;
            } else {
                str = this.shuffleOffContentDescription;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateTimeline() {
        int i;
        Timeline.Window window;
        long positionInWindowUs;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > windowCount) {
                    break;
                }
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == C2732C.TIME_UNSET) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                int i3 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i3 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i3, this.period);
                        int adGroupCount = this.period.getAdGroupCount();
                        for (int removedAdGroupCount = this.period.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                long j3 = this.period.durationUs;
                                if (j3 != C2732C.TIME_UNSET) {
                                    adGroupTimeUs = j3;
                                    positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                                    if (positionInWindowUs < 0) {
                                        long[] jArr = this.adGroupTimesMs;
                                        if (i == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                            this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                        }
                                        this.adGroupTimesMs[i] = Util.usToMs(j2 + positionInWindowUs);
                                        this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                        i++;
                                    }
                                }
                            } else {
                                positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                                if (positionInWindowUs < 0) {
                                }
                            }
                        }
                        i3++;
                    }
                }
                j2 += window.durationUs;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jUsToMs = Util.usToMs(j);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i4);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    public final void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z = contentPosition != this.currentPosition;
            boolean z2 = contentBufferedPosition != this.currentBufferedPosition;
            this.currentPosition = contentPosition;
            this.currentBufferedPosition = contentBufferedPosition;
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f > 0.0f ? (long) (jMin / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    public final void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final void requestPlayPauseAccessibilityFocus() {
        View view;
        View view2;
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public final void updateButton(boolean z, boolean z2, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z ? 0 : 8);
    }

    public final void seekToTimeBarPosition(Player player, long j) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j);
        updateProgress();
    }

    public final void seekTo(Player player, int i, long j) {
        player.seekTo(i, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != C2732C.TIME_UNSET) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, jUptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    public static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == C2732C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    public static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C2997R.styleable.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    /* loaded from: classes3.dex */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                LegacyPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                LegacyPlayerControlView.this.updateTimeline();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            LegacyPlayerControlView.this.scrubbing = true;
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            LegacyPlayerControlView.this.scrubbing = false;
            if (z || LegacyPlayerControlView.this.player == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = LegacyPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (LegacyPlayerControlView.this.nextButton != view) {
                if (LegacyPlayerControlView.this.previousButton != view) {
                    if (LegacyPlayerControlView.this.fastForwardButton != view) {
                        if (LegacyPlayerControlView.this.rewindButton != view) {
                            if (LegacyPlayerControlView.this.playButton != view) {
                                if (LegacyPlayerControlView.this.pauseButton != view) {
                                    if (LegacyPlayerControlView.this.repeatToggleButton != view) {
                                        if (LegacyPlayerControlView.this.shuffleButton == view) {
                                            player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                            return;
                                        }
                                        return;
                                    }
                                    player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), LegacyPlayerControlView.this.repeatToggleModes));
                                    return;
                                }
                                Util.handlePauseButtonAction(player);
                                return;
                            }
                            Util.handlePlayButtonAction(player);
                            return;
                        }
                        player.seekBack();
                        return;
                    }
                    if (player.getPlaybackState() != 4) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                player.seekToPrevious();
                return;
            }
            player.seekToNext();
        }
    }

    @RequiresApi(21)
    public static final class Api21 {
        @DoNotInline
        public static boolean isAccessibilityFocused(View view) {
            return view.isAccessibilityFocused();
        }
    }
}
