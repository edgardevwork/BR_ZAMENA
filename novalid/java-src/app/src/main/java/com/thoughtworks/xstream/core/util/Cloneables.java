package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public class Cloneables {
    public static Object clone(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (!(obj instanceof Cloneable)) {
            return null;
        }
        if (obj.getClass().isArray()) {
            Class<?> componentType = obj.getClass().getComponentType();
            if (!componentType.isPrimitive()) {
                return ((Object[]) obj).clone();
            }
            int length = Array.getLength(obj);
            Object objNewInstance = Array.newInstance(componentType, length);
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return objNewInstance;
                }
                Array.set(objNewInstance, i, Array.get(obj, i));
                length = i;
            }
        } else {
            try {
                return obj.getClass().getMethod("clone", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                throw new ObjectAccessException("Cannot clone Cloneable type", e);
            } catch (NoSuchMethodException e2) {
                throw new ObjectAccessException("Cloneable type has no clone method", e2);
            } catch (InvocationTargetException e3) {
                throw new ObjectAccessException("Exception cloning Cloneable type", e3.getCause());
            }
        }
    }

    public static Object cloneIfPossible(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objClone = clone(obj);
        return objClone == null ? obj : objClone;
    }
}
