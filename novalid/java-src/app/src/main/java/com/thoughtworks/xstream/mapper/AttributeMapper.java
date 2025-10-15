package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class AttributeMapper extends MapperWrapper {
    public ConverterLookup converterLookup;
    public final Map fieldNameToTypeMap;
    public final Set fieldToUseAsAttribute;
    public ReflectionProvider reflectionProvider;
    public final Set typeSet;

    public AttributeMapper(Mapper mapper) {
        this(mapper, null, null);
    }

    public AttributeMapper(Mapper mapper, ConverterLookup converterLookup, ReflectionProvider reflectionProvider) {
        super(mapper);
        this.fieldNameToTypeMap = new HashMap();
        this.typeSet = new HashSet();
        this.fieldToUseAsAttribute = new HashSet();
        this.converterLookup = converterLookup;
        this.reflectionProvider = reflectionProvider;
    }

    public void setConverterLookup(ConverterLookup converterLookup) {
        this.converterLookup = converterLookup;
    }

    public void addAttributeFor(String str, Class cls) {
        this.fieldNameToTypeMap.put(str, cls);
    }

    public void addAttributeFor(Class cls) {
        this.typeSet.add(cls);
    }

    public final SingleValueConverter getLocalConverterFromItemType(Class cls) {
        Converter converterLookupConverterForType = this.converterLookup.lookupConverterForType(cls);
        if (converterLookupConverterForType == null || !(converterLookupConverterForType instanceof SingleValueConverter)) {
            return null;
        }
        return (SingleValueConverter) converterLookupConverterForType;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls) {
        if (this.fieldNameToTypeMap.get(str) == cls) {
            return getLocalConverterFromItemType(cls);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls, Class cls2) {
        SingleValueConverter localConverterFromItemType;
        return (!shouldLookForSingleValueConverter(str, cls, cls2) || (localConverterFromItemType = getLocalConverterFromItemType(cls)) == null) ? super.getConverterFromItemType(str, cls, cls2) : localConverterFromItemType;
    }

    public boolean shouldLookForSingleValueConverter(String str, Class cls, Class cls2) {
        if (this.typeSet.contains(cls) || this.fieldNameToTypeMap.get(str) == cls) {
            return true;
        }
        if (str == null || cls2 == null) {
            return false;
        }
        Field fieldOrNull = this.reflectionProvider.getFieldOrNull(cls2, str);
        return fieldOrNull != null && this.fieldToUseAsAttribute.contains(fieldOrNull);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(Class cls) {
        if (this.typeSet.contains(cls)) {
            return getLocalConverterFromItemType(cls);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(String str) {
        Class cls = (Class) this.fieldNameToTypeMap.get(str);
        if (cls != null) {
            return getLocalConverterFromItemType(cls);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str) {
        Field fieldOrNull = this.reflectionProvider.getFieldOrNull(cls, str);
        if (fieldOrNull != null) {
            return getConverterFromAttribute(cls, str, fieldOrNull.getType());
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str, Class cls2) {
        SingleValueConverter localConverterFromItemType;
        return (!shouldLookForSingleValueConverter(str, cls2, cls) || (localConverterFromItemType = getLocalConverterFromItemType(cls2)) == null) ? super.getConverterFromAttribute(cls, str, cls2) : localConverterFromItemType;
    }

    public void addAttributeFor(Field field) {
        if (field != null) {
            this.fieldToUseAsAttribute.add(field);
        }
    }

    public void addAttributeFor(Class cls, String str) {
        addAttributeFor(this.reflectionProvider.getField(cls, str));
    }
}
