package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.canvas.CanvasCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class ShapeableDelegate {

    @Nullable
    public ShapeAppearanceModel shapeAppearanceModel;
    public boolean forceCompatClippingEnabled = false;
    public boolean offsetZeroCornerEdgeBoundsEnabled = false;
    public RectF maskBounds = new RectF();
    public final Path shapePath = new Path();

    public abstract void invalidateClippingMethod(@NonNull View view);

    public abstract boolean shouldUseCompatClipping();

    @NonNull
    public static ShapeableDelegate create(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new ShapeableDelegateV33(view);
        }
        return new ShapeableDelegateV22(view);
    }

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void setForceCompatClippingEnabled(@NonNull View view, boolean z) {
        if (z != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@NonNull View view, boolean z) {
        this.offsetZeroCornerEdgeBoundsEnabled = z;
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(@NonNull View view, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onMaskChanged(@NonNull View view, @NonNull RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public final void updateShapePath() {
        if (!isMaskBoundsValid() || this.shapeAppearanceModel == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    public final boolean isMaskBoundsValid() {
        RectF rectF = this.maskBounds;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void maybeClip(@NonNull Canvas canvas, @NonNull CanvasCompat.CanvasOperation canvasOperation) {
        if (shouldUseCompatClipping() && !this.shapePath.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.shapePath);
            canvasOperation.run(canvas);
            canvas.restore();
            return;
        }
        canvasOperation.run(canvas);
    }
}
