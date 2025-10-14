package org.jfrog.build.extractor.packageManager;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class PackageManagerLogger implements Log {
    public Logger logger = Logger.getLogger(PackageManagerLogger.class.getName());

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void debug(String str) {
        this.logger.fine(str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void info(String str) {
        this.logger.info(str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void warn(String str) {
        this.logger.warning(str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void error(String str) {
        this.logger.severe(str);
    }

    @Override // org.jfrog.build.api.util.Log, org.jfrog.filespecs.utils.Log
    public void error(String str, Throwable th) {
        this.logger.log(Level.SEVERE, str, th);
    }
}
