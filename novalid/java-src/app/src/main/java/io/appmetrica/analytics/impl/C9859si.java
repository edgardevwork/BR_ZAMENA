package io.appmetrica.analytics.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.si */
/* loaded from: classes7.dex */
public final class C9859si {
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:9:0x0011, B:11:0x001f), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:9:0x0011, B:11:0x001f), top: B:33:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScreenInfo m6801a(Context context) {
        Point point;
        int i;
        float f;
        Display display;
        if (AndroidUtils.isApiAchieved(30)) {
            try {
                display = context.getDisplay();
            } catch (Throwable unused) {
            }
            if (display == null) {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            point = display == null ? (Point) SystemServiceUtils.accessSystemServiceSafely(display, "getting display metrics", "Display", new C9834ri()) : null;
        } else {
            display = null;
            if (display == null) {
            }
            if (display == null) {
            }
        }
        if (point == null) {
            return null;
        }
        int iMax = Math.max(point.x, point.y);
        int iMin = Math.min(point.x, point.y);
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i = displayMetrics.densityDpi;
            try {
                f = displayMetrics.density;
            } catch (Throwable unused2) {
                f = 0.0f;
                return new ScreenInfo(iMax, iMin, i, f);
            }
        } catch (Throwable unused3) {
            i = 0;
        }
        return new ScreenInfo(iMax, iMin, i, f);
    }
}
