package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.C6765R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

@OptIn(markerClass = {ExperimentalBadgeUtils.class})
/* loaded from: classes6.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    public static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    public static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    public static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";

    @StyleRes
    public static final int DEFAULT_STYLE = C6765R.style.Widget_MaterialComponents_Badge;

    @AttrRes
    public static final int DEFAULT_THEME_ATTR = C6765R.attr.badgeStyle;
    public static final float FONT_SCALE_THRESHOLD = 0.3f;
    public static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    public static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    public static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    @Nullable
    public WeakReference<View> anchorViewRef;

    @NonNull
    public final Rect badgeBounds;
    public float badgeCenterX;
    public float badgeCenterY;

    @NonNull
    public final WeakReference<Context> contextRef;
    public float cornerRadius;

    @Nullable
    public WeakReference<FrameLayout> customBadgeParentRef;
    public float halfBadgeHeight;
    public float halfBadgeWidth;
    public int maxBadgeNumber;

    @NonNull
    public final MaterialShapeDrawable shapeDrawable;

    @NonNull
    public final BadgeState state;

    @NonNull
    public final TextDrawableHelper textDrawableHelper;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BadgeGravity {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @NonNull
    public BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    @NonNull
    public static BadgeDrawable createFromSavedState(@NonNull Context context, @NonNull BadgeState.State state) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        return new BadgeDrawable(context, i, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public void setVisible(boolean z) {
        this.state.setVisible(z);
        onVisibilityUpdated();
    }

    public final void onVisibilityUpdated() {
        boolean zIsVisible = this.state.isVisible();
        setVisible(zIsVisible, false);
        if (!BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || zIsVisible) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    public final void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    public BadgeDrawable(@NonNull Context context, @XmlRes int i, @AttrRes int i2, @StyleRes int i3, @Nullable BadgeState.State state) {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i2, i3, state);
        this.state = badgeState;
        if (hasBadgeContent()) {
            badgeShapeAppearanceResId = badgeState.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = badgeState.getBadgeShapeAppearanceResId();
        }
        if (hasBadgeContent()) {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeShapeAppearanceOverlayResId();
        }
        this.shapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        restoreState();
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        boolean z = BadgeUtils.USE_COMPAT_PARENT;
        if (z && frameLayout == null) {
            tryWrapAnchorInCompatParent(view);
        } else {
            this.customBadgeParentRef = new WeakReference<>(frameLayout);
        }
        if (!z) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }

    public final boolean isAnchorViewWrappedInCompatParent() {
        FrameLayout customBadgeParent = getCustomBadgeParent();
        return customBadgeParent != null && customBadgeParent.getId() == C6765R.id.mtrl_anchor_parent;
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void tryWrapAnchorInCompatParent(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C6765R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C6765R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    public final /* synthetic */ View val$anchorView;
                    public final /* synthetic */ FrameLayout val$frameLayout;

                    public RunnableC67721(View view2, FrameLayout frameLayout2) {
                        view = view2;
                        frameLayout = frameLayout2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeDrawable$1 */
    /* loaded from: classes4.dex */
    public class RunnableC67721 implements Runnable {
        public final /* synthetic */ View val$anchorView;
        public final /* synthetic */ FrameLayout val$frameLayout;

        public RunnableC67721(View view2, FrameLayout frameLayout2) {
            view = view2;
            frameLayout = frameLayout2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
        }
    }

    public static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.state.setBackgroundColor(i);
        onBackgroundColorUpdated();
    }

    public final void onBackgroundColorUpdated() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != colorStateListValueOf) {
            this.shapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public void setBadgeTextColor(@ColorInt int i) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i) {
            this.state.setBadgeTextColor(i);
            onBadgeTextColorUpdated();
        }
    }

    public final void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public boolean hasNumber() {
        return !this.state.hasText() && this.state.hasNumber();
    }

    public int getNumber() {
        if (this.state.hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    public void setNumber(int i) {
        int iMax = Math.max(0, i);
        if (this.state.getNumber() != iMax) {
            this.state.setNumber(iMax);
            onNumberUpdated();
        }
    }

    public void clearNumber() {
        if (this.state.hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    public final void onNumberUpdated() {
        if (hasText()) {
            return;
        }
        onBadgeContentUpdated();
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    @Nullable
    public String getText() {
        return this.state.getText();
    }

    public void setText(@Nullable String str) {
        if (TextUtils.equals(this.state.getText(), str)) {
            return;
        }
        this.state.setText(str);
        onTextUpdated();
    }

    public void clearText() {
        if (this.state.hasText()) {
            this.state.clearText();
            onTextUpdated();
        }
    }

    public final void onTextUpdated() {
        onBadgeContentUpdated();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public void setMaxCharacterCount(int i) {
        if (this.state.getMaxCharacterCount() != i) {
            this.state.setMaxCharacterCount(i);
            onMaxBadgeLengthUpdated();
        }
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public void setMaxNumber(int i) {
        if (this.state.getMaxNumber() != i) {
            this.state.setMaxNumber(i);
            onMaxBadgeLengthUpdated();
        }
    }

    public final void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public void setBadgeGravity(int i) {
        if (i == 8388691 || i == 8388693) {
            Log.w(TAG, "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if (this.state.getBadgeGravity() != i) {
            this.state.setBadgeGravity(i);
            onBadgeGravityUpdated();
        }
    }

    public final void onBadgeGravityUpdated() {
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.anchorViewRef.get();
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.state.setAlpha(i);
        onAlphaUpdated();
    }

    public final void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasBadgeContent()) {
            drawBadgeContent(canvas);
        }
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setContentDescriptionForText(@Nullable CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.state.setContentDescriptionQuantityStringsResource(i);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i);
    }

    @Nullable
    public CharSequence getContentDescription() {
        if (!isVisible()) {
            return null;
        }
        if (hasText()) {
            return getTextContentDescription();
        }
        if (hasNumber()) {
            return getNumberContentDescription();
        }
        return getEmptyContentDescription();
    }

    @Nullable
    public final String getNumberContentDescription() {
        Context context;
        if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), Integer.valueOf(getNumber()));
        }
        return context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), Integer.valueOf(this.maxBadgeNumber));
    }

    @Nullable
    public final CharSequence getTextContentDescription() {
        CharSequence contentDescriptionForText = this.state.getContentDescriptionForText();
        return contentDescriptionForText != null ? contentDescriptionForText : getText();
    }

    public final CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    public void setHorizontalPadding(@Px int i) {
        if (i != this.state.getBadgeHorizontalPadding()) {
            this.state.setBadgeHorizontalPadding(i);
            updateCenterAndBounds();
        }
    }

    @Px
    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    public void setVerticalPadding(@Px int i) {
        if (i != this.state.getBadgeVerticalPadding()) {
            this.state.setBadgeVerticalPadding(i);
            updateCenterAndBounds();
        }
    }

    @Px
    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithoutText(@Px int i) {
        this.state.setHorizontalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    @Px
    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public void setHorizontalOffsetWithText(@Px int i) {
        this.state.setHorizontalOffsetWithText(i);
        updateCenterAndBounds();
    }

    @Px
    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    public void setAdditionalHorizontalOffset(int i) {
        this.state.setAdditionalHorizontalOffset(i);
        updateCenterAndBounds();
    }

    public int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithoutText(@Px int i) {
        this.state.setVerticalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    @Px
    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public void setVerticalOffsetWithText(@Px int i) {
        this.state.setVerticalOffsetWithText(i);
        updateCenterAndBounds();
    }

    @Px
    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    public void setLargeFontVerticalOffsetAdjustment(@Px int i) {
        this.state.setLargeFontVerticalOffsetAdjustment(i);
        updateCenterAndBounds();
    }

    @Px
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    public void setAdditionalVerticalOffset(@Px int i) {
        this.state.setAdditionalVerticalOffset(i);
        updateCenterAndBounds();
    }

    @Px
    public int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z) {
        if (this.state.isAutoAdjustedToGrandparentBounds() == z) {
            return;
        }
        this.state.setAutoAdjustToGrandparentBounds(z);
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
    }

    public void setTextAppearance(@StyleRes int i) {
        this.state.setTextAppearanceResId(i);
        onBadgeTextAppearanceUpdated();
    }

    public final void onBadgeTextAppearanceUpdated() {
        TextAppearance textAppearance;
        Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i) {
        this.state.setBadgeShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i) {
        this.state.setBadgeShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i) {
        this.state.setBadgeWithTextShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public final void onBadgeShapeAppearanceUpdated() {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (hasBadgeContent()) {
            badgeShapeAppearanceResId = this.state.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = this.state.getBadgeShapeAppearanceResId();
        }
        if (hasBadgeContent()) {
            badgeShapeAppearanceOverlayResId = this.state.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = this.state.getBadgeShapeAppearanceOverlayResId();
        }
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        invalidateSelf();
    }

    public final void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(rect2, view);
        BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        float f = this.cornerRadius;
        if (f != -1.0f) {
            this.shapeDrawable.setCornerSize(f);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    public final int getTotalVerticalOffsetForState() {
        int verticalOffsetWithoutText = this.state.getVerticalOffsetWithoutText();
        if (hasBadgeContent()) {
            verticalOffsetWithoutText = this.state.getVerticalOffsetWithText();
            Context context = this.contextRef.get();
            if (context != null) {
                verticalOffsetWithoutText = AnimationUtils.lerp(verticalOffsetWithoutText, verticalOffsetWithoutText - this.state.getLargeFontVerticalOffsetAdjustment(), AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithoutText -= Math.round(this.halfBadgeHeight);
        }
        return verticalOffsetWithoutText + this.state.getAdditionalVerticalOffset();
    }

    public final int getTotalHorizontalOffsetForState() {
        int horizontalOffsetWithoutText;
        if (hasBadgeContent()) {
            horizontalOffsetWithoutText = this.state.getHorizontalOffsetWithText();
        } else {
            horizontalOffsetWithoutText = this.state.getHorizontalOffsetWithoutText();
        }
        if (this.state.offsetAlignmentMode == 1) {
            horizontalOffsetWithoutText += hasBadgeContent() ? this.state.horizontalInsetWithText : this.state.horizontalInset;
        }
        return horizontalOffsetWithoutText + this.state.getAdditionalHorizontalOffset();
    }

    public final void calculateCenterAndBounds(@NonNull Rect rect, @NonNull View view) {
        float f;
        float f2;
        float f3 = hasBadgeContent() ? this.state.badgeWithTextRadius : this.state.badgeRadius;
        this.cornerRadius = f3;
        if (f3 != -1.0f) {
            this.halfBadgeWidth = f3;
            this.halfBadgeHeight = f3;
        } else {
            this.halfBadgeWidth = Math.round((hasBadgeContent() ? this.state.badgeWithTextWidth : this.state.badgeWidth) / 2.0f);
            this.halfBadgeHeight = Math.round((hasBadgeContent() ? this.state.badgeWithTextHeight : this.state.badgeHeight) / 2.0f);
        }
        if (hasBadgeContent()) {
            String badgeContent = getBadgeContent();
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(badgeContent) / 2.0f) + this.state.getBadgeHorizontalPadding());
            float fMax = Math.max(this.halfBadgeHeight, (this.textDrawableHelper.getTextHeight(badgeContent) / 2.0f) + this.state.getBadgeVerticalPadding());
            this.halfBadgeHeight = fMax;
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, fMax);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            if (ViewCompat.getLayoutDirection(view) == 0) {
                f = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
            } else {
                f = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f;
        } else {
            if (ViewCompat.getLayoutDirection(view) == 0) {
                f2 = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
            } else {
                f2 = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f2;
        }
        if (this.state.isAutoAdjustedToGrandparentBounds()) {
            autoAdjustWithinGrandparentBounds(view);
        }
    }

    public final void autoAdjustWithinGrandparentBounds(@NonNull View view) {
        float y;
        float x;
        View customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y2 = view.getY();
            x = view.getX();
            customBadgeParent = (View) view.getParent();
            y = y2;
        } else if (!isAnchorViewWrappedInCompatParent()) {
            y = 0.0f;
            x = 0.0f;
        } else {
            if (!(customBadgeParent.getParent() instanceof View)) {
                return;
            }
            y = customBadgeParent.getY();
            x = customBadgeParent.getX();
            customBadgeParent = (View) customBadgeParent.getParent();
        }
        float topCutOff = getTopCutOff(customBadgeParent, y);
        float leftCutOff = getLeftCutOff(customBadgeParent, x);
        float bottomCutOff = getBottomCutOff(customBadgeParent, y);
        float rightCutoff = getRightCutoff(customBadgeParent, x);
        if (topCutOff < 0.0f) {
            this.badgeCenterY += Math.abs(topCutOff);
        }
        if (leftCutOff < 0.0f) {
            this.badgeCenterX += Math.abs(leftCutOff);
        }
        if (bottomCutOff > 0.0f) {
            this.badgeCenterY -= Math.abs(bottomCutOff);
        }
        if (rightCutoff > 0.0f) {
            this.badgeCenterX -= Math.abs(rightCutoff);
        }
    }

    public final float getTopCutOff(View view, float f) {
        return (this.badgeCenterY - this.halfBadgeHeight) + view.getY() + f;
    }

    public final float getLeftCutOff(View view, float f) {
        return (this.badgeCenterX - this.halfBadgeWidth) + view.getX() + f;
    }

    public final float getBottomCutOff(View view, float f) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterY + this.halfBadgeHeight) - (((View) view.getParent()).getHeight() - view.getY())) + f;
    }

    public final float getRightCutoff(View view, float f) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterX + this.halfBadgeWidth) - (((View) view.getParent()).getWidth() - view.getX())) + f;
    }

    public final void drawBadgeContent(Canvas canvas) {
        String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            Rect rect = new Rect();
            this.textDrawableHelper.getTextPaint().getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float fExactCenterY = this.badgeCenterY - rect.exactCenterY();
            canvas.drawText(badgeContent, this.badgeCenterX, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.textDrawableHelper.getTextPaint());
        }
    }

    public final boolean hasBadgeContent() {
        return hasText() || hasNumber();
    }

    @Nullable
    public final String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    @Nullable
    public final String getTextBadgeText() {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(C6765R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), "…");
    }

    @NonNull
    public final String getNumberBadgeText() {
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return String.format(this.state.getNumberLocale(), context.getString(C6765R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.maxBadgeNumber), "+");
    }

    public final void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    public final void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }
}
