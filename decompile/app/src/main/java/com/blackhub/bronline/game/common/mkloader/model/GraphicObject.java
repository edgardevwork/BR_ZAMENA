package com.blackhub.bronline.game.common.mkloader.model;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class GraphicObject {
    public Paint paint;

    public abstract void draw(Canvas canvas);

    public GraphicObject() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
    }

    public void setColor(int color) {
        this.paint.setColor(color);
    }

    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    public void setWidth(float width) {
        this.paint.setStrokeWidth(width);
    }

    public void setStyle(Paint.Style style) {
        this.paint.setStyle(style);
    }
}
