package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import kotlinx.serialization.json.JsonKt;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.dataflow.qual.Pure;

@UnstableApi
/* loaded from: classes2.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;

    @GuardedBy("lock")
    public static int logLevel = 0;

    @GuardedBy("lock")
    public static boolean logStackTraces = true;
    public static final Object lock = new Object();

    @GuardedBy("lock")
    public static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: d */
            public void mo637d(String str, String str2, @Nullable Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: i */
            public void mo639i(String str, String str2, @Nullable Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: w */
            public void mo640w(String str, String str2, @Nullable Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: e */
            public void mo638e(String str, String str2, @Nullable Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }
        };

        /* renamed from: d */
        void mo637d(String str, String str2, @Nullable Throwable th);

        /* renamed from: e */
        void mo638e(String str, String str2, @Nullable Throwable th);

        /* renamed from: i */
        void mo639i(String str, String str2, @Nullable Throwable th);

        /* renamed from: w */
        void mo640w(String str, String str2, @Nullable Throwable th);

        /* renamed from: androidx.media3.common.util.Log$Logger$1 */
        public class C27501 implements Logger {
            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: d */
            public void mo637d(String str, String str2, @Nullable Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: i */
            public void mo639i(String str, String str2, @Nullable Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: w */
            public void mo640w(String str, String str2, @Nullable Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: e */
            public void mo638e(String str, String str2, @Nullable Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }
        }
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @Pure
    /* renamed from: d */
    public static void m629d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.mo637d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* renamed from: d */
    public static void m630d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.mo637d(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    /* renamed from: i */
    public static void m633i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.mo639i(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* renamed from: i */
    public static void m634i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.mo639i(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    /* renamed from: w */
    public static void m635w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.mo640w(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* renamed from: w */
    public static void m636w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.mo640w(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    /* renamed from: e */
    public static void m631e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.mo638e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    /* renamed from: e */
    public static void m632e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.mo638e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    @Pure
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            try {
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (!logStackTraces) {
                    return th.getMessage();
                }
                return android.util.Log.getStackTraceString(th).trim().replace("\t", JsonKt.defaultIndent);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace(StringUtils.f9903LF, "\n  ") + '\n';
    }

    @Pure
    public static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
