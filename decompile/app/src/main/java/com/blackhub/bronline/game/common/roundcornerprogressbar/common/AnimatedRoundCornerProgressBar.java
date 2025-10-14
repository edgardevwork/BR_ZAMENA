package com.blackhub.bronline.game.common.roundcornerprogressbar.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.view.AbsSavedState;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil.util.Utils;
import com.blackhub.bronline.C3489R;
import com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import com.google.android.material.color.utilities.Score;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000 E2\u00020\u0001:\u0002EFB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ(\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0002J\b\u0010)\u001a\u00020\u000eH\u0017J\b\u0010*\u001a\u00020\u000eH\u0016J\b\u0010+\u001a\u00020\u000eH\u0016J\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\u0010J\b\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u000201H\u0014J \u00102\u001a\u00020\u001f2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0014J\u0012\u00104\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\n\u00107\u001a\u0004\u0018\u000106H\u0014J\b\u00108\u001a\u00020\u001fH\u0002J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eH\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eH\u0002J\b\u0010<\u001a\u00020\u001fH\u0002J\b\u0010=\u001a\u00020\u001fH\u0002J\u0010\u0010>\u001a\u00020\u001f2\b\b\u0001\u0010(\u001a\u00020\u000eJ\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\tH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\tH\u0016J\u001a\u0010A\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010B\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002J\u0018\u0010C\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002J\b\u0010D\u001a\u00020\u001fH\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/AnimatedRoundCornerProgressBar;", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/BaseRoundCornerProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "_animationSpeedScale", "", "_isAnimationEnabled", "", "_isProgressAnimating", "_isSecondaryProgressAnimating", "_lastProgress", "_lastSecondaryProgress", "_progressAnimator", "Landroid/animation/ValueAnimator;", "_secondaryProgressAnimator", "progressAnimationAdapterListener", "Landroid/animation/AnimatorListenerAdapter;", "progressAnimationUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "secondaryProgressAnimationAdapterListener", "secondaryProgressAnimationUpdateListener", "clearProgressAnimation", "", "clearSecondaryProgressAnimation", "disableAnimation", "enableAnimation", "getAnimationDuration", "", "from", "to", "max", "scale", "getAnimationSpeedScale", "getProgress", "getSecondaryProgress", "isProgressAnimating", "isSecondaryProgressAnimating", "onProgressAnimationEnd", "onProgressChangeAnimationEnd", TtmlNode.TAG_LAYOUT, "Landroid/widget/LinearLayout;", "onProgressChangeAnimationUpdate", "current", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSecondaryProgressAnimationEnd", "onUpdateProgressByAnimation", "progress", "onUpdateSecondaryProgressByAnimation", "restoreProgressAnimationState", "restoreSecondaryProgressAnimationState", "setAnimationSpeedScale", "setProgress", "setSecondaryProgress", "setupStyleable", "startProgressAnimation", "startSecondaryProgressAnimation", "stopProgressAnimationImmediately", "Companion", "SavedState", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public abstract class AnimatedRoundCornerProgressBar extends BaseRoundCornerProgressBar {
    public static final long DEFAULT_DURATION = 500;
    private float _animationSpeedScale;
    private boolean _isAnimationEnabled;
    private boolean _isProgressAnimating;
    private boolean _isSecondaryProgressAnimating;
    private float _lastProgress;
    private float _lastSecondaryProgress;

    @Nullable
    private ValueAnimator _progressAnimator;

    @Nullable
    private ValueAnimator _secondaryProgressAnimator;

    @NotNull
    private final AnimatorListenerAdapter progressAnimationAdapterListener;

    @NotNull
    private final ValueAnimator.AnimatorUpdateListener progressAnimationUpdateListener;

    @NotNull
    private final AnimatorListenerAdapter secondaryProgressAnimationAdapterListener;

    @NotNull
    private final ValueAnimator.AnimatorUpdateListener secondaryProgressAnimationUpdateListener;
    public static final int $stable = 8;

    public void onProgressChangeAnimationEnd(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "layout");
    }

    public void onProgressChangeAnimationUpdate(@NotNull LinearLayout linearLayout, float current, float to) {
        Intrinsics.checkNotNullParameter(linearLayout, "layout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._animationSpeedScale = 1.0f;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.progressAnimationUpdateListener$lambda$3(this.f$0, valueAnimator);
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$progressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
                this.this$0.onProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.secondaryProgressAnimationUpdateListener$lambda$6(this.f$0, valueAnimator);
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$secondaryProgressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
                this.this$0.onSecondaryProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._animationSpeedScale = 1.0f;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.progressAnimationUpdateListener$lambda$3(this.f$0, valueAnimator);
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$progressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
                this.this$0.onProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.secondaryProgressAnimationUpdateListener$lambda$6(this.f$0, valueAnimator);
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$secondaryProgressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
                this.this$0.onSecondaryProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._animationSpeedScale = 1.0f;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.progressAnimationUpdateListener$lambda$3(this.f$0, valueAnimator);
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$progressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
                this.this$0.onProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.secondaryProgressAnimationUpdateListener$lambda$6(this.f$0, valueAnimator);
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$secondaryProgressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
                this.this$0.onSecondaryProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._animationSpeedScale = 1.0f;
        this.progressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.progressAnimationUpdateListener$lambda$3(this.f$0, valueAnimator);
            }
        };
        this.progressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$progressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
                this.this$0.onProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isProgressAnimating = false;
            }
        };
        this.secondaryProgressAnimationUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimatedRoundCornerProgressBar.secondaryProgressAnimationUpdateListener$lambda$6(this.f$0, valueAnimator);
            }
        };
        this.secondaryProgressAnimationAdapterListener = new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$secondaryProgressAnimationAdapterListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
                this.this$0.onSecondaryProgressAnimationEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0._isSecondaryProgressAnimating = false;
            }
        };
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setupStyleable(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.setupStyleable(context, attrs);
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3489R.styleable.AnimatedRoundCornerProgressBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this._isAnimationEnabled = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this._animationSpeedScale = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        this._lastProgress = super.get_progress();
        this._lastSecondaryProgress = super.get_secondaryProgress();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    /* renamed from: getProgress */
    public float get_progress() {
        if (!this._isAnimationEnabled && !this._isProgressAnimating) {
            return super.get_progress();
        }
        return this._lastProgress;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(int progress) {
        setProgress(progress);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(float progress) {
        float fCoerceAtMost = progress >= 0.0f ? RangesKt___RangesKt.coerceAtMost(progress, get_max()) : 0.0f;
        clearProgressAnimation();
        this._lastProgress = fCoerceAtMost;
        if (this._isAnimationEnabled) {
            startProgressAnimation(super.get_progress(), fCoerceAtMost);
        } else {
            super.setProgress(fCoerceAtMost);
        }
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    /* renamed from: getSecondaryProgress */
    public float get_secondaryProgress() {
        if (!this._isAnimationEnabled && !this._isSecondaryProgressAnimating) {
            return super.get_secondaryProgress();
        }
        return this._lastSecondaryProgress;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setSecondaryProgress(int progress) {
        setSecondaryProgress(progress);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setSecondaryProgress(float progress) {
        float fCoerceAtMost = progress >= 0.0f ? RangesKt___RangesKt.coerceAtMost(progress, get_max()) : 0.0f;
        clearSecondaryProgressAnimation();
        this._lastSecondaryProgress = fCoerceAtMost;
        if (this._isAnimationEnabled) {
            startSecondaryProgressAnimation(super.get_secondaryProgress(), fCoerceAtMost);
        } else {
            super.setSecondaryProgress(fCoerceAtMost);
        }
    }

    @FloatRange(from = Utils.STANDARD_MEMORY_MULTIPLIER, m9to = Score.CUTOFF_CHROMA)
    /* renamed from: getAnimationSpeedScale, reason: from getter */
    public float get_animationSpeedScale() {
        return this._animationSpeedScale;
    }

    public final void enableAnimation() {
        this._isAnimationEnabled = true;
    }

    public final void disableAnimation() {
        this._isAnimationEnabled = false;
    }

    public final void setAnimationSpeedScale(@FloatRange(from = Utils.STANDARD_MEMORY_MULTIPLIER, m9to = Score.CUTOFF_CHROMA) float scale) {
        this._animationSpeedScale = RangesKt___RangesKt.coerceIn(scale, 0.2f, 5.0f);
    }

    /* renamed from: isProgressAnimating, reason: from getter */
    public final boolean get_isProgressAnimating() {
        return this._isProgressAnimating;
    }

    /* renamed from: isSecondaryProgressAnimating, reason: from getter */
    public final boolean get_isSecondaryProgressAnimating() {
        return this._isSecondaryProgressAnimating;
    }

    public void stopProgressAnimationImmediately() {
        clearProgressAnimation();
        clearSecondaryProgressAnimation();
        if (this._isAnimationEnabled && this._isProgressAnimating) {
            disableAnimation();
            if (this._isProgressAnimating) {
                super.setProgress(this._lastProgress);
            }
            if (this._isSecondaryProgressAnimating) {
                super.setSecondaryProgress(this._lastProgress);
            }
            enableAnimation();
        }
    }

    private final long getAnimationDuration(float from, float to, float max, float scale) {
        return (long) (((Math.abs(from - to) * 500) / max) * scale);
    }

    private final void startProgressAnimation(float from, float to) {
        this._isProgressAnimating = true;
        ValueAnimator valueAnimator = this._progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.progressAnimationUpdateListener);
            valueAnimator.removeListener(this.progressAnimationAdapterListener);
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(from, to);
        valueAnimatorOfFloat.setDuration(getAnimationDuration(from, to, get_max(), this._animationSpeedScale));
        valueAnimatorOfFloat.addUpdateListener(this.progressAnimationUpdateListener);
        valueAnimatorOfFloat.addListener(this.progressAnimationAdapterListener);
        valueAnimatorOfFloat.start();
        this._progressAnimator = valueAnimatorOfFloat;
    }

    public static final void progressAnimationUpdateListener$lambda$3(AnimatedRoundCornerProgressBar this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.onUpdateProgressByAnimation(((Float) animatedValue).floatValue());
    }

    private final void onUpdateProgressByAnimation(float progress) {
        super.setProgress(progress);
        onProgressChangeAnimationUpdate(getLayoutProgress(), progress, this._lastProgress);
    }

    public final void onProgressAnimationEnd() {
        onProgressChangeAnimationEnd(getLayoutProgress());
    }

    private final void restoreProgressAnimationState() {
        if (this._isProgressAnimating) {
            startProgressAnimation(super.get_progress(), this._lastProgress);
        }
    }

    private final void clearProgressAnimation() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this._progressAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this._progressAnimator) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    private final void startSecondaryProgressAnimation(float from, float to) {
        this._isSecondaryProgressAnimating = true;
        ValueAnimator valueAnimator = this._secondaryProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.secondaryProgressAnimationUpdateListener);
            valueAnimator.removeListener(this.secondaryProgressAnimationAdapterListener);
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(from, to);
        valueAnimatorOfFloat.setDuration(getAnimationDuration(from, to, get_max(), this._animationSpeedScale));
        valueAnimatorOfFloat.addUpdateListener(this.secondaryProgressAnimationUpdateListener);
        valueAnimatorOfFloat.addListener(this.secondaryProgressAnimationAdapterListener);
        valueAnimatorOfFloat.start();
        this._secondaryProgressAnimator = valueAnimatorOfFloat;
    }

    public static final void secondaryProgressAnimationUpdateListener$lambda$6(AnimatedRoundCornerProgressBar this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.onUpdateSecondaryProgressByAnimation(((Float) animatedValue).floatValue());
    }

    private final void onUpdateSecondaryProgressByAnimation(float progress) {
        super.setSecondaryProgress(progress);
        onProgressChangeAnimationUpdate(getLayoutSecondaryProgress(), progress, this._lastProgress);
    }

    public final void onSecondaryProgressAnimationEnd() {
        onProgressChangeAnimationEnd(getLayoutSecondaryProgress());
    }

    private final void restoreSecondaryProgressAnimationState() {
        if (this._isSecondaryProgressAnimating) {
            startSecondaryProgressAnimation(super.get_secondaryProgress(), this._lastSecondaryProgress);
        }
    }

    private final void clearSecondaryProgressAnimation() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this._secondaryProgressAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this._secondaryProgressAnimator) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.setProgressAnimating(this._isProgressAnimating);
        savedState.setSecondaryProgressAnimating(this._isSecondaryProgressAnimating);
        savedState.setLastProgress(this._lastProgress);
        savedState.setLastSecondaryProgress(this._lastSecondaryProgress);
        savedState.setAnimationSpeedScale(this._animationSpeedScale);
        savedState.setAnimationEnabled(this._isAnimationEnabled);
        return savedState;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this._isProgressAnimating = savedState.getIsProgressAnimating();
        this._isSecondaryProgressAnimating = savedState.getIsSecondaryProgressAnimating();
        this._lastProgress = savedState.getLastProgress();
        this._lastSecondaryProgress = savedState.getLastSecondaryProgress();
        this._animationSpeedScale = savedState.getAnimationSpeedScale();
        this._isAnimationEnabled = savedState.getIsAnimationEnabled();
        restoreProgressAnimationState();
        restoreSecondaryProgressAnimationState();
    }

    /* compiled from: AnimatedRoundCornerProgressBar.kt */
    @Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006&"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/AnimatedRoundCornerProgressBar$SavedState;", "Landroidx/customview/view/AbsSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "animationSpeedScale", "", "getAnimationSpeedScale", "()F", "setAnimationSpeedScale", "(F)V", "isAnimationEnabled", "", "()Z", "setAnimationEnabled", "(Z)V", "isProgressAnimating", "setProgressAnimating", "isSecondaryProgressAnimating", "setSecondaryProgressAnimating", "lastProgress", "getLastProgress", "setLastProgress", "lastSecondaryProgress", "getLastSecondaryProgress", "setLastSecondaryProgress", "writeToParcel", "", "dest", "flags", "", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class SavedState extends AbsSavedState {
        public float animationSpeedScale;
        public boolean isAnimationEnabled;
        public boolean isProgressAnimating;
        public boolean isSecondaryProgressAnimating;
        public float lastProgress;
        public float lastSecondaryProgress;

        @JvmField
        @NotNull
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NotNull
            public AnimatedRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source, @NotNull ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loader, "loader");
                return new AnimatedRoundCornerProgressBar.SavedState(source, loader);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public AnimatedRoundCornerProgressBar.SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new AnimatedRoundCornerProgressBar.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public AnimatedRoundCornerProgressBar.SavedState[] newArray(int size) {
                return newArray(size);
            }
        };

        /* renamed from: isProgressAnimating, reason: from getter */
        public final boolean getIsProgressAnimating() {
            return this.isProgressAnimating;
        }

        public final void setProgressAnimating(boolean z) {
            this.isProgressAnimating = z;
        }

        /* renamed from: isSecondaryProgressAnimating, reason: from getter */
        public final boolean getIsSecondaryProgressAnimating() {
            return this.isSecondaryProgressAnimating;
        }

        public final void setSecondaryProgressAnimating(boolean z) {
            this.isSecondaryProgressAnimating = z;
        }

        public final float getLastProgress() {
            return this.lastProgress;
        }

        public final void setLastProgress(float f) {
            this.lastProgress = f;
        }

        public final float getLastSecondaryProgress() {
            return this.lastSecondaryProgress;
        }

        public final void setLastSecondaryProgress(float f) {
            this.lastSecondaryProgress = f;
        }

        public final float getAnimationSpeedScale() {
            return this.animationSpeedScale;
        }

        public final void setAnimationSpeedScale(float f) {
            this.animationSpeedScale = f;
        }

        /* renamed from: isAnimationEnabled, reason: from getter */
        public final boolean getIsAnimationEnabled() {
            return this.isAnimationEnabled;
        }

        public final void setAnimationEnabled(boolean z) {
            this.isAnimationEnabled = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source, @Nullable ClassLoader classLoader) {
            super(source, classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            this.isProgressAnimating = source.readByte() != 0;
            this.isSecondaryProgressAnimating = source.readByte() != 0;
            this.lastProgress = source.readFloat();
            this.lastSecondaryProgress = source.readFloat();
            this.animationSpeedScale = source.readFloat();
            this.isAnimationEnabled = source.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, flags);
            dest.writeByte(this.isProgressAnimating ? (byte) 1 : (byte) 0);
            dest.writeByte(this.isSecondaryProgressAnimating ? (byte) 1 : (byte) 0);
            dest.writeFloat(this.lastProgress);
            dest.writeFloat(this.lastSecondaryProgress);
            dest.writeFloat(this.animationSpeedScale);
            dest.writeByte(this.isAnimationEnabled ? (byte) 1 : (byte) 0);
        }
    }
}
