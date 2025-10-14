package com.blackhub.bronline.game.common.mkloader.model;

import android.graphics.Canvas;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class Circle extends GraphicObject {
    public final PointF center = new PointF();
    public float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCenter(float x, float y) {
        this.center.set(x, y);
    }

    @Override // com.blackhub.bronline.game.common.mkloader.model.GraphicObject
    public void draw(Canvas canvas) {
        PointF pointF = this.center;
        canvas.drawCircle(pointF.x, pointF.y, this.radius, this.paint);
    }
}
