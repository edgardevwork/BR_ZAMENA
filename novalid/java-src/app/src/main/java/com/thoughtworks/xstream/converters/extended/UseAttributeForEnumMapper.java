package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.core.util.DependencyInjectionFactory;
import com.thoughtworks.xstream.mapper.AttributeMapper;
import com.thoughtworks.xstream.mapper.Mapper;

/* loaded from: classes7.dex */
public class UseAttributeForEnumMapper extends AttributeMapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$DefaultMapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper;
    public static /* synthetic */ Class class$java$lang$Object;

    @Override // com.thoughtworks.xstream.mapper.AttributeMapper, com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromAttribute(Class cls, String str, Class cls2) {
        return null;
    }

    @Override // com.thoughtworks.xstream.mapper.AttributeMapper, com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public SingleValueConverter getConverterFromItemType(String str, Class cls, Class cls2) {
        return null;
    }

    public UseAttributeForEnumMapper(Mapper mapper) {
        super(mapper, null, null);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static boolean isEnum(Class cls) throws Throwable {
        while (cls != null) {
            Class clsClass$ = class$java$lang$Object;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Object");
                class$java$lang$Object = clsClass$;
            }
            if (cls == clsClass$) {
                return false;
            }
            if (cls.getName().equals("java.lang.Enum")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.mapper.AttributeMapper
    public boolean shouldLookForSingleValueConverter(String str, Class cls, Class cls2) {
        return isEnum(cls);
    }

    public static Mapper createEnumMapper(Mapper mapper) throws Throwable {
        try {
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper");
                class$com$thoughtworks$xstream$mapper$Mapper = clsClass$;
            }
            Class<?> cls = Class.forName("com.thoughtworks.xstream.mapper.EnumMapper", true, clsClass$.getClassLoader());
            Class clsClass$2 = class$com$thoughtworks$xstream$mapper$DefaultMapper;
            if (clsClass$2 == null) {
                clsClass$2 = class$("com.thoughtworks.xstream.mapper.DefaultMapper");
                class$com$thoughtworks$xstream$mapper$DefaultMapper = clsClass$2;
            }
            return (Mapper) DependencyInjectionFactory.newInstance(cls, new Object[]{new UseAttributeForEnumMapper(mapper.lookupMapperOfType(clsClass$2))});
        } catch (Exception unused) {
            return null;
        }
    }
}
