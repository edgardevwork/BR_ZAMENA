package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Arc;

/* loaded from: classes3.dex */
public class Whirlpool extends LoaderView {
    public Arc[] arcs;
    public final int numberOfArc = 3;
    public float[] rotates;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float fMin = Math.min(this.width, this.height) / 2.0f;
        int i = this.numberOfArc;
        this.arcs = new Arc[i];
        this.rotates = new float[i];
        for (int i2 = 0; i2 < this.numberOfArc; i2++) {
            float f = (fMin / 4.0f) + ((i2 * fMin) / 4.0f);
            this.arcs[i2] = new Arc();
            this.arcs[i2].setColor(this.color);
            Arc arc = this.arcs[i2];
            PointF pointF = this.center;
            float f2 = pointF.x;
            float f3 = pointF.y;
            arc.setOval(new RectF(f2 - f, f3 - f, f2 + f, f3 + f));
            this.arcs[i2].setStartAngle(i2 * 45);
            this.arcs[i2].setSweepAngle(r3 + 90);
            this.arcs[i2].setStyle(Paint.Style.STROKE);
            this.arcs[i2].setWidth(fMin / 10.0f);
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = this.numberOfArc - 1; i >= 0; i--) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.arcs[i].getStartAngle(), this.arcs[i].getStartAngle() + ((i % 2 == 0 ? -1 : 1) * 360));
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setDuration((i + 1) * 500);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Whirlpool$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpAnimation$0(int i, ValueAnimator valueAnimator) {
        this.rotates[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.numberOfArc; i++) {
            canvas.save();
            float f = this.rotates[i];
            PointF pointF = this.center;
            canvas.rotate(f, pointF.x, pointF.y);
            this.arcs[i].draw(canvas);
            canvas.restore();
        }
    }
}
