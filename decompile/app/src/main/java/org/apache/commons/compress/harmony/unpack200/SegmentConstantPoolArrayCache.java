package org.apache.commons.compress.harmony.unpack200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class SegmentConstantPoolArrayCache {
    public IdentityHashMap<String[], CachedArray> knownArrays = new IdentityHashMap<>(1000);
    public String[] lastArray;
    public List<Integer> lastIndexes;
    public String lastKey;

    public List<Integer> indexesForArrayKey(String[] strArr, String str) {
        if (!arrayIsCached(strArr)) {
            cacheArray(strArr);
        }
        if (this.lastArray == strArr && this.lastKey == str) {
            return this.lastIndexes;
        }
        this.lastArray = strArr;
        this.lastKey = str;
        List<Integer> listIndexesForKey = this.knownArrays.get(strArr).indexesForKey(str);
        this.lastIndexes = listIndexesForKey;
        return listIndexesForKey;
    }

    public boolean arrayIsCached(String[] strArr) {
        return this.knownArrays.containsKey(strArr) && this.knownArrays.get(strArr).lastKnownSize() == strArr.length;
    }

    public void cacheArray(String[] strArr) {
        if (arrayIsCached(strArr)) {
            throw new IllegalArgumentException("Trying to cache an array that already exists");
        }
        this.knownArrays.put(strArr, new CachedArray(strArr));
        this.lastArray = null;
    }

    public class CachedArray {
        public int lastKnownSize;
        public String[] primaryArray;
        public HashMap<String, List<Integer>> primaryTable;

        public CachedArray(String[] strArr) {
            this.primaryArray = strArr;
            this.lastKnownSize = strArr.length;
            this.primaryTable = new HashMap<>(this.lastKnownSize);
            cacheIndexes();
        }

        public int lastKnownSize() {
            return this.lastKnownSize;
        }

        public List<Integer> indexesForKey(String str) {
            if (!this.primaryTable.containsKey(str)) {
                return Collections.EMPTY_LIST;
            }
            return this.primaryTable.get(str);
        }

        public void cacheIndexes() {
            int i = 0;
            while (true) {
                String[] strArr = this.primaryArray;
                if (i >= strArr.length) {
                    return;
                }
                String str = strArr[i];
                if (!this.primaryTable.containsKey(str)) {
                    this.primaryTable.put(str, new ArrayList());
                }
                this.primaryTable.get(str).add(Integer.valueOf(i));
                i++;
            }
        }
    }
}
