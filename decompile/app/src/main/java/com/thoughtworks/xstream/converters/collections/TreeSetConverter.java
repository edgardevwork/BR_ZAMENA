package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.core.util.PresortedSet;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public class TreeSetConverter extends CollectionConverter {
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$java$util$SortedMap;
    public static /* synthetic */ Class class$java$util$TreeSet;
    public transient TreeMapConverter treeMapConverter;

    /* JADX WARN: Illegal instructions before constructor call */
    public TreeSetConverter(Mapper mapper) throws Throwable {
        Class clsClass$ = class$java$util$TreeSet;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.TreeSet");
            class$java$util$TreeSet = clsClass$;
        }
        super(mapper, clsClass$);
        readResolve();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.CollectionConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        this.treeMapConverter.marshalComparator(((SortedSet) obj).comparator(), hierarchicalStreamWriter, marshallingContext);
        super.marshal(obj, hierarchicalStreamWriter, marshallingContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.TreeSet] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.TreeSet] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.TreeSet] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.TreeSet] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.thoughtworks.xstream.converters.collections.CollectionConverter, com.thoughtworks.xstream.converters.collections.TreeSetConverter] */
    @Override // com.thoughtworks.xstream.converters.collections.CollectionConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws IllegalAccessException, IllegalArgumentException {
        TreeMap treeMap;
        TreeMap treeMap2;
        TreeMap treeMap3;
        TreeMap treeMap4 = null;
        Comparator comparatorUnmarshalComparator = this.treeMapConverter.unmarshalComparator(hierarchicalStreamReader, unmarshallingContext, null);
        boolean z = comparatorUnmarshalComparator instanceof Mapper.Null;
        Comparator comparator = z ? null : comparatorUnmarshalComparator;
        if (Reflections.sortedMapField != null) {
            ?? treeSet = comparator == null ? new TreeSet() : new TreeSet(comparator);
            try {
                Object obj = Reflections.sortedMapField.get(treeSet);
                if (obj instanceof TreeMap) {
                    treeMap3 = (TreeMap) obj;
                    treeMap4 = treeSet;
                } else {
                    treeMap3 = null;
                }
                TreeMap treeMap5 = treeMap3;
                treeMap = treeMap4;
                treeMap4 = treeMap5;
            } catch (IllegalAccessException e) {
                throw new ObjectAccessException("Cannot get backing map of TreeSet", e);
            }
        } else {
            treeMap = null;
        }
        if (treeMap4 == null) {
            PresortedSet presortedSet = new PresortedSet(comparator);
            ?? treeSet2 = comparator == null ? new TreeSet() : new TreeSet(comparator);
            if (z) {
                addCurrentElementToCollection(hierarchicalStreamReader, unmarshallingContext, treeSet2, presortedSet);
                hierarchicalStreamReader.moveUp();
            }
            populateCollection(hierarchicalStreamReader, unmarshallingContext, treeSet2, presortedSet);
            treeMap2 = treeSet2;
            if (presortedSet.size() > 0) {
                treeSet2.addAll(presortedSet);
                treeMap2 = treeSet2;
            }
        } else {
            this.treeMapConverter.populateTreeMap(hierarchicalStreamReader, unmarshallingContext, treeMap4, comparatorUnmarshalComparator);
            treeMap2 = treeMap;
        }
        return treeMap2;
    }

    private Object readResolve() {
        this.treeMapConverter = new TreeMapConverter(mapper()) { // from class: com.thoughtworks.xstream.converters.collections.TreeSetConverter.1
            @Override // com.thoughtworks.xstream.converters.collections.MapConverter
            public void populateMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map, final Map map2) {
                TreeSetConverter.this.populateCollection(hierarchicalStreamReader, unmarshallingContext, new AbstractList() { // from class: com.thoughtworks.xstream.converters.collections.TreeSetConverter.1.1
                    @Override // java.util.AbstractList, java.util.List
                    public Object get(int i) {
                        return null;
                    }

                    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                    public boolean add(Object obj) {
                        return map2.put(obj, Reflections.constantValue != null ? Reflections.constantValue : obj) != null;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return map2.size();
                    }
                });
            }

            @Override // com.thoughtworks.xstream.converters.collections.MapConverter
            public void putCurrentEntryIntoMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map, Map map2) {
                Object item = readItem(hierarchicalStreamReader, unmarshallingContext, map);
                map2.put(item, item);
            }
        };
        return this;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Object constantValue;
        public static final Field sortedMapField;

        static {
            Field fieldLocate;
            Map map;
            Object[] array;
            Object obj;
            Object obj2 = null;
            if (JVM.hasOptimizedTreeSetAddAll()) {
                Class clsClass$ = TreeSetConverter.class$java$util$TreeSet;
                if (clsClass$ == null) {
                    clsClass$ = TreeSetConverter.class$("java.util.TreeSet");
                    TreeSetConverter.class$java$util$TreeSet = clsClass$;
                }
                Class clsClass$2 = TreeSetConverter.class$java$util$SortedMap;
                if (clsClass$2 == null) {
                    clsClass$2 = TreeSetConverter.class$("java.util.SortedMap");
                    TreeSetConverter.class$java$util$SortedMap = clsClass$2;
                }
                fieldLocate = Fields.locate(clsClass$, clsClass$2, false);
            } else {
                fieldLocate = null;
            }
            sortedMapField = fieldLocate;
            if (fieldLocate != null) {
                TreeSet treeSet = new TreeSet();
                treeSet.add("1");
                treeSet.add("2");
                try {
                    map = (Map) fieldLocate.get(treeSet);
                } catch (IllegalAccessException unused) {
                    map = null;
                }
                if (map != null && (obj = (array = map.values().toArray())[0]) == array[1]) {
                    obj2 = obj;
                }
            } else {
                Class clsClass$3 = TreeSetConverter.class$java$util$TreeSet;
                if (clsClass$3 == null) {
                    clsClass$3 = TreeSetConverter.class$("java.util.TreeSet");
                    TreeSetConverter.class$java$util$TreeSet = clsClass$3;
                }
                Class clsClass$4 = TreeSetConverter.class$java$lang$Object;
                if (clsClass$4 == null) {
                    clsClass$4 = TreeSetConverter.class$("java.lang.Object");
                    TreeSetConverter.class$java$lang$Object = clsClass$4;
                }
                Field fieldLocate2 = Fields.locate(clsClass$3, clsClass$4, true);
                if (fieldLocate2 != null) {
                    try {
                        obj2 = fieldLocate2.get(null);
                    } catch (IllegalAccessException unused2) {
                    }
                }
            }
            constantValue = obj2;
        }
    }
}
