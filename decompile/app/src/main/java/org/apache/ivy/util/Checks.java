package org.apache.ivy.util;

import java.io.File;

/* loaded from: classes8.dex */
public final class Checks {
    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str + " must not be null");
    }

    public static File checkAbsolute(File file, String str) {
        checkNotNull(file, str);
        if (!file.isAbsolute()) {
            throw new IllegalArgumentException(str + " must be absolute: " + file.getPath());
        }
        return FileUtil.normalize(file.getPath());
    }

    public static File checkAbsolute(String str, String str2) {
        checkNotNull(str, str2);
        File file = new File(str);
        if (!file.isAbsolute()) {
            throw new IllegalArgumentException(str2 + " must be absolute: " + str);
        }
        return FileUtil.normalize(file.getPath());
    }
}
