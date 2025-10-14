package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.C6765R;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class ViewUtils {

    @RequiresApi(16)
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    public static void showKeyboard(@NonNull View view) {
        showKeyboard(view, true);
    }

    public static void showKeyboard(@NonNull View view, boolean z) {
        WindowInsetsControllerCompat windowInsetsController;
        if (z && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.show(WindowInsetsCompat.Type.ime());
        } else {
            getInputMethodManager(view).showSoftInput(view, 1);
        }
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void requestFocusAndShowKeyboard(@NonNull final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z);
            }
        });
    }

    public static void hideKeyboard(@NonNull View view) {
        hideKeyboard(view, true);
    }

    public static void hideKeyboard(@NonNull View view, boolean z) {
        WindowInsetsControllerCompat windowInsetsController;
        if (z && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(WindowInsetsCompat.Type.ime());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Nullable
    public static InputMethodManager getInputMethodManager(@NonNull View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static void setBoundsFromRect(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view) {
        return calculateRectFromBounds(view, 0);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    @NonNull
    public static Rect calculateOffsetRectFromBounds(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    @NonNull
    public static List<View> getChildren(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
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

    public static boolean isLayoutRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i, int i2, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C6765R.styleable.Insets, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C6765R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C6765R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C6765R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            public final /* synthetic */ OnApplyWindowInsetsListener val$listener;
            public final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
            public final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
            public final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

            public C69091(boolean z4, boolean z22, boolean z32, OnApplyWindowInsetsListener onApplyWindowInsetsListener2) {
                z = z4;
                z = z22;
                z = z32;
                onApplyWindowInsetsListener = onApplyWindowInsetsListener2;
            }

            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view2, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z) {
                    if (zIsLayoutRtl) {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                    } else {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                }
                if (z) {
                    if (zIsLayoutRtl) {
                        relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                    } else {
                        relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsetsCompat, relativePadding) : windowInsetsCompat;
            }
        });
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$1 */
    /* loaded from: classes8.dex */
    public class C69091 implements OnApplyWindowInsetsListener {
        public final /* synthetic */ OnApplyWindowInsetsListener val$listener;
        public final /* synthetic */ boolean val$paddingBottomSystemWindowInsets;
        public final /* synthetic */ boolean val$paddingLeftSystemWindowInsets;
        public final /* synthetic */ boolean val$paddingRightSystemWindowInsets;

        public C69091(boolean z4, boolean z22, boolean z32, OnApplyWindowInsetsListener onApplyWindowInsetsListener2) {
            z = z4;
            z = z22;
            z = z32;
            onApplyWindowInsetsListener = onApplyWindowInsetsListener2;
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view2, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
            if (z) {
                relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
            if (z) {
                if (zIsLayoutRtl) {
                    relativePadding.end += windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    relativePadding.start += windowInsetsCompat.getSystemWindowInsetLeft();
                }
            }
            if (z) {
                if (zIsLayoutRtl) {
                    relativePadding.start += windowInsetsCompat.getSystemWindowInsetRight();
                } else {
                    relativePadding.end += windowInsetsCompat.getSystemWindowInsetRight();
                }
            }
            relativePadding.applyToView(view2);
            OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
            return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsetsCompat, relativePadding) : windowInsetsCompat;
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            public final /* synthetic */ RelativePadding val$initialPadding;

            public C69102(RelativePadding relativePadding) {
                relativePadding = relativePadding;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$2 */
    /* loaded from: classes8.dex */
    public class C69102 implements androidx.core.view.OnApplyWindowInsetsListener {
        public final /* synthetic */ RelativePadding val$initialPadding;

        public C69102(RelativePadding relativePadding) {
            relativePadding = relativePadding;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
            return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat, new RelativePadding(relativePadding));
        }
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewCompat.requestApplyInsets(view2);
                }
            });
        }
    }

    /* renamed from: com.google.android.material.internal.ViewUtils$3 */
    public class ViewOnAttachStateChangeListenerC69113 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view2) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view2) {
            view2.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view2);
        }
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ViewCompat.getElevation((View) parent);
        }
        return elevation;
    }

    @Nullable
    public static ViewOverlayImpl getOverlay(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    @Nullable
    public static ViewGroup getContentView(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view) {
        return getOverlay(getContentView(view));
    }

    public static void addOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Nullable
    public static Integer getBackgroundColor(@NonNull View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }
}
