package com.thoughtworks.xstream.p042io.path;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class PathTracker {
    public int capacity;
    public Path currentPath;
    public Map[] indexMapStack;
    public String[] pathStack;
    public int pointer;

    public PathTracker() {
        this(16);
    }

    public PathTracker(int i) {
        int iMax = Math.max(1, i);
        this.capacity = iMax;
        this.pathStack = new String[iMax];
        this.indexMapStack = new Map[iMax];
    }

    public void pushElement(String str) {
        int i = this.pointer + 1;
        int i2 = this.capacity;
        if (i >= i2) {
            resizeStacks(i2 * 2);
        }
        String[] strArr = this.pathStack;
        int i3 = this.pointer;
        strArr[i3] = str;
        Map map = this.indexMapStack[i3];
        if (map == null) {
            map = new HashMap();
            this.indexMapStack[this.pointer] = map;
        }
        if (map.containsKey(str)) {
            map.put(str, new Integer(((Integer) map.get(str)).intValue() + 1));
        } else {
            map.put(str, new Integer(1));
        }
        this.pointer++;
        this.currentPath = null;
    }

    public void popElement() {
        Map[] mapArr = this.indexMapStack;
        int i = this.pointer;
        mapArr[i] = null;
        this.pathStack[i] = null;
        this.currentPath = null;
        this.pointer = i - 1;
    }

    public String peekElement() {
        return peekElement(0);
    }

    public String peekElement(int i) {
        int i2 = this.pointer;
        if (i < (-i2) || i > 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        int i3 = (i2 + i) - 1;
        int iIntValue = ((Integer) this.indexMapStack[i3].get(this.pathStack[i3])).intValue();
        if (iIntValue > 1) {
            StringBuffer stringBuffer = new StringBuffer(this.pathStack[i3].length() + 6);
            stringBuffer.append(this.pathStack[i3]);
            stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
            stringBuffer.append(iIntValue);
            stringBuffer.append(AbstractJsonLexerKt.END_LIST);
            return stringBuffer.toString();
        }
        return this.pathStack[i3];
    }

    public int depth() {
        return this.pointer;
    }

    public final void resizeStacks(int i) {
        String[] strArr = new String[i];
        Map[] mapArr = new Map[i];
        int iMin = Math.min(this.capacity, i);
        System.arraycopy(this.pathStack, 0, strArr, 0, iMin);
        System.arraycopy(this.indexMapStack, 0, mapArr, 0, iMin);
        this.pathStack = strArr;
        this.indexMapStack = mapArr;
        this.capacity = i;
    }

    public Path getPath() {
        if (this.currentPath == null) {
            int i = this.pointer;
            String[] strArr = new String[i + 1];
            strArr[0] = "";
            int i2 = -i;
            while (true) {
                i2++;
                if (i2 > 0) {
                    break;
                }
                strArr[this.pointer + i2] = peekElement(i2);
            }
            this.currentPath = new Path(strArr);
        }
        return this.currentPath;
    }
}
