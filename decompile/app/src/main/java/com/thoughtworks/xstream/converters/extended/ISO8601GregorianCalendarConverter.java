package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.core.JVM;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class ISO8601GregorianCalendarConverter extends AbstractSingleValueConverter {
    public static final Class[] EMPTY_CLASS_ARRAY = new Class[0];
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    public static /* synthetic */ Class class$java$util$GregorianCalendar;
    public final SingleValueConverter converter;

    public ISO8601GregorianCalendarConverter() {
        SingleValueConverter singleValueConverter;
        try {
            singleValueConverter = (SingleValueConverter) JVM.loadClassForName(JVM.isVersion(8) ? "com.thoughtworks.xstream.core.util.ISO8601JavaTimeConverter" : "com.thoughtworks.xstream.core.util.ISO8601JodaTimeConverter").getDeclaredConstructor(EMPTY_CLASS_ARRAY).newInstance(EMPTY_OBJECT_ARRAY);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            singleValueConverter = null;
        }
        this.converter = singleValueConverter;
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
        if (this.converter != null) {
            Class clsClass$ = class$java$util$GregorianCalendar;
            if (clsClass$ == null) {
                clsClass$ = class$("java.util.GregorianCalendar");
                class$java$util$GregorianCalendar = clsClass$;
            }
            if (cls == clsClass$) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return this.converter.fromString(str);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return this.converter.toString(obj);
    }
}
