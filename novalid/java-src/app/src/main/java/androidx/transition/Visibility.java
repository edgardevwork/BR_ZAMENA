package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Mode {
    }

    /* loaded from: classes2.dex */
    public static class VisibilityInfo {
        public ViewGroup mEndParent;
        public int mEndVisibility;
        public boolean mFadeIn;
        public ViewGroup mStartParent;
        public int mStartVisibility;
        public boolean mVisibilityChange;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    public Visibility() {
        this.mMode = 3;
    }

    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.VISIBILITY_TRANSITION);
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_VISIBILITY, Integer.valueOf(transitionValues.view.getVisibility()));
        transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public boolean isVisible(@Nullable TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        return ((Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) transitionValues.values.get(PROPNAME_PARENT)) != null;
    }

    private VisibilityInfo getVisibilityChangeInfo(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.mVisibilityChange = false;
        visibilityInfo.mFadeIn = false;
        if (transitionValues != null && transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.mStartVisibility = ((Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.mStartParent = (ViewGroup) transitionValues.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.mStartVisibility = -1;
            visibilityInfo.mStartParent = null;
        }
        if (transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.mEndVisibility = ((Integer) transitionValues2.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.mEndParent = (ViewGroup) transitionValues2.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.mEndVisibility = -1;
            visibilityInfo.mEndParent = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i = visibilityInfo.mStartVisibility;
            int i2 = visibilityInfo.mEndVisibility;
            if (i == i2 && visibilityInfo.mStartParent == visibilityInfo.mEndParent) {
                return visibilityInfo;
            }
            if (i != i2) {
                if (i == 0) {
                    visibilityInfo.mFadeIn = false;
                    visibilityInfo.mVisibilityChange = true;
                } else if (i2 == 0) {
                    visibilityInfo.mFadeIn = true;
                    visibilityInfo.mVisibilityChange = true;
                }
            } else if (visibilityInfo.mEndParent == null) {
                visibilityInfo.mFadeIn = false;
                visibilityInfo.mVisibilityChange = true;
            } else if (visibilityInfo.mStartParent == null) {
                visibilityInfo.mFadeIn = true;
                visibilityInfo.mVisibilityChange = true;
            }
        } else if (transitionValues == null && visibilityInfo.mEndVisibility == 0) {
            visibilityInfo.mFadeIn = true;
            visibilityInfo.mVisibilityChange = true;
        } else if (transitionValues2 == null && visibilityInfo.mStartVisibility == 0) {
            visibilityInfo.mFadeIn = false;
            visibilityInfo.mVisibilityChange = true;
        }
        return visibilityInfo;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (!visibilityChangeInfo.mVisibilityChange) {
            return null;
        }
        if (visibilityChangeInfo.mStartParent == null && visibilityChangeInfo.mEndParent == null) {
            return null;
        }
        if (visibilityChangeInfo.mFadeIn) {
            return onAppear(viewGroup, transitionValues, visibilityChangeInfo.mStartVisibility, transitionValues2, visibilityChangeInfo.mEndVisibility);
        }
        return onDisappear(viewGroup, transitionValues, visibilityChangeInfo.mStartVisibility, transitionValues2, visibilityChangeInfo.mEndVisibility);
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) {
        if ((this.mMode & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.view.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).mVisibilityChange) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[PHI: r8
  0x0073: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:37:0x0082, B:39:0x0085, B:41:0x008b, B:43:0x008f, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.mMode & 2) != 2 || transitionValues == null) {
            return null;
        }
        View view3 = transitionValues.view;
        View viewCopyViewImage = transitionValues2 != null ? transitionValues2.view : null;
        int i3 = C3239R.id.save_overlay_view;
        View view4 = (View) view3.getTag(i3);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else if (viewCopyViewImage == null || viewCopyViewImage.getParent() == null) {
            if (viewCopyViewImage != null) {
                view = null;
                z = false;
            } else {
                viewCopyViewImage = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (!getVisibilityChangeInfo(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).mVisibilityChange) {
                            viewCopyViewImage = TransitionUtils.copyViewImage(viewGroup, view3, view5);
                        } else {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                        }
                    }
                    z2 = false;
                    View view6 = view;
                    view4 = viewCopyViewImage;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                View view62 = view;
                view4 = viewCopyViewImage;
                view2 = view62;
            }
        } else {
            if (i2 == 4 || view3 == viewCopyViewImage) {
                view = viewCopyViewImage;
                z = false;
                viewCopyViewImage = null;
            }
            if (z) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            ViewUtils.setTransitionVisibility(view2, 0);
            Animator animatorOnDisappear = onDisappear(viewGroup, view2, transitionValues, transitionValues2);
            if (animatorOnDisappear != null) {
                DisappearListener disappearListener = new DisappearListener(view2, i2, true);
                animatorOnDisappear.addListener(disappearListener);
                getRootTransition().addListener(disappearListener);
            } else {
                ViewUtils.setTransitionVisibility(view2, visibility);
            }
            return animatorOnDisappear;
        }
        if (!z2) {
            int[] iArr = (int[]) transitionValues.values.get(PROPNAME_SCREEN_LOCATION);
            int i4 = iArr[0];
            int i5 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i4 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i5 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view4, transitionValues, transitionValues2);
        if (!z2) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view3.setTag(i3, view4);
                OverlayListener overlayListener = new OverlayListener(viewGroup, view4, view3);
                animatorOnDisappear2.addListener(overlayListener);
                animatorOnDisappear2.addPauseListener(overlayListener);
                getRootTransition().addListener(overlayListener);
            }
        }
        return animatorOnDisappear2;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY) != transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (visibilityChangeInfo.mVisibilityChange) {
            return visibilityChangeInfo.mStartVisibility == 0 || visibilityChangeInfo.mEndVisibility == 0;
        }
        return false;
    }

    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean mCanceled = false;
        public final int mFinalVisibility;
        public boolean mLayoutSuppressed;
        public final ViewGroup mParent;
        public final boolean mSuppressLayout;
        public final View mView;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        public DisappearListener(View view, int i, boolean z) {
            this.mView = view;
            this.mFinalVisibility = i;
            this.mParent = (ViewGroup) view.getParent();
            this.mSuppressLayout = z;
            suppressLayout(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            hideViewWhenNotCanceled();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z) {
                ViewUtils.setTransitionVisibility(this.mView, 0);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z) {
                return;
            }
            hideViewWhenNotCanceled();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            suppressLayout(false);
            if (this.mCanceled) {
                return;
            }
            ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            suppressLayout(true);
            if (this.mCanceled) {
                return;
            }
            ViewUtils.setTransitionVisibility(this.mView, 0);
        }

        public final void hideViewWhenNotCanceled() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.mCanceled) {
                ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            suppressLayout(false);
        }

        public final void suppressLayout(boolean z) {
            ViewGroup viewGroup;
            if (!this.mSuppressLayout || this.mLayoutSuppressed == z || (viewGroup = this.mParent) == null) {
                return;
            }
            this.mLayoutSuppressed = z;
            ViewGroupUtils.suppressLayout(viewGroup, z);
        }
    }

    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean mHasOverlay = true;
        public final ViewGroup mOverlayHost;
        public final View mOverlayView;
        public final View mStartView;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.mOverlayHost = viewGroup;
            this.mOverlayView = view;
            this.mStartView = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.mOverlayView.getParent() == null) {
                this.mOverlayHost.getOverlay().add(this.mOverlayView);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z) {
            if (z) {
                this.mStartView.setTag(C3239R.id.save_overlay_view, this.mOverlayView);
                this.mOverlayHost.getOverlay().add(this.mOverlayView);
                this.mHasOverlay = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            removeFromOverlay();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z) {
            if (z) {
                return;
            }
            removeFromOverlay();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            if (this.mHasOverlay) {
                removeFromOverlay();
            }
        }

        public final void removeFromOverlay() {
            this.mStartView.setTag(C3239R.id.save_overlay_view, null);
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
            this.mHasOverlay = false;
        }
    }
}
