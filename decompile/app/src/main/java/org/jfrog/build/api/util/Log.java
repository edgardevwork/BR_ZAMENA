package org.jfrog.build.api.util;

import java.io.Serializable;

/* loaded from: classes5.dex */
public interface Log extends Serializable, org.jfrog.filespecs.utils.Log {
    @Override // org.jfrog.filespecs.utils.Log
    void debug(String str);

    @Override // org.jfrog.filespecs.utils.Log
    void error(String str);

    @Override // org.jfrog.filespecs.utils.Log
    void error(String str, Throwable th);

    @Override // org.jfrog.filespecs.utils.Log
    void info(String str);

    @Override // org.jfrog.filespecs.utils.Log
    void warn(String str);
}
