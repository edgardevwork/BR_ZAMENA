package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;

/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    public static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    public static final String PROPNAME_CLIP = "android:clipBounds:clip";
    public static final String[] sTransitionProperties = {PROPNAME_CLIP};
    public static final Rect NULL_SENTINEL = new Rect();

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void captureValues(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(C3239R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != NULL_SENTINEL ? clipBounds : null;
        transitionValues.values.put(PROPNAME_CLIP, rect);
        if (rect == null) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey(PROPNAME_CLIP) || !transitionValues2.values.containsKey(PROPNAME_CLIP)) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Rect rect2 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) transitionValues.values.get(PROPNAME_BOUNDS) : rect;
        Rect rect4 = rect2 == null ? (Rect) transitionValues2.values.get(PROPNAME_BOUNDS) : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.view.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.view, (Property<View, V>) ViewUtils.CLIP_BOUNDS, (TypeEvaluator) new RectEvaluator(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        Listener listener = new Listener(transitionValues2.view, rect, rect2);
        objectAnimatorOfObject.addListener(listener);
        addListener(listener);
        return objectAnimatorOfObject;
    }

    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Rect mEnd;
        public final Rect mStart;
        public final View mView;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        public Listener(View view, Rect rect, Rect rect2) {
            this.mView = view;
            this.mStart = rect;
            this.mEnd = rect2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            Rect clipBounds = this.mView.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.NULL_SENTINEL;
            }
            this.mView.setTag(C3239R.id.transition_clip, clipBounds);
            this.mView.setClipBounds(this.mEnd);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            View view = this.mView;
            int i = C3239R.id.transition_clip;
            this.mView.setClipBounds((Rect) view.getTag(i));
            this.mView.setTag(i, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (!z) {
                this.mView.setClipBounds(this.mEnd);
            } else {
                this.mView.setClipBounds(this.mStart);
            }
        }
    }
}
