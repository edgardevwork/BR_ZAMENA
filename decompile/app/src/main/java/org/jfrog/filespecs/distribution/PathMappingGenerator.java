package org.jfrog.filespecs.distribution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes5.dex */
public class PathMappingGenerator {
    public static PathMapping createPathMapping(FilesGroup filesGroup) {
        if (StringUtils.isEmpty(filesGroup.getTarget())) {
            return null;
        }
        return new PathMapping(convertWildcardStringToRegexp(filesGroup.getPattern()), convertPlaceholdersToApiFormat(filesGroup.getTarget()));
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.String convertWildcardStringToRegexp(java.lang.String r6) {
        /*
            if (r6 != 0) goto L5
            java.lang.String r6 = "^$"
            return r6
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            r0.<init>(r1)
            int r1 = r6.length()
            r2 = 0
        L13:
            java.lang.String r3 = ".*"
            if (r2 >= r1) goto L4e
            char r4 = r6.charAt(r2)
            r5 = 36
            if (r4 == r5) goto L43
            r5 = 46
            if (r4 == r5) goto L43
            r5 = 63
            if (r4 == r5) goto L3d
            r5 = 42
            if (r4 == r5) goto L39
            r3 = 43
            if (r4 == r3) goto L43
            switch(r4) {
                case 91: goto L43;
                case 92: goto L43;
                case 93: goto L43;
                case 94: goto L43;
                default: goto L32;
            }
        L32:
            switch(r4) {
                case 123: goto L43;
                case 124: goto L43;
                case 125: goto L43;
                default: goto L35;
            }
        L35:
            r0.append(r4)
            goto L4b
        L39:
            r0.append(r3)
            goto L4b
        L3d:
            java.lang.String r3 = "."
            r0.append(r3)
            goto L4b
        L43:
            java.lang.String r3 = "\\"
            r0.append(r3)
            r0.append(r4)
        L4b:
            int r2 = r2 + 1
            goto L13
        L4e:
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "/"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
        L69:
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
        throw new UnsupportedOperationException("Method not decompiled: org.jfrog.filespecs.distribution.PathMappingGenerator.convertWildcardStringToRegexp(java.lang.String):java.lang.String");
    }

    public static String convertPlaceholdersToApiFormat(String str) {
        Matcher matcher = Pattern.compile("(\\{\\d\\})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "\\$" + matcher.group().charAt(1));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
