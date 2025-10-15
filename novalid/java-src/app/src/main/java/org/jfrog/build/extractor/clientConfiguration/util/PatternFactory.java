package org.jfrog.build.extractor.clientConfiguration.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.dependency.pattern.BuildDependencyPattern;
import org.jfrog.build.api.dependency.pattern.DependencyPattern;
import org.jfrog.build.api.dependency.pattern.PatternType;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public class PatternFactory {
    public static DependencyPattern create(String str) {
        String[] strArrSplit = str.split("=>|=!>");
        String strSeparatorsToUnix = strArrSplit.length > 0 ? FilenameUtils.separatorsToUnix(strArrSplit[0].trim()) : "";
        String strSeparatorsToUnix2 = strArrSplit.length > 1 ? FilenameUtils.separatorsToUnix(strArrSplit[1].trim()) : "";
        String strExtractPatternFromSource = extractPatternFromSource(strSeparatorsToUnix);
        String strExtractMatrixParamsFromSource = extractMatrixParamsFromSource(strSeparatorsToUnix);
        int iLastIndexOf = strSeparatorsToUnix.lastIndexOf(64);
        int iLastIndexOf2 = strSeparatorsToUnix.lastIndexOf(35);
        if (iLastIndexOf > 0 && iLastIndexOf2 > iLastIndexOf && iLastIndexOf2 < strSeparatorsToUnix.length() - 1) {
            String strSubstring = StringUtils.substring(strSeparatorsToUnix, 0, iLastIndexOf);
            String strSubstring2 = StringUtils.substring(strSeparatorsToUnix, iLastIndexOf + 1, iLastIndexOf2);
            String strSubstring3 = StringUtils.substring(strSeparatorsToUnix, iLastIndexOf2 + 1);
            if (!StringUtils.isNotBlank(strSubstring2) && !StringUtils.isNotBlank(strSubstring3) && !StringUtils.isNotBlank(strSubstring)) {
                return null;
            }
            String strSubstring4 = StringUtils.substring(strSubstring, strExtractPatternFromSource.length() + 1, iLastIndexOf);
            return new BuildDependencyPattern(StringUtils.isNotBlank(strSubstring4) ? StringUtils.substring(strSubstring, 0, (iLastIndexOf - strSubstring4.length()) - 1) : strSubstring, strSubstring4, strSeparatorsToUnix2, getPatternType(str), strSubstring2, strSubstring3);
        }
        return new DependencyPattern(strExtractPatternFromSource, strExtractMatrixParamsFromSource, strSeparatorsToUnix2, getPatternType(str));
    }

    public static PatternType getPatternType(String str) {
        if (StringUtils.contains(str, "=!>")) {
            return PatternType.DELETE;
        }
        return PatternType.NORMAL;
    }

    public static String extractPatternFromSource(String str) {
        int iIndexOf = str.indexOf(59);
        return iIndexOf == -1 ? str : StringUtils.substring(str, 0, iIndexOf);
    }

    public static String extractMatrixParamsFromSource(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = StringUtils.split(str, ';');
        if (strArrSplit.length > 1) {
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = StringUtils.split(strArrSplit[i], '=');
                if (strArrSplit2.length != 0) {
                    boolean z = false;
                    String strSubstring = strArrSplit2[0];
                    if (strSubstring.endsWith("+")) {
                        strSubstring = StringUtils.substring(strSubstring, 0, strSubstring.length() - 1);
                        z = true;
                    }
                    if (i > 1) {
                        sb.append(PropertiesParser.PROPS_SEPARATOR);
                    }
                    try {
                        sb.append(URLEncoder.encode(strSubstring, "utf-8"));
                        if (z) {
                            sb.append("+");
                        }
                        if (strArrSplit2.length > 1) {
                            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                            sb.append(URLEncoder.encode(strArrSplit2[1], "utf-8"));
                        }
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }
                }
            }
        }
        return sb.toString();
    }
}
