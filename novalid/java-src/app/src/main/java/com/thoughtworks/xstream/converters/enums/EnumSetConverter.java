package com.thoughtworks.xstream.converters.enums;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class EnumSetConverter implements Converter {
    public final Mapper mapper;

    public EnumSetConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return (cls == null || !EnumSet.class.isAssignableFrom(cls) || Reflections.typeField == null) ? false : true;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        EnumSet enumSet = (EnumSet) obj;
        Class cls = (Class) Fields.read(Reflections.typeField, enumSet);
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("enum-type");
        if (strAliasForSystemAttribute != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(cls));
        }
        hierarchicalStreamWriter.setValue(joinEnumValues(enumSet));
    }

    public final String joinEnumValues(EnumSet enumSet) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = enumSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            if (z) {
                stringBuffer.append(',');
            } else {
                z = true;
            }
            stringBuffer.append(r2.name());
        }
        return stringBuffer.toString();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("enum-type");
        if (strAliasForSystemAttribute == null) {
            throw new ConversionException("No EnumType specified for EnumSet");
        }
        Class clsRealClass = this.mapper.realClass(hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute));
        EnumSet enumSetNoneOf = EnumSet.noneOf(clsRealClass);
        for (String str : hierarchicalStreamReader.getValue().split(",")) {
            if (str.length() > 0) {
                enumSetNoneOf.add(Enum.valueOf(clsRealClass, str));
            }
        }
        return enumSetNoneOf;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Field typeField = Fields.locate(EnumSet.class, Class.class, false);
    }
}
