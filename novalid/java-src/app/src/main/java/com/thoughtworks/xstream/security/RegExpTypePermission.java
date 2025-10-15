package com.thoughtworks.xstream.security;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class RegExpTypePermission implements TypePermission {
    public final Pattern[] patterns;

    public RegExpTypePermission(String[] strArr) {
        this(getPatterns(strArr));
    }

    public RegExpTypePermission(Pattern[] patternArr) {
        this.patterns = patternArr == null ? new Pattern[0] : patternArr;
    }

    @Override // com.thoughtworks.xstream.security.TypePermission
    public boolean allows(Class cls) {
        if (cls != null) {
            String name = cls.getName();
            int i = 0;
            while (true) {
                Pattern[] patternArr = this.patterns;
                if (i >= patternArr.length) {
                    break;
                }
                if (patternArr[i].matcher(name).matches()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static Pattern[] getPatterns(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        Pattern[] patternArr = new Pattern[length];
        for (int i = 0; i < length; i++) {
            patternArr[i] = Pattern.compile(strArr[i]);
        }
        return patternArr;
    }
}
