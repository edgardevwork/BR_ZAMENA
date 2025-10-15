package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Arc;

/* loaded from: classes3.dex */
public class PhoneWave extends LoaderView {
    public Arc[] arcs;
    public final int numberOfArc = 3;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float fMin = Math.min(this.width, this.height) / 2.0f;
        this.arcs = new Arc[this.numberOfArc];
        for (int i = 0; i < this.numberOfArc; i++) {
            float f = (fMin / 4.0f) + ((i * fMin) / 4.0f);
            this.arcs[i] = new Arc();
            this.arcs[i].setColor(this.color);
            this.arcs[i].setAlpha(126);
            Arc arc = this.arcs[i];
            PointF pointF = this.center;
            float f2 = pointF.x;
            float f3 = pointF.y;
            float f4 = fMin / 3.0f;
            arc.setOval(new RectF(f2 - f, (f3 - f) + f4, f2 + f, f3 + f + f4));
            this.arcs[i].setStartAngle(225.0f);
            this.arcs[i].setSweepAngle(90.0f);
            this.arcs[i].setStyle(Paint.Style.STROKE);
            this.arcs[i].setWidth(fMin / 10.0f);
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.numberOfArc; i++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(126, 255, 126);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setStartDelay(i * 120);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.PhoneWave$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpAnimation$0(int i, ValueAnimator valueAnimator) {
        this.arcs[i].setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.numberOfArc; i++) {
            this.arcs[i].draw(canvas);
        }
    }
}
