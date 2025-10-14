package com.blackhub.bronline.game.common.colorpickerview.sliders;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AlphaTileDrawable extends Drawable {
    public final Paint paint = new Paint(1);
    public final int tileEvenColor;
    public final int tileOddColor;
    public final int tileSize;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return PixelFormat.UNKNOWN;
    }

    public AlphaTileDrawable() {
        Builder builder = new Builder();
        this.tileSize = builder.tileSize;
        this.tileOddColor = builder.tileOddColor;
        this.tileEvenColor = builder.tileEvenColor;
        drawTiles();
    }

    public AlphaTileDrawable(Builder builder) {
        this.tileSize = builder.tileSize;
        this.tileOddColor = builder.tileOddColor;
        this.tileEvenColor = builder.tileEvenColor;
        drawTiles();
    }

    public final void drawTiles() {
        int i = this.tileSize;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i * 2, i * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i2 = this.tileSize;
        Rect rect = new Rect(0, 0, i2, i2);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.tileOddColor);
        drawTile(canvas, rect, paint, 0, 0);
        int i3 = this.tileSize;
        drawTile(canvas, rect, paint, i3, i3);
        paint.setColor(this.tileEvenColor);
        drawTile(canvas, rect, paint, -this.tileSize, 0);
        int i4 = this.tileSize;
        drawTile(canvas, rect, paint, i4, -i4);
        Paint paint2 = this.paint;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
    }

    public final void drawTile(Canvas canvas, Rect rect, Paint bitmapPaint, int dx, int dy) {
        rect.offset(dx, dy);
        canvas.drawRect(rect, bitmapPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.drawPaint(this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public static class Builder {
        public int tileSize = 25;
        public int tileOddColor = -1;
        public int tileEvenColor = -3421237;

        public int getTileSize() {
            return this.tileSize;
        }

        public Builder setTileSize(int tileSize) {
            this.tileSize = tileSize;
            return this;
        }

        @ColorInt
        public int getTileOddColor() {
            return this.tileOddColor;
        }

        public Builder setTileOddColor(@ColorInt int color) {
            this.tileOddColor = color;
            return this;
        }

        @ColorInt
        public int getTileEvenColor() {
            return this.tileEvenColor;
        }

        public Builder setTileEvenColor(@ColorInt int color) {
            this.tileEvenColor = color;
            return this;
        }

        public AlphaTileDrawable build() {
            return new AlphaTileDrawable(this);
        }
    }
}
