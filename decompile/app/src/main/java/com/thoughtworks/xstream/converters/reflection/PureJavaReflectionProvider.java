package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.ErrorWritingException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.util.Fields;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class PureJavaReflectionProvider implements ReflectionProvider {
    public static /* synthetic */ Class class$java$io$ObjectStreamClass;
    public static /* synthetic */ Class class$java$io$Serializable;
    public static /* synthetic */ Class class$java$lang$Void;
    public FieldDictionary fieldDictionary;
    public transient Map objectStreamClassCache;
    public transient Map serializedDataCache;

    public PureJavaReflectionProvider() {
        this(new FieldDictionary(new ImmutableFieldKeySorter()));
    }

    public PureJavaReflectionProvider(FieldDictionary fieldDictionary) {
        this.fieldDictionary = fieldDictionary;
        init();
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0095  */
    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object newInstance(Class cls) throws Throwable {
        ErrorWritingException conversionException;
        ErrorWritingException objectAccessException;
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
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        if (constructor.getParameterTypes().length == 0) {
                            if (!constructor.isAccessible()) {
                                constructor.setAccessible(true);
                            }
                            return constructor.newInstance(null);
                        }
                    }
                    Class clsClass$2 = class$java$io$Serializable;
                    if (clsClass$2 == null) {
                        clsClass$2 = class$("java.io.Serializable");
                        class$java$io$Serializable = clsClass$2;
                    }
                    if (clsClass$2.isAssignableFrom(cls)) {
                        return instantiateUsingSerialization(cls);
                    }
                    conversionException = new ObjectAccessException("Cannot construct type as it does not have a no-args constructor");
                } catch (IllegalAccessException e) {
                    objectAccessException = new ObjectAccessException("Cannot construct type", e);
                    conversionException = objectAccessException;
                } catch (InstantiationException e2) {
                    objectAccessException = new ObjectAccessException("Cannot construct type", e2);
                    conversionException = objectAccessException;
                } catch (InvocationTargetException e3) {
                    if (e3.getTargetException() instanceof RuntimeException) {
                        throw ((RuntimeException) e3.getTargetException());
                    }
                    if (e3.getTargetException() instanceof Error) {
                        throw ((Error) e3.getTargetException());
                    }
                    conversionException = new ObjectAccessException("Constructor for type threw an exception", e3.getTargetException());
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

    public final Object instantiateUsingSerialization(Class cls) {
        ObjectAccessException objectAccessException;
        byte[] byteArray;
        Object objInvoke;
        try {
            if (Reflections.newInstance != null) {
                synchronized (this.objectStreamClassCache) {
                    try {
                        ObjectStreamClass objectStreamClassLookup = (ObjectStreamClass) this.objectStreamClassCache.get(cls);
                        if (objectStreamClassLookup == null) {
                            objectStreamClassLookup = ObjectStreamClass.lookup(cls);
                            this.objectStreamClassCache.put(cls, objectStreamClassLookup);
                        }
                        objInvoke = Reflections.newInstance.invoke(objectStreamClassLookup, null);
                    } finally {
                    }
                }
                return objInvoke;
            }
            synchronized (this.serializedDataCache) {
                try {
                    byteArray = (byte[]) this.serializedDataCache.get(cls);
                    if (byteArray == null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        dataOutputStream.writeShort(-21267);
                        dataOutputStream.writeShort(5);
                        dataOutputStream.writeByte(115);
                        dataOutputStream.writeByte(114);
                        dataOutputStream.writeUTF(cls.getName());
                        dataOutputStream.writeLong(ObjectStreamClass.lookup(cls).getSerialVersionUID());
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeShort(0);
                        dataOutputStream.writeByte(120);
                        dataOutputStream.writeByte(112);
                        byteArray = byteArrayOutputStream.toByteArray();
                        this.serializedDataCache.put(cls, byteArray);
                    }
                } finally {
                }
            }
            return new ObjectInputStream(new ByteArrayInputStream(byteArray)) { // from class: com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider.1
                public final /* synthetic */ Class val$type;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C86301(InputStream inputStream, Class cls2) {
                    super(inputStream);
                    cls = cls2;
                }

                @Override // java.io.ObjectInputStream
                public Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
                    return Class.forName(objectStreamClass.getName(), false, cls.getClassLoader());
                }
            }.readObject();
        } catch (ObjectAccessException e) {
            objectAccessException = e;
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        } catch (IOException e2) {
            objectAccessException = new ObjectAccessException("Cannot create type by JDK serialization", e2);
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        } catch (ClassNotFoundException e3) {
            objectAccessException = new ObjectAccessException("Cannot find class", e3);
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        } catch (IllegalAccessException e4) {
            objectAccessException = new ObjectAccessException("Cannot create type by JDK object stream data", e4);
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        } catch (IllegalArgumentException e5) {
            objectAccessException = new ObjectAccessException("Cannot create type by JDK object stream data", e5);
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        } catch (InvocationTargetException e6) {
            objectAccessException = new ObjectAccessException("Cannot create type by JDK object stream data", e6);
            objectAccessException.add("construction-type", cls2.getName());
            throw objectAccessException;
        }
    }

    /* renamed from: com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider$1 */
    public class C86301 extends ObjectInputStream {
        public final /* synthetic */ Class val$type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C86301(InputStream inputStream, Class cls2) {
            super(inputStream);
            cls = cls2;
        }

        @Override // java.io.ObjectInputStream
        public Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            return Class.forName(objectStreamClass.getName(), false, cls.getClassLoader());
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public void visitSerializableFields(Object obj, ReflectionProvider.Visitor visitor) throws SecurityException {
        Iterator itFieldsFor = this.fieldDictionary.fieldsFor(obj.getClass());
        while (itFieldsFor.hasNext()) {
            Field field = (Field) itFieldsFor.next();
            if (fieldModifiersSupported(field)) {
                validateFieldAccess(field);
                visitor.visit(field.getName(), field.getType(), field.getDeclaringClass(), Fields.read(field, obj));
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public void writeField(Object obj, String str, Object obj2, Class cls) throws Throwable {
        Field field = this.fieldDictionary.field(obj.getClass(), str, cls);
        validateFieldAccess(field);
        Fields.write(field, obj, obj2);
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public Class getFieldType(Object obj, String str, Class cls) {
        return this.fieldDictionary.field(obj.getClass(), str, cls).getType();
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public boolean fieldDefinedInClass(String str, Class cls) throws Throwable {
        Field fieldFieldOrNull = this.fieldDictionary.fieldOrNull(cls, str, null);
        return fieldFieldOrNull != null && fieldModifiersSupported(fieldFieldOrNull);
    }

    public boolean fieldModifiersSupported(Field field) {
        int modifiers = field.getModifiers();
        return (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers)) ? false : true;
    }

    public void validateFieldAccess(Field field) throws SecurityException {
        if (Modifier.isFinal(field.getModifiers())) {
            if (JVM.isVersion(5)) {
                if (field.isAccessible()) {
                    return;
                }
                field.setAccessible(true);
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid final field ");
                stringBuffer.append(field.getDeclaringClass().getName());
                stringBuffer.append(".");
                stringBuffer.append(field.getName());
                throw new ObjectAccessException(stringBuffer.toString());
            }
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public Field getField(Class cls, String str) {
        return this.fieldDictionary.field(cls, str, null);
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public Field getFieldOrNull(Class cls, String str) {
        return this.fieldDictionary.fieldOrNull(cls, str, null);
    }

    public void setFieldDictionary(FieldDictionary fieldDictionary) {
        this.fieldDictionary = fieldDictionary;
    }

    private Object readResolve() {
        init();
        return this;
    }

    public void init() {
        this.objectStreamClassCache = new WeakHashMap();
        this.serializedDataCache = new WeakHashMap();
    }

    public static class Reflections {
        public static final Method newInstance;

        static {
            Method declaredMethod = null;
            try {
                Class clsClass$ = PureJavaReflectionProvider.class$java$io$ObjectStreamClass;
                if (clsClass$ == null) {
                    clsClass$ = PureJavaReflectionProvider.class$("java.io.ObjectStreamClass");
                    PureJavaReflectionProvider.class$java$io$ObjectStreamClass = clsClass$;
                }
                declaredMethod = clsClass$.getDeclaredMethod("newInstance", null);
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException | SecurityException unused) {
            }
            newInstance = declaredMethod;
        }
    }
}
