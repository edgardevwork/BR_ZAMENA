package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CompactStringObjectMap implements Serializable {
    public static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
    public static final long serialVersionUID = 1;
    public final Object[] _hashArea;
    public final int _hashMask;
    public final int _spillCount;

    public static final int findSize(int i) {
        if (i <= 5) {
            return 8;
        }
        if (i <= 12) {
            return 16;
        }
        int i2 = 32;
        while (i2 < i + (i >> 2)) {
            i2 += i2;
        }
        return i2;
    }

    public CompactStringObjectMap(int i, int i2, Object[] objArr) {
        this._hashMask = i;
        this._spillCount = i2;
        this._hashArea = objArr;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        int iFindSize = findSize(map.size());
        int i = iFindSize - 1;
        int i2 = (iFindSize >> 1) + iFindSize;
        Object[] objArrCopyOf = new Object[i2 * 2];
        int i3 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int iHashCode = key.hashCode() & i;
                int i4 = iHashCode + iHashCode;
                if (objArrCopyOf[i4] != null) {
                    i4 = ((iHashCode >> 1) + iFindSize) << 1;
                    if (objArrCopyOf[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i4] = key;
                objArrCopyOf[i4 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i, i3, objArrCopyOf);
    }

    public Object find(String str) {
        int iHashCode = str.hashCode() & this._hashMask;
        int i = iHashCode << 1;
        Object obj = this._hashArea[i];
        if (obj == str || str.equals(obj)) {
            return this._hashArea[i + 1];
        }
        return _find2(str, iHashCode, obj);
    }

    public final Object _find2(String str, int i, Object obj) {
        if (obj == null) {
            return null;
        }
        int i2 = this._hashMask + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this._hashArea[i3];
        if (str.equals(obj2)) {
            return this._hashArea[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this._spillCount + i4;
            while (i4 < i5) {
                Object obj3 = this._hashArea[i4];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i4 + 1];
                }
                i4 += 2;
            }
        }
        return null;
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i = 0; i < length; i += 2) {
            Object obj = this._hashArea[i];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i = 0; i < length; i += 2) {
            Object obj = this._hashArea[i];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
