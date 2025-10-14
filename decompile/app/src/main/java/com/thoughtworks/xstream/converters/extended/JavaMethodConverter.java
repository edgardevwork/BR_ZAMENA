package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class JavaMethodConverter implements Converter {
    public static /* synthetic */ Class class$java$lang$reflect$Constructor;
    public static /* synthetic */ Class class$java$lang$reflect$Method;
    public final SingleValueConverter javaClassConverter;

    public JavaMethodConverter(ClassLoaderReference classLoaderReference) {
        this(new JavaClassConverter(classLoaderReference));
    }

    public JavaMethodConverter(ClassLoader classLoader) {
        this(new ClassLoaderReference(classLoader));
    }

    public JavaMethodConverter(SingleValueConverter singleValueConverter) {
        this.javaClassConverter = singleValueConverter;
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
        Class clsClass$ = class$java$lang$reflect$Method;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.reflect.Method");
            class$java$lang$reflect$Method = clsClass$;
        }
        if (cls != clsClass$) {
            Class clsClass$2 = class$java$lang$reflect$Constructor;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.lang.reflect.Constructor");
                class$java$lang$reflect$Constructor = clsClass$2;
            }
            if (cls != clsClass$2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        if (obj instanceof Method) {
            Method method = (Method) obj;
            marshalMethod(hierarchicalStreamWriter, this.javaClassConverter.toString(method.getDeclaringClass()), method.getName(), method.getParameterTypes());
        } else {
            Constructor constructor = (Constructor) obj;
            marshalMethod(hierarchicalStreamWriter, this.javaClassConverter.toString(constructor.getDeclaringClass()), null, constructor.getParameterTypes());
        }
    }

    public final void marshalMethod(HierarchicalStreamWriter hierarchicalStreamWriter, String str, String str2, Class[] clsArr) {
        hierarchicalStreamWriter.startNode("class");
        hierarchicalStreamWriter.setValue(str);
        hierarchicalStreamWriter.endNode();
        if (str2 != null) {
            hierarchicalStreamWriter.startNode("name");
            hierarchicalStreamWriter.setValue(str2);
            hierarchicalStreamWriter.endNode();
        }
        hierarchicalStreamWriter.startNode("parameter-types");
        for (Class cls : clsArr) {
            hierarchicalStreamWriter.startNode("class");
            hierarchicalStreamWriter.setValue(this.javaClassConverter.toString(cls));
            hierarchicalStreamWriter.endNode();
        }
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        String value;
        try {
            Class requiredType = unmarshallingContext.getRequiredType();
            Class clsClass$ = class$java$lang$reflect$Method;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.reflect.Method");
                class$java$lang$reflect$Method = clsClass$;
            }
            boolean zEquals = requiredType.equals(clsClass$);
            hierarchicalStreamReader.moveDown();
            Class cls = (Class) this.javaClassConverter.fromString(hierarchicalStreamReader.getValue());
            hierarchicalStreamReader.moveUp();
            if (zEquals) {
                hierarchicalStreamReader.moveDown();
                value = hierarchicalStreamReader.getValue();
                hierarchicalStreamReader.moveUp();
            } else {
                value = null;
            }
            hierarchicalStreamReader.moveDown();
            ArrayList arrayList = new ArrayList();
            while (hierarchicalStreamReader.hasMoreChildren()) {
                hierarchicalStreamReader.moveDown();
                arrayList.add(this.javaClassConverter.fromString(hierarchicalStreamReader.getValue()));
                hierarchicalStreamReader.moveUp();
            }
            Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
            hierarchicalStreamReader.moveUp();
            if (zEquals) {
                return cls.getDeclaredMethod(value, clsArr);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            throw new ConversionException(e);
        }
    }
}
