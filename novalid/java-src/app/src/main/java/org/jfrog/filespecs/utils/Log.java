package org.jfrog.filespecs.utils;

import java.io.Serializable;

/* loaded from: classes5.dex */
public interface Log extends Serializable {
    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    void info(String str);

    void warn(String str);
}
