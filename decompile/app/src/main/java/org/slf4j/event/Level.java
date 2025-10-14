package org.slf4j.event;

import com.blackhub.bronline.launcher.LauncherConstants;

/* loaded from: classes6.dex */
public enum Level {
    ERROR(40, LauncherConstants.ERROR_KEY),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    public int levelInt;
    public String levelStr;

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
