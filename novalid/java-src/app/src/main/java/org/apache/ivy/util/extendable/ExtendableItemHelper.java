package org.apache.ivy.util.extendable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.xml.sax.Attributes;

/* loaded from: classes8.dex */
public final class ExtendableItemHelper {
    public static final char separator = '.';

    public static String decodeAttribute(String str, String str2) throws NumberFormatException {
        StringBuilder sb = new StringBuilder(str);
        int length = str2.length();
        int iIndexOf = str.indexOf(46, length);
        int i = Integer.parseInt(str.substring(length, iIndexOf));
        int i2 = iIndexOf + 1;
        if (i > 0) {
            sb.setCharAt(i + i2, ':');
        }
        return sb.substring(i2);
    }

    public static String encodeAttribute(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 5);
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        sb.append(str2);
        sb.append(iIndexOf);
        sb.append('.');
        sb.append(str);
        if (iIndexOf > 0) {
            sb.setCharAt((sb.length() - str.length()) + iIndexOf, '.');
        }
        return sb.toString();
    }

    public static Map<String, String> getExtraAttributes(Attributes attributes, String str) {
        HashMap map = new HashMap();
        for (int i = 0; i < attributes.getLength(); i++) {
            if (attributes.getQName(i).startsWith(str)) {
                map.put(decodeAttribute(attributes.getQName(i), str), attributes.getValue(i));
            }
        }
        return map;
    }

    @Deprecated
    public static Map<String, String> getExtraAttributes(ParserSettings parserSettings, Attributes attributes, String[] strArr) {
        return getExtraAttributes(parserSettings, attributes, (List<String>) Arrays.asList(strArr));
    }

    public static Map<String, String> getExtraAttributes(ParserSettings parserSettings, Attributes attributes, List<String> list) {
        HashMap map = new HashMap();
        for (int i = 0; i < attributes.getLength(); i++) {
            if (!list.contains(attributes.getQName(i))) {
                map.put(attributes.getQName(i), parserSettings.substitute(attributes.getValue(i)));
            }
        }
        return map;
    }

    @Deprecated
    public static void fillExtraAttributes(ParserSettings parserSettings, DefaultExtendableItem defaultExtendableItem, Attributes attributes, String[] strArr) {
        fillExtraAttributes(parserSettings, defaultExtendableItem, attributes, (List<String>) Arrays.asList(strArr));
    }

    public static void fillExtraAttributes(ParserSettings parserSettings, DefaultExtendableItem defaultExtendableItem, Attributes attributes, List<String> list) {
        for (Map.Entry<String, String> entry : getExtraAttributes(parserSettings, attributes, list).entrySet()) {
            defaultExtendableItem.setExtraAttribute(entry.getKey(), entry.getValue());
        }
    }
}
