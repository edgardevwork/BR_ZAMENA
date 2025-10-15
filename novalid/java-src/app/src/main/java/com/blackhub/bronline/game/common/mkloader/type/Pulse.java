package com.blackhub.bronline.game.common.mkloader.type;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;
import com.blackhub.bronline.game.common.mkloader.exception.InvalidNumberOfPulseException;
import com.blackhub.bronline.game.common.mkloader.model.Line;

/* loaded from: classes3.dex */
public class Pulse extends LoaderView {
    public float lineDistance;
    public float lineWidth;
    public final Line[] lines;
    public final int numberOfLines;
    public final float[] scaleY;

    public Pulse(int numberOfLines) throws InvalidNumberOfPulseException {
        if (numberOfLines < 3 || numberOfLines > 5) {
            throw new InvalidNumberOfPulseException();
        }
        this.numberOfLines = numberOfLines;
        this.lines = new Line[numberOfLines];
        this.scaleY = new float[numberOfLines];
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void initializeObjects() {
        int i = this.width;
        int i2 = this.numberOfLines;
        float f = i / (i2 * 2);
        this.lineWidth = f;
        float f2 = f / 4.0f;
        this.lineDistance = f2;
        float f3 = ((i - ((i2 * f) + (f2 * (i2 - 1)))) / 2.0f) + (f / 2.0f);
        for (int i3 = 0; i3 < this.numberOfLines; i3++) {
            this.lines[i3] = new Line();
            this.lines[i3].setColor(this.color);
            this.lines[i3].setWidth(this.lineWidth);
            this.lines[i3].setPoint1(new PointF(f3, this.center.y - (this.height / 4.0f)));
            this.lines[i3].setPoint2(new PointF(f3, this.center.y + (this.height / 4.0f)));
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void setUpAnimation() {
        for (final int i = 0; i < this.numberOfLines; i++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.5f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setStartDelay(i * 120);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.common.mkloader.type.Pulse$$ExternalSyntheticLambda0
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
        this.scaleY[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InvalidateListener invalidateListener = this.invalidateListener;
        if (invalidateListener != null) {
            invalidateListener.reDraw();
        }
    }

    @Override // com.blackhub.bronline.game.common.mkloader.type.LoaderView
    public void draw(Canvas canvas) {
        for (int i = 0; i < this.numberOfLines; i++) {
            canvas.save();
            canvas.translate(i * (this.lineWidth + this.lineDistance), 0.0f);
            canvas.scale(1.0f, this.scaleY[i], this.lines[i].getPoint1().x, this.center.y);
            this.lines[i].draw(canvas);
            canvas.restore();
        }
    }
}
