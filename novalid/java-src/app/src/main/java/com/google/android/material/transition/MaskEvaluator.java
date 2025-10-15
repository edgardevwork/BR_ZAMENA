package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

/* loaded from: classes4.dex */
public class MaskEvaluator {
    public ShapeAppearanceModel currentShapeAppearanceModel;
    public final Path path = new Path();
    public final Path startPath = new Path();
    public final Path endPath = new Path();
    public final ShapeAppearancePathProvider pathProvider = ShapeAppearancePathProvider.getInstance();

    public void evaluate(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel shapeAppearanceModelLerp = TransitionUtils.lerp(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f);
        this.currentShapeAppearanceModel = shapeAppearanceModelLerp;
        this.pathProvider.calculatePath(shapeAppearanceModelLerp, 1.0f, rectF2, this.startPath);
        this.pathProvider.calculatePath(this.currentShapeAppearanceModel, 1.0f, rectF3, this.endPath);
        this.path.op(this.startPath, this.endPath, Path.Op.UNION);
    }

    public void clip(Canvas canvas) {
        canvas.clipPath(this.path);
    }

    public Path getPath() {
        return this.path;
    }

    public ShapeAppearanceModel getCurrentShapeAppearanceModel() {
        return this.currentShapeAppearanceModel;
    }
}
