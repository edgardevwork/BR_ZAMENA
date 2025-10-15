package com.thoughtworks.xstream.converters.javabean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/* loaded from: classes5.dex */
public class BeanProperty {
    public static final Object[] EMPTY_ARGS = new Object[0];
    public Method getter;
    public Class memberClass;
    public String propertyName;
    public Method setter;
    public Class type;

    public BeanProperty(Class cls, String str, Class cls2) {
        this.memberClass = cls;
        this.propertyName = str;
        this.type = cls2;
    }

    public Class getBeanClass() {
        return this.memberClass;
    }

    public Class getType() {
        return this.type;
    }

    public String getName() {
        return this.propertyName;
    }

    public boolean isReadable() {
        return this.getter != null;
    }

    public boolean isWritable() {
        return this.setter != null;
    }

    public Object get(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (!isReadable()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Property ");
            stringBuffer.append(this.propertyName);
            stringBuffer.append(" of ");
            stringBuffer.append(this.memberClass);
            stringBuffer.append(" not readable");
            throw new IllegalStateException(stringBuffer.toString());
        }
        try {
            return this.getter.invoke(obj, EMPTY_ARGS);
        } catch (InvocationTargetException e) {
            throw new UndeclaredThrowableException(e.getTargetException());
        }
    }

    public Object set(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        if (!isWritable()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Property ");
            stringBuffer.append(this.propertyName);
            stringBuffer.append(" of ");
            stringBuffer.append(this.memberClass);
            stringBuffer.append(" not writable");
            throw new IllegalStateException(stringBuffer.toString());
        }
        try {
            return this.setter.invoke(obj, obj2);
        } catch (InvocationTargetException e) {
            throw new UndeclaredThrowableException(e.getTargetException());
        }
    }

    public void setGetterMethod(Method method) {
        this.getter = method;
    }

    public void setSetterMethod(Method method) {
        this.setter = method;
    }
}
