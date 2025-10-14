package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class DrawableUtils {
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] EMPTY_STATE_SET = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        return true;
    }

    @NonNull
    public static Rect getOpticalBounds(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = Api29Impl.getOpticalInsets(drawable);
            return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        return Api18Impl.getOpticalInsets(DrawableCompat.unwrap(drawable));
    }

    public static void fixDrawable(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        forceDrawableStateChange(drawable);
    }

    public static void forceDrawableStateChange(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @RequiresApi(18)
    public static class Api18Impl {
        public static final Field sBottom;
        public static final Method sGetOpticalInsets;
        public static final Field sLeft;
        public static final boolean sReflectionSuccessful;
        public static final Field sRight;
        public static final Field sTop;

        /* JADX WARN: Removed duplicated region for block: B:65:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField(TtmlNode.LEFT);
            } catch (ClassNotFoundException unused4) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchFieldException unused5) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchMethodException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            }
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField(TtmlNode.RIGHT);
                    try {
                        field4 = cls.getField("bottom");
                        z = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                        field4 = null;
                        z = false;
                        if (!z) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused9) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchFieldException unused10) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchMethodException unused11) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            }
            if (!z) {
                sGetOpticalInsets = method;
                sLeft = field;
                sTop = field2;
                sRight = field3;
                sBottom = field4;
                sReflectionSuccessful = true;
                return;
            }
            sGetOpticalInsets = null;
            sLeft = null;
            sTop = null;
            sRight = null;
            sBottom = null;
            sReflectionSuccessful = false;
        }

        @NonNull
        public static Rect getOpticalInsets(@NonNull Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    Object objInvoke = sGetOpticalInsets.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(sLeft.getInt(objInvoke), sTop.getInt(objInvoke), sRight.getInt(objInvoke), sBottom.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.INSETS_NONE;
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static Insets getOpticalInsets(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
