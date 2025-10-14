package com.thoughtworks.xstream.converters.collections;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.SecurityUtils;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class CollectionConverter extends AbstractCollectionConverter {
    public static /* synthetic */ Class class$java$util$ArrayList;
    public static /* synthetic */ Class class$java$util$Collection;
    public static /* synthetic */ Class class$java$util$HashSet;
    public static /* synthetic */ Class class$java$util$LinkedHashSet;
    public static /* synthetic */ Class class$java$util$LinkedList;
    public static /* synthetic */ Class class$java$util$Vector;
    public final Class type;

    public CollectionConverter(Mapper mapper) {
        this(mapper, null);
    }

    public CollectionConverter(Mapper mapper, Class cls) throws Throwable {
        super(mapper);
        this.type = cls;
        if (cls != null) {
            Class clsClass$ = class$java$util$Collection;
            if (clsClass$ == null) {
                clsClass$ = class$("java.util.Collection");
                class$java$util$Collection = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls);
            stringBuffer.append(" not of type ");
            Class clsClass$2 = class$java$util$Collection;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.Collection");
                class$java$util$Collection = clsClass$2;
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
        Class clsClass$ = class$java$util$ArrayList;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.ArrayList");
            class$java$util$ArrayList = clsClass$;
        }
        if (!cls.equals(clsClass$)) {
            Class clsClass$2 = class$java$util$HashSet;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.HashSet");
                class$java$util$HashSet = clsClass$2;
            }
            if (!cls.equals(clsClass$2)) {
                Class clsClass$3 = class$java$util$LinkedList;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("java.util.LinkedList");
                    class$java$util$LinkedList = clsClass$3;
                }
                if (!cls.equals(clsClass$3)) {
                    Class clsClass$4 = class$java$util$Vector;
                    if (clsClass$4 == null) {
                        clsClass$4 = class$("java.util.Vector");
                        class$java$util$Vector = clsClass$4;
                    }
                    if (!cls.equals(clsClass$4)) {
                        Class clsClass$5 = class$java$util$LinkedHashSet;
                        if (clsClass$5 == null) {
                            clsClass$5 = class$("java.util.LinkedHashSet");
                            class$java$util$LinkedHashSet = clsClass$5;
                        }
                        if (!cls.equals(clsClass$5)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            writeCompleteItem(it.next(), marshallingContext, hierarchicalStreamWriter);
        }
    }

    @Override // com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Collection collection = (Collection) createCollection(unmarshallingContext.getRequiredType());
        populateCollection(hierarchicalStreamReader, unmarshallingContext, collection);
        return collection;
    }

    public void populateCollection(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Collection collection) {
        populateCollection(hierarchicalStreamReader, unmarshallingContext, collection, collection);
    }

    public void populateCollection(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Collection collection, Collection collection2) {
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            addCurrentElementToCollection(hierarchicalStreamReader, unmarshallingContext, collection, collection2);
            hierarchicalStreamReader.moveUp();
        }
    }

    public void addCurrentElementToCollection(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, Collection collection, Collection collection2) {
        Object item = readItem(hierarchicalStreamReader, unmarshallingContext, collection);
        long jCurrentTimeMillis = System.currentTimeMillis();
        collection2.add(item);
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
