package org.jfrog.build.extractor.clientConfiguration.util;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.jfrog.build.extractor.clientConfiguration.util.spec.UploadSpecHelper;

/* loaded from: classes7.dex */
public class PublishedItemsHelper {
    public static Multimap<String, String> getPublishedItemsPatternPairs(String str) {
        HashMultimap hashMultimapCreate = HashMultimap.create();
        if (StringUtils.isNotBlank(str)) {
            Iterator<String> it = parsePatternsFromProperty(str).iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split("=>");
                String strSeparatorsToUnix = strArrSplit.length > 0 ? FilenameUtils.separatorsToUnix(strArrSplit[0].trim()) : "";
                String strSeparatorsToUnix2 = strArrSplit.length > 1 ? FilenameUtils.separatorsToUnix(strArrSplit[1].trim()) : "";
                if (StringUtils.isNotBlank(strSeparatorsToUnix)) {
                    hashMultimapCreate.put(strSeparatorsToUnix, strSeparatorsToUnix2);
                }
            }
        }
        return hashMultimapCreate;
    }

    public static List<String> parsePatternsFromProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot parse null pattern.");
        }
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(StringUtils.f9903LF)) {
            if (StringUtils.isNotBlank(str2)) {
                for (String str3 : str2.trim().split(",")) {
                    if (StringUtils.isNotBlank(str3)) {
                        arrayList.add(str3.trim());
                    }
                }
            }
        }
        return arrayList;
    }

    public static String removeDoubleDotsFromPattern(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot remove double dots from a null pattern.");
        }
        if (!str.contains("..")) {
            return str;
        }
        String[] strArrSplit = str.split("/");
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("/")) {
            sb.append("/");
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!"..".equals(strArrSplit[i])) {
                sb.append(strArrSplit[i]);
                if (i != strArrSplit.length - 1) {
                    sb.append("/");
                }
            }
        }
        return StringUtils.removeEnd(sb.toString(), "/");
    }

    @Deprecated
    public static Multimap<String, File> buildPublishingData(File file, String str, String str2) throws IOException {
        Pattern patternCompile;
        HashMultimap hashMultimapCreate = HashMultimap.create();
        File absolutePath = getAbsolutePath(file, str);
        if (absolutePath.isFile()) {
            hashMultimapCreate.put(str2, absolutePath);
        } else {
            if (absolutePath.isDirectory()) {
                patternCompile = Pattern.compile(SegmentConstantPool.REGEX_MATCH_ALL);
            } else if (str.indexOf(42) >= 0 || str.indexOf(63) >= 0) {
                File baseTruncationDir = getBaseTruncationDir(absolutePath);
                if (baseTruncationDir == null) {
                    baseTruncationDir = file;
                }
                if (isAncestor(file, absolutePath)) {
                    str = str.substring(baseTruncationDir.getAbsolutePath().length() - file.getAbsolutePath().length());
                }
                String absolutePath2 = absolutePath.getAbsolutePath();
                if (!StringUtils.isBlank(absolutePath2) && absolutePath2.startsWith(baseTruncationDir.getAbsolutePath())) {
                    str = UploadSpecHelper.getRelativePath(baseTruncationDir, absolutePath);
                }
                patternCompile = Pattern.compile(convertAntToRegexp(str));
                absolutePath = baseTruncationDir;
            } else {
                absolutePath = null;
                patternCompile = null;
            }
            if (patternCompile != null) {
                ArrayList<File> arrayList = new ArrayList();
                collectMatchedFiles(absolutePath, absolutePath, patternCompile, arrayList);
                for (File file2 : arrayList) {
                    hashMultimapCreate.put(UploadSpecHelper.calculateFileTargetPath(absolutePath, file2, str2), file2);
                }
            }
        }
        return hashMultimapCreate;
    }

    @Deprecated
    public static Multimap<String, File> wildCardBuildPublishingData(File file, String str, String str2, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            str = PathsUtils.pathToRegExp(str);
        }
        Pattern patternCompile = Pattern.compile(str);
        ArrayList arrayList = new ArrayList();
        collectMatchedFiles(file, file, patternCompile, arrayList, z2);
        return UploadSpecHelper.getUploadPathsMap(arrayList, file, str2, z, patternCompile, false);
    }

    public static File getAbsolutePath(File file, String str) {
        File file2 = new File(str);
        if (file2.isAbsolute()) {
            return file2;
        }
        File file3 = new File(file, str);
        return file.getPath().startsWith("\\\\") ? file3 : new File(file3.toURI().normalize().getPath());
    }

    public static File getBaseTruncationDir(File file) {
        String dirWithoutPattern = getDirWithoutPattern(file.getPath());
        if ("".equals(dirWithoutPattern)) {
            return null;
        }
        return new File(dirWithoutPattern);
    }

    public static String getDirWithoutPattern(String str) {
        String strReplace = str.replace('\\', '/');
        int iIndexOf = strReplace.indexOf(42);
        int iIndexOf2 = strReplace.indexOf(63);
        if (iIndexOf < 0 || (iIndexOf >= iIndexOf2 && iIndexOf2 >= 0)) {
            iIndexOf = iIndexOf2;
        }
        int iLastIndexOf = strReplace.lastIndexOf(47, iIndexOf);
        return iLastIndexOf <= 0 ? "" : str.substring(0, iLastIndexOf);
    }

    public static boolean isAncestor(File file, File file2) throws IOException {
        while (file2 != null) {
            if (file2.equals(file)) {
                return true;
            }
            file2 = getParentFile(file2);
        }
        return false;
    }

    public static File getParentFile(File file) {
        int i = 0;
        while (true) {
            file = file.getParentFile();
            if (file == null) {
                return null;
            }
            if (!".".equals(file.getName())) {
                if ("..".equals(file.getName())) {
                    i++;
                } else {
                    if (i <= 0) {
                        return file;
                    }
                    i--;
                }
            }
        }
    }

    public static String convertAntToRegexp(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = false;
        int i = 0;
        boolean z2 = true;
        for (int i2 = (str.startsWith("/") || str.startsWith("\\")) ? 1 : 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '*') {
                i++;
            } else {
                boolean z3 = z2 && i == 2 && (cCharAt == '/' || cCharAt == '\\');
                boolean z4 = i > 0;
                boolean z5 = cCharAt == '/' || cCharAt == '\\';
                if (z3) {
                    sb.append("(?:[^/]+/)*?");
                } else {
                    if (z4) {
                        sb.append("[^/]*?");
                    }
                    if (cCharAt == '(' || cCharAt == ')' || cCharAt == '[' || cCharAt == ']' || cCharAt == '^' || cCharAt == '$' || cCharAt == '.' || cCharAt == '{' || cCharAt == '}' || cCharAt == '+' || cCharAt == '|') {
                        sb.append('\\');
                        sb.append(cCharAt);
                    } else if (cCharAt == '?') {
                        sb.append("[^/]{1}");
                    } else if (cCharAt == '\\') {
                        sb.append('/');
                    } else {
                        sb.append(cCharAt);
                    }
                }
                i = 0;
                z2 = z5;
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '/') {
            z = true;
        }
        if ((i == 0 && z) || (z2 && i == 2)) {
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            if (sb.length() == 0) {
                sb.append(SegmentConstantPool.REGEX_MATCH_ALL);
            } else {
                sb.append("(?:$|/.+)");
            }
        } else if (i > 0) {
            sb.append("[^/]*?");
        }
        return sb.toString();
    }

    public static void collectMatchedFiles(File file, File file2, Pattern pattern, List list) {
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isFile()) {
                if (pattern.matcher(UploadSpecHelper.getRelativePath(file, file3).replace("\\", "/")).matches()) {
                    list.add(file3);
                }
            } else {
                collectMatchedFiles(file, file3, pattern, list);
            }
        }
    }

    public static void collectMatchedFiles(File file, File file2, Pattern pattern, List list, boolean z) {
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isFile()) {
                String strReplace = UploadSpecHelper.getRelativePath(file, file3).replace("\\", "/");
                if (pattern.matcher(strReplace).matches() || (z && pattern.matcher(StringUtils.substringAfterLast(strReplace, "/")).matches())) {
                    list.add(file3);
                }
            } else if (continueDepthSearch(file, file3, pattern, z)) {
                collectMatchedFiles(file, file3, pattern, list, z);
            }
        }
    }

    public static boolean continueDepthSearch(File file, File file2, Pattern pattern, boolean z) {
        return z || StringUtils.countMatches(UploadSpecHelper.getRelativePath(file, file2).replace("\\", "/"), "/") < StringUtils.countMatches(pattern.toString(), "/");
    }

    public static String calculateTargetPath(String str, File file) {
        String strCalculateTargetRelativePath = UploadSpecHelper.calculateTargetRelativePath(file);
        if (strCalculateTargetRelativePath == null) {
            throw new IllegalArgumentException("Cannot calculate a target path given a null relative path.");
        }
        if (StringUtils.isBlank(str)) {
            return strCalculateTargetRelativePath;
        }
        String strSeparatorsToUnix = FilenameUtils.separatorsToUnix(strCalculateTargetRelativePath);
        String strSeparatorsToUnix2 = FilenameUtils.separatorsToUnix(str);
        if (StringUtils.startsWith(strSeparatorsToUnix2, "/")) {
            return strSeparatorsToUnix2 + "/" + file.getName();
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = strSeparatorsToUnix2.split("/");
        int i = 0;
        boolean z = false;
        while (i < strArrSplit.length) {
            boolean z2 = i == strArrSplit.length - 1;
            String str2 = strArrSplit[i];
            if ("**".equals(str2)) {
                if (!z2) {
                    sb.append(FilenameUtils.getPathNoEndSeparator(strSeparatorsToUnix));
                    z = true;
                } else {
                    sb.append(strSeparatorsToUnix);
                }
            } else if (str2.startsWith("*.")) {
                sb.append(FilenameUtils.removeExtension(FilenameUtils.getName(strSeparatorsToUnix)) + str2.substring(1));
            } else if ("*".equals(str2)) {
                sb.append(FilenameUtils.getName(strSeparatorsToUnix));
            } else {
                if (StringUtils.isNotBlank(str2)) {
                    sb.append(str2);
                }
                if (z2) {
                    if (sb.length() > 0) {
                        sb.append("/");
                    }
                    if (z) {
                        sb.append(FilenameUtils.getName(strSeparatorsToUnix));
                    } else {
                        sb.append(strSeparatorsToUnix);
                    }
                }
            }
            if (!z2) {
                sb.append("/");
            }
            i++;
        }
        return sb.toString();
    }
}
