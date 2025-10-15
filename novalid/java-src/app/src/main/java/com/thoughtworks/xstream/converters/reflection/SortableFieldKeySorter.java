package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.core.Caching;
import com.thoughtworks.xstream.core.util.OrderRetainingMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class SortableFieldKeySorter implements FieldKeySorter, Caching {
    public static final FieldKey[] EMPTY_FIELD_KEY_ARRAY = new FieldKey[0];
    public final Map map = new HashMap();

    @Override // com.thoughtworks.xstream.converters.reflection.FieldKeySorter
    public Map sort(Class cls, Map map) {
        if (!this.map.containsKey(cls)) {
            return map;
        }
        OrderRetainingMap orderRetainingMap = new OrderRetainingMap();
        FieldKey[] fieldKeyArr = (FieldKey[]) map.keySet().toArray(EMPTY_FIELD_KEY_ARRAY);
        Arrays.sort(fieldKeyArr, (Comparator) this.map.get(cls));
        for (FieldKey fieldKey : fieldKeyArr) {
            orderRetainingMap.put(fieldKey, map.get(fieldKey));
        }
        return orderRetainingMap;
    }

    public void registerFieldOrder(Class cls, String[] strArr) {
        this.map.put(cls, new FieldComparator(cls, strArr));
    }

    public class FieldComparator implements Comparator {
        public final String[] fieldOrder;
        public final Class type;

        public FieldComparator(Class cls, String[] strArr) {
            this.type = cls;
            this.fieldOrder = strArr;
        }

        public int compare(String str, String str2) {
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            while (true) {
                String[] strArr = this.fieldOrder;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(str)) {
                    i2 = i;
                }
                if (this.fieldOrder[i].equals(str2)) {
                    i3 = i;
                }
                i++;
            }
            if (i2 != -1 && i3 != -1) {
                return i2 - i3;
            }
            ConversionException conversionException = new ConversionException("Incomplete list of serialized fields for type");
            conversionException.add("sort-type", this.type.getName());
            throw conversionException;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return compare(((FieldKey) obj).getFieldName(), ((FieldKey) obj2).getFieldName());
        }
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
        this.map.clear();
    }
}
