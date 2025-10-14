package androidx.media3.p008ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class SubtitlePainter {
    public static final float INNER_PADDING_RATIO = 0.125f;
    public static final String TAG = "SubtitlePainter";
    public int backgroundColor;
    public final Paint bitmapPaint;
    public Rect bitmapRect;
    public float bottomPaddingFraction;

    @Nullable
    public Bitmap cueBitmap;
    public float cueBitmapHeight;
    public float cueLine;
    public int cueLineAnchor;
    public int cueLineType;
    public float cuePosition;
    public int cuePositionAnchor;
    public float cueSize;

    @Nullable
    public CharSequence cueText;

    @Nullable
    public Layout.Alignment cueTextAlignment;
    public float cueTextSizePx;
    public float defaultTextSizePx;
    public int edgeColor;
    public StaticLayout edgeLayout;
    public int edgeType;
    public int foregroundColor;
    public final float outlineWidth;
    public int parentBottom;
    public int parentLeft;
    public int parentRight;
    public int parentTop;
    public final float shadowOffset;
    public final float shadowRadius;
    public final float spacingAdd;
    public final float spacingMult;
    public StaticLayout textLayout;
    public int textLeft;
    public int textPaddingX;
    public final TextPaint textPaint;
    public int textTop;
    public int windowColor;
    public final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = cue.bitmap == null;
        if (!z) {
            i5 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i5 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f && this.cueTextSizePx == f2 && this.bottomPaddingFraction == f3 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f;
        this.cueTextSizePx = f2;
        this.bottomPaddingFraction = f3;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    @RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setupTextLayout() {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int iMax;
        int iMin;
        int iRound;
        int i3;
        int i4;
        int i5;
        CharSequence charSequence = this.cueText;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(this.cueText);
        }
        int i6 = this.parentRight - this.parentLeft;
        int i7 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i8 = (int) ((this.defaultTextSizePx * 0.125f) + 0.5f);
        int i9 = i8 * 2;
        int i10 = i6 - i9;
        float f = this.cueSize;
        if (f != -3.4028235E38f) {
            i10 = (int) (i10 * f);
        }
        int i11 = i10;
        if (i11 <= 0) {
            Log.m635w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            int i12 = this.edgeType;
            if (i12 == 0 || i12 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i11, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        for (int i13 = 0; i13 < lineCount; i13++) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i13)), iMax2);
        }
        if (this.cueSize == -3.4028235E38f || iMax2 >= i11) {
            i11 = iMax2;
        }
        int i14 = i11 + i9;
        float f2 = this.cuePosition;
        if (f2 != -3.4028235E38f) {
            int iRound2 = Math.round(i6 * f2);
            int i15 = this.parentLeft;
            int i16 = iRound2 + i15;
            int i17 = this.cuePositionAnchor;
            i = 1;
            if (i17 != 1) {
                i2 = 2;
                if (i17 == 2) {
                    i16 -= i14;
                }
            } else {
                i2 = 2;
                i16 = ((i16 * 2) - i14) / 2;
            }
            iMax = Math.max(i16, i15);
            iMin = Math.min(i14 + iMax, this.parentRight);
        } else {
            i = 1;
            i2 = 2;
            iMax = ((i6 - i14) / 2) + this.parentLeft;
            iMin = iMax + i14;
        }
        int i18 = iMin - iMax;
        if (i18 <= 0) {
            Log.m635w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i7 * f3) + this.parentTop;
                int i19 = this.cueLineAnchor;
                if (i19 == i2) {
                    iRound -= height;
                } else if (i19 == i) {
                    iRound = ((iRound * 2) - height) / i2;
                }
                i4 = iRound + height;
                i5 = this.parentBottom;
                if (i4 > i5) {
                    iRound = i5 - height;
                } else {
                    int i20 = this.parentTop;
                    if (iRound < i20) {
                        i3 = i20;
                    }
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    iRound = Math.round(f4 * lineBottom) + this.parentTop;
                    i4 = iRound + height;
                    i5 = this.parentBottom;
                    if (i4 > i5) {
                    }
                } else {
                    iRound = Math.round((f4 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                    i4 = iRound + height;
                    i5 = this.parentBottom;
                    if (i4 > i5) {
                    }
                }
            }
            this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i18, alignment2, this.spacingMult, this.spacingAdd, true);
            this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i18, alignment2, this.spacingMult, this.spacingAdd, true);
            this.textLeft = iMax;
            this.textTop = i3;
            this.textPaddingX = i8;
        }
        iRound = (this.parentBottom - height) - ((int) (i7 * this.bottomPaddingFraction));
        i3 = iRound;
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i18, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i18, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = i3;
        this.textPaddingX = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @RequiresNonNull({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setupBitmapLayout() {
        int iRound;
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.cueBitmap;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = i3 + (this.cuePosition * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.cueLine * f5);
        int iRound2 = Math.round(f3 * this.cueSize);
        float f7 = this.cueBitmapHeight;
        if (f7 != -3.4028235E38f) {
            iRound = Math.round(f5 * f7);
        } else {
            iRound = Math.round(iRound2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.cuePositionAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound2 / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.cueLineAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound / 2;
                }
                int iRound4 = Math.round(f6);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f2 = iRound;
            f6 -= f2;
            int iRound42 = Math.round(f6);
            this.bitmapRect = new Rect(iRound3, iRound42, iRound2 + iRound3, iRound + iRound42);
        }
        f = iRound2;
        f4 -= f;
        int iRound32 = Math.round(f4);
        i = this.cueLineAnchor;
        if (i == 2) {
        }
        f6 -= f2;
        int iRound422 = Math.round(f6);
        this.bitmapRect = new Rect(iRound32, iRound422, iRound2 + iRound32, iRound + iRound422);
    }

    public final void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    public final void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i = this.edgeType;
        if (i == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.textPaint;
            float f = this.shadowRadius;
            float f2 = this.shadowOffset;
            textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.edgeColor;
            int i3 = z ? this.edgeColor : -1;
            float f3 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i3);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    public final void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    public static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
