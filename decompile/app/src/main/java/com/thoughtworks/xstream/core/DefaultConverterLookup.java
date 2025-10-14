package com.thoughtworks.xstream.core;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.ConverterRegistry;
import com.thoughtworks.xstream.core.util.Cloneables;
import com.thoughtworks.xstream.core.util.PrioritizedList;
import com.thoughtworks.xstream.mapper.Mapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class DefaultConverterLookup implements ConverterLookup, ConverterRegistry, Caching {
    public final PrioritizedList converters;
    public Map serializationMap;
    public transient Map typeToConverterMap;

    public DefaultConverterLookup() {
        this(new HashMap());
    }

    public DefaultConverterLookup(Map map) {
        this.converters = new PrioritizedList();
        this.serializationMap = null;
        this.typeToConverterMap = map;
        map.clear();
    }

    public DefaultConverterLookup(Mapper mapper) {
        this();
    }

    @Override // com.thoughtworks.xstream.converters.ConverterLookup
    public Converter lookupConverterForType(Class cls) {
        Converter converter = cls != null ? (Converter) this.typeToConverterMap.get(cls.getName()) : null;
        if (converter != null) {
            return converter;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.converters.iterator();
        while (it.hasNext()) {
            Converter converter2 = (Converter) it.next();
            try {
            } catch (LinkageError e) {
                linkedHashMap.put(converter2.getClass().getName(), e.getMessage());
            } catch (RuntimeException e2) {
                linkedHashMap.put(converter2.getClass().getName(), e2.getMessage());
            }
            if (converter2.canConvert(cls)) {
                if (cls != null) {
                    this.typeToConverterMap.put(cls.getName(), converter2);
                }
                return converter2;
            }
            continue;
        }
        ConversionException conversionException = new ConversionException(linkedHashMap.isEmpty() ? "No converter specified" : "No converter available");
        conversionException.add("type", cls != null ? cls.getName() : "null");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            conversionException.add("converter", entry.getKey().toString());
            conversionException.add(ThrowableDeserializer.PROP_NAME_MESSAGE, entry.getValue().toString());
        }
        throw conversionException;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterRegistry
    public void registerConverter(Converter converter, int i) {
        this.typeToConverterMap.clear();
        this.converters.add(converter, i);
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
        this.typeToConverterMap.clear();
        Iterator it = this.converters.iterator();
        while (it.hasNext()) {
            Converter converter = (Converter) it.next();
            if (converter instanceof Caching) {
                ((Caching) converter).flushCache();
            }
        }
    }

    public final Object writeReplace() {
        Map map = (Map) Cloneables.cloneIfPossible(this.typeToConverterMap);
        this.serializationMap = map;
        map.clear();
        return this;
    }

    private Object readResolve() {
        Map map = this.serializationMap;
        if (map == null) {
            map = new HashMap();
        }
        this.typeToConverterMap = map;
        this.serializationMap = null;
        return this;
    }
}
