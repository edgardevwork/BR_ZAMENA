package org.apache.commons.logging.impl;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;

/* loaded from: classes7.dex */
public class Jdk13LumberjackLogger implements Log, Serializable {
    public static final Level dummyLevel = Level.FINE;
    public static final long serialVersionUID = -8649807923527610591L;
    public transient Logger logger;
    public String name;
    public String sourceClassName = "unknown";
    public String sourceMethodName = "unknown";
    public boolean classAndMethodFound = false;

    public Jdk13LumberjackLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    private void log(Level level, String str, Throwable th) {
        if (getLogger().isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, str);
            if (!this.classAndMethodFound) {
                getClassAndMethod();
            }
            logRecord.setSourceClassName(this.sourceClassName);
            logRecord.setSourceMethodName(this.sourceMethodName);
            if (th != null) {
                logRecord.setThrown(th);
            }
            getLogger().log(logRecord);
        }
    }

    public final void getClassAndMethod() {
        try {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.getBuffer().toString(), StringUtils.f9903LF);
            stringTokenizer.nextToken();
            String strNextToken = stringTokenizer.nextToken();
            while (strNextToken.indexOf(getClass().getName()) == -1) {
                strNextToken = stringTokenizer.nextToken();
            }
            while (strNextToken.indexOf(getClass().getName()) >= 0) {
                strNextToken = stringTokenizer.nextToken();
            }
            String strSubstring = strNextToken.substring(strNextToken.indexOf("at ") + 3, strNextToken.indexOf(40));
            int iLastIndexOf = strSubstring.lastIndexOf(46);
            this.sourceClassName = strSubstring.substring(0, iLastIndexOf);
            this.sourceMethodName = strSubstring.substring(iLastIndexOf + 1);
        } catch (Exception unused) {
        }
        this.classAndMethodFound = true;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        log(Level.FINE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th) {
        log(Level.FINE, String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th) {
        log(Level.SEVERE, String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th) {
        log(Level.SEVERE, String.valueOf(obj), th);
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        log(Level.INFO, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th) {
        log(Level.INFO, String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isLoggable(Level.FINE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isLoggable(Level.INFO);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isLoggable(Level.FINEST);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isLoggable(Level.WARNING);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        log(Level.FINEST, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th) {
        log(Level.FINEST, String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        log(Level.WARNING, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th) {
        log(Level.WARNING, String.valueOf(obj), th);
    }
}
