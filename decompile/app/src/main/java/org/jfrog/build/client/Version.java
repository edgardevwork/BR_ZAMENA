package org.jfrog.build.client;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public class Version implements Serializable {
    public static final Version NOT_FOUND = new Version("0.0.0");
    public static final String SNAPSHOT_SUFFIX = "SNAPSHOT";
    public final String version;
    public final String[] versionTokens;

    public Version(String str) {
        if (StringUtils.isBlank(str)) {
            throw new IllegalArgumentException("Please provide a valid version.");
        }
        this.version = str;
        this.versionTokens = StringUtils.split(str, ".");
    }

    public boolean isNotFound() {
        return NOT_FOUND.version.equals(this.version);
    }

    public boolean isAtLeast(Version version) {
        int iCompareTokens;
        if (version != null) {
            int i = 0;
            while (true) {
                String[] strArr = version.versionTokens;
                if (i >= strArr.length) {
                    break;
                }
                String strTrim = strArr[i].trim();
                String[] strArr2 = this.versionTokens;
                int i2 = i + 1;
                if (strArr2.length < i2 || (iCompareTokens = compareTokens(strArr2[i].trim(), strTrim)) < 0) {
                    return false;
                }
                if (iCompareTokens > 0) {
                    return true;
                }
                i = i2;
            }
        }
        return true;
    }

    public final int compareTokens(String str, String str2) {
        boolean zIsBlank = StringUtils.isBlank(str);
        boolean zIsBlank2 = StringUtils.isBlank(str2);
        if (zIsBlank && zIsBlank2) {
            return 0;
        }
        if (!zIsBlank && zIsBlank2) {
            return 1;
        }
        if (zIsBlank) {
            return -1;
        }
        if (StringUtils.isNumeric(str2)) {
            return compareToCheckToNumericAtLeast(str, str2);
        }
        if (StringUtils.isAlphanumeric(str2)) {
            String tokenFirstNumerals = getTokenFirstNumerals(str2);
            if (StringUtils.isNotBlank(tokenFirstNumerals)) {
                return compareToCheckToNumericAtLeast(str, tokenFirstNumerals);
            }
            if (StringUtils.isNumeric(str)) {
                return -1;
            }
        }
        int iCompareTo = str.compareTo(str2);
        if (iCompareTo == 0) {
            boolean zContains = str.contains(SNAPSHOT_SUFFIX);
            boolean zContains2 = str2.contains(SNAPSHOT_SUFFIX);
            if (zContains && !zContains2) {
                return 1;
            }
            if (!zContains && zContains2) {
                return -1;
            }
        }
        return iCompareTo;
    }

    public final int compareToCheckToNumericAtLeast(String str, String str2) {
        if (StringUtils.isNumeric(str)) {
            return compareNumerals(str, str2);
        }
        if (StringUtils.isAlphanumeric(str)) {
            return compareAlphaNumericToCheckToNumericAtLeast(str, str2);
        }
        return 1;
    }

    public final int compareAlphaNumericToCheckToNumericAtLeast(String str, String str2) {
        String tokenFirstNumerals = getTokenFirstNumerals(str);
        if (StringUtils.isBlank(tokenFirstNumerals)) {
            return 1;
        }
        return compareNumerals(tokenFirstNumerals, str2);
    }

    public final int compareNumerals(String str, String str2) {
        return Integer.valueOf(str).compareTo(Integer.valueOf(str2));
    }

    public final String getTokenFirstNumerals(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!Character.isDigit(charArray[0])) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String toString() {
        return this.version;
    }
}
