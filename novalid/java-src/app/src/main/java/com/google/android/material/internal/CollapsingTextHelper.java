package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollapsingTextHelper {
    public static final boolean DEBUG_DRAW = false;
    public static final String ELLIPSIS_NORMAL = "…";
    public static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    public static final String TAG = "CollapsingTextHelper";
    public boolean boundsChanged;

    @NonNull
    public final Rect collapsedBounds;
    public float collapsedDrawX;
    public float collapsedDrawY;
    public CancelableFontCallback collapsedFontCallback;
    public float collapsedLetterSpacing;
    public ColorStateList collapsedShadowColor;
    public float collapsedShadowDx;
    public float collapsedShadowDy;
    public float collapsedShadowRadius;
    public float collapsedTextBlend;
    public ColorStateList collapsedTextColor;
    public float collapsedTextWidth;
    public Typeface collapsedTypeface;
    public Typeface collapsedTypefaceBold;
    public Typeface collapsedTypefaceDefault;

    @NonNull
    public final RectF currentBounds;
    public float currentDrawX;
    public float currentDrawY;
    public float currentLetterSpacing;
    public int currentOffsetY;
    public int currentShadowColor;
    public float currentShadowDx;
    public float currentShadowDy;
    public float currentShadowRadius;
    public float currentTextSize;
    public Typeface currentTypeface;

    @NonNull
    public final Rect expandedBounds;
    public float expandedDrawX;
    public float expandedDrawY;
    public CancelableFontCallback expandedFontCallback;
    public float expandedFraction;
    public float expandedLetterSpacing;
    public int expandedLineCount;
    public ColorStateList expandedShadowColor;
    public float expandedShadowDx;
    public float expandedShadowDy;
    public float expandedShadowRadius;
    public float expandedTextBlend;
    public ColorStateList expandedTextColor;

    @Nullable
    public Bitmap expandedTitleTexture;
    public Typeface expandedTypeface;
    public Typeface expandedTypefaceBold;
    public Typeface expandedTypefaceDefault;
    public boolean fadeModeEnabled;
    public float fadeModeStartFraction;
    public float fadeModeThresholdFraction;
    public boolean isRtl;
    public TimeInterpolator positionInterpolator;
    public float scale;
    public int[] state;

    @Nullable
    public StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;

    @Nullable
    public CharSequence text;
    public StaticLayout textLayout;

    @NonNull
    public final TextPaint textPaint;
    public TimeInterpolator textSizeInterpolator;

    @Nullable
    public CharSequence textToDraw;
    public CharSequence textToDrawCollapsed;
    public Paint texturePaint;

    @NonNull
    public final TextPaint tmpPaint;
    public boolean useTexture;
    public final View view;
    public static final boolean USE_SCALING_TEXTURE = false;

    @NonNull
    public static final Paint DEBUG_DRAW_PAINT = null;
    public int expandedTextGravity = 16;
    public int collapsedTextGravity = 16;
    public float expandedTextSize = 15.0f;
    public float collapsedTextSize = 15.0f;
    public TextUtils.TruncateAt titleTextEllipsize = TextUtils.TruncateAt.END;
    public boolean isRtlTextDirectionHeuristicsEnabled = true;
    public int maxLines = 1;
    public float lineSpacingAdd = 0.0f;
    public float lineSpacingMultiplier = 1.0f;
    public int hyphenationFrequency = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;

    public CollapsingTextHelper(View view) {
        this.view = view;
        TextPaint textPaint = new TextPaint(129);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    public void setExpandedTextSize(float f) {
        if (this.expandedTextSize != f) {
            this.expandedTextSize = f;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if (this.collapsedTextSize != f) {
            this.collapsedTextSize = f;
            recalculate();
        }
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.collapsedTextColor == colorStateList && this.expandedTextColor == colorStateList) {
            return;
        }
        this.collapsedTextColor = colorStateList;
        this.expandedTextColor = colorStateList;
        recalculate();
    }

    public void setExpandedLetterSpacing(float f) {
        if (this.expandedLetterSpacing != f) {
            this.expandedLetterSpacing = f;
            recalculate();
        }
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.expandedBounds, i, i2, i3, i4)) {
            return;
        }
        this.expandedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (rectEquals(this.collapsedBounds, i, i2, i3, i4)) {
            return;
        }
        this.collapsedBounds.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF, int i, int i2) {
        this.isRtl = calculateIsRtl(this.text);
        rectF.left = Math.max(getCollapsedTextLeftBound(i, i2), this.collapsedBounds.left);
        rectF.top = this.collapsedBounds.top;
        rectF.right = Math.min(getCollapsedTextRightBound(rectF, i, i2), this.collapsedBounds.right);
        rectF.bottom = this.collapsedBounds.top + getCollapsedTextHeight();
    }

    public final float getCollapsedTextLeftBound(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.collapsedTextWidth / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.isRtl ? this.collapsedBounds.left : this.collapsedBounds.right - this.collapsedTextWidth : this.isRtl ? this.collapsedBounds.right - this.collapsedTextWidth : this.collapsedBounds.left;
    }

    public final float getCollapsedTextRightBound(@NonNull RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (this.collapsedTextWidth / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.isRtl ? rectF.left + this.collapsedTextWidth : this.collapsedBounds.right : this.isRtl ? this.collapsedBounds.right : rectF.left + this.collapsedTextWidth;
    }

    public float getExpandedTextHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextFullHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public void setCurrentOffsetY(int i) {
        this.currentOffsetY = i;
    }

    public void setFadeModeStartFraction(float f) {
        this.fadeModeStartFraction = f;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    public final float calculateFadeModeThresholdFraction() {
        float f = this.fadeModeStartFraction;
        return f + ((1.0f - f) * 0.5f);
    }

    public void setFadeModeEnabled(boolean z) {
        this.fadeModeEnabled = z;
    }

    public final void getTextPaintExpanded(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
    }

    public final void getTextPaintCollapsed(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
    }

    public void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate();
        }
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate();
        }
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public void setCollapsedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.collapsedShadowColor = colorStateList;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setExpandedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.expandedShadowColor = colorStateList;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.titleTextEllipsize = truncateAt;
        recalculate();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (collapsedTypefaceInternal || expandedTypefaceInternal) {
            recalculate();
        }
    }

    public final boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
        }
        this.collapsedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
        }
        this.expandedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public void setExpansionFraction(float f) {
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (fClamp != this.expandedFraction) {
            this.expandedFraction = fClamp;
            calculateCurrentOffsets();
        }
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.collapsedTextColor;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.expandedTextColor) != null && colorStateList.isStateful());
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.isRtlTextDirectionHeuristicsEnabled = z;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    public final void calculateOffsets(float f) {
        float f2;
        interpolateBounds(f);
        if (!this.fadeModeEnabled) {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
            setInterpolatedTextSize(f);
            f2 = f;
        } else if (f < this.fadeModeThresholdFraction) {
            this.currentDrawX = this.expandedDrawX;
            this.currentDrawY = this.expandedDrawY;
            setInterpolatedTextSize(0.0f);
            f2 = 0.0f;
        } else {
            this.currentDrawX = this.collapsedDrawX;
            this.currentDrawY = this.collapsedDrawY - Math.max(0, this.currentOffsetY);
            setInterpolatedTextSize(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        setExpandedTextBlend(lerp(1.0f, 0.0f, f, timeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f2));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        int i = Build.VERSION.SDK_INT;
        float f3 = this.collapsedLetterSpacing;
        float f4 = this.expandedLetterSpacing;
        if (f3 != f4) {
            this.textPaint.setLetterSpacing(lerp(f4, f3, f, timeInterpolator));
        } else {
            this.textPaint.setLetterSpacing(f3);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f, null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, f, null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, f, null);
        int iBlendARGB = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f);
        this.currentShadowColor = iBlendARGB;
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, iBlendARGB);
        if (this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(f) * this.textPaint.getAlpha()));
            if (i >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public final float calculateFadeModeTextAlpha(@FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        float f2 = this.fadeModeThresholdFraction;
        if (f <= f2) {
            return AnimationUtils.lerp(1.0f, 0.0f, this.fadeModeStartFraction, f2, f);
        }
        return AnimationUtils.lerp(0.0f, 1.0f, f2, 1.0f, f);
    }

    @ColorInt
    public final int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    @ColorInt
    public final int getCurrentColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void calculateBaseOffsets(boolean z) {
        StaticLayout staticLayout;
        calculateUsingTextSize(1.0f, z);
        CharSequence charSequence = this.textToDraw;
        if (charSequence != null && (staticLayout = this.textLayout) != null) {
            this.textToDrawCollapsed = TextUtils.ellipsize(charSequence, this.textPaint, staticLayout.getWidth(), this.titleTextEllipsize);
        }
        CharSequence charSequence2 = this.textToDrawCollapsed;
        float fMeasureTextWidth = 0.0f;
        if (charSequence2 != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, charSequence2);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.collapsedDrawY = this.collapsedBounds.top;
        } else if (i == 80) {
            this.collapsedDrawY = this.collapsedBounds.bottom + this.textPaint.ascent();
        } else {
            this.collapsedDrawY = this.collapsedBounds.centerY() - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.collapsedDrawX = this.collapsedBounds.centerX() - (this.collapsedTextWidth / 2.0f);
        } else if (i2 == 5) {
            this.collapsedDrawX = this.collapsedBounds.right - this.collapsedTextWidth;
        } else {
            this.collapsedDrawX = this.collapsedBounds.left;
        }
        calculateUsingTextSize(0.0f, z);
        float height = this.textLayout != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.textLayout;
        if (staticLayout2 != null && this.maxLines > 1) {
            fMeasureTextWidth = staticLayout2.getWidth();
        } else {
            CharSequence charSequence3 = this.textToDraw;
            if (charSequence3 != null) {
                fMeasureTextWidth = measureTextWidth(this.textPaint, charSequence3);
            }
        }
        StaticLayout staticLayout3 = this.textLayout;
        this.expandedLineCount = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.expandedDrawY = this.expandedBounds.top;
        } else if (i3 != 80) {
            this.expandedDrawY = this.expandedBounds.centerY() - (height / 2.0f);
        } else {
            this.expandedDrawY = (this.expandedBounds.bottom - height) + this.textPaint.descent();
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.expandedDrawX = this.expandedBounds.centerX() - (fMeasureTextWidth / 2.0f);
        } else if (i4 == 5) {
            this.expandedDrawX = this.expandedBounds.right - fMeasureTextWidth;
        } else {
            this.expandedDrawX = this.expandedBounds.left;
        }
        clearTexture();
        setInterpolatedTextSize(this.expandedFraction);
    }

    public final float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void interpolateBounds(float f) {
        if (this.fadeModeEnabled) {
            this.currentBounds.set(f < this.fadeModeThresholdFraction ? this.expandedBounds : this.collapsedBounds);
            return;
        }
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f, this.positionInterpolator);
    }

    public final void setCollapsedTextBlend(float f) {
        this.collapsedTextBlend = f;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public final void setExpandedTextBlend(float f) {
        this.expandedTextBlend = f;
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public void draw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.textToDraw == null || this.currentBounds.width() <= 0.0f || this.currentBounds.height() <= 0.0f) {
            return;
        }
        this.textPaint.setTextSize(this.currentTextSize);
        float f = this.currentDrawX;
        float f2 = this.currentDrawY;
        boolean z = this.useTexture && this.expandedTitleTexture != null;
        float f3 = this.scale;
        if (f3 != 1.0f && !this.fadeModeEnabled) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.expandedTitleTexture, f, f2, this.texturePaint);
            canvas.restoreToCount(iSave);
            return;
        }
        if (shouldDrawMultiline() && (!this.fadeModeEnabled || this.expandedFraction > this.fadeModeThresholdFraction)) {
            drawMultilineTransition(canvas, this.currentDrawX - this.textLayout.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.textLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final boolean shouldDrawMultiline() {
        return this.maxLines > 1 && (!this.isRtl || this.fadeModeEnabled) && !this.useTexture;
    }

    public final void drawMultilineTransition(@NonNull Canvas canvas, float f, float f2) {
        int alpha = this.textPaint.getAlpha();
        canvas.translate(f, f2);
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.expandedTextBlend * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
            this.textLayout.draw(canvas);
        }
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.collapsedTextBlend * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.textPaint;
            textPaint2.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint2.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.textPaint);
        if (i >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (this.fadeModeEnabled) {
            return;
        }
        String strTrim = this.textToDrawCollapsed.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.textPaint.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.textLayout.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.textPaint);
    }

    public final boolean calculateIsRtl(@NonNull CharSequence charSequence) {
        boolean zIsDefaultIsRtl = isDefaultIsRtl();
        return this.isRtlTextDirectionHeuristicsEnabled ? isTextDirectionHeuristicsIsRtl(charSequence, zIsDefaultIsRtl) : zIsDefaultIsRtl;
    }

    public final boolean isDefaultIsRtl() {
        return ViewCompat.getLayoutDirection(this.view) == 1;
    }

    public final boolean isTextDirectionHeuristicsIsRtl(@NonNull CharSequence charSequence, boolean z) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (z) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public final void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = USE_SCALING_TEXTURE && this.scale != 1.0f;
        this.useTexture = z;
        if (z) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public final void calculateUsingTextSize(float f) {
        calculateUsingTextSize(f, false);
    }

    public final void calculateUsingTextSize(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.text == null) {
            return;
        }
        float fWidth = this.collapsedBounds.width();
        float fWidth2 = this.expandedBounds.width();
        if (isClose(f, 1.0f)) {
            f2 = this.collapsedTextSize;
            f3 = this.collapsedLetterSpacing;
            this.scale = 1.0f;
            typeface = this.collapsedTypeface;
        } else {
            float f4 = this.expandedTextSize;
            float f5 = this.expandedLetterSpacing;
            Typeface typeface2 = this.expandedTypeface;
            if (isClose(f, 0.0f)) {
                this.scale = 1.0f;
            } else {
                this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator) / this.expandedTextSize;
            }
            float f6 = this.collapsedTextSize / this.expandedTextSize;
            fWidth = (z || this.fadeModeEnabled || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z2 = this.currentTextSize != f2;
            boolean z3 = this.currentLetterSpacing != f3;
            boolean z4 = this.currentTypeface != typeface;
            StaticLayout staticLayout = this.textLayout;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.boundsChanged;
            this.currentTextSize = f2;
            this.currentLetterSpacing = f3;
            this.currentTypeface = typeface;
            this.boundsChanged = false;
            this.textPaint.setLinearText(this.scale != 1.0f);
            z = z5;
        }
        if (this.textToDraw == null || z) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            this.textPaint.setLetterSpacing(this.currentLetterSpacing);
            this.isRtl = calculateIsRtl(this.text);
            StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(shouldDrawMultiline() ? this.maxLines : 1, fWidth, this.isRtl);
            this.textLayout = staticLayoutCreateStaticLayout;
            this.textToDraw = staticLayoutCreateStaticLayout.getText();
        }
    }

    public final StaticLayout createStaticLayout(int i, float f, boolean z) {
        StaticLayout staticLayoutBuild;
        try {
            staticLayoutBuild = StaticLayoutBuilderCompat.obtain(this.text, this.textPaint, (int) f).setEllipsize(this.titleTextEllipsize).setIsRtl(z).setAlignment(i == 1 ? Layout.Alignment.ALIGN_NORMAL : getMultilineTextLayoutAlignment()).setIncludePad(false).setMaxLines(i).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).setStaticLayoutBuilderConfigurer(this.staticLayoutBuilderConfigurer).build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            Log.e(TAG, e.getCause().getMessage(), e);
            staticLayoutBuild = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayoutBuild);
    }

    public final Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
        if (absoluteGravity != 1) {
            return absoluteGravity != 5 ? this.isRtl ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.isRtl ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public final void ensureExpandedTexture() {
        if (this.expandedTitleTexture != null || this.expandedBounds.isEmpty() || TextUtils.isEmpty(this.textToDraw)) {
            return;
        }
        calculateOffsets(0.0f);
        int width = this.textLayout.getWidth();
        int height = this.textLayout.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.expandedTitleTexture = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.textLayout.draw(new Canvas(this.expandedTitleTexture));
        if (this.texturePaint == null) {
            this.texturePaint = new Paint(3);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void recalculate(boolean z) {
        if ((this.view.getHeight() <= 0 || this.view.getWidth() <= 0) && !z) {
            return;
        }
        calculateBaseOffsets(z);
        calculateCurrentOffsets();
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    public final void clearTexture() {
        Bitmap bitmap = this.expandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.expandedTitleTexture = null;
        }
    }

    public void setMaxLines(int i) {
        if (i != this.maxLines) {
            this.maxLines = i;
            clearTexture();
            recalculate();
        }
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f) {
        this.lineSpacingAdd = f;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.lineSpacingMultiplier = f;
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i) {
        this.hyphenationFrequency = i;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.staticLayoutBuilderConfigurer != staticLayoutBuilderConfigurer) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static float lerp(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    public static boolean rectEquals(@NonNull Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
