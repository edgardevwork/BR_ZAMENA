package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/system/SystemPropertiesHelper;", "", "", "name", "readSystemProperty", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class SystemPropertiesHelper {

    @NotNull
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @JvmStatic
    @SuppressLint({"PrivateApi"})
    @NotNull
    public static final String readSystemProperty(@NotNull String name) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, name);
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }
}
