package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.C3424L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    public static final int CLIP_SAVE_FLAG = 2;
    public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    public static final int MATRIX_SAVE_FLAG = 1;
    public static final int SAVE_FLAGS = 19;
    public final List<BaseKeyframeAnimation<?, ?>> animations;

    @Nullable
    public BlurMaskFilter blurMaskFilter;
    public float blurMaskFilterRadius;
    public final Matrix boundsMatrix;
    public final RectF canvasBounds;
    public final Paint clearPaint;
    public final String drawTraceName;
    public final Paint dstInPaint;
    public final Paint dstOutPaint;

    @Nullable
    public FloatKeyframeAnimation inOutAnimation;
    public final Layer layerModel;
    public final LottieDrawable lottieDrawable;

    @Nullable
    public MaskKeyframeAnimation mask;
    public final RectF maskBoundsRect;
    public final RectF matteBoundsRect;

    @Nullable
    public BaseLayer matteLayer;
    public final Paint mattePaint;
    public boolean outlineMasksAndMattes;

    @Nullable
    public Paint outlineMasksAndMattesPaint;

    @Nullable
    public BaseLayer parentLayer;
    public List<BaseLayer> parentLayers;
    public final RectF rect;
    public final RectF tempMaskBoundsRect;
    public final TransformKeyframeAnimation transform;
    public boolean visible;
    public final Path path = new Path();
    public final Matrix matrix = new Matrix();
    public final Matrix canvasMatrix = new Matrix();
    public final Paint contentPaint = new LPaint(1);

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i);

    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    @Nullable
    public static BaseLayer forModel(CompositionLayer compositionLayer, Layer layer, LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
        switch (C34681.$SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[layer.getLayerType().ordinal()]) {
            case 1:
                return new ShapeLayer(lottieDrawable, layer, compositionLayer, lottieComposition);
            case 2:
                return new CompositionLayer(lottieDrawable, layer, lottieComposition.getPrecomps(layer.getRefId()), lottieComposition);
            case 3:
                return new SolidLayer(lottieDrawable, layer);
            case 4:
                return new ImageLayer(lottieDrawable, layer);
            case 5:
                return new NullLayer(lottieDrawable, layer);
            case 6:
                return new TextLayer(lottieDrawable, layer);
            default:
                Logger.warning("Unknown layer type " + layer.getLayerType());
                return null;
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.dstInPaint = new LPaint(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.dstOutPaint = new LPaint(1, mode2);
        LPaint lPaint = new LPaint(1);
        this.mattePaint = lPaint;
        this.clearPaint = new LPaint(PorterDuff.Mode.CLEAR);
        this.rect = new RectF();
        this.canvasBounds = new RectF();
        this.maskBoundsRect = new RectF();
        this.matteBoundsRect = new RectF();
        this.tempMaskBoundsRect = new RectF();
        this.boundsMatrix = new Matrix();
        this.animations = new ArrayList();
        this.visible = true;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layerModel = layer;
        this.drawTraceName = layer.getName() + "#draw";
        if (layer.getMatteType() == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = layer.getTransform().createAnimation();
        this.transform = transformKeyframeAnimationCreateAnimation;
        transformKeyframeAnimationCreateAnimation.addListener(this);
        if (layer.getMasks() != null && !layer.getMasks().isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.getMasks());
            this.mask = maskKeyframeAnimation;
            Iterator<BaseKeyframeAnimation<ShapeData, Path>> it = maskKeyframeAnimation.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation : this.mask.getOpacityAnimations()) {
                addAnimation(baseKeyframeAnimation);
                baseKeyframeAnimation.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.outlineMasksAndMattesPaint == null) {
            this.outlineMasksAndMattesPaint = new LPaint();
        }
        this.outlineMasksAndMattes = z;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidateSelf();
    }

    public Layer getLayerModel() {
        return this.layerModel;
    }

    public void setMatteLayer(@Nullable BaseLayer baseLayer) {
        this.matteLayer = baseLayer;
    }

    public boolean hasMatteOnThisLayer() {
        return this.matteLayer != null;
    }

    public void setParentLayer(@Nullable BaseLayer baseLayer) {
        this.parentLayer = baseLayer;
    }

    public final void setupInOutAnimations() {
        if (!this.layerModel.getInOutKeyframes().isEmpty()) {
            FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.layerModel.getInOutKeyframes());
            this.inOutAnimation = floatKeyframeAnimation;
            floatKeyframeAnimation.setIsDiscrete();
            this.inOutAnimation.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.model.layer.BaseLayer$$ExternalSyntheticLambda0
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    this.f$0.lambda$setupInOutAnimations$0();
                }
            });
            setVisible(this.inOutAnimation.getValue().floatValue() == 1.0f);
            addAnimation(this.inOutAnimation);
            return;
        }
        setVisible(true);
    }

    public final /* synthetic */ void lambda$setupInOutAnimations$0() {
        setVisible(this.inOutAnimation.getFloatValue() == 1.0f);
    }

    public final void invalidateSelf() {
        this.lottieDrawable.invalidateSelf();
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.animations.add(baseKeyframeAnimation);
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animations.remove(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        buildParentLayerListIfNeeded();
        this.boundsMatrix.set(matrix);
        if (z) {
            List<BaseLayer> list = this.parentLayers;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.parentLayer;
                if (baseLayer != null) {
                    this.boundsMatrix.preConcat(baseLayer.transform.getMatrix());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.getMatrix());
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer value;
        C3424L.beginSection(this.drawTraceName);
        if (!this.visible || this.layerModel.isHidden()) {
            C3424L.endSection(this.drawTraceName);
            return;
        }
        buildParentLayerListIfNeeded();
        C3424L.beginSection("Layer#parentMatrix");
        this.matrix.reset();
        this.matrix.set(matrix);
        for (int size = this.parentLayers.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
        }
        C3424L.endSection("Layer#parentMatrix");
        BaseKeyframeAnimation<?, Integer> opacity = this.transform.getOpacity();
        int iIntValue = (int) ((((i / 255.0f) * ((opacity == null || (value = opacity.getValue()) == null) ? 100 : value.intValue())) / 100.0f) * 255.0f);
        if (!hasMatteOnThisLayer() && !hasMasksOnThisLayer()) {
            this.matrix.preConcat(this.transform.getMatrix());
            C3424L.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.matrix, iIntValue);
            C3424L.endSection("Layer#drawLayer");
            recordRenderTime(C3424L.endSection(this.drawTraceName));
            return;
        }
        C3424L.beginSection("Layer#computeBounds");
        getBounds(this.rect, this.matrix, false);
        intersectBoundsWithMatte(this.rect, matrix);
        this.matrix.preConcat(this.transform.getMatrix());
        intersectBoundsWithMask(this.rect, this.matrix);
        this.canvasBounds.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.canvasMatrix);
        if (!this.canvasMatrix.isIdentity()) {
            Matrix matrix2 = this.canvasMatrix;
            matrix2.invert(matrix2);
            this.canvasMatrix.mapRect(this.canvasBounds);
        }
        if (!this.rect.intersect(this.canvasBounds)) {
            this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C3424L.endSection("Layer#computeBounds");
        if (this.rect.width() >= 1.0f && this.rect.height() >= 1.0f) {
            C3424L.beginSection("Layer#saveLayer");
            this.contentPaint.setAlpha(255);
            Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
            C3424L.endSection("Layer#saveLayer");
            clearCanvas(canvas);
            C3424L.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.matrix, iIntValue);
            C3424L.endSection("Layer#drawLayer");
            if (hasMasksOnThisLayer()) {
                applyMasks(canvas, this.matrix);
            }
            if (hasMatteOnThisLayer()) {
                C3424L.beginSection("Layer#drawMatte");
                C3424L.beginSection("Layer#saveLayer");
                Utils.saveLayerCompat(canvas, this.rect, this.mattePaint, 19);
                C3424L.endSection("Layer#saveLayer");
                clearCanvas(canvas);
                this.matteLayer.draw(canvas, matrix, iIntValue);
                C3424L.beginSection("Layer#restoreLayer");
                canvas.restore();
                C3424L.endSection("Layer#restoreLayer");
                C3424L.endSection("Layer#drawMatte");
            }
            C3424L.beginSection("Layer#restoreLayer");
            canvas.restore();
            C3424L.endSection("Layer#restoreLayer");
        }
        if (this.outlineMasksAndMattes && (paint = this.outlineMasksAndMattesPaint) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.outlineMasksAndMattesPaint.setColor(-251901);
            this.outlineMasksAndMattesPaint.setStrokeWidth(4.0f);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
            this.outlineMasksAndMattesPaint.setStyle(Paint.Style.FILL);
            this.outlineMasksAndMattesPaint.setColor(1357638635);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
        }
        recordRenderTime(C3424L.endSection(this.drawTraceName));
    }

    public final void recordRenderTime(float f) {
        this.lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(this.layerModel.getName(), f);
    }

    public final void clearCanvas(Canvas canvas) {
        C3424L.beginSection("Layer#clearLayer");
        RectF rectF = this.rect;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.clearPaint);
        C3424L.endSection("Layer#clearLayer");
    }

    public final void intersectBoundsWithMask(RectF rectF, Matrix matrix) {
        this.maskBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (hasMasksOnThisLayer()) {
            int size = this.mask.getMasks().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.mask.getMasks().get(i);
                Path value = this.mask.getMaskAnimations().get(i).getValue();
                if (value != null) {
                    this.path.set(value);
                    this.path.transform(matrix);
                    int i2 = C34681.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask.getMaskMode().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.isInverted()) {
                        return;
                    }
                    this.path.computeBounds(this.tempMaskBoundsRect, false);
                    if (i == 0) {
                        this.maskBoundsRect.set(this.tempMaskBoundsRect);
                    } else {
                        RectF rectF2 = this.maskBoundsRect;
                        rectF2.set(Math.min(rectF2.left, this.tempMaskBoundsRect.left), Math.min(this.maskBoundsRect.top, this.tempMaskBoundsRect.top), Math.max(this.maskBoundsRect.right, this.tempMaskBoundsRect.right), Math.max(this.maskBoundsRect.bottom, this.tempMaskBoundsRect.bottom));
                    }
                }
            }
            if (rectF.intersect(this.maskBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C34681 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode;
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final void intersectBoundsWithMatte(RectF rectF, Matrix matrix) {
        if (hasMatteOnThisLayer() && this.layerModel.getMatteType() != Layer.MatteType.INVERT) {
            this.matteBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.matteLayer.getBounds(this.matteBoundsRect, matrix, true);
            if (rectF.intersect(this.matteBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void applyMasks(Canvas canvas, Matrix matrix) {
        C3424L.beginSection("Layer#saveLayer");
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint, 19);
        if (Build.VERSION.SDK_INT < 28) {
            clearCanvas(canvas);
        }
        C3424L.endSection("Layer#saveLayer");
        for (int i = 0; i < this.mask.getMasks().size(); i++) {
            Mask mask = this.mask.getMasks().get(i);
            BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation = this.mask.getMaskAnimations().get(i);
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.mask.getOpacityAnimations().get(i);
            int i2 = C34681.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask.getMaskMode().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.contentPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.contentPaint.setAlpha(255);
                        canvas.drawRect(this.rect, this.contentPaint);
                    }
                    if (mask.isInverted()) {
                        applyInvertedSubtractMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                    } else {
                        applySubtractMask(canvas, matrix, baseKeyframeAnimation);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.isInverted()) {
                            applyInvertedAddMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                        } else {
                            applyAddMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                        }
                    }
                } else if (mask.isInverted()) {
                    applyInvertedIntersectMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applyIntersectMask(canvas, matrix, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (areAllMasksNone()) {
                this.contentPaint.setAlpha(255);
                canvas.drawRect(this.rect, this.contentPaint);
            }
        }
        C3424L.beginSection("Layer#restoreLayer");
        canvas.restore();
        C3424L.endSection("Layer#restoreLayer");
    }

    public final boolean areAllMasksNone() {
        if (this.mask.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.mask.getMasks().size(); i++) {
            if (this.mask.getMasks().get(i).getMaskMode() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void applyAddMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
    }

    public final void applyInvertedAddMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    public final void applySubtractMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
    }

    public final void applyInvertedSubtractMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstOutPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    public final void applyIntersectMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
        canvas.restore();
    }

    public final void applyInvertedIntersectMask(Canvas canvas, Matrix matrix, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    public boolean hasMasksOnThisLayer() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.mask;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.getMaskAnimations().isEmpty()) ? false : true;
    }

    public final void setVisible(boolean z) {
        if (z != this.visible) {
            this.visible = z;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        C3424L.beginSection("BaseLayer#setProgress");
        C3424L.beginSection("BaseLayer#setProgress.transform");
        this.transform.setProgress(f);
        C3424L.endSection("BaseLayer#setProgress.transform");
        if (this.mask != null) {
            C3424L.beginSection("BaseLayer#setProgress.mask");
            for (int i = 0; i < this.mask.getMaskAnimations().size(); i++) {
                this.mask.getMaskAnimations().get(i).setProgress(f);
            }
            C3424L.endSection("BaseLayer#setProgress.mask");
        }
        if (this.inOutAnimation != null) {
            C3424L.beginSection("BaseLayer#setProgress.inout");
            this.inOutAnimation.setProgress(f);
            C3424L.endSection("BaseLayer#setProgress.inout");
        }
        if (this.matteLayer != null) {
            C3424L.beginSection("BaseLayer#setProgress.matte");
            this.matteLayer.setProgress(f);
            C3424L.endSection("BaseLayer#setProgress.matte");
        }
        C3424L.beginSection("BaseLayer#setProgress.animations." + this.animations.size());
        for (int i2 = 0; i2 < this.animations.size(); i2++) {
            this.animations.get(i2).setProgress(f);
        }
        C3424L.endSection("BaseLayer#setProgress.animations." + this.animations.size());
        C3424L.endSection("BaseLayer#setProgress");
    }

    public final void buildParentLayerListIfNeeded() {
        if (this.parentLayers != null) {
            return;
        }
        if (this.parentLayer == null) {
            this.parentLayers = Collections.emptyList();
            return;
        }
        this.parentLayers = new ArrayList();
        for (BaseLayer baseLayer = this.parentLayer; baseLayer != null; baseLayer = baseLayer.parentLayer) {
            this.parentLayers.add(baseLayer);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.layerModel.getName();
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.layerModel.getBlurEffect();
    }

    public LBlendMode getBlendMode() {
        return this.layerModel.getBlendMode();
    }

    public BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.blurMaskFilterRadius == f) {
            return this.blurMaskFilter;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.blurMaskFilter = blurMaskFilter;
        this.blurMaskFilterRadius = f;
        return blurMaskFilter;
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.layerModel.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        BaseLayer baseLayer = this.matteLayer;
        if (baseLayer != null) {
            KeyPath keyPathAddKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.matteLayer.getName(), i)) {
                list.add(keyPathAddKey.resolve(this.matteLayer));
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                this.matteLayer.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.matteLayer.getName(), i) + i, list, keyPathAddKey);
            }
        }
        if (keyPath.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                resolveChildKeyPath(keyPath, i + keyPath.incrementDepthBy(getName(), i), list, keyPath2);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.transform.applyValueCallback(t, lottieValueCallback);
    }
}
