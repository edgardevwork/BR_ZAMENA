package com.blackhub.bronline.game.common.colorpickerview;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import java.util.Locale;

/* loaded from: classes.dex */
public class ColorUtils {
    public static String getHexCode(@ColorInt int color) {
        return String.format(Locale.getDefault(), "%02X%02X%02X%02X", Integer.valueOf(Color.alpha(color)), Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color)));
    }

    public static int[] getColorARGB(@ColorInt int color) {
        return new int[]{Color.alpha(color), Color.red(color), Color.green(color), Color.blue(color)};
    }
}
