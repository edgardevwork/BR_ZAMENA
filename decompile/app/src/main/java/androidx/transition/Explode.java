package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class Explode extends Visibility {
    public static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    public int[] mTempLoc;
    public static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    public static final TimeInterpolator sAccelerate = new AccelerateInterpolator();

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public Explode() {
        this.mTempLoc = new int[2];
        setPropagation(new CircularPropagation());
    }

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempLoc = new int[2];
        setPropagation(new CircularPropagation());
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr = this.mTempLoc;
        int i = iArr[0];
        int i2 = iArr[1];
        transitionValues.values.put(PROPNAME_SCREEN_BOUNDS, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.values.get(PROPNAME_SCREEN_BOUNDS);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, sDecelerate, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_SCREEN_BOUNDS);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(C3239R.id.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], sAccelerate, this);
    }

    public final void calculateOut(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fCalculateDistance = calculateDistance(fCenterX, fCenterY);
        float fCalculateMaxDistance = calculateMaxDistance(view, width - i, iCenterY - i2);
        iArr[0] = Math.round((fCenterX / fCalculateDistance) * fCalculateMaxDistance);
        iArr[1] = Math.round(fCalculateMaxDistance * (fCenterY / fCalculateDistance));
    }

    public static float calculateMaxDistance(View view, int i, int i2) {
        return calculateDistance(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    public static float calculateDistance(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }
}
