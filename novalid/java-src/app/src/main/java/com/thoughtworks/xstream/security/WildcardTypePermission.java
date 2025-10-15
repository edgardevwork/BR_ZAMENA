package com.thoughtworks.xstream.security;

/* loaded from: classes8.dex */
public class WildcardTypePermission extends RegExpTypePermission {
    public WildcardTypePermission(String[] strArr) {
        this(false, strArr);
    }

    public WildcardTypePermission(boolean z, String[] strArr) {
        super(getRegExpPatterns(strArr, z));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] getRegExpPatterns(String[] strArr, boolean z) {
        if (strArr == null) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            StringBuffer stringBuffer = new StringBuffer(str.length() * 2);
            stringBuffer.append("(?u)");
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '$' || cCharAt == '.') {
                    stringBuffer.append('\\');
                    stringBuffer.append(cCharAt);
                } else if (cCharAt == '?') {
                    stringBuffer.append('.');
                } else if (cCharAt != '|') {
                    switch (cCharAt) {
                        case '(':
                        case ')':
                        case '+':
                            break;
                        case '*':
                            int i3 = i2 + 1;
                            if (i3 < length && str.charAt(i3) == '*') {
                                stringBuffer.append(z ? "[\\P{C}]*" : "[\\P{C}&&[^$]]*(?:\\$[^0-9$][\\P{C}&&[^.$]]*)*");
                                i2 = i3;
                                break;
                            } else {
                                stringBuffer.append(z ? "[\\P{C}&&[^.]]*" : "[\\P{C}&&[^.$]]*(?:\\$[^0-9$][\\P{C}&&[^.$]]*)*");
                                break;
                            }
                        default:
                            switch (cCharAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                    break;
                                default:
                                    stringBuffer.append(cCharAt);
                                    break;
                            }
                    }
                }
                i2++;
            }
            strArr2[i] = stringBuffer.toString();
        }
        return strArr2;
    }
}
