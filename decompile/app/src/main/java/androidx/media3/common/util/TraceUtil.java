package androidx.media3.common.util;

import android.os.Trace;
import androidx.annotation.RequiresApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class TraceUtil {
    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    @RequiresApi(18)
    public static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    @RequiresApi(18)
    public static void endSectionV18() {
        Trace.endSection();
    }
}
