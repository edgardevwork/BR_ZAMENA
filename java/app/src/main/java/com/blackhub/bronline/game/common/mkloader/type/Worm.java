package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Circle;

/* loaded from: classes3.dex */
public class Worm extends LoaderView {
    public Circle[] circles;
    public float radius;
    public final int circlesSize = 5;
    public final int[] transformations = {-2, -1, 0, 1, 2};

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        this.circles = new Circle[this.circlesSize];
        int i = this.width;
        this.radius = (i / 10.0f) - (i / 100.0f);
        for (int i2 = 0; i2 < this.circlesSize; i2++) {
            this.circles[i2] = new Circle();
            this.circles[i2].setColor(this.color);
            this.circles[i2].setRadius(this.radius);
            Circle circle = this.circles[i2];
            PointF pointF = this.center;
            circle.setCenter(pointF.x, pointF.y);
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.circlesSize; i++) {
            float f = this.center.y;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, this.height / 4.0f, (r5 * 3) / 4.0f, f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setStartDelay(i * 120);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Worm$$ExternalSyntheticLambda0
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
        this.circles[i].setCenter(this.center.x, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.circlesSize; i++) {
            canvas.save();
            canvas.translate(this.radius * 2.0f * this.transformations[i], 0.0f);
            this.circles[i].draw(canvas);
            canvas.restore();
        }
    }
}
