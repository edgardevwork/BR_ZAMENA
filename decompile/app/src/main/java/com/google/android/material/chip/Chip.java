package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C6765R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {
    public static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    public static final int CHIP_BODY_VIRTUAL_ID = 0;
    public static final int CLOSE_ICON_VIRTUAL_ID = 1;
    public static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    public static final int MIN_TOUCH_TARGET_DP = 48;
    public static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    public static final String RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.RadioButton";
    public static final String TAG = "Chip";

    @Nullable
    public CharSequence accessibilityClassName;

    @Nullable
    public ChipDrawable chipDrawable;
    public boolean closeIconFocused;
    public boolean closeIconHovered;
    public boolean closeIconPressed;
    public boolean deferredCheckedValue;
    public boolean ensureMinTouchTargetSize;
    public final TextAppearanceFontCallback fontCallback;

    @Nullable
    public InsetDrawable insetBackgroundDrawable;
    public int lastLayoutDirection;

    @Dimension(unit = 1)
    public int minTouchTargetSize;

    @Nullable
    public CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @Nullable
    public MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListenerInternal;

    @Nullable
    public View.OnClickListener onCloseIconClickListener;
    public final Rect rect;
    public final RectF rectF;

    @Nullable
    public RippleDrawable ripple;

    @NonNull
    public final ChipTouchHelper touchHelper;
    public boolean touchHelperEnabled;
    public static final int DEF_STYLE_RES = C6765R.style.Widget_MaterialComponents_Chip_Action;
    public static final Rect EMPTY_BOUNDS = new Rect();
    public static final int[] SELECTED_STATE = {R.attr.state_selected};
    public static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};

    /* renamed from: com.google.android.material.chip.Chip$1 */
    public class C68231 extends TextAppearanceFontCallback {
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
        }

        public C68231() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.chipDrawable.shouldDrawText() ? Chip.this.chipDrawable.getText() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6765R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i3) {
            }

            public C68231() {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
                Chip chip = Chip.this;
                chip.setText(chip.chipDrawable.shouldDrawText() ? Chip.this.chipDrawable.getText() : Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        ChipDrawable chipDrawableCreateFromAttributes = ChipDrawable.createFromAttributes(context2, attributeSet, i, i2);
        initMinTouchTarget(context2, attributeSet, i);
        setChipDrawable(chipDrawableCreateFromAttributes);
        chipDrawableCreateFromAttributes.setElevation(ViewCompat.getElevation(this));
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C6765R.styleable.Chip, i, i2, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C6765R.styleable.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes.recycle();
        this.touchHelper = new ChipTouchHelper(this);
        updateAccessibilityDelegate();
        if (!zHasValue) {
            initOutlineProvider();
        }
        setChecked(this.deferredCheckedValue);
        setText(chipDrawableCreateFromAttributes.getText());
        setEllipsize(chipDrawableCreateFromAttributes.getEllipsize());
        updateTextPaintDrawState();
        if (!this.chipDrawable.shouldDrawText()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        updatePaddingInternal();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.minTouchTargetSize);
        }
        this.lastLayoutDirection = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.Chip$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f$0.lambda$new$0(compoundButton, z);
            }
        });
    }

    public final /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean z) {
        MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener = this.onCheckedChangeListenerInternal;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = this.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.chipDrawable);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setElevation(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.getRowIndex(this), 1, chipGroup.isSingleLine() ? chipGroup.getIndexOfChip(this) : -1, 1, false, isChecked()));
        }
    }

    public final void updateAccessibilityDelegate() {
        if (hasCloseIcon() && isCloseIconVisible() && this.onCloseIconClickListener != null) {
            ViewCompat.setAccessibilityDelegate(this, this.touchHelper);
            this.touchHelperEnabled = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.touchHelperEnabled = false;
        }
    }

    public final void initMinTouchTarget(Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C6765R.styleable.Chip, i, DEF_STYLE_RES, new int[0]);
        this.ensureMinTouchTargetSize = typedArrayObtainStyledAttributes.getBoolean(C6765R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(C6765R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void updatePaddingInternal() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.chipDrawable) == null) {
            return;
        }
        int chipEndPadding = (int) (chipDrawable.getChipEndPadding() + this.chipDrawable.getTextEndPadding() + this.chipDrawable.calculateCloseIconWidth());
        int chipStartPadding = (int) (this.chipDrawable.getChipStartPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.calculateChipIconWidth());
        if (this.insetBackgroundDrawable != null) {
            Rect rect = new Rect();
            this.insetBackgroundDrawable.getPadding(rect);
            chipStartPadding += rect.left;
            chipEndPadding += rect.right;
        }
        ViewCompat.setPaddingRelative(this, chipStartPadding, getPaddingTop(), chipEndPadding, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.lastLayoutDirection != i) {
            this.lastLayoutDirection = i;
            updatePaddingInternal();
        }
    }

    private void validateAttributes(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", NotificationCompat.WearableExtender.KEY_GRAVITY, 8388627) != 8388627) {
            Log.w(TAG, "Chip text must be vertically center and start aligned");
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$2 */
    /* loaded from: classes4.dex */
    public class C68242 extends ViewOutlineProvider {
        public C68242() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.chipDrawable != null) {
                Chip.this.chipDrawable.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public final void initOutlineProvider() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
            public C68242() {
            }

            @Override // android.view.ViewOutlineProvider
            @TargetApi(21)
            public void getOutline(View view, @NonNull Outline outline) {
                if (Chip.this.chipDrawable != null) {
                    Chip.this.chipDrawable.getOutline(outline);
                } else {
                    outline.setAlpha(0.0f);
                }
            }
        });
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.chipDrawable;
        if (chipDrawable2 != chipDrawable) {
            unapplyChipDrawable(chipDrawable2);
            this.chipDrawable = chipDrawable;
            chipDrawable.setShouldDrawText(false);
            applyChipDrawable(this.chipDrawable);
            ensureAccessibleTouchTarget(this.minTouchTargetSize);
        }
    }

    public final void updateBackgroundDrawable() {
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            updateFrameworkRippleBackground();
            return;
        }
        this.chipDrawable.setUseCompatRipple(true);
        ViewCompat.setBackground(this, getBackgroundDrawable());
        updatePaddingInternal();
        ensureChipDrawableHasCallback();
    }

    public final void ensureChipDrawableHasCallback() {
        if (getBackgroundDrawable() == this.insetBackgroundDrawable && this.chipDrawable.getCallback() == null) {
            this.chipDrawable.setCallback(this.insetBackgroundDrawable);
        }
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.insetBackgroundDrawable;
        return insetDrawable == null ? this.chipDrawable : insetDrawable;
    }

    public final void updateFrameworkRippleBackground() {
        this.ripple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.chipDrawable.getRippleColor()), getBackgroundDrawable(), null);
        this.chipDrawable.setUseCompatRipple(false);
        ViewCompat.setBackground(this, this.ripple);
        updatePaddingInternal();
    }

    public final void unapplyChipDrawable(@Nullable ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.setDelegate(null);
        }
    }

    public final void applyChipDrawable(@NonNull ChipDrawable chipDrawable) {
        chipDrawable.setDelegate(this);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, SELECTED_STATE);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w(TAG, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w(TAG, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w(TAG, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w(TAG, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w(TAG, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.ripple) {
            Log.w(TAG, "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.ripple) {
            Log.w(TAG, "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.chipDrawable == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setEllipsize(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setMaxWidth(i);
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            this.deferredCheckedValue = z;
        } else if (chipDrawable.isCheckable()) {
            super.setChecked(z);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.onCloseIconClickListener = onClickListener;
        updateAccessibilityDelegate();
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.onCloseIconClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.touchHelperEnabled) {
            this.touchHelper.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x001e, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.closeIconPressed) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else {
                if (this.closeIconPressed) {
                    performCloseIconClick();
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.touchHelperEnabled) {
            return this.touchHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.touchHelperEnabled) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.touchHelper.dispatchKeyEvent(keyEvent) || this.touchHelper.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.touchHelperEnabled) {
            this.touchHelper.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.touchHelperEnabled && (this.touchHelper.getKeyboardFocusedVirtualViewId() == 1 || this.touchHelper.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.closeIconPressed != z) {
            this.closeIconPressed = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.closeIconHovered != z) {
            this.closeIconHovered = z;
            refreshDrawableState();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.chipDrawable;
        if ((chipDrawable == null || !chipDrawable.isCloseIconStateful()) ? false : this.chipDrawable.setCloseIconState(createCloseIconDrawableState())) {
            invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] createCloseIconDrawableState() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.closeIconFocused) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.closeIconHovered) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.closeIconPressed) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.closeIconFocused) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.closeIconHovered) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.closeIconPressed) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public final boolean hasCloseIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return (chipDrawable == null || chipDrawable.getCloseIcon() == null) ? false : true;
    }

    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.rectF.setEmpty();
        if (hasCloseIcon() && this.onCloseIconClickListener != null) {
            this.chipDrawable.getCloseIconTouchBounds(this.rectF);
        }
        return this.rectF;
    }

    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.rect;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.onCheckedChangeListenerInternal = onCheckedChangeListener;
    }

    public class ChipTouchHelper extends ExploreByTouchHelper {
        public ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return (Chip.this.hasCloseIcon() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.hasCloseIcon() && Chip.this.isCloseIconVisible() && Chip.this.onCloseIconClickListener != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip.this.closeIconFocused = z;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    accessibilityNodeInfoCompat.setContentDescription(Chip.this.getContext().getString(C6765R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
                }
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.EMPTY_BOUNDS);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.isCheckable());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColorResource(i);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeightResource(i);
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipMinHeight(f);
        }
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.getChipCornerRadius());
        }
        return 0.0f;
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadiusResource(i);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.chipDrawable.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.chipDrawable.getShapeAppearanceModel();
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipCornerRadius(f);
        }
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColorResource(i);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidthResource(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStrokeWidth(f);
        }
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getRippleColor();
        }
        return null;
    }

    public void setRippleColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColorResource(i);
            if (this.chipDrawable.getUseCompatRipple()) {
                return;
            }
            updateFrameworkRippleBackground();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setRippleColor(colorStateList);
        }
        if (this.chipDrawable.getUseCompatRipple()) {
            return;
        }
        updateFrameworkRippleBackground();
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.chipDrawable == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.shouldDrawText() ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.chipDrawable;
        if (chipDrawable2 != null) {
            chipDrawable2.setText(charSequence);
        }
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearance(textAppearance);
        }
        updateTextPaintDrawState();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i);
        }
        updateTextPaintDrawState();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextAppearanceResource(i);
        }
        updateTextPaintDrawState();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        updateTextPaintDrawState();
    }

    public final void updateTextPaintDrawState() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.fontCallback);
        }
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextAppearance();
        }
        return null;
    }

    public boolean isChipIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isChipIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public void setChipIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconVisible(z);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Nullable
    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIcon();
        }
        return null;
    }

    public void setChipIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconResource(i);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIcon(drawable);
        }
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconTint();
        }
        return null;
    }

    public void setChipIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTintResource(i);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSizeResource(i);
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipIconSize(f);
        }
    }

    public boolean isCloseIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCloseIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconVisible(z);
        }
        updateAccessibilityDelegate();
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Nullable
    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIcon();
        }
        return null;
    }

    public void setCloseIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconResource(i);
        }
        updateAccessibilityDelegate();
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIcon(drawable);
        }
        updateAccessibilityDelegate();
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconTint();
        }
        return null;
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTintResource(i);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSizeResource(i);
        }
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconSize(f);
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public boolean isCheckable() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCheckable();
    }

    public void setCheckableResource(@BoolRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckableResource(i);
        }
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckable(z);
        }
    }

    public boolean isCheckedIconVisible() {
        ChipDrawable chipDrawable = this.chipDrawable;
        return chipDrawable != null && chipDrawable.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconVisible(z);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIcon();
        }
        return null;
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconResource(i);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIcon(drawable);
        }
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCheckedIconTint();
        }
        return null;
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTintResource(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCheckedIconTint(colorStateList);
        }
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpecResource(i);
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpecResource(i);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPaddingResource(i);
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipStartPadding(f);
        }
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPaddingResource(i);
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconStartPadding(f);
        }
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPaddingResource(i);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setIconEndPadding(f);
        }
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPaddingResource(i);
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextStartPadding(f);
        }
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPaddingResource(i);
        }
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setTextEndPadding(f);
        }
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPaddingResource(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconStartPadding(f);
        }
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPaddingResource(i);
        }
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setCloseIconEndPadding(f);
        }
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            return chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPaddingResource(i);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.chipDrawable;
        if (chipDrawable != null) {
            chipDrawable.setChipEndPadding(f);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.ensureMinTouchTargetSize = z;
        ensureAccessibleTouchTarget(this.minTouchTargetSize);
    }

    public boolean ensureAccessibleTouchTarget(@Dimension int i) {
        this.minTouchTargetSize = i;
        if (!shouldEnsureMinTouchTargetSize()) {
            if (this.insetBackgroundDrawable != null) {
                removeBackgroundInset();
            } else {
                updateBackgroundDrawable();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.chipDrawable.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.chipDrawable.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.insetBackgroundDrawable != null) {
                removeBackgroundInset();
            } else {
                updateBackgroundDrawable();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.insetBackgroundDrawable != null) {
            Rect rect = new Rect();
            this.insetBackgroundDrawable.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                updateBackgroundDrawable();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        insetChipBackgroundDrawable(i2, i3, i2, i3);
        updateBackgroundDrawable();
        return true;
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.accessibilityClassName = charSequence;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.accessibilityClassName)) {
            return this.accessibilityClassName;
        }
        if (!isCheckable()) {
            return isClickable() ? BUTTON_ACCESSIBILITY_CLASS_NAME : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME : BUTTON_ACCESSIBILITY_CLASS_NAME;
    }

    public final void removeBackgroundInset() {
        if (this.insetBackgroundDrawable != null) {
            this.insetBackgroundDrawable = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            updateBackgroundDrawable();
        }
    }

    public final void insetChipBackgroundDrawable(int i, int i2, int i3, int i4) {
        this.insetBackgroundDrawable = new InsetDrawable((Drawable) this.chipDrawable, i, i2, i3, i4);
    }
}
