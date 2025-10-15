package com.thoughtworks.xstream.converters.javabean;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.ErrorWritingException;
import com.thoughtworks.xstream.converters.javabean.JavaBeanProvider;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class BeanProvider implements JavaBeanProvider {
    public static final Object[] NO_PARAMS = new Object[0];
    public static /* synthetic */ Class class$java$lang$Void;
    public PropertyDictionary propertyDictionary;

    public interface Visitor extends JavaBeanProvider.Visitor {
    }

    public BeanProvider() {
        this(new PropertyDictionary(new NativePropertySorter()));
    }

    public BeanProvider(Comparator comparator) {
        this(new PropertyDictionary(new ComparingPropertySorter(comparator)));
    }

    public BeanProvider(PropertyDictionary propertyDictionary) {
        this.propertyDictionary = propertyDictionary;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object newInstance(Class cls) throws Throwable {
        ErrorWritingException conversionException;
        if (cls == Void.TYPE) {
            conversionException = new ConversionException("Security alert: Marshalling rejected");
        } else {
            Class clsClass$ = class$java$lang$Void;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Void");
                class$java$lang$Void = clsClass$;
            }
            if (cls != clsClass$) {
                try {
                    return cls.newInstance();
                } catch (ExceptionInInitializerError e) {
                    conversionException = new ConversionException("Cannot construct type", e);
                } catch (IllegalAccessException e2) {
                    conversionException = new ObjectAccessException("Cannot construct type", e2);
                } catch (InstantiationException e3) {
                    conversionException = new ConversionException("Cannot construct type", e3);
                } catch (SecurityException e4) {
                    conversionException = new ObjectAccessException("Cannot construct type", e4);
                }
            }
        }
        conversionException.add("construction-type", cls.getName());
        throw conversionException;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    public void visitSerializableProperties(Object obj, JavaBeanProvider.Visitor visitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ErrorWritingException conversionException;
        for (PropertyDescriptor propertyDescriptor : getSerializableProperties(obj)) {
            try {
                Method readMethod = propertyDescriptor.getReadMethod();
                String name = propertyDescriptor.getName();
                Class<?> declaringClass = readMethod.getDeclaringClass();
                conversionException = null;
                if (visitor.shouldVisit(name, declaringClass)) {
                    visitor.visit(name, propertyDescriptor.getPropertyType(), declaringClass, readMethod.invoke(obj, null));
                }
            } catch (IllegalAccessException e) {
                conversionException = new ObjectAccessException("Cannot access property", e);
            } catch (IllegalArgumentException e2) {
                conversionException = new ConversionException("Cannot get property", e2);
            } catch (InvocationTargetException e3) {
                conversionException = new ConversionException("Cannot get property", e3.getTargetException());
            }
            if (conversionException != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(obj.getClass());
                stringBuffer.append(".");
                stringBuffer.append(propertyDescriptor.getName());
                conversionException.add("property", stringBuffer.toString());
                throw conversionException;
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    public void writeProperty(Object obj, String str, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ErrorWritingException conversionException;
        ErrorWritingException objectAccessException;
        PropertyDescriptor property = getProperty(str, obj.getClass());
        try {
            property.getWriteMethod().invoke(obj, obj2);
            objectAccessException = null;
        } catch (IllegalAccessException e) {
            objectAccessException = new ObjectAccessException("Cannot access property", e);
        } catch (IllegalArgumentException e2) {
            conversionException = new ConversionException("Cannot set property", e2);
            objectAccessException = conversionException;
        } catch (InvocationTargetException e3) {
            conversionException = new ConversionException("Cannot set property", e3.getTargetException());
            objectAccessException = conversionException;
        }
        if (objectAccessException == null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass());
        stringBuffer.append(".");
        stringBuffer.append(property.getName());
        objectAccessException.add("property", stringBuffer.toString());
        throw objectAccessException;
    }

    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    public Class getPropertyType(Object obj, String str) {
        return getProperty(str, obj.getClass()).getPropertyType();
    }

    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    public boolean propertyDefinedInClass(String str, Class cls) {
        return this.propertyDictionary.propertyDescriptorOrNull(cls, str) != null;
    }

    @Override // com.thoughtworks.xstream.converters.javabean.JavaBeanProvider
    public boolean canInstantiate(Class cls) {
        if (cls == null) {
            return false;
        }
        try {
            return newInstance(cls) != null;
        } catch (ErrorWritingException unused) {
            return false;
        }
    }

    public Constructor getDefaultConstrutor(Class cls) throws SecurityException {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length == 0 && Modifier.isPublic(constructor.getModifiers())) {
                return constructor;
            }
        }
        return null;
    }

    public PropertyDescriptor[] getSerializableProperties(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator itPropertiesFor = this.propertyDictionary.propertiesFor(obj.getClass());
        while (itPropertiesFor.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) itPropertiesFor.next();
            if (canStreamProperty(propertyDescriptor)) {
                arrayList.add(propertyDescriptor);
            }
        }
        return (PropertyDescriptor[]) arrayList.toArray(new PropertyDescriptor[arrayList.size()]);
    }

    public boolean canStreamProperty(PropertyDescriptor propertyDescriptor) {
        return (propertyDescriptor.getReadMethod() == null || propertyDescriptor.getWriteMethod() == null) ? false : true;
    }

    public boolean propertyWriteable(String str, Class cls) {
        return getProperty(str, cls).getWriteMethod() != null;
    }

    public PropertyDescriptor getProperty(String str, Class cls) {
        return this.propertyDictionary.propertyDescriptor(cls, str);
    }
}
