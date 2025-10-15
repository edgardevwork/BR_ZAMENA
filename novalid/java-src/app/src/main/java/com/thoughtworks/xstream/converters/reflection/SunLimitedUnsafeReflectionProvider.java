package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.ErrorWritingException;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public class SunLimitedUnsafeReflectionProvider extends PureJavaReflectionProvider {
    public static /* synthetic */ Class class$java$lang$Void;
    public static /* synthetic */ Class class$sun$misc$Unsafe;
    public static final Exception exception;
    public static final Unsafe unsafe;

    @Override // com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider
    public void validateFieldAccess(Field field) {
    }

    static {
        Unsafe unsafe2;
        Exception exc = null;
        try {
            Class clsClass$ = class$sun$misc$Unsafe;
            if (clsClass$ == null) {
                clsClass$ = class$("sun.misc.Unsafe");
                class$sun$misc$Unsafe = clsClass$;
            }
            Field declaredField = clsClass$.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe2 = (Unsafe) declaredField.get(null);
        } catch (IllegalAccessException e) {
            e = e;
            Exception exc2 = e;
            unsafe2 = null;
            exc = exc2;
            exception = exc;
            unsafe = unsafe2;
        } catch (IllegalArgumentException e2) {
            e = e2;
            Exception exc22 = e;
            unsafe2 = null;
            exc = exc22;
            exception = exc;
            unsafe = unsafe2;
        } catch (NoSuchFieldException e3) {
            e = e3;
            Exception exc222 = e;
            unsafe2 = null;
            exc = exc222;
            exception = exc;
            unsafe = unsafe2;
        } catch (SecurityException e4) {
            e = e4;
            Exception exc2222 = e;
            unsafe2 = null;
            exc = exc2222;
            exception = exc;
            unsafe = unsafe2;
        }
        exception = exc;
        unsafe = unsafe2;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public SunLimitedUnsafeReflectionProvider() {
    }

    public SunLimitedUnsafeReflectionProvider(FieldDictionary fieldDictionary) {
        super(fieldDictionary);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    @Override // com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider, com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object newInstance(Class cls) throws Throwable {
        ErrorWritingException conversionException;
        Exception exc = exception;
        if (exc != null) {
            ObjectAccessException objectAccessException = new ObjectAccessException("Cannot construct type", exc);
            objectAccessException.add("construction-type", cls.getName());
            throw objectAccessException;
        }
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
                    return unsafe.allocateInstance(cls);
                } catch (IllegalArgumentException e) {
                    conversionException = new ObjectAccessException("Cannot construct type", e);
                } catch (InstantiationException e2) {
                    conversionException = new ConversionException("Cannot construct type", e2);
                } catch (SecurityException e3) {
                    conversionException = new ObjectAccessException("Cannot construct type", e3);
                }
            }
        }
        conversionException.add("construction-type", cls.getName());
        throw conversionException;
    }

    private Object readResolve() {
        init();
        return this;
    }
}
