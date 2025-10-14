package com.thoughtworks.xstream.core.util;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.ErrorWritingException;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.core.Caching;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class SerializationMembers implements Caching {
    public static final Object[] EMPTY_ARGS;
    public static final Class[] EMPTY_CLASSES;
    public static final Map NO_FIELDS;
    public static final Method NO_METHOD;
    public static final FastField[] OBJECT_TYPE_FIELDS;
    public static final int PERSISTENT_FIELDS_MODIFIER = 26;
    public static /* synthetic */ Class class$java$io$ObjectInputStream;
    public static /* synthetic */ Class class$java$io$ObjectOutputStream;
    public static /* synthetic */ Class class$java$lang$Object;
    public Map declaredCache = Collections.synchronizedMap(new HashMap());
    public Map resRepCache = Collections.synchronizedMap(new HashMap());
    public final Map fieldCache = Collections.synchronizedMap(new HashMap());

    public SerializationMembers() {
        int i = 0;
        while (true) {
            FastField[] fastFieldArr = OBJECT_TYPE_FIELDS;
            if (i >= fastFieldArr.length) {
                break;
            }
            this.declaredCache.put(fastFieldArr[i], NO_METHOD);
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.resRepCache.put(OBJECT_TYPE_FIELDS[i2], NO_METHOD);
        }
    }

    static {
        new Object() { // from class: com.thoughtworks.xstream.core.util.SerializationMembers.1
            public final void noMethod() {
            }
        };
        NO_METHOD = C86451.class.getDeclaredMethods()[0];
        EMPTY_ARGS = new Object[0];
        EMPTY_CLASSES = new Class[0];
        NO_FIELDS = Collections.EMPTY_MAP;
        Class clsClass$ = class$java$lang$Object;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Object");
            class$java$lang$Object = clsClass$;
        }
        FastField fastField = new FastField(clsClass$, "readResolve");
        Class clsClass$2 = class$java$lang$Object;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.lang.Object");
            class$java$lang$Object = clsClass$2;
        }
        FastField fastField2 = new FastField(clsClass$2, "writeReplace");
        Class clsClass$3 = class$java$lang$Object;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.lang.Object");
            class$java$lang$Object = clsClass$3;
        }
        FastField fastField3 = new FastField(clsClass$3, "readObject");
        Class clsClass$4 = class$java$lang$Object;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.lang.Object");
            class$java$lang$Object = clsClass$4;
        }
        OBJECT_TYPE_FIELDS = new FastField[]{fastField, fastField2, fastField3, new FastField(clsClass$4, "writeObject")};
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public Object callReadResolve(Object obj) throws NoSuchMethodException, SecurityException {
        ErrorWritingException conversionException;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        Method rRMethod = getRRMethod(cls, "readResolve");
        if (rRMethod == null) {
            return obj;
        }
        try {
            return rRMethod.invoke(obj, EMPTY_ARGS);
        } catch (IllegalAccessException e) {
            conversionException = new ObjectAccessException("Cannot access method", e);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls.getName());
            stringBuffer.append(".readResolve()");
            conversionException.add(FirebaseAnalytics.Param.METHOD, stringBuffer.toString());
            throw conversionException;
        } catch (InvocationTargetException e2) {
            conversionException = new ConversionException("Failed calling method", e2.getTargetException());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(cls.getName());
            stringBuffer2.append(".readResolve()");
            conversionException.add(FirebaseAnalytics.Param.METHOD, stringBuffer2.toString());
            throw conversionException;
        }
    }

    public Object callWriteReplace(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ErrorWritingException conversionException;
        ErrorWritingException e;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        Method rRMethod = getRRMethod(cls, "writeReplace");
        if (rRMethod == null) {
            return obj;
        }
        try {
            Object objInvoke = rRMethod.invoke(obj, EMPTY_ARGS);
            return (objInvoke == null || obj.getClass().equals(objInvoke.getClass())) ? objInvoke : callWriteReplace(objInvoke);
        } catch (ErrorWritingException e2) {
            e = e2;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls.getName());
            stringBuffer.append(".writeReplace()");
            e.add(FirebaseAnalytics.Param.METHOD, stringBuffer.toString());
            throw e;
        } catch (IllegalAccessException e3) {
            conversionException = new ObjectAccessException("Cannot access method", e3);
            e = conversionException;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(cls.getName());
            stringBuffer2.append(".writeReplace()");
            e.add(FirebaseAnalytics.Param.METHOD, stringBuffer2.toString());
            throw e;
        } catch (InvocationTargetException e4) {
            conversionException = new ConversionException("Failed calling method", e4.getTargetException());
            e = conversionException;
            StringBuffer stringBuffer22 = new StringBuffer();
            stringBuffer22.append(cls.getName());
            stringBuffer22.append(".writeReplace()");
            e.add(FirebaseAnalytics.Param.METHOD, stringBuffer22.toString());
            throw e;
        }
    }

    public boolean supportsReadObject(Class cls, boolean z) throws Throwable {
        Class clsClass$ = class$java$io$ObjectInputStream;
        if (clsClass$ == null) {
            clsClass$ = class$("java.io.ObjectInputStream");
            class$java$io$ObjectInputStream = clsClass$;
        }
        return getMethod(cls, "readObject", new Class[]{clsClass$}, z) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.thoughtworks.xstream.converters.ErrorWritingException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void callReadObject(Class cls, Object obj, ObjectInputStream objectInputStream) throws Throwable {
        Throwable conversionException;
        ?? r4;
        try {
            Class clsClass$ = class$java$io$ObjectInputStream;
            if (clsClass$ == null) {
                clsClass$ = class$("java.io.ObjectInputStream");
                class$java$io$ObjectInputStream = clsClass$;
            }
            getMethod(cls, "readObject", new Class[]{clsClass$}, false).invoke(obj, objectInputStream);
            r4 = 0;
        } catch (IllegalAccessException e) {
            conversionException = new ObjectAccessException("Cannot access method", e);
            r4 = conversionException;
            if (r4 == 0) {
            }
        } catch (InvocationTargetException e2) {
            conversionException = new ConversionException("Failed calling method", e2.getTargetException());
            r4 = conversionException;
            if (r4 == 0) {
            }
        }
        if (r4 == 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(".readObject()");
        r4.add(FirebaseAnalytics.Param.METHOD, stringBuffer.toString());
        throw r4;
    }

    public boolean supportsWriteObject(Class cls, boolean z) throws Throwable {
        Class clsClass$ = class$java$io$ObjectOutputStream;
        if (clsClass$ == null) {
            clsClass$ = class$("java.io.ObjectOutputStream");
            class$java$io$ObjectOutputStream = clsClass$;
        }
        return getMethod(cls, "writeObject", new Class[]{clsClass$}, z) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.thoughtworks.xstream.converters.ErrorWritingException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void callWriteObject(Class cls, Object obj, ObjectOutputStream objectOutputStream) throws Throwable {
        Throwable conversionException;
        ?? r4;
        try {
            Class clsClass$ = class$java$io$ObjectOutputStream;
            if (clsClass$ == null) {
                clsClass$ = class$("java.io.ObjectOutputStream");
                class$java$io$ObjectOutputStream = clsClass$;
            }
            getMethod(cls, "writeObject", new Class[]{clsClass$}, false).invoke(obj, objectOutputStream);
            r4 = 0;
        } catch (IllegalAccessException e) {
            conversionException = new ObjectAccessException("Cannot access method", e);
            r4 = conversionException;
            if (r4 == 0) {
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof ConversionException) {
                throw ((ConversionException) targetException);
            }
            conversionException = new ConversionException("Failed calling method", e2.getTargetException());
            r4 = conversionException;
            if (r4 == 0) {
            }
        }
        if (r4 == 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(".writeObject()");
        r4.add(FirebaseAnalytics.Param.METHOD, stringBuffer.toString());
        throw r4;
    }

    public final Method getMethod(Class cls, String str, Class[] clsArr, boolean z) throws NoSuchMethodException, SecurityException {
        Method method = getMethod(cls, str, clsArr);
        if (method == NO_METHOD || !(z || method.getDeclaringClass().equals(cls))) {
            return null;
        }
        return method;
    }

    public final Method getMethod(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        FastField fastField = new FastField(cls, str);
        Method method = (Method) this.declaredCache.get(fastField);
        if (method == null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                method = getMethod(cls.getSuperclass(), str, clsArr);
            }
            this.declaredCache.put(fastField, method);
        }
        return method;
    }

    public final Method getRRMethod(Class cls, String str) throws NoSuchMethodException, SecurityException {
        Method method;
        FastField fastField = new FastField(cls, str);
        Method method2 = (Method) this.resRepCache.get(fastField);
        if (method2 == null) {
            Method method3 = getMethod(cls, str, EMPTY_CLASSES, true);
            if (method3 == null || method3.getDeclaringClass() == cls) {
                if (method3 == null) {
                    method = NO_METHOD;
                    method2 = method;
                }
                method2 = method3;
            } else {
                if ((method3.getModifiers() & 5) == 0 && ((method3.getModifiers() & 2) > 0 || cls.getPackage() != method3.getDeclaringClass().getPackage())) {
                    method = NO_METHOD;
                    method2 = method;
                }
                method2 = method3;
            }
            this.resRepCache.put(fastField, method2);
        }
        if (method2 == NO_METHOD) {
            return null;
        }
        return method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map getSerializablePersistentFields(Class cls) throws NoSuchFieldException, SecurityException {
        Map map;
        IllegalAccessException e;
        ClassCastException e2;
        ErrorWritingException objectAccessException;
        if (cls == null) {
            return null;
        }
        Map map2 = (Map) this.fieldCache.get(cls.getName());
        if (map2 == null) {
            try {
                Field declaredField = cls.getDeclaredField("serialPersistentFields");
                if ((declaredField.getModifiers() & 26) == 26) {
                    declaredField.setAccessible(true);
                    ObjectStreamField[] objectStreamFieldArr = (ObjectStreamField[]) declaredField.get(null);
                    if (objectStreamFieldArr != null) {
                        map = new HashMap();
                        for (int i = 0; i < objectStreamFieldArr.length; i++) {
                            try {
                                map.put(objectStreamFieldArr[i].getName(), objectStreamFieldArr[i]);
                            } catch (ClassCastException e3) {
                                e2 = e3;
                                objectAccessException = new ConversionException("Incompatible field type", e2);
                                map2 = map;
                                if (objectAccessException != null) {
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                objectAccessException = new ObjectAccessException("Cannot get field", e);
                                map2 = map;
                                if (objectAccessException != null) {
                                }
                            } catch (NoSuchFieldException unused) {
                            }
                        }
                        map2 = map;
                    }
                }
            } catch (ClassCastException e5) {
                map = map2;
                e2 = e5;
            } catch (IllegalAccessException e6) {
                map = map2;
                e = e6;
            } catch (NoSuchFieldException unused2) {
            }
            objectAccessException = null;
            if (objectAccessException != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(cls.getName());
                stringBuffer.append(".serialPersistentFields");
                objectAccessException.add(SerializableConverter.ELEMENT_FIELD, stringBuffer.toString());
                throw objectAccessException;
            }
            if (map2 == null) {
                map2 = NO_FIELDS;
            }
            this.fieldCache.put(cls.getName(), map2);
        }
        if (map2 == NO_FIELDS) {
            return null;
        }
        return map2;
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
        Set setKeySet = this.declaredCache.keySet();
        FastField[] fastFieldArr = OBJECT_TYPE_FIELDS;
        setKeySet.retainAll(Arrays.asList(fastFieldArr));
        this.resRepCache.keySet().retainAll(Arrays.asList(fastFieldArr));
    }
}
