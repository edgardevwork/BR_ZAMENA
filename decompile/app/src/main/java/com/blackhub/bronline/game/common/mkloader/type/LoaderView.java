package com.blackhub.bronline.game.common.mkloader.type;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.blackhub.bronline.game.common.mkloader.callback.InvalidateListener;

/* loaded from: classes.dex */
public abstract class LoaderView {
    public PointF center;
    public int color;
    public int height;
    public InvalidateListener invalidateListener;
    public int width;
    public int desiredWidth = 150;
    public int desiredHeight = 150;

    public abstract void draw(Canvas canvas);

    public abstract void initializeObjects();

    public abstract void setUpAnimation();

    public void setColor(int color) {
        this.color = color;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        this.center = new PointF(width / 2.0f, height / 2.0f);
    }

    public void setInvalidateListener(InvalidateListener invalidateListener) {
        this.invalidateListener = invalidateListener;
    }

    public int getDesiredWidth() {
        return this.desiredWidth;
    }

    public int getDesiredHeight() {
        return this.desiredHeight;
    }

    public boolean isDetached() {
        return this.invalidateListener == null;
    }

    public void onDetach() {
        if (this.invalidateListener != null) {
            this.invalidateListener = null;
        }
    }
}
