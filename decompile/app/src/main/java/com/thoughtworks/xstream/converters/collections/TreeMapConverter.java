package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.PresortedMap;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public class TreeMapConverter extends MapConverter {
    public static final Comparator NULL_MARKER = new NullComparator();
    public static /* synthetic */ Class class$java$util$Comparator;
    public static /* synthetic */ Class class$java$util$TreeMap;

    /* loaded from: classes8.dex */
    public static final class NullComparator extends Mapper.Null implements Comparator {
        public NullComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TreeMapConverter(Mapper mapper) throws Throwable {
        Class clsClass$ = class$java$util$TreeMap;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.TreeMap");
            class$java$util$TreeMap = clsClass$;
        }
        super(mapper, clsClass$);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        marshalComparator(((SortedMap) obj).comparator(), hierarchicalStreamWriter, marshallingContext);
        super.marshal(obj, hierarchicalStreamWriter, marshallingContext);
    }

    public void marshalComparator(Comparator comparator, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        if (comparator != null) {
            hierarchicalStreamWriter.startNode("comparator");
            hierarchicalStreamWriter.addAttribute(mapper().aliasForSystemAttribute("class"), mapper().serializedClass(comparator.getClass()));
            marshallingContext.convertAnother(comparator);
            hierarchicalStreamWriter.endNode();
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws IllegalAccessException, IllegalArgumentException {
        TreeMap treeMap = Reflections.comparatorField != null ? new TreeMap() : null;
        Comparator comparatorUnmarshalComparator = unmarshalComparator(hierarchicalStreamReader, unmarshallingContext, treeMap);
        if (treeMap == null) {
            treeMap = (comparatorUnmarshalComparator == null || comparatorUnmarshalComparator == NULL_MARKER) ? new TreeMap() : new TreeMap(comparatorUnmarshalComparator);
        }
        populateTreeMap(hierarchicalStreamReader, unmarshallingContext, treeMap, comparatorUnmarshalComparator);
        return treeMap;
    }

    public Comparator unmarshalComparator(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, TreeMap treeMap) {
        Comparator comparator = null;
        if (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            if (hierarchicalStreamReader.getNodeName().equals("comparator")) {
                comparator = (Comparator) unmarshallingContext.convertAnother(treeMap, HierarchicalStreams.readClassType(hierarchicalStreamReader, mapper()));
            } else if (!hierarchicalStreamReader.getNodeName().equals("no-comparator")) {
                return NULL_MARKER;
            }
            hierarchicalStreamReader.moveUp();
        }
        return comparator;
    }

    public void populateTreeMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, TreeMap treeMap, Comparator comparator) throws IllegalAccessException, IllegalArgumentException {
        boolean z = comparator == NULL_MARKER;
        Comparator comparator2 = null;
        if (z) {
            comparator = null;
        }
        if (comparator != null && JVM.hasOptimizedTreeMapPutAll()) {
            comparator2 = comparator;
        }
        PresortedMap presortedMap = new PresortedMap(comparator2);
        if (z) {
            putCurrentEntryIntoMap(hierarchicalStreamReader, unmarshallingContext, treeMap, presortedMap);
            hierarchicalStreamReader.moveUp();
        }
        populateMap(hierarchicalStreamReader, unmarshallingContext, treeMap, presortedMap);
        try {
            if (JVM.hasOptimizedTreeMapPutAll()) {
                if (comparator != null && Reflections.comparatorField != null) {
                    Reflections.comparatorField.set(treeMap, comparator);
                }
                treeMap.putAll(presortedMap);
                return;
            }
            if (Reflections.comparatorField == null) {
                treeMap.putAll(presortedMap);
                return;
            }
            Reflections.comparatorField.set(treeMap, presortedMap.comparator());
            treeMap.putAll(presortedMap);
            Reflections.comparatorField.set(treeMap, comparator);
        } catch (IllegalAccessException e) {
            throw new ObjectAccessException("Cannot set comparator of TreeMap", e);
        }
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Field comparatorField;

        static {
            Class clsClass$ = TreeMapConverter.class$java$util$TreeMap;
            if (clsClass$ == null) {
                clsClass$ = TreeMapConverter.class$("java.util.TreeMap");
                TreeMapConverter.class$java$util$TreeMap = clsClass$;
            }
            Class clsClass$2 = TreeMapConverter.class$java$util$Comparator;
            if (clsClass$2 == null) {
                clsClass$2 = TreeMapConverter.class$("java.util.Comparator");
                TreeMapConverter.class$java$util$Comparator = clsClass$2;
            }
            comparatorField = Fields.locate(clsClass$, clsClass$2, false);
        }
    }
}
