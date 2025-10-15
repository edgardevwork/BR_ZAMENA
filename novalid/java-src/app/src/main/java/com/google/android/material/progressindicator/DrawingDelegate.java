package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.gson.internal.Excluder;

/* loaded from: classes4.dex */
public abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    public S spec;

    public static class ActiveIndicator {

        @ColorInt
        public int color;

        @FloatRange(from = 0.0d, m9to = 1.0d)
        public float endFraction;

        @Px
        public int gapSize;

        @FloatRange(from = 0.0d, m9to = 1.0d)
        public float startFraction;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = Excluder.IGNORE_VERSIONS, m9to = 1.0d) float f, boolean z, boolean z2);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i2);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m9to = 1.0d) float f, @FloatRange(from = 0.0d, m9to = 1.0d) float f2, @ColorInt int i, @IntRange(from = 0, m10to = ScatterMapKt.Sentinel) int i2, @Px int i3);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m9to = 1.0d) float f, boolean z, boolean z2) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z, z2);
    }
}
