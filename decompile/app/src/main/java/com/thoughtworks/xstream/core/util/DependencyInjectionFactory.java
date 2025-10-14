package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public class DependencyInjectionFactory {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$util$TypedNull;

    public static Object newInstance(Class cls, Object[] objArr) {
        return newInstance(cls, objArr, null);
    }

    public static Object newInstance(Class cls, Object[] objArr, BitSet bitSet) throws Throwable {
        long j;
        Constructor<?> constructor;
        long j2;
        Throwable e;
        Object objNewInstance;
        int i;
        Constructor<?> constructor2;
        Constructor<?> constructor3;
        Class cls2;
        Class cls3;
        Object[] objArr2 = objArr;
        if (objArr2 != null && objArr2.length > 63) {
            throw new IllegalArgumentException("More than 63 arguments are not supported");
        }
        ArrayList arrayList = new ArrayList();
        if (objArr2 == null || objArr2.length <= 0) {
            j = 1;
            constructor = null;
            j2 = 0;
        } else {
            Constructor<?>[] constructors = cls.getConstructors();
            if (constructors.length > 1) {
                Arrays.sort(constructors, new Comparator() { // from class: com.thoughtworks.xstream.core.util.DependencyInjectionFactory.1
                    @Override // java.util.Comparator
                    public int compare(Object obj, Object obj2) {
                        return ((Constructor) obj2).getParameterTypes().length - ((Constructor) obj).getParameterTypes().length;
                    }
                });
            }
            int length = objArr2.length;
            TypedValue[] typedValueArr = new TypedValue[length];
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                Object obj = objArr2[i2];
                Class type = obj.getClass();
                if (type.isPrimitive()) {
                    type = Primitives.box(type);
                } else {
                    Class clsClass$ = class$com$thoughtworks$xstream$core$util$TypedNull;
                    if (clsClass$ == null) {
                        clsClass$ = class$("com.thoughtworks.xstream.core.util.TypedNull");
                        class$com$thoughtworks$xstream$core$util$TypedNull = clsClass$;
                    }
                    if (type == clsClass$) {
                        type = ((TypedNull) obj).getType();
                        obj = null;
                    }
                }
                typedValueArr[i2] = new TypedValue(type, obj);
            }
            int length2 = Integer.MAX_VALUE;
            Constructor<?> constructor4 = null;
            int i3 = 0;
            Constructor<?> constructor5 = null;
            List list = null;
            j2 = 0;
            long j3 = 0;
            while (true) {
                if (constructor4 != null || i3 >= constructors.length) {
                    break;
                }
                constructor = constructors[i3];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length <= objArr2.length) {
                    if (parameterTypes.length == 0) {
                        j = constructor5 == null ? 1L : 1L;
                    } else {
                        if (length2 > parameterTypes.length) {
                            if (constructor5 == null) {
                                length2 = parameterTypes.length;
                            }
                        }
                        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
                            if (parameterTypes[i4].isPrimitive()) {
                                parameterTypes[i4] = Primitives.box(parameterTypes[i4]);
                            }
                        }
                        arrayList.clear();
                        int i5 = 0;
                        int i6 = 0;
                        j2 = 0;
                        while (i5 < parameterTypes.length && (parameterTypes.length + i6) - i5 <= length) {
                            i = length2;
                            if (parameterTypes[i5].isAssignableFrom(typedValueArr[i6].type)) {
                                arrayList.add(typedValueArr[i6].value);
                                j2 |= 1 << i6;
                                i5++;
                                if (i5 == parameterTypes.length) {
                                    constructor4 = constructor;
                                    break;
                                }
                            }
                            i6++;
                            length2 = i;
                        }
                        i = length2;
                        if (constructor4 == null) {
                            TypedValue[] typedValueArr2 = new TypedValue[length];
                            int i7 = 0;
                            System.arraycopy(typedValueArr, 0, typedValueArr2, 0, length);
                            arrayList.clear();
                            int i8 = 0;
                            j2 = 0;
                            while (true) {
                                if (i8 < parameterTypes.length) {
                                    int i9 = -1;
                                    while (true) {
                                        constructor2 = constructor4;
                                        if (i7 >= length) {
                                            constructor3 = constructor;
                                            break;
                                        }
                                        TypedValue typedValue = typedValueArr2[i7];
                                        if (typedValue == null) {
                                            constructor3 = constructor;
                                        } else {
                                            Class<?> cls4 = typedValue.type;
                                            constructor3 = constructor;
                                            Class<?> cls5 = parameterTypes[i8];
                                            if (cls4 == cls5) {
                                                i9 = i7;
                                                break;
                                            }
                                            if (cls5.isAssignableFrom(cls4) && (i9 < 0 || ((cls2 = typedValueArr2[i9].type) != (cls3 = typedValueArr2[i7].type) && cls2.isAssignableFrom(cls3)))) {
                                                i9 = i7;
                                            }
                                        }
                                        i7++;
                                        constructor4 = constructor2;
                                        constructor = constructor3;
                                    }
                                    if (i9 < 0) {
                                        break;
                                    }
                                    arrayList.add(typedValueArr2[i9].value);
                                    j2 |= 1 << i9;
                                    typedValueArr2[i9] = null;
                                    i8++;
                                    constructor4 = constructor2;
                                    constructor = constructor3;
                                    i7 = 0;
                                } else {
                                    constructor2 = constructor4;
                                    Constructor<?> constructor6 = constructor;
                                    if (constructor5 == null || j2 < j3) {
                                        list = (List) arrayList.clone();
                                        j3 = j2;
                                        length2 = i;
                                        constructor4 = constructor2;
                                        constructor5 = constructor6;
                                    }
                                }
                            }
                            length2 = i;
                            constructor4 = constructor2;
                        } else {
                            length2 = i;
                        }
                    }
                }
                i3++;
                objArr2 = objArr;
            }
            constructor = constructor4;
            if (constructor == null) {
                if (constructor5 == null) {
                    ObjectAccessException objectAccessException = new ObjectAccessException("Cannot construct type, none of the arguments match any constructor's parameters");
                    objectAccessException.add("construction-type", cls.getName());
                    throw objectAccessException;
                }
                arrayList.clear();
                arrayList.addAll(list);
                constructor = constructor5;
                j2 = j3;
            }
        }
        try {
            if (constructor == null) {
                objNewInstance = cls.newInstance();
            } else {
                objNewInstance = constructor.newInstance(arrayList.toArray());
            }
            if (bitSet != null) {
                bitSet.clear();
                long j4 = j;
                int i10 = 0;
                while (j4 < j2) {
                    if ((j2 & j4) > 0) {
                        bitSet.set(i10);
                    }
                    j4 <<= 1;
                    i10++;
                }
            }
            return objNewInstance;
        } catch (ExceptionInInitializerError e2) {
            e = e2;
            ObjectAccessException objectAccessException2 = new ObjectAccessException("Cannot construct type", e);
            objectAccessException2.add("construction-type", cls.getName());
            throw objectAccessException2;
        } catch (IllegalAccessException e3) {
            e = e3;
            ObjectAccessException objectAccessException22 = new ObjectAccessException("Cannot construct type", e);
            objectAccessException22.add("construction-type", cls.getName());
            throw objectAccessException22;
        } catch (InstantiationException e4) {
            e = e4;
            ObjectAccessException objectAccessException222 = new ObjectAccessException("Cannot construct type", e);
            objectAccessException222.add("construction-type", cls.getName());
            throw objectAccessException222;
        } catch (SecurityException e5) {
            e = e5;
            ObjectAccessException objectAccessException2222 = new ObjectAccessException("Cannot construct type", e);
            objectAccessException2222.add("construction-type", cls.getName());
            throw objectAccessException2222;
        } catch (InvocationTargetException e6) {
            e = e6.getCause();
            ObjectAccessException objectAccessException22222 = new ObjectAccessException("Cannot construct type", e);
            objectAccessException22222.add("construction-type", cls.getName());
            throw objectAccessException22222;
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static class TypedValue {
        public final Class type;
        public final Object value;

        public TypedValue(Class cls, Object obj) {
            this.type = cls;
            this.value = obj;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.type.getName());
            stringBuffer.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            stringBuffer.append(this.value);
            return stringBuffer.toString();
        }
    }
}
