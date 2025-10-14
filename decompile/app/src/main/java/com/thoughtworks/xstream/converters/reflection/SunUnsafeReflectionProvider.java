package com.thoughtworks.xstream.converters.reflection;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class SunUnsafeReflectionProvider extends SunLimitedUnsafeReflectionProvider {
    public transient Map fieldOffsetCache;

    public SunUnsafeReflectionProvider() {
    }

    public SunUnsafeReflectionProvider(FieldDictionary fieldDictionary) {
        super(fieldDictionary);
    }

    @Override // com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider, com.thoughtworks.xstream.converters.reflection.ReflectionProvider
    public void writeField(Object obj, String str, Object obj2, Class cls) {
        write(this.fieldDictionary.field(obj.getClass(), str, cls), obj, obj2);
    }

    public final void write(Field field, Object obj, Object obj2) {
        Exception exc = SunLimitedUnsafeReflectionProvider.exception;
        if (exc != null) {
            ObjectAccessException objectAccessException = new ObjectAccessException("Cannot set field", exc);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(obj.getClass());
            stringBuffer.append(".");
            stringBuffer.append(field.getName());
            objectAccessException.add(SerializableConverter.ELEMENT_FIELD, stringBuffer.toString());
            throw objectAccessException;
        }
        try {
            long fieldOffset = getFieldOffset(field);
            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                if (type.equals(Integer.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putInt(obj, fieldOffset, ((Integer) obj2).intValue());
                    return;
                }
                if (type.equals(Long.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putLong(obj, fieldOffset, ((Long) obj2).longValue());
                    return;
                }
                if (type.equals(Short.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putShort(obj, fieldOffset, ((Short) obj2).shortValue());
                    return;
                }
                if (type.equals(Character.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putChar(obj, fieldOffset, ((Character) obj2).charValue());
                    return;
                }
                if (type.equals(Byte.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putByte(obj, fieldOffset, ((Byte) obj2).byteValue());
                    return;
                }
                if (type.equals(Float.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putFloat(obj, fieldOffset, ((Float) obj2).floatValue());
                    return;
                }
                if (type.equals(Double.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putDouble(obj, fieldOffset, ((Double) obj2).doubleValue());
                    return;
                }
                if (type.equals(Boolean.TYPE)) {
                    SunLimitedUnsafeReflectionProvider.unsafe.putBoolean(obj, fieldOffset, ((Boolean) obj2).booleanValue());
                    return;
                }
                ObjectAccessException objectAccessException2 = new ObjectAccessException("Cannot set field of unknown type", exc);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(obj.getClass());
                stringBuffer2.append(".");
                stringBuffer2.append(field.getName());
                objectAccessException2.add(SerializableConverter.ELEMENT_FIELD, stringBuffer2.toString());
                objectAccessException2.add("unknown-type", type.getName());
                throw objectAccessException2;
            }
            SunLimitedUnsafeReflectionProvider.unsafe.putObject(obj, fieldOffset, obj2);
        } catch (IllegalArgumentException e) {
            ObjectAccessException objectAccessException3 = new ObjectAccessException("Cannot set field", e);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(obj.getClass());
            stringBuffer3.append(".");
            stringBuffer3.append(field.getName());
            objectAccessException3.add(SerializableConverter.ELEMENT_FIELD, stringBuffer3.toString());
            throw objectAccessException3;
        }
    }

    public final synchronized long getFieldOffset(Field field) {
        Long l;
        try {
            l = (Long) this.fieldOffsetCache.get(field);
            if (l == null) {
                l = new Long(SunLimitedUnsafeReflectionProvider.unsafe.objectFieldOffset(field));
                this.fieldOffsetCache.put(field, l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return l.longValue();
    }

    private Object readResolve() {
        init();
        return this;
    }

    @Override // com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider
    public void init() {
        super.init();
        this.fieldOffsetCache = new WeakHashMap();
    }
}
