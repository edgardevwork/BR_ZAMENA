package org.jfrog.build.extractor.clientConfiguration;

import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public abstract class PatternMatcher {
    public static boolean pathConflicts(String str, IncludeExcludePatterns includeExcludePatterns) {
        if (isPathIncluded(str, includeExcludePatterns)) {
            return isPathExcluded(str, includeExcludePatterns);
        }
        return true;
    }

    public static boolean isPathIncluded(String str, IncludeExcludePatterns includeExcludePatterns) {
        String[] includePatterns = includeExcludePatterns.getIncludePatterns();
        if (includePatterns.length == 0) {
            return true;
        }
        return pathMatchesPattern(str, includePatterns);
    }

    public static boolean isPathExcluded(String str, IncludeExcludePatterns includeExcludePatterns) {
        String[] excludePatterns = includeExcludePatterns.getExcludePatterns();
        if (excludePatterns.length == 0) {
            return false;
        }
        return pathMatchesPattern(str, excludePatterns);
    }

    public static boolean pathMatchesPattern(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (StringUtils.isNotBlank(str2) && match(str2, str, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r7 <= r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 > r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0[r6] == '*') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r10 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r10 == '*') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r7 > r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r10 == '?') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        if (r19 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (r10 == r1[r4]) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        if (r19 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (java.lang.Character.toUpperCase(r10) == java.lang.Character.toUpperCase(r1[r4])) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        r2 = r2 - 1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r7 <= r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        if (r6 > r2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        if (r0[r6] == '*') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
    
        if (r6 == r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
    
        if (r7 > r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        r10 = r6 + 1;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if (r11 > r2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        if (r0[r11] != '*') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008e, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
    
        if (r11 != r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0094, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0096, code lost:
    
        r10 = (r11 - r6) - (r3 ? 1 : 0);
        r13 = (r4 - r7) + (r3 ? 1 : 0);
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
    
        if (r14 > (r13 - r10)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a1, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a2, code lost:
    
        if (r15 >= r10) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a4, code lost:
    
        r3 = r0[(r6 + r15) + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00aa, code lost:
    
        if (r3 == r8) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ac, code lost:
    
        if (r19 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b4, code lost:
    
        if (r3 == r1[(r7 + r14) + r15]) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b7, code lost:
    
        if (r19 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c6, code lost:
    
        if (java.lang.Character.toUpperCase(r3) == java.lang.Character.toUpperCase(r1[(r7 + r14) + r15])) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c8, code lost:
    
        r14 = r14 + 1;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        r15 = r15 + 1;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d4, code lost:
    
        r7 = r7 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d6, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d7, code lost:
    
        if (r7 != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00da, code lost:
    
        r7 = r7 + r10;
        r6 = r11;
        r3 = true;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e0, code lost:
    
        if (r6 > r2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e4, code lost:
    
        if (r0[r6] == '*') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ea, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean match(String str, String str2, boolean z) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        boolean z2 = true;
        int length = charArray.length - 1;
        int length2 = charArray2.length - 1;
        int i = 0;
        while (true) {
            char c = '?';
            if (i >= charArray.length) {
                if (length != length2) {
                    return false;
                }
                for (int i2 = 0; i2 <= length; i2++) {
                    char c2 = charArray[i2];
                    if (c2 != '?') {
                        if (z && c2 != charArray2[i2]) {
                            return false;
                        }
                        if (!z && Character.toUpperCase(c2) != Character.toUpperCase(charArray2[i2])) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (charArray[i] != '*') {
                i++;
                z2 = true;
            } else {
                if (length == 0) {
                    return z2;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    char c3 = charArray[i3];
                    if (c3 == '*' || i4 > length2) {
                        break;
                    }
                    if (c3 != '?') {
                        if (z && c3 != charArray2[i4]) {
                            return false;
                        }
                        if (!z && Character.toUpperCase(c3) != Character.toUpperCase(charArray2[i4])) {
                            return false;
                        }
                    }
                    i3++;
                    i4++;
                }
            }
        }
    }
}
