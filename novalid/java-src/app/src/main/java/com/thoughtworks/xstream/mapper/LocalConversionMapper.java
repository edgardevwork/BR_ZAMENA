package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.core.util.FastField;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class LocalConversionMapper extends MapperWrapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AttributeMapper;
    public transient AttributeMapper attributeMapper;
    public final Map localConverters;

    public LocalConversionMapper(Mapper mapper) throws Throwable {
        super(mapper);
        this.localConverters = new HashMap();
        readResolve();
    }

    public void registerLocalConverter(Class cls, String str, Converter converter) {
        this.localConverters.put(new FastField(cls, str), converter);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Converter getLocalConverter(Class cls, String str) {
        return (Converter) this.localConverters.get(new FastField(cls, str));
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str, Class cls2) {
        SingleValueConverter localSingleValueConverter = getLocalSingleValueConverter(cls, str, cls2);
        return localSingleValueConverter == null ? super.getConverterFromAttribute(cls, str, cls2) : localSingleValueConverter;
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls, Class cls2) {
        SingleValueConverter localSingleValueConverter = getLocalSingleValueConverter(cls2, str, cls);
        return localSingleValueConverter == null ? super.getConverterFromItemType(str, cls, cls2) : localSingleValueConverter;
    }

    public final SingleValueConverter getLocalSingleValueConverter(Class cls, String str, Class cls2) {
        Converter localConverter;
        AttributeMapper attributeMapper = this.attributeMapper;
        if (attributeMapper == null || !attributeMapper.shouldLookForSingleValueConverter(str, cls2, cls) || (localConverter = getLocalConverter(cls, str)) == null || !(localConverter instanceof SingleValueConverter)) {
            return null;
        }
        return (SingleValueConverter) localConverter;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private Object readResolve() throws Throwable {
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$AttributeMapper;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.AttributeMapper");
            class$com$thoughtworks$xstream$mapper$AttributeMapper = clsClass$;
        }
        this.attributeMapper = (AttributeMapper) lookupMapperOfType(clsClass$);
        return this;
    }
}
