package org.jfrog.gradle.plugin.artifactory.utils;

import org.gradle.api.logging.LogLevel;
import org.gradle.api.logging.Logger;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class GradleClientLogger implements Log {
    public final Logger logger;

    public GradleClientLogger(Logger logger) {
        this.logger = logger;
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void debug(String str) {
        this.logger.log(LogLevel.DEBUG, str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void info(String str) {
        this.logger.log(LogLevel.LIFECYCLE, str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void warn(String str) {
        this.logger.log(LogLevel.WARN, str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void error(String str) {
        this.logger.log(LogLevel.ERROR, str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void error(String str, Throwable th) {
        this.logger.log(LogLevel.ERROR, str, th);
    }
}
