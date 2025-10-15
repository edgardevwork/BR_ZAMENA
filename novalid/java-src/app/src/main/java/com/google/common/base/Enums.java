package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Enums {

    @GwtIncompatible
    public static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> enumConstantCache = new WeakHashMap();

    @GwtIncompatible
    public static Field getField(Enum<?> enumValue) {
        try {
            return enumValue.getDeclaringClass().getDeclaredField(enumValue.name());
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <T extends Enum<T>> Optional<T> getIfPresent(Class<T> enumClass, String value) {
        Preconditions.checkNotNull(enumClass);
        Preconditions.checkNotNull(value);
        return Platform.getEnumIfPresent(enumClass, value);
    }

    @GwtIncompatible
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> populateCache(Class<T> enumClass) {
        HashMap map = new HashMap();
        Iterator it = EnumSet.allOf(enumClass).iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            map.put(r2.name(), new WeakReference(r2));
        }
        enumConstantCache.put(enumClass, map);
        return map;
    }

    @GwtIncompatible
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> getEnumConstants(Class<T> enumClass) {
        Map<String, WeakReference<? extends Enum<?>>> mapPopulateCache;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map = enumConstantCache;
        synchronized (map) {
            try {
                mapPopulateCache = map.get(enumClass);
                if (mapPopulateCache == null) {
                    mapPopulateCache = populateCache(enumClass);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapPopulateCache;
    }

    @GwtIncompatible
    public static <T extends Enum<T>> Converter<String, T> stringConverter(Class<T> enumClass) {
        return new StringConverter(enumClass);
    }

    @GwtIncompatible
    /* loaded from: classes8.dex */
    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Class<T> enumClass;

        public StringConverter(Class<T> enumClass) {
            this.enumClass = (Class) Preconditions.checkNotNull(enumClass);
        }

        @Override // com.google.common.base.Converter
        public T doForward(String str) {
            return (T) Enum.valueOf(this.enumClass, str);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(T enumValue) {
            return enumValue.name();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof StringConverter) {
                return this.enumClass.equals(((StringConverter) object).enumClass);
            }
            return false;
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public String toString() {
            return "Enums.stringConverter(" + this.enumClass.getName() + ".class)";
        }
    }
}
