package com.thoughtworks.xstream.p042io.xml.xppdom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class XppDomComparator implements Comparator {
    public final ThreadLocal xpath;

    public XppDomComparator() {
        this(null);
    }

    public XppDomComparator(ThreadLocal threadLocal) {
        this.xpath = threadLocal;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        StringBuffer stringBuffer = new StringBuffer("/");
        int iCompareInternal = compareInternal((XppDom) obj, (XppDom) obj2, stringBuffer, -1);
        ThreadLocal threadLocal = this.xpath;
        if (threadLocal != null) {
            if (iCompareInternal != 0) {
                threadLocal.set(stringBuffer.toString());
            } else {
                threadLocal.set(null);
            }
        }
        return iCompareInternal;
    }

    public final int compareInternal(XppDom xppDom, XppDom xppDom2, StringBuffer stringBuffer, int i) {
        int length = stringBuffer.length();
        String name = xppDom.getName();
        int iCompareTo = name.compareTo(xppDom2.getName());
        stringBuffer.append(name);
        if (i >= 0) {
            stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
            stringBuffer.append(i);
            stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        }
        if (iCompareTo != 0) {
            stringBuffer.append('?');
            return iCompareTo;
        }
        String[] attributeNames = xppDom.getAttributeNames();
        String[] attributeNames2 = xppDom2.getAttributeNames();
        int length2 = attributeNames.length;
        int length3 = attributeNames2.length - length2;
        if (length3 != 0) {
            stringBuffer.append("::count(@*)");
            return length3 < 0 ? 1 : -1;
        }
        Arrays.sort(attributeNames);
        Arrays.sort(attributeNames2);
        for (int i2 = 0; i2 < length2; i2++) {
            String str = attributeNames[i2];
            int iCompareTo2 = str.compareTo(attributeNames2[i2]);
            if (iCompareTo2 != 0) {
                stringBuffer.append("[@");
                stringBuffer.append(str);
                stringBuffer.append("?]");
                return iCompareTo2;
            }
            int iCompareTo3 = xppDom.getAttribute(str).compareTo(xppDom2.getAttribute(str));
            if (iCompareTo3 != 0) {
                stringBuffer.append("[@");
                stringBuffer.append(str);
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                return iCompareTo3;
            }
        }
        int childCount = xppDom.getChildCount();
        int childCount2 = xppDom2.getChildCount() - childCount;
        if (childCount2 != 0) {
            stringBuffer.append("::count(*)");
            return childCount2 < 0 ? 1 : -1;
        }
        if (childCount > 0) {
            if (xppDom.getValue() != null || xppDom2.getValue() != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("XppDom cannot handle mixed mode at ");
                stringBuffer2.append((Object) stringBuffer);
                stringBuffer2.append("::text()");
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
            stringBuffer.append('/');
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < childCount; i3++) {
                XppDom child = xppDom.getChild(i3);
                XppDom child2 = xppDom2.getChild(i3);
                String name2 = child.getName();
                if (!map.containsKey(name2)) {
                    map.put(name2, new int[1]);
                }
                int[] iArr = (int[]) map.get(name2);
                int i4 = iArr[0];
                iArr[0] = i4 + 1;
                childCount2 = compareInternal(child, child2, stringBuffer, i4);
                if (childCount2 != 0) {
                    return childCount2;
                }
            }
        } else {
            String value = xppDom2.getValue();
            String value2 = xppDom.getValue();
            if (value2 == null) {
                childCount2 = value == null ? 0 : -1;
            } else {
                childCount2 = value != null ? value2.compareTo(value) : 1;
            }
            if (childCount2 != 0) {
                stringBuffer.append("::text()");
                return childCount2;
            }
        }
        stringBuffer.setLength(length);
        return childCount2;
    }
}
