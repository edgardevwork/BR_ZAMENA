package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.mapper.DefaultMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class JavaFieldConverter implements Converter {
    public static /* synthetic */ Class class$java$lang$reflect$Field;
    public final SingleValueConverter javaClassConverter;
    public final Mapper mapper;

    public JavaFieldConverter(ClassLoaderReference classLoaderReference) {
        this(new JavaClassConverter(classLoaderReference), new DefaultMapper(classLoaderReference));
    }

    public JavaFieldConverter(ClassLoader classLoader) {
        this(new ClassLoaderReference(classLoader));
    }

    public JavaFieldConverter(SingleValueConverter singleValueConverter, Mapper mapper) {
        this.javaClassConverter = singleValueConverter;
        this.mapper = mapper;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$lang$reflect$Field;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.reflect.Field");
            class$java$lang$reflect$Field = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Field field = (Field) obj;
        Class<?> declaringClass = field.getDeclaringClass();
        hierarchicalStreamWriter.startNode("name");
        hierarchicalStreamWriter.setValue(this.mapper.serializedMember(declaringClass, field.getName()));
        hierarchicalStreamWriter.endNode();
        hierarchicalStreamWriter.startNode("clazz");
        hierarchicalStreamWriter.setValue(this.javaClassConverter.toString(declaringClass));
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String value = null;
        String value2 = null;
        while (true) {
            if ((value != null && value2 != null) || !hierarchicalStreamReader.hasMoreChildren()) {
                break;
            }
            hierarchicalStreamReader.moveDown();
            if (hierarchicalStreamReader.getNodeName().equals("name")) {
                value = hierarchicalStreamReader.getValue();
            } else if (hierarchicalStreamReader.getNodeName().equals("clazz")) {
                value2 = hierarchicalStreamReader.getValue();
            }
            hierarchicalStreamReader.moveUp();
        }
        Class cls = (Class) this.javaClassConverter.fromString(value2);
        try {
            return cls.getDeclaredField(this.mapper.realMember(cls, value));
        } catch (NoSuchFieldException e) {
            throw new ConversionException(e);
        }
    }
}
