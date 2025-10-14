package org.apache.ivy.util;

import java.util.List;

/* loaded from: classes8.dex */
public interface MessageLogger {
    void clearProblems();

    void debug(String str);

    void deprecated(String str);

    void endProgress();

    void endProgress(String str);

    void error(String str);

    List<String> getErrors();

    List<String> getProblems();

    List<String> getWarns();

    void info(String str);

    boolean isShowProgress();

    void log(String str, int i);

    void progress();

    void rawinfo(String str);

    void rawlog(String str, int i);

    void setShowProgress(boolean z);

    void sumupProblems();

    void verbose(String str);

    void warn(String str);
}
