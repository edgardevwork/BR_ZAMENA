package com.blackhub.bronline.game.common.mkloader.model;

import android.graphics.Canvas;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class Arc extends GraphicObject {
    public RectF oval;
    public float startAngle;
    public float sweepAngle;
    public boolean useCenter;

    public void setOval(RectF oval) {
        this.oval = oval;
    }

    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public void setSweepAngle(float sweepAngle) {
        this.sweepAngle = sweepAngle;
    }

    public void setUseCenter(boolean useCenter) {
        this.useCenter = useCenter;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    @Override // com.blackhub.bronline.game.common.mkloader.model.GraphicObject
    public void draw(Canvas canvas) {
        canvas.drawArc(this.oval, this.startAngle, this.sweepAngle, this.useCenter, this.paint);
    }
}
