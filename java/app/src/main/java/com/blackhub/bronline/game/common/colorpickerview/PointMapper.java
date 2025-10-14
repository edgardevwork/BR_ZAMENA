package com.blackhub.bronline.game.common.colorpickerview;

import android.graphics.Point;

/* loaded from: classes.dex */
public class PointMapper {
    public static Point getColorPoint(ColorPickerView colorPickerView, Point point) {
        return colorPickerView.isHuePalette() ? getHuePoint(colorPickerView, point) : approximatedPoint(colorPickerView, point, new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2));
    }

    public static Point approximatedPoint(ColorPickerView colorPickerView, Point start, Point end) {
        if (getDistance(start, end) <= 3) {
            return end;
        }
        Point centerPoint = getCenterPoint(start, end);
        if (colorPickerView.getColorFromBitmap(centerPoint.x, centerPoint.y) == 0) {
            return approximatedPoint(colorPickerView, centerPoint, end);
        }
        return approximatedPoint(colorPickerView, start, centerPoint);
    }

    public static Point getHuePoint(ColorPickerView colorPickerView, Point point) {
        float width = colorPickerView.getWidth() * 0.5f;
        float height = colorPickerView.getHeight() * 0.5f;
        float f = point.x - width;
        float f2 = point.y - height;
        float fMin = Math.min(width, height);
        double dSqrt = Math.sqrt((f * f) + (f2 * f2));
        double d = fMin;
        if (dSqrt > d) {
            float f3 = (float) (d / dSqrt);
            f *= f3;
            f2 *= f3;
        }
        return new Point((int) (f + width), (int) (f2 + height));
    }

    public static Point getCenterPoint(Point start, Point end) {
        return new Point((end.x + start.x) / 2, (end.y + start.y) / 2);
    }

    public static int getDistance(Point start, Point end) {
        return (int) Math.sqrt((Math.abs(end.x - start.x) * Math.abs(end.x - start.x)) + (Math.abs(end.y - start.y) * Math.abs(end.y - start.y)));
    }
}
