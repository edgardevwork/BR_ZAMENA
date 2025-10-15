package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class Logger {
    public static final int MAX_PREFIXED_TAG_LENGTH = 20;
    public static final int MAX_TAG_LENGTH = 23;
    public static final String TAG_PREFIX = "WM-";
    public static final Object sLock = new Object();
    public static volatile Logger sLogger;

    public abstract void debug(@NonNull String tag, @NonNull String message);

    public abstract void debug(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void error(@NonNull String tag, @NonNull String message);

    public abstract void error(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void info(@NonNull String tag, @NonNull String message);

    public abstract void info(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void verbose(@NonNull String tag, @NonNull String message);

    public abstract void verbose(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public abstract void warning(@NonNull String tag, @NonNull String message);

    public abstract void warning(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable);

    public static void setLogger(@NonNull Logger logger) {
        synchronized (sLock) {
            sLogger = logger;
        }
    }

    @NonNull
    public static String tagWithPrefix(@NonNull String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(TAG_PREFIX);
        int i = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i) {
            sb.append(tag.substring(0, i));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }

    @NonNull
    public static Logger get() {
        Logger logger;
        synchronized (sLock) {
            try {
                if (sLogger == null) {
                    sLogger = new LogcatLogger(3);
                }
                logger = sLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
        return logger;
    }

    public Logger(int loggingLevel) {
    }

    /* loaded from: classes3.dex */
    public static class LogcatLogger extends Logger {
        public final int mLoggingLevel;

        public LogcatLogger(int loggingLevel) {
            super(loggingLevel);
            this.mLoggingLevel = loggingLevel;
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String tag, @NonNull String message) {
            if (this.mLoggingLevel <= 2) {
                Log.v(tag, message);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
            if (this.mLoggingLevel <= 2) {
                Log.v(tag, message, throwable);
            }
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String tag, @NonNull String message) {
            if (this.mLoggingLevel <= 3) {
                Log.d(tag, message);
            }
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
            if (this.mLoggingLevel <= 3) {
                Log.d(tag, message, throwable);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String tag, @NonNull String message) {
            if (this.mLoggingLevel <= 4) {
                Log.i(tag, message);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
            if (this.mLoggingLevel <= 4) {
                Log.i(tag, message, throwable);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String tag, @NonNull String message) {
            if (this.mLoggingLevel <= 5) {
                Log.w(tag, message);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
            if (this.mLoggingLevel <= 5) {
                Log.w(tag, message, throwable);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String tag, @NonNull String message) {
            if (this.mLoggingLevel <= 6) {
                Log.e(tag, message);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String tag, @NonNull String message, @NonNull Throwable throwable) {
            if (this.mLoggingLevel <= 6) {
                Log.e(tag, message, throwable);
            }
        }
    }
}
