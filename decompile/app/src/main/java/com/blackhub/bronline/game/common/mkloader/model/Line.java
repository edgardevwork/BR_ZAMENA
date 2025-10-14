package com.blackhub.bronline.game.common.mkloader.model;

import android.graphics.Canvas;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class Line extends GraphicObject {
    public PointF point1;
    public PointF point2;

    public void setPoint1(PointF point1) {
        this.point1 = point1;
    }

    public void setPoint2(PointF point2) {
        this.point2 = point2;
    }

    public PointF getPoint1() {
        return this.point1;
    }

    public PointF getPoint2() {
        return this.point2;
    }

    @Override // com.blackhub.bronline.game.common.mkloader.model.GraphicObject
    public void draw(Canvas canvas) {
        PointF pointF = this.point1;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.point2;
        canvas.drawLine(f, f2, pointF2.x, pointF2.y, this.paint);
    }
}
