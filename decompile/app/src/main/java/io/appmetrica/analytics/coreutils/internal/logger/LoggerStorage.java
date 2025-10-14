package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class LoggerStorage {

    /* renamed from: a */
    private static HashMap f6183a = new HashMap();

    /* renamed from: b */
    private static final Object f6184b = new Object();

    /* renamed from: c */
    private static volatile PublicLogger f6185c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f6185c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f6185c = getOrCreatePublicLogger(str);
        return f6185c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f6183a.get(str);
        if (publicLogger == null) {
            synchronized (f6184b) {
                try {
                    publicLogger = (PublicLogger) f6183a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        f6183a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    @VisibleForTesting(otherwise = 5)
    public static void unsetPublicLoggers() {
        f6183a = new HashMap();
        f6185c = PublicLogger.getAnonymousInstance();
    }
}
