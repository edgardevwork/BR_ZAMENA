package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import com.thoughtworks.xstream.mapper.DefaultMapper;
import com.thoughtworks.xstream.mapper.Mapper;

/* loaded from: classes7.dex */
public class JavaClassConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Class;
    public Mapper mapper;

    public JavaClassConverter(ClassLoaderReference classLoaderReference) {
        this(new DefaultMapper(classLoaderReference));
    }

    public JavaClassConverter(ClassLoader classLoader) {
        this(new ClassLoaderReference(classLoader));
    }

    public JavaClassConverter(Mapper mapper) {
        this.mapper = mapper;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$lang$Class;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Class");
            class$java$lang$Class = clsClass$;
        }
        return clsClass$.equals(cls);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return this.mapper.serializedClass((Class) obj);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        try {
            return this.mapper.realClass(str);
        } catch (CannotResolveClassException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Cannot load java class ");
            stringBuffer.append(str);
            throw new ConversionException(stringBuffer.toString(), e.getCause());
        }
    }
}
