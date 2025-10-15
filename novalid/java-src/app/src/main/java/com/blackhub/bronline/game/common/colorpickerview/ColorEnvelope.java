package com.blackhub.bronline.game.common.colorpickerview;

import androidx.annotation.ColorInt;

/* loaded from: classes.dex */
public class ColorEnvelope {
    public final int[] argb;

    @ColorInt
    public int color;
    public final String hexCode;

    public ColorEnvelope(@ColorInt int color) {
        this.color = color;
        this.hexCode = ColorUtils.getHexCode(color);
        this.argb = ColorUtils.getColorARGB(color);
    }

    @ColorInt
    public int getColor() {
        return this.color;
    }

    public String getHexCode() {
        return this.hexCode;
    }

    public int[] getArgb() {
        return this.argb;
    }
}
