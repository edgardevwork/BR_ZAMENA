package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C2171R;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class WindowInsetsAnimationCompat {
    public static final boolean DEBUG = false;
    public static final String TAG = "WindowInsetsAnimCompat";
    public Impl mImpl;

    public WindowInsetsAnimationCompat(int i, @Nullable Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(i, interpolator, j);
        } else {
            this.mImpl = new Impl21(i, interpolator, j);
        }
    }

    @RequiresApi(30)
    public WindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(windowInsetsAnimation);
        }
    }

    public int getTypeMask() {
        return this.mImpl.getTypeMask();
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public float getFraction() {
        return this.mImpl.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.mImpl.getInterpolatedFraction();
    }

    @Nullable
    public Interpolator getInterpolator() {
        return this.mImpl.getInterpolator();
    }

    public long getDurationMillis() {
        return this.mImpl.getDurationMillis();
    }

    public void setFraction(@FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        this.mImpl.setFraction(f);
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public float getAlpha() {
        return this.mImpl.getAlpha();
    }

    public void setAlpha(@FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        this.mImpl.setAlpha(f);
    }

    public static final class BoundsCompat {
        public final Insets mLowerBound;
        public final Insets mUpperBound;

        public BoundsCompat(@NonNull Insets insets, @NonNull Insets insets2) {
            this.mLowerBound = insets;
            this.mUpperBound = insets2;
        }

        @RequiresApi(30)
        public BoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            this.mLowerBound = Impl30.getLowerBounds(bounds);
            this.mUpperBound = Impl30.getHigherBounds(bounds);
        }

        @NonNull
        public Insets getLowerBound() {
            return this.mLowerBound;
        }

        @NonNull
        public Insets getUpperBound() {
            return this.mUpperBound;
        }

        @NonNull
        public BoundsCompat inset(@NonNull Insets insets) {
            return new BoundsCompat(WindowInsetsCompat.insetInsets(this.mLowerBound, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.insetInsets(this.mUpperBound, insets.left, insets.top, insets.right, insets.bottom));
        }

        public String toString() {
            return "Bounds{lower=" + this.mLowerBound + " upper=" + this.mUpperBound + WebvttCssParser.RULE_END;
        }

        @NonNull
        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds toBounds() {
            return Impl30.createPlatformBounds(this);
        }

        @NonNull
        @RequiresApi(30)
        public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }
    }

    @RequiresApi(30)
    public static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        public WindowInsets mDispachedInsets;
        public final int mDispatchMode;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        @NonNull
        public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        public BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull BoundsCompat boundsCompat) {
            return boundsCompat;
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }
    }

    public static void setCallback(@NonNull View view, @Nullable Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            Impl30.setCallback(view, callback);
        } else {
            Impl21.setCallback(view, callback);
        }
    }

    public static class Impl {
        public float mAlpha;
        public final long mDurationMillis;
        public float mFraction;

        @Nullable
        public final Interpolator mInterpolator;
        public final int mTypeMask;

        public Impl(int i, @Nullable Interpolator interpolator, long j) {
            this.mTypeMask = i;
            this.mInterpolator = interpolator;
            this.mDurationMillis = j;
        }

        public int getTypeMask() {
            return this.mTypeMask;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public float getInterpolatedFraction() {
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.mFraction);
            }
            return this.mFraction;
        }

        @Nullable
        public Interpolator getInterpolator() {
            return this.mInterpolator;
        }

        public long getDurationMillis() {
            return this.mDurationMillis;
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void setAlpha(float f) {
            this.mAlpha = f;
        }
    }

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    public static class Impl21 extends Impl {
        public static final Interpolator SHOW_IME_INTERPOLATOR = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final Interpolator HIDE_IME_INTERPOLATOR = new FastOutLinearInInterpolator();
        public static final Interpolator DEFAULT_INSET_INTERPOLATOR = new DecelerateInterpolator();

        public Impl21(int i, @Nullable Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static void setCallback(@NonNull View view, @Nullable Callback callback) {
            Object tag = view.getTag(C2171R.id.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(C2171R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerCreateProxyListener = createProxyListener(view, callback);
            view.setTag(C2171R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListenerCreateProxyListener);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerCreateProxyListener);
            }
        }

        @NonNull
        public static View.OnApplyWindowInsetsListener createProxyListener(@NonNull View view, @NonNull Callback callback) {
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        @NonNull
        public static BoundsCompat computeAnimationBounds(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsetsCompat windowInsetsCompat2, int i) {
            Insets insets = windowInsetsCompat.getInsets(i);
            Insets insets2 = windowInsetsCompat2.getInsets(i);
            return new BoundsCompat(Insets.m441of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.m441of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        @SuppressLint({"WrongConstant"})
        public static int buildAnimationMask(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.getInsets(i2).equals(windowInsetsCompat2.getInsets(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static Interpolator createInsetInterpolator(int i, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            if ((i & 8) != 0) {
                if (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.ime()).bottom) {
                    return SHOW_IME_INTERPOLATOR;
                }
                return HIDE_IME_INTERPOLATOR;
            }
            return DEFAULT_INSET_INTERPOLATOR;
        }

        @SuppressLint({"WrongConstant"})
        public static WindowInsetsCompat interpolateInsets(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    builder.setInsets(i2, windowInsetsCompat.getInsets(i2));
                } else {
                    Insets insets = windowInsetsCompat.getInsets(i2);
                    Insets insets2 = windowInsetsCompat2.getInsets(i2);
                    float f2 = 1.0f - f;
                    builder.setInsets(i2, WindowInsetsCompat.insetInsets(insets, (int) (((insets.left - insets2.left) * f2) + 0.5d), (int) (((insets.top - insets2.top) * f2) + 0.5d), (int) (((insets.right - insets2.right) * f2) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f2) + 0.5d)));
                }
            }
            return builder.build();
        }

        @RequiresApi(21)
        /* loaded from: classes4.dex */
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            public static final int COMPAT_ANIMATION_DURATION = 160;
            public final Callback mCallback;
            public WindowInsetsCompat mLastInsets;

            public Impl21OnApplyWindowInsetsListener(@NonNull View view, @NonNull Callback callback) {
                this.mCallback = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                this.mLastInsets = rootWindowInsets != null ? new WindowInsetsCompat.Builder(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.mLastInsets == null) {
                    this.mLastInsets = ViewCompat.getRootWindowInsets(view);
                }
                if (this.mLastInsets == null) {
                    this.mLastInsets = windowInsetsCompat;
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                Callback callback = Impl21.getCallback(view);
                if (callback != null && Objects.equals(callback.mDispachedInsets, windowInsets)) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                int iBuildAnimationMask = Impl21.buildAnimationMask(windowInsetsCompat, this.mLastInsets);
                if (iBuildAnimationMask == 0) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.mLastInsets;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(iBuildAnimationMask, Impl21.createInsetInterpolator(iBuildAnimationMask, windowInsetsCompat, windowInsetsCompat2), 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                BoundsCompat boundsCompatComputeAnimationBounds = Impl21.computeAnimationBounds(windowInsetsCompat, windowInsetsCompat2, iBuildAnimationMask);
                Impl21.dispatchOnPrepare(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                    public final /* synthetic */ int val$animationMask;
                    public final /* synthetic */ WindowInsetsCompat val$startingInsets;
                    public final /* synthetic */ WindowInsetsCompat val$targetInsets;
                    public final /* synthetic */ View val$v;

                    public C23011(WindowInsetsAnimationCompat windowInsetsAnimationCompat2, WindowInsetsCompat windowInsetsCompat3, WindowInsetsCompat windowInsetsCompat22, int iBuildAnimationMask2, View view2) {
                        windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                        windowInsetsCompat = windowInsetsCompat3;
                        windowInsetsCompat = windowInsetsCompat22;
                        i = iBuildAnimationMask2;
                        view = view2;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                        Impl21.dispatchOnProgress(view, Impl21.interpolateInsets(windowInsetsCompat, windowInsetsCompat, windowInsetsAnimationCompat.getInterpolatedFraction(), i), Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                    public final /* synthetic */ View val$v;

                    public C23022(WindowInsetsAnimationCompat windowInsetsAnimationCompat2, View view2) {
                        windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                        view = view2;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        windowInsetsAnimationCompat.setFraction(1.0f);
                        Impl21.dispatchOnEnd(view, windowInsetsAnimationCompat);
                    }
                });
                OneShotPreDrawListener.add(view2, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                    public final /* synthetic */ BoundsCompat val$animationBounds;
                    public final /* synthetic */ ValueAnimator val$animator;
                    public final /* synthetic */ View val$v;

                    public RunnableC23033(View view2, WindowInsetsAnimationCompat windowInsetsAnimationCompat2, BoundsCompat boundsCompatComputeAnimationBounds2, ValueAnimator duration2) {
                        view = view2;
                        windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                        boundsCompat = boundsCompatComputeAnimationBounds2;
                        valueAnimator = duration2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Impl21.dispatchOnStart(view, windowInsetsAnimationCompat, boundsCompat);
                        valueAnimator.start();
                    }
                });
                this.mLastInsets = windowInsetsCompat3;
                return Impl21.forwardToViewIfNeeded(view2, windowInsets);
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1 */
            public class C23011 implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                public final /* synthetic */ int val$animationMask;
                public final /* synthetic */ WindowInsetsCompat val$startingInsets;
                public final /* synthetic */ WindowInsetsCompat val$targetInsets;
                public final /* synthetic */ View val$v;

                public C23011(WindowInsetsAnimationCompat windowInsetsAnimationCompat2, WindowInsetsCompat windowInsetsCompat3, WindowInsetsCompat windowInsetsCompat22, int iBuildAnimationMask2, View view2) {
                    windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                    windowInsetsCompat = windowInsetsCompat3;
                    windowInsetsCompat = windowInsetsCompat22;
                    i = iBuildAnimationMask2;
                    view = view2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                    Impl21.dispatchOnProgress(view, Impl21.interpolateInsets(windowInsetsCompat, windowInsetsCompat, windowInsetsAnimationCompat.getInterpolatedFraction(), i), Collections.singletonList(windowInsetsAnimationCompat));
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2 */
            public class C23022 extends AnimatorListenerAdapter {
                public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                public final /* synthetic */ View val$v;

                public C23022(WindowInsetsAnimationCompat windowInsetsAnimationCompat2, View view2) {
                    windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                    view = view2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    windowInsetsAnimationCompat.setFraction(1.0f);
                    Impl21.dispatchOnEnd(view, windowInsetsAnimationCompat);
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3 */
            public class RunnableC23033 implements Runnable {
                public final /* synthetic */ WindowInsetsAnimationCompat val$anim;
                public final /* synthetic */ BoundsCompat val$animationBounds;
                public final /* synthetic */ ValueAnimator val$animator;
                public final /* synthetic */ View val$v;

                public RunnableC23033(View view2, WindowInsetsAnimationCompat windowInsetsAnimationCompat2, BoundsCompat boundsCompatComputeAnimationBounds2, ValueAnimator duration2) {
                    view = view2;
                    windowInsetsAnimationCompat = windowInsetsAnimationCompat2;
                    boundsCompat = boundsCompatComputeAnimationBounds2;
                    valueAnimator = duration2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Impl21.dispatchOnStart(view, windowInsetsAnimationCompat, boundsCompat);
                    valueAnimator.start();
                }
            }
        }

        @NonNull
        public static WindowInsets forwardToViewIfNeeded(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(C2171R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static void dispatchOnPrepare(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.mDispachedInsets = windowInsets;
                if (!z) {
                    callback.onPrepare(windowInsetsAnimationCompat);
                    z = callback.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnPrepare(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        public static void dispatchOnStart(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnStart(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static void dispatchOnProgress(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            Callback callback = getCallback(view);
            if (callback != null) {
                windowInsetsCompat = callback.onProgress(windowInsetsCompat, list);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnProgress(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        public static void dispatchOnEnd(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onEnd(windowInsetsAnimationCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnEnd(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        @Nullable
        public static Callback getCallback(View view) {
            Object tag = view.getTag(C2171R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).mCallback;
            }
            return null;
        }
    }

    @RequiresApi(30)
    /* loaded from: classes2.dex */
    public static class Impl30 extends Impl {

        @NonNull
        public final WindowInsetsAnimation mWrapped;

        public Impl30(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.mWrapped = windowInsetsAnimation;
        }

        public Impl30(int i, Interpolator interpolator, long j) {
            this(C2299x6f32a47f.m520m(i, interpolator, j));
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
            return this.mWrapped.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        @Nullable
        public Interpolator getInterpolator() {
            return this.mWrapped.getInterpolator();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
            return this.mWrapped.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
            return this.mWrapped.getFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float f) {
            this.mWrapped.setFraction(f);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
            return this.mWrapped.getInterpolatedFraction();
        }

        @RequiresApi(30)
        public static class ProxyCallback extends WindowInsetsAnimation$Callback {
            public final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations;
            public final Callback mCompat;
            public List<WindowInsetsAnimationCompat> mRORunningAnimations;
            public ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;

            public ProxyCallback(@NonNull Callback callback) {
                super(callback.getDispatchMode());
                this.mAnimations = new HashMap<>();
                this.mCompat = callback;
            }

            @NonNull
            public final WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.mAnimations.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(windowInsetsAnimation);
                this.mAnimations.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                return windowInsetsAnimationCompat2;
            }

            public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
            }

            @NonNull
            public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                return this.mCompat.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }

            @NonNull
            public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.mTmpRunningAnimations;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.mTmpRunningAnimations = arrayList2;
                    this.mRORunningAnimations = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM521m = C2300x30864cc7.m521m(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(windowInsetsAnimationM521m);
                    windowInsetsAnimationCompat.setFraction(windowInsetsAnimationM521m.getFraction());
                    this.mTmpRunningAnimations.add(windowInsetsAnimationCompat);
                }
                return this.mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.mRORunningAnimations).toWindowInsets();
            }

            public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.mAnimations.remove(windowInsetsAnimation);
            }
        }

        public static void setCallback(@NonNull View view, @Nullable Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new ProxyCallback(callback) : null);
        }

        @NonNull
        public static WindowInsetsAnimation.Bounds createPlatformBounds(@NonNull BoundsCompat boundsCompat) {
            C2291x7721ea9a.m512m();
            return C2290x7721ea99.m511m(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        @NonNull
        public static Insets getLowerBounds(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getLowerBound());
        }

        @NonNull
        public static Insets getHigherBounds(@NonNull WindowInsetsAnimation.Bounds bounds) {
            return Insets.toCompatInsets(bounds.getUpperBound());
        }
    }
}
