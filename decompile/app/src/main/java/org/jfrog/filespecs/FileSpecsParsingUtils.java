package org.jfrog.filespecs;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes5.dex */
public class FileSpecsParsingUtils {
    public static void pathToUnixFormat(FileSpec fileSpec) {
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            String str = StringUtils.equalsIgnoreCase(filesGroup.getRegexp(), Boolean.TRUE.toString()) ? "\\\\\\\\" : "\\\\";
            if (filesGroup.getTarget() != null) {
                filesGroup.setTarget(filesGroup.getTarget().replaceAll("\\\\", "/"));
            }
            if (filesGroup.getPattern() != null) {
                filesGroup.setPattern(filesGroup.getPattern().replaceAll(str, "/"));
            }
            if (!ArrayUtils.isEmpty(filesGroup.getExclusions())) {
                filesGroup.setExclusions(fixExclusionsPathToUnixFormat(filesGroup.getExclusions(), str));
            } else if (!ArrayUtils.isEmpty(filesGroup.getExcludePatterns())) {
                filesGroup.setExcludePatterns(fixExclusionsPathToUnixFormat(filesGroup.getExcludePatterns(), str));
            }
        }
    }

    public static String[] fixExclusionsPathToUnixFormat(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replaceAll(str, "/");
        }
        return strArr;
    }
}
