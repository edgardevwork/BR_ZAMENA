package com.thoughtworks.xstream.converters.enums;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.MapConverter;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.EnumMap;

/* loaded from: classes7.dex */
public class EnumMapConverter extends MapConverter {
    public EnumMapConverter(Mapper mapper) {
        super(mapper);
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == EnumMap.class && Reflections.typeField != null;
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Class cls = (Class) Fields.read(Reflections.typeField, obj);
        String strAliasForSystemAttribute = mapper().aliasForSystemAttribute("enum-type");
        if (strAliasForSystemAttribute != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, mapper().serializedClass(cls));
        }
        super.marshal(obj, hierarchicalStreamWriter, marshallingContext);
    }

    @Override // com.thoughtworks.xstream.converters.collections.MapConverter, com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String strAliasForSystemAttribute = mapper().aliasForSystemAttribute("enum-type");
        if (strAliasForSystemAttribute == null) {
            throw new ConversionException("No EnumType specified for EnumMap");
        }
        EnumMap enumMap = new EnumMap(mapper().realClass(hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute)));
        populateMap(hierarchicalStreamReader, unmarshallingContext, enumMap);
        return enumMap;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Field typeField = Fields.locate(EnumMap.class, Class.class, false);
    }
}
