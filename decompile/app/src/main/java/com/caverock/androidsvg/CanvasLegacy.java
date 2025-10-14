package com.caverock.androidsvg;

import android.graphics.Canvas;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class CanvasLegacy {
    public static final int MATRIX_SAVE_FLAG;
    public static final Method SAVE;

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            SAVE = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    public static void save(Canvas canvas, int i) {
        try {
            SAVE.invoke(canvas, Integer.valueOf(i));
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    public static RuntimeException sneakyThrow(Throwable th) {
        if (th == null) {
            throw new NullPointerException("t");
        }
        return (RuntimeException) sneakyThrow0(th);
    }

    public static <T extends Throwable> T sneakyThrow0(Throwable th) throws Throwable {
        throw th;
    }
}
