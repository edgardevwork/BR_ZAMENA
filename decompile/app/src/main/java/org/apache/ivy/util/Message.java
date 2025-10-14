package org.apache.ivy.util;

import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyContext;

/* loaded from: classes8.dex */
public final class Message {
    public static final int MSG_DEBUG = 4;
    public static final int MSG_ERR = 0;
    public static final int MSG_INFO = 2;
    public static final int MSG_VERBOSE = 3;
    public static final int MSG_WARN = 1;
    public static MessageLogger defaultLogger = new DefaultMessageLogger(2);
    public static boolean showedInfo;

    public static MessageLogger getDefaultLogger() {
        return defaultLogger;
    }

    public static void setDefaultLogger(MessageLogger messageLogger) {
        Checks.checkNotNull(messageLogger, "logger");
        defaultLogger = messageLogger;
    }

    public static MessageLogger getLogger() {
        return IvyContext.getContext().getMessageLogger();
    }

    public static void showInfo() {
        if (showedInfo) {
            return;
        }
        info(":: Apache Ivy " + Ivy.getIvyVersion() + " - " + Ivy.getIvyDate() + " :: " + Ivy.getIvyHomeURL() + " ::");
        showedInfo = true;
    }

    public static void debug(String str) {
        getLogger().debug(str);
    }

    public static void verbose(String str) {
        getLogger().verbose(str);
    }

    public static void info(String str) {
        getLogger().info(str);
    }

    public static void rawinfo(String str) {
        getLogger().rawinfo(str);
    }

    public static void deprecated(String str) {
        getLogger().deprecated(str);
    }

    public static void warn(String str) {
        getLogger().warn(str);
    }

    public static void error(String str) {
        getLogger().error(str);
    }

    public static void log(int i, String str) {
        if (i == 0) {
            error(str);
            return;
        }
        if (i == 1) {
            warn(str);
            return;
        }
        if (i == 2) {
            info(str);
            return;
        }
        if (i == 3) {
            verbose(str);
        } else {
            if (i == 4) {
                debug(str);
                return;
            }
            throw new IllegalArgumentException("Unknown log level " + i);
        }
    }

    public static List<String> getProblems() {
        return getLogger().getProblems();
    }

    public static void sumupProblems() {
        getLogger().sumupProblems();
    }

    public static void progress() {
        getLogger().progress();
    }

    public static void endProgress() {
        getLogger().endProgress();
    }

    public static void endProgress(String str) {
        getLogger().endProgress(str);
    }

    public static boolean isShowProgress() {
        return getLogger().isShowProgress();
    }

    public static void setShowProgress(boolean z) {
        getLogger().setShowProgress(z);
    }

    public static void debug(String str, Throwable th) {
        if (th == null) {
            debug(str);
            return;
        }
        debug(str + " (" + th.getClass().getName() + ": " + th.getMessage() + ")");
        debug(th);
    }

    public static void verbose(String str, Throwable th) {
        if (th == null) {
            verbose(str);
            return;
        }
        verbose(str + " (" + th.getClass().getName() + ": " + th.getMessage() + ")");
        debug(th);
    }

    public static void info(String str, Throwable th) {
        if (th == null) {
            info(str);
            return;
        }
        info(str + " (" + th.getClass().getName() + ": " + th.getMessage() + ")");
        debug(th);
    }

    public static void warn(String str, Throwable th) {
        if (th == null) {
            warn(str);
            return;
        }
        warn(str + " (" + th.getClass().getName() + ": " + th.getMessage() + ")");
        debug(th);
    }

    public static void error(String str, Throwable th) {
        if (th == null) {
            error(str);
            return;
        }
        error(str + " (" + th.getClass().getName() + ": " + th.getMessage() + ")");
        debug(th);
    }

    public static void debug(Throwable th) {
        debug(StringUtils.getStackTrace(th));
    }
}
