package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.SecurityUtils;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Map;

/* loaded from: classes7.dex */
public class MapConverter extends AbstractCollectionConverter {
    public static /* synthetic */ Class class$java$util$HashMap;
    public static /* synthetic */ Class class$java$util$Hashtable;
    public static /* synthetic */ Class class$java$util$Map;
    public static /* synthetic */ Class class$java$util$Map$Entry;
    public final Class type;

    public MapConverter(Mapper mapper) {
        this(mapper, null);
    }

    public MapConverter(Mapper mapper, Class cls) throws Throwable {
        super(mapper);
        this.type = cls;
        if (cls != null) {
            Class clsClass$ = class$java$util$Map;
            if (clsClass$ == null) {
                clsClass$ = class$("java.util.Map");
                class$java$util$Map = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls);
            stringBuffer.append(" not of type ");
            Class clsClass$2 = class$java$util$Map;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.Map");
                class$java$util$Map = clsClass$2;
            }
            stringBuffer.append(clsClass$2);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Object obj = this.type;
        if (obj != null) {
            return cls.equals(obj);
        }
        Class clsClass$ = class$java$util$HashMap;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.HashMap");
            class$java$util$HashMap = clsClass$;
        }
        if (!cls.equals(clsClass$)) {
            Class clsClass$2 = class$java$util$Hashtable;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.Hashtable");
                class$java$util$Hashtable = clsClass$2;
            }
            if (!cls.equals(clsClass$2) && !cls.getName().equals("java.util.LinkedHashMap") && !cls.getName().equals("java.util.concurrent.ConcurrentHashMap") && !cls.getName().equals("sun.font.AttributeMap")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Map map = (Map) obj;
        Mapper mapper = mapper();
        Class clsClass$ = class$java$util$Map$Entry;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.Map$Entry");
            class$java$util$Map$Entry = clsClass$;
        }
        String strSerializedClass = mapper.serializedClass(clsClass$);
        for (Map.Entry entry : map.entrySet()) {
            ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, strSerializedClass, entry.getClass());
            writeCompleteItem(entry.getKey(), marshallingContext, hierarchicalStreamWriter);
            writeCompleteItem(entry.getValue(), marshallingContext, hierarchicalStreamWriter);
            hierarchicalStreamWriter.endNode();
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Map map = (Map) createCollection(unmarshallingContext.getRequiredType());
        populateMap(hierarchicalStreamReader, unmarshallingContext, map);
        return map;
    }

    public void populateMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map) {
        populateMap(hierarchicalStreamReader, unmarshallingContext, map, map);
    }

    public void populateMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map, Map map2) {
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            putCurrentEntryIntoMap(hierarchicalStreamReader, unmarshallingContext, map, map2);
            hierarchicalStreamReader.moveUp();
        }
    }

    public void putCurrentEntryIntoMap(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Map map, Map map2) {
        Object completeItem = readCompleteItem(hierarchicalStreamReader, unmarshallingContext, map);
        Object completeItem2 = readCompleteItem(hierarchicalStreamReader, unmarshallingContext, map);
        long jCurrentTimeMillis = System.currentTimeMillis();
        map2.put(completeItem, completeItem2);
        SecurityUtils.checkForCollectionDoSAttack(unmarshallingContext, jCurrentTimeMillis);
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter
    public Object createCollection(Class cls) {
        Class cls2 = this.type;
        if (cls2 != null) {
            cls = cls2;
        }
        return super.createCollection(cls);
    }
}
