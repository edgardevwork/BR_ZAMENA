package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.blackhub.bronline.launcher.LauncherConstants;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.xi */
/* loaded from: classes8.dex */
public abstract class AbstractC9984xi {
    /* renamed from: a */
    public static void m6965a(String str, Object... objArr) {
        ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format(str, objArr), new Object[0]);
    }

    /* renamed from: a */
    public static String m6964a() {
        StringBuilder sb = new StringBuilder("public");
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append(LauncherConstants.UNDERSCORE_STRING);
        }
        return sb.toString();
    }
}
