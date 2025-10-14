package org.jfrog.build.extractor.clientConfiguration.util;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public class PathsUtils {
    public static final char ESCAPE_CHARACTER = "\\".charAt(0);
    public static final String REGEXP_CHARS = "*+?[]$^.{}|()";

    public static String reformatRegexp(String str, String str2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str.replace("\\", "/"));
        if (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String strGroup = matcher.group(i);
                if (strGroup != null) {
                    str2 = str2.replace(WebvttCssParser.RULE_START + i + WebvttCssParser.RULE_END, strGroup);
                }
            }
        }
        return str2;
    }

    public static String substringBeforeFirstRegex(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (StringUtils.contains(REGEXP_CHARS, cCharAt)) {
                break;
            }
            if (cCharAt == ESCAPE_CHARACTER) {
                if (str.length() < i + 2) {
                    throw new IllegalStateException("Base directory: " + str + " ends with an escape character.");
                }
                i++;
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static String escapeRegexChars(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String strSubstring = str.substring(i, i2);
            if (StringUtils.contains(REGEXP_CHARS, strSubstring)) {
                sb.append(ESCAPE_CHARACTER);
                sb.append(strSubstring);
            } else {
                sb.append(strSubstring);
            }
            i = i2;
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.String pathToRegExp(java.lang.String r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            r0.<init>(r1)
            int r1 = r6.length()
            r2 = 0
        Le:
            java.lang.String r3 = ".*"
            if (r2 >= r1) goto L49
            char r4 = r6.charAt(r2)
            r5 = 36
            if (r4 == r5) goto L3e
            r5 = 46
            if (r4 == r5) goto L3e
            r5 = 63
            if (r4 == r5) goto L38
            r5 = 42
            if (r4 == r5) goto L34
            r3 = 43
            if (r4 == r3) goto L3e
            switch(r4) {
                case 91: goto L3e;
                case 92: goto L3e;
                case 93: goto L3e;
                case 94: goto L3e;
                default: goto L2d;
            }
        L2d:
            switch(r4) {
                case 123: goto L3e;
                case 124: goto L3e;
                case 125: goto L3e;
                default: goto L30;
            }
        L30:
            r0.append(r4)
            goto L46
        L34:
            r0.append(r3)
            goto L46
        L38:
            java.lang.String r3 = "."
            r0.append(r3)
            goto L46
        L3e:
            java.lang.String r3 = "\\"
            r0.append(r3)
            r0.append(r4)
        L46:
            int r2 = r2 + 1
            goto Le
        L49:
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "/"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "^"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "$"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jfrog.build.extractor.clientConfiguration.util.PathsUtils.pathToRegExp(java.lang.String):java.lang.String");
    }

    public static Map<String, String> replaceFilesName(String str, String str2) {
        String strSubstringBeforeLast = StringUtils.substringBeforeLast(str, "/");
        String strSubstringAfterLast = StringUtils.substringAfterLast(str, "/");
        HashMap map = new HashMap();
        map.put("targetPath", strSubstringBeforeLast);
        if (str2.contains("/")) {
            strSubstringAfterLast = StringUtils.substringBeforeLast(str2, "/") + "/" + strSubstringAfterLast;
        }
        map.put("srcPath", strSubstringAfterLast);
        return map;
    }

    public static String removeUnescapedChar(String str, Character ch) {
        String strValueOf = String.valueOf(ch);
        if (REGEXP_CHARS.contains(strValueOf)) {
            strValueOf = "\\" + ch;
        }
        String[] strArrSplit = str.split(strValueOf);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (str2.endsWith("\\")) {
                sb.append(str2);
                sb.append(ch);
            } else {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static String escapeSpecialChars(String str) {
        for (char c : "\\*+?[]$^.{}|()".toCharArray()) {
            str = str.replace(String.valueOf(c), "\\" + c);
        }
        return str;
    }
}
