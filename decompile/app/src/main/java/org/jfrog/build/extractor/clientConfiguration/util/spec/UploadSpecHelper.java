package org.jfrog.build.extractor.clientConfiguration.util.spec;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.apache.ivy.plugins.version.VersionRangeMatcher;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.clientConfiguration.util.PathsUtils;

/* loaded from: classes7.dex */
public class UploadSpecHelper {
    public static DeployDetails buildDeployDetails(String str, File file, String str2, String str3, String str4, Multimap<String, String> multimap) throws NoSuchAlgorithmException, IOException {
        String strReplace = StringUtils.replace(wildcardCalculateTargetPath(str, file), "//", "/");
        try {
            Map<String, String> mapCalculateChecksums = FileChecksumCalculator.calculateChecksums(file, "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256");
            DeployDetails.Builder builderPackageType = new DeployDetails.Builder().file(file).artifactPath(strReplace).targetRepository(getRepositoryKey(str2)).md5(mapCalculateChecksums.get("MD5")).sha1(mapCalculateChecksums.get(FileChecksumCalculator.SHA1_ALGORITHM)).sha256(mapCalculateChecksums.get("SHA-256")).explode(BooleanUtils.toBoolean(str3)).addProperties(SpecsHelper.getPropertiesMap(str4)).packageType(DeployDetails.PackageType.GENERIC);
            if (multimap != null && !multimap.isEmpty()) {
                builderPackageType.addProperties(multimap);
            }
            return builderPackageType.build();
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException(String.format("Could not find checksum algorithm for %s or %s or %s.", "MD5", FileChecksumCalculator.SHA1_ALGORITHM, "SHA-256"), e);
        }
    }

    public static String wildcardCalculateTargetPath(String str, File file) {
        if (!str.endsWith("/") && !str.equals("")) {
            return str;
        }
        return StringUtils.removeStart(str + calculateTargetRelativePath(file), "/");
    }

    public static String calculateTargetRelativePath(File file) {
        String absolutePath = file.getAbsolutePath();
        String parent = file.getParent();
        if (!StringUtils.isBlank(parent)) {
            absolutePath = StringUtils.removeStart(file.getAbsolutePath(), parent);
        }
        return StringUtils.removeStart(FilenameUtils.separatorsToUnix(absolutePath), "/");
    }

    public static String getRelativeToWsPath(String str, String str2) {
        return str.replace("\\", "/").substring(str2.replace("\\", "/").length() + 1);
    }

    public static String prepareExcludePattern(String[] strArr, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        if (!ArrayUtils.isEmpty(strArr)) {
            for (String strPathToRegExp : strArr) {
                if (!StringUtils.isBlank(strPathToRegExp)) {
                    if (z) {
                        strPathToRegExp = PathsUtils.pathToRegExp(strPathToRegExp);
                    }
                    if (z2 && strPathToRegExp.endsWith(File.pathSeparator)) {
                        strPathToRegExp = strPathToRegExp + SegmentConstantPool.REGEX_MATCH_ALL;
                    }
                    sb.append("(");
                    sb.append(strPathToRegExp);
                    sb.append(")|");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static String getUploadPath(File file, Pattern pattern, String str, boolean z, boolean z2, File file2, boolean z3) {
        String relativePath;
        String strCalculateFileTargetPath = (!z3 || z) ? str : calculateFileTargetPath(file2, file, str);
        if (z2) {
            if (z) {
                str = strCalculateFileTargetPath;
            } else if (z3) {
                str = str + file.getPath();
            }
            relativePath = file.getPath();
            strCalculateFileTargetPath = str;
        } else {
            relativePath = getRelativePath(file2, file);
        }
        return PathsUtils.reformatRegexp(relativePath, strCalculateFileTargetPath.replace('\\', '/'), pattern);
    }

    public static Multimap<String, File> getUploadPathsMap(List<File> list, File file, String str, boolean z, Pattern pattern, boolean z2) {
        HashMultimap hashMultimapCreate = HashMultimap.create();
        boolean zEndsWith = StringUtils.endsWith(str, "/");
        for (File file2 : list) {
            hashMultimapCreate.put(getUploadPath(file2, pattern, str, z, z2, file, zEndsWith), file2);
        }
        return hashMultimapCreate;
    }

    public static String getWildcardBaseDir(File file, String str) {
        String strSubstringBefore = StringUtils.substringBefore(StringUtils.substringBefore(getWildcardAbsolutePattern(file, str), "*"), "?");
        return removeParenthesisEscapeChar(removeParenthesis(strSubstringBefore.substring(0, strSubstringBefore.lastIndexOf("/") + 1)));
    }

    public static String getRegexBaseDir(File file, String str) throws FileNotFoundException {
        String existingPath = getExistingPath(getRegexpAbsolutePattern(file, str));
        if (StringUtils.isEmpty(existingPath)) {
            throw new FileNotFoundException("Could not find any base path in the pattern: " + str);
        }
        if (existingPath.endsWith("/")) {
            return existingPath;
        }
        return existingPath + "/";
    }

    public static String prepareRegexPattern(File file, String str, String str2) {
        String strRemoveLeadingSeparator = removeLeadingSeparator(cleanRegexpPattern(getRegexpAbsolutePattern(file, str), str2));
        if (!str.endsWith("/")) {
            return strRemoveLeadingSeparator;
        }
        return strRemoveLeadingSeparator + SegmentConstantPool.REGEX_MATCH_ALL;
    }

    public static String prepareWildcardPattern(File file, String str, String str2) {
        String strRemoveLeadingSeparator = removeLeadingSeparator(StringUtils.substringAfter(removeParenthesisEscapeChar(removeParenthesis(getWildcardAbsolutePattern(file, str))), str2));
        if (!str.endsWith("/")) {
            return strRemoveLeadingSeparator;
        }
        return strRemoveLeadingSeparator + "*";
    }

    public static String removeLeadingSeparator(String str) {
        return str.startsWith("/") ? str.substring(1) : str;
    }

    public static String getRelativePath(File file, File file2) {
        if (file == null || file2 == null) {
            return null;
        }
        if (!file.isDirectory() && (file = file.getParentFile()) == null) {
            return null;
        }
        if (file.equals(file2)) {
            return ".";
        }
        String absolutePath = file2.getAbsolutePath();
        String strEnsureEndsWithSeparator = ensureEndsWithSeparator(file.getAbsolutePath());
        String lowerCase = strEnsureEndsWithSeparator.toLowerCase();
        String lowerCase2 = absolutePath.toLowerCase();
        if (lowerCase.equals(ensureEndsWithSeparator(lowerCase2))) {
            return ".";
        }
        int i = 0;
        int i2 = 0;
        while (i < absolutePath.length() && i < strEnsureEndsWithSeparator.length() && lowerCase2.charAt(i) == lowerCase.charAt(i)) {
            if (strEnsureEndsWithSeparator.charAt(i) == File.separatorChar) {
                i2 = i;
            }
            i++;
        }
        if (i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < strEnsureEndsWithSeparator.length()) {
            if (strEnsureEndsWithSeparator.charAt(i) == File.separatorChar) {
                sb.append("..");
                sb.append(File.separator);
            }
            i++;
        }
        sb.append(absolutePath.substring(i2 + 1));
        return sb.toString();
    }

    public static String calculateFileTargetPath(File file, File file2, String str) {
        String strStripFileNameFromPath = stripFileNameFromPath(getRelativePath(file, file2));
        if (str.length() == 0) {
            return strStripFileNameFromPath;
        }
        if (strStripFileNameFromPath.length() == 0) {
            return str;
        }
        return str + '/' + strStripFileNameFromPath;
    }

    public static String getLocalPath(String str) {
        String strSubstringAfter = StringUtils.substringAfter(str, "/");
        return "".equals(strSubstringAfter) ? "/" : strSubstringAfter;
    }

    public static String getRegexpAbsolutePattern(File file, String str) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        return PathsUtils.escapeRegexChars(file.getAbsolutePath().replace("\\", "/")) + "/" + str;
    }

    public static String getWildcardAbsolutePattern(File file, String str) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        return escapeParentheses(file.getAbsolutePath().replace("\\", "/")) + "/" + str;
    }

    public static String getExistingPath(String str) {
        String strSubstringBeforeFirstRegex = PathsUtils.substringBeforeFirstRegex(removeParenthesis(str));
        while (!new File(strSubstringBeforeFirstRegex).isDirectory() && strSubstringBeforeFirstRegex.contains("/")) {
            strSubstringBeforeFirstRegex = StringUtils.substringBeforeLast(strSubstringBeforeFirstRegex, "/");
        }
        return strSubstringBeforeFirstRegex;
    }

    public static String removeParenthesisEscapeChar(String str) {
        return str.replace(VersionRangeMatcher.UI_PATTERN, ")").replace(VersionRangeMatcher.LI_PATTERN, "(");
    }

    public static String removeParenthesis(String str) {
        return PathsUtils.removeUnescapedChar(PathsUtils.removeUnescapedChar(str, Character.valueOf("(".charAt(0))), Character.valueOf(")".charAt(0)));
    }

    public static String escapeParentheses(String str) {
        return str.replace("(", VersionRangeMatcher.LI_PATTERN).replace(")", VersionRangeMatcher.UI_PATTERN);
    }

    public static String cleanRegexpPattern(String str, String str2) {
        while (str2.contains("/")) {
            str2 = StringUtils.substringAfter(str2, "/");
            str = StringUtils.substringAfter(str, "/");
        }
        return cleanUnopenedParenthesis(str);
    }

    public static String stripFileNameFromPath(String str) {
        File file = new File(str);
        return file.getPath().substring(0, file.getPath().length() - file.getName().length());
    }

    public static String cleanUnopenedParenthesis(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ")".charAt(0)) {
                sb.append(cCharAt);
                if (cCharAt == "(".charAt(0)) {
                    i++;
                }
            } else if (i > 0) {
                i--;
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String ensureEndsWithSeparator(String str) {
        String str2 = File.separator;
        if (StringUtils.endsWith(str, str2)) {
            return str;
        }
        return str + str2;
    }

    public static String getRepositoryKey(String str) {
        return StringUtils.substringBefore(str, "/");
    }
}
