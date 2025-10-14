package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Circle;

/* loaded from: classes3.dex */
public class TwinFishesSpinner extends LoaderView {
    public Circle[] circles;
    public final int numberOfCircle = 10;
    public final float[] rotates = new float[10];

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        int i;
        float fMin = Math.min(this.width, this.height);
        float f = fMin / 10.0f;
        this.circles = new Circle[this.numberOfCircle];
        int i2 = 0;
        while (true) {
            i = this.numberOfCircle;
            if (i2 >= i / 2) {
                break;
            }
            this.circles[i2] = new Circle();
            this.circles[i2].setCenter(this.center.x, f);
            this.circles[i2].setColor(this.color);
            this.circles[i2].setRadius(f - ((i2 * f) / 6.0f));
            i2++;
        }
        for (int i3 = i / 2; i3 < this.numberOfCircle; i3++) {
            this.circles[i3] = new Circle();
            this.circles[i3].setCenter(this.center.x, fMin - f);
            this.circles[i3].setColor(this.color);
            this.circles[i3].setRadius(f - (((i3 - 5) * f) / 6.0f));
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        final int i = 0;
        while (i < this.numberOfCircle) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setDuration(1700L);
            valueAnimatorOfFloat.setStartDelay((i >= 5 ? i - 5 : i) * 100);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.TwinFishesSpinner$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setUpAnimation$0(i, valueAnimator);
                }
            });
            valueAnimatorOfFloat.start();
            i++;
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
        for (int i = 0; i < this.numberOfCircle; i++) {
            canvas.save();
            float f = this.rotates[i];
            PointF pointF = this.center;
            canvas.rotate(f, pointF.x, pointF.y);
            this.circles[i].draw(canvas);
            canvas.restore();
        }
    }
}
