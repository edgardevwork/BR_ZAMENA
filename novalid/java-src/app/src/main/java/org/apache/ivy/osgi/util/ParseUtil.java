package org.apache.ivy.osgi.util;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ParseUtil {
    public static String[] parseDelimitedString(String str, String str2) {
        if (str == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c = 7;
        for (int i = 0; i < length; i++) {
            char c2 = charArray[i];
            boolean z = str2.indexOf(c2) >= 0;
            boolean z2 = c2 == '\"';
            if (!z || (c & 2) <= 0) {
                if (z2 && (c & 4) > 0) {
                    sb.append(c2);
                    c = '\t';
                } else if (z2 && (c & '\b') > 0) {
                    sb.append(c2);
                } else {
                    sb.append(c2);
                }
            } else {
                arrayList.add(sb.toString().trim());
                sb.delete(0, sb.length());
            }
            c = 7;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString().trim());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
