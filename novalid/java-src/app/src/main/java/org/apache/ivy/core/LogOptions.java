package org.apache.ivy.core;

/* loaded from: classes7.dex */
public class LogOptions {
    public static final String LOG_DEFAULT = "default";
    public static final String LOG_DOWNLOAD_ONLY = "download-only";
    public static final String LOG_QUIET = "quiet";
    public String log;

    public LogOptions() {
        this.log = "default";
    }

    public LogOptions(LogOptions logOptions) {
        this.log = "default";
        this.log = logOptions.log;
    }

    public String getLog() {
        return this.log;
    }

    public LogOptions setLog(String str) {
        this.log = str;
        return this;
    }
}
