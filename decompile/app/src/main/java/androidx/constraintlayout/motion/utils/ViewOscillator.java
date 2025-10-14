package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {
    public static final String TAG = "ViewOscillator";

    public abstract void setProperty(View view, float t);

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ElevationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setElevation(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class AlphaSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setAlpha(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class RotationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setRotation(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class RotationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setRotationX(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class RotationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setRotationY(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotateSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
        }

        public void setPathRotate(View view, float t, double dx, double dy) {
            view.setRotation(get(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }
    }

    /* loaded from: classes2.dex */
    public static class ScaleXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setScaleX(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class ScaleYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setScaleY(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class TranslationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setTranslationX(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class TranslationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setTranslationY(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class TranslationZset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            view.setTranslationZ(get(t));
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomSet extends ViewOscillator {
        public ConstraintAttribute mCustom;
        public float[] value = new float[1];

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setCustom(Object custom) {
            this.mCustom = (ConstraintAttribute) custom;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) {
            this.value[0] = get(t);
            CustomSupport.setInterpolatedValue(this.mCustom, view, this.value);
        }
    }

    /* loaded from: classes2.dex */
    public static class ProgressSet extends ViewOscillator {
        public boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float t) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(t));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(t)));
                } catch (IllegalAccessException e) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e2);
                }
            }
        }
    }
}
