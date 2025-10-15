package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.blackhub.bronline.launcher.LauncherConstants;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Zd */
/* loaded from: classes6.dex */
public abstract class AbstractC9380Zd {

    /* renamed from: a */
    public static final SafePackageManager f7639a = new SafePackageManager();

    /* renamed from: b */
    public static final C9260Ud f7640b = new C9260Ud();

    /* renamed from: c */
    public static final C9284Vd f7641c = new C9284Vd();

    /* renamed from: d */
    public static final C9308Wd f7642d = new C9308Wd(2);

    /* renamed from: a */
    public static String m5810a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append(LauncherConstants.UNDERSCORE_CHAR);
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static EnumC9356Yd m5809a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        EnumC9356Yd enumC9356Yd = EnumC9356Yd.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return EnumC9356Yd.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return enumC9356Yd;
        }
        for (Integer num : f7641c.f8894a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (EnumC9356Yd) f7641c.m6635a(num);
            }
        }
        return enumC9356Yd;
    }
}
