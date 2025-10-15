package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C6765R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes6.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        initialize(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        initialize(attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i);
        }
    }

    public final void initialize(@Nullable AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i, i2) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
        }
    }

    public final void applyLineHeightFromViewAppearance(@NonNull Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, C6765R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, C6765R.styleable.MaterialTextAppearance_android_lineHeight, C6765R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    public static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, C6765R.attr.textAppearanceLineHeightEnabled, true);
    }

    public static int readFirstAvailableDimension(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i], -1);
        }
        return dimensionPixelSize;
    }

    public static boolean viewAttrsHasLineHeight(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6765R.styleable.MaterialTextView, i, i2);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, C6765R.styleable.MaterialTextView_android_lineHeight, C6765R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    public static int findViewAppearanceResourceId(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6765R.styleable.MaterialTextView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6765R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
