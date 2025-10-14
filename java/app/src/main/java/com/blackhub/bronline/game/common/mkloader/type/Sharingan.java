package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.model.Circle;

/* loaded from: classes3.dex */
public class Sharingan extends LoaderView {
    public Circle eye;
    public Circle eyeBound;
    public final int numberOfSharingan = 3;
    public float rotate;
    public float scale;
    public Circle[] sharingans;

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        float fMin = Math.min(this.width, this.height) / 2.0f;
        float f = fMin / 1.5f;
        Circle circle = new Circle();
        this.eye = circle;
        PointF pointF = this.center;
        circle.setCenter(pointF.x, pointF.y);
        this.eye.setColor(this.color);
        this.eye.setRadius(fMin / 4.0f);
        Circle circle2 = new Circle();
        this.eyeBound = circle2;
        PointF pointF2 = this.center;
        circle2.setCenter(pointF2.x, pointF2.y);
        this.eyeBound.setColor(this.color);
        this.eyeBound.setRadius(f);
        this.eyeBound.setStyle(Paint.Style.STROKE);
        this.eyeBound.setWidth(fMin / 20.0f);
        this.sharingans = new Circle[this.numberOfSharingan];
        for (int i = 0; i < this.numberOfSharingan; i++) {
            this.sharingans[i] = new Circle();
            Circle circle3 = this.sharingans[i];
            PointF pointF3 = this.center;
            circle3.setCenter(pointF3.x, pointF3.y - f);
            this.sharingans[i].setColor(this.color);
            this.sharingans[i].setRadius(fMin / 6.0f);
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Sharingan$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$setUpAnimation$0(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(1000L);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Sharingan$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$setUpAnimation$1(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpAnimation$0(ValueAnimator valueAnimator) {
        this.rotate = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    public final /* synthetic */ void lambda$setUpAnimation$1(ValueAnimator valueAnimator) {
        this.scale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        canvas.save();
        float f = this.scale;
        PointF pointF = this.center;
        canvas.scale(f, f, pointF.x, pointF.y);
        float f2 = this.rotate;
        PointF pointF2 = this.center;
        canvas.rotate(f2, pointF2.x, pointF2.y);
        this.eye.draw(canvas);
        this.eyeBound.draw(canvas);
        for (int i = 0; i < this.numberOfSharingan; i++) {
            canvas.save();
            PointF pointF3 = this.center;
            canvas.rotate(i * 120, pointF3.x, pointF3.y);
            this.sharingans[i].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }
}
