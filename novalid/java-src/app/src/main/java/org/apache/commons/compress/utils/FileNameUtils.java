package org.apache.commons.compress.utils;

import java.io.File;
import java.nio.file.Path;

/* loaded from: classes8.dex */
public class FileNameUtils {
    public static String fileNameToBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    public static String fileNameToExtension(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String getBaseName(Path path) {
        if (path == null) {
            return null;
        }
        return fileNameToBaseName(path.getFileName().toString());
    }

    public static String getBaseName(String str) {
        if (str == null) {
            return null;
        }
        return fileNameToBaseName(new File(str).getName());
    }

    public static String getExtension(Path path) {
        if (path == null) {
            return null;
        }
        return fileNameToExtension(path.getFileName().toString());
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        return fileNameToExtension(new File(str).getName());
    }
}
